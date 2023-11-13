// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.Iterator;
import java.util.Collections;
import com.ibm.jzos.PdsDirectory;
import java.util.ArrayList;
import java.util.List;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import com.ibm.jzos.ZFileException;
import java.util.logging.Level;
import com.ibm.dmh.log.LoggerManager;
import java.text.MessageFormat;
import java.util.ResourceBundle;

public class ZFile
{
    protected com.ibm.jzos.ZFile file;
    protected String fileName;
    protected String options;
    private static ResourceBundle i18n;
    
    public ZFile(final String iName, final AccessType iAccessType) {
        this.fileName = iName;
        switch (iAccessType) {
            case READ_TEXT: {
                this.options = "rt";
                break;
            }
            case WRITE_TEXT: {
                this.options = "wt";
                break;
            }
            case WRITE_TEXT_APPEND: {
                this.options = "at";
                break;
            }
            case READ_BINARY: {
                this.options = "rb";
                break;
            }
            case WRITE_BINARY: {
                this.options = "wb";
                break;
            }
            default: {
                throw new IllegalArgumentException(MessageFormat.format(ZFile.i18n.getString("unknown_access_type"), String.valueOf(iAccessType)));
            }
        }
        this.options += ",recfm=*";
    }
    
    static String decorateNameForZFile(String fileName) {
        if (!fileName.startsWith("//")) {
            if (fileName.startsWith("DD:")) {
                fileName = String.format("//%s", fileName);
            }
            else {
                fileName = String.format("//'%s'", fileName);
            }
        }
        return fileName;
    }
    
    protected com.ibm.jzos.ZFile getFile() throws IOException {
        if (this.file == null) {
            LoggerManager.getMainLogger().fine(String.format("ZFile getFile file=[%s] options=[%s]", this.fileName, this.options));
            try {
                this.file = new com.ibm.jzos.ZFile(decorateNameForZFile(this.fileName), this.options);
            }
            catch (com.ibm.jzos.ZFileException e) {
                LoggerManager.getMainLogger().log(Level.FINE, String.format("ZFileException %s abend=%X", e.getLocalizedMessage(), e.getAbendCode()), (Throwable)e);
                switch (e.getErrno()) {
                    case 47: {
                        throw new InvalidNameException(this.getFilename());
                    }
                    case 49: {
                        throw new DataSetNotFoundException(this.getFilename());
                    }
                    case 67: {
                        throw new MemberNotFoundException(this.getFilename());
                    }
                    case 92: {
                        if (e.getAbendCode() == 2323) {
                            throw new InsufficientAuthorityException(this.getFilename());
                        }
                        break;
                    }
                }
                throw e;
            }
        }
        return this.file;
    }
    
    public static void createSequential(final String fileName, final RECFM recfm, final int lrecl, final int blksize, final SPACE_UNIT unit, final int primary, final int secondary, final String volser) throws IOException {
        create(fileName, recfm, lrecl, blksize, unit, primary, secondary, volser, 0);
    }
    
    public static void createPDSE(final String fileName, final RECFM recfm, final int lrecl, final int blksize, final SPACE_UNIT unit, final int primary, final int secondary, final String volser) throws IOException {
        create(fileName, recfm, lrecl, blksize, unit, primary, secondary, volser, -1);
    }
    
    public static void createPDS(final String fileName, final RECFM recfm, final int lrecl, final int blksize, final SPACE_UNIT unit, final int primary, final int secondary, final int directory, final String volser) throws IOException {
        if (directory <= 0) {
            throw new IllegalArgumentException(MessageFormat.format(ZFile.i18n.getString("create_requires_one_block"), String.valueOf(directory)));
        }
        create(fileName, recfm, lrecl, blksize, unit, primary, secondary, volser, directory);
    }
    
    public static void create(final String fileName, final RECFM recfm, final int lrecl, final int blksize, final SPACE_UNIT unit, final int primary, final int secondary, final String volser, final int directory) throws IOException {
        if (!dsExists(fileName)) {
            String alloc = String.format("ALLOC DA(%s) RECFM(%s) LRECL(%d) SPACE(%d,%d) %s NEW CATALOG", fileName, (recfm == RECFM.VB) ? "V,B" : "F,B", lrecl, primary, secondary, (unit == SPACE_UNIT.CYLINDERS) ? "CYLINDERS" : "TRACKS");
            if (directory > 0) {
                alloc += String.format(" DIR(%d) DSORG(PO)", directory);
            }
            else if (directory < 0) {
                alloc += " DSORG(PO) DSNTYPE(LIBRARY)";
            }
            else {
                alloc += " DSORG(PS)";
            }
            if (blksize > 0) {
                alloc += String.format(" BLKSIZE(%d)", blksize);
            }
            if (!StringUtils.isEmpty(volser)) {
                alloc += String.format(" VOL(%s) UNIT(SYSDA)", volser);
            }
            LoggerManager.getMainLogger().fine(String.format("ZFile create using=[%s]", alloc));
            com.ibm.jzos.ZFile.bpxwdyn(alloc);
        }
    }
    
    public String getFilename() {
        return this.fileName.startsWith("//'") ? this.fileName.substring(2, this.fileName.length() - 1) : this.fileName;
    }
    
    public String getActualFilename() throws IOException {
        return this.getFile().getActualFilename();
    }
    
    public InputStream getInputStream() throws IOException {
        return this.getFile().getInputStream();
    }
    
    public OutputStream getOutputStream() throws IOException {
        OutputStream os = null;
        try {
            os = this.getFile().getOutputStream();
        }
        catch (com.ibm.jzos.ZFileException e) {
            LoggerManager.getMainLogger().log(Level.FINE, String.format("ZFileException %s abend=%X", e.getLocalizedMessage(), e.getAbendCode()), (Throwable)e);
            if (e.getErrno() == 61 && e.getErrno2() == -1073019901) {
                throw new DataSetInUseException(this.getFilename());
            }
            throw e;
        }
        return os;
    }
    
    public int getDsorg() throws IOException {
        return this.getFile().getDsorg();
    }
    
    public boolean isPds() throws IOException {
        return (this.getFile().getDsorg() & 0x5) == 0x5 || (this.getFile().getDsorg() & 0x1) == 0x1;
    }
    
    public boolean isPdsMember() throws IOException {
        return (this.getFile().getDsorg() & 0x3) == 0x3;
    }
    
    public boolean isSequential() throws IOException {
        return (this.getFile().getDsorg() & 0x8) == 0x8;
    }
    
    public void close() throws IOException {
        try {
            if (this.file != null && this.exists()) {
                this.getFile().close();
            }
        }
        catch (IllegalStateException e) {
            if (e.getMessage().indexOf("already closed") == -1) {
                throw e;
            }
        }
        finally {
            this.file = null;
        }
    }
    
    public static void delete(final String iFileName) throws IOException {
        if (exists(iFileName)) {
            try {
                com.ibm.jzos.ZFile.remove(decorateNameForZFile(iFileName));
            }
            catch (IOException e) {
                if (e.getMessage().contains("errno=91 errno2=0xc0120099") || e.getMessage().contains("errno=46 errno2=0xc012008b")) {
                    throw new IOException(MessageFormat.format(ZFile.i18n.getString("remove_failed_in_use"), iFileName));
                }
                throw e;
            }
        }
    }
    
    public void delete() throws IOException {
        this.close();
        delete(this.fileName);
    }
    
    public boolean exists() throws IOException {
        try {
            if (this.file == null) {
                this.getFile();
            }
            return com.ibm.jzos.ZFile.dsExists(decorateNameForZFile(this.fileName));
        }
        catch (IllegalArgumentException e) {
            if (e.getMessage().indexOf("must be FB or VB") > -1) {
                if (this.fileName.indexOf("(") > -1) {
                    try {
                        return this.isPdsMember();
                    }
                    catch (com.ibm.jzos.ZFileException e2) {
                        if (e2.getMessage().indexOf("nonexistent") > -1) {
                            return false;
                        }
                        throw e2;
                    }
                }
                return this.isPds() || this.isSequential();
            }
            throw e;
        }
        catch (com.ibm.jzos.ZFileException e3) {
            if (e3.getAbendCode() == 2323) {
                throw new InsufficientAuthorityException(this.getFilename());
            }
            throw e3;
        }
    }
    
    public static boolean exists(final String dsn) throws IOException {
        ZFile file = null;
        try {
            file = new ZFile(dsn, AccessType.READ_BINARY);
            return file.exists();
        }
        finally {
            if (file != null) {
                try {
                    file.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public boolean dsExists() throws IOException {
        final String fileName = removeMemberName(this.fileName);
        try {
            return com.ibm.jzos.ZFile.dsExists(decorateNameForZFile(fileName));
        }
        catch (IllegalArgumentException e) {
            if (e.getMessage().indexOf("must be FB or VB") > -1) {
                return this.isPds() || this.isSequential();
            }
            throw e;
        }
    }
    
    public static boolean dsExists(final String dsn) throws IOException {
        ZFile file = null;
        try {
            file = new ZFile(dsn, AccessType.READ_BINARY);
            return file.dsExists();
        }
        finally {
            if (file != null) {
                try {
                    file.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public List<String> getMemberNames(final String pattern) throws IOException {
        final List<String> memberNames = new ArrayList<String>();
        if ("".equals(pattern)) {
            return memberNames;
        }
        final PdsDirectory dir = new PdsDirectory(removeMemberName(this.fileName));
        for (final PdsDirectory.MemberInfo member : dir) {
            final String memberName = member.getName();
            if (pattern == null || "*".equals(pattern) || StringUtils.isLike(pattern, memberName)) {
                memberNames.add(memberName);
            }
        }
        Collections.sort(memberNames);
        return memberNames;
    }
    
    public List<String> getMemberNames() throws IOException {
        return this.getMemberNames(null);
    }
    
    public static String removeMemberName(final String dsn) {
        return dsn.replaceAll("\\([^\\)]+\\)", "");
    }
    
    static {
        ZFile.i18n = ResourceBundle.getBundle("com.ibm.dmh.util.ZFile");
    }
    
    public enum AccessType
    {
        READ_TEXT, 
        WRITE_TEXT, 
        READ_BINARY, 
        WRITE_BINARY, 
        WRITE_TEXT_APPEND;
    }
    
    public enum RECFM
    {
        FB, 
        VB;
    }
    
    public enum SPACE_UNIT
    {
        CYLINDERS, 
        TRACKS;
    }
    
    public class ZFileException extends IOException
    {
        private static final long serialVersionUID = 1L;
        String name;
        
        protected ZFileException(final String msg, final String name) {
            super(msg);
            this.name = name;
        }
        
        public String getName() {
            return this.name;
        }
    }
    
    public class DataSetNotFoundException extends ZFileException
    {
        private static final long serialVersionUID = 1L;
        
        public DataSetNotFoundException(final String name) {
            super(MessageFormat.format(ZFile.i18n.getString("data_set_not_found"), name), name);
        }
    }
    
    public class InvalidNameException extends ZFileException
    {
        private static final long serialVersionUID = 1L;
        
        public InvalidNameException(final String name) {
            super(MessageFormat.format(ZFile.i18n.getString("invalid_name"), name), name);
        }
    }
    
    public class MemberNotFoundException extends ZFileException
    {
        private static final long serialVersionUID = 1L;
        
        public MemberNotFoundException(final String name) {
            super(MessageFormat.format(ZFile.i18n.getString("member_not_found"), name), name);
        }
    }
    
    public class InsufficientAuthorityException extends ZFileException
    {
        private static final long serialVersionUID = 1L;
        
        public InsufficientAuthorityException(final String name) {
            super(MessageFormat.format(ZFile.i18n.getString("insufficient_authority"), name), name);
        }
    }
    
    public class DataSetInUseException extends ZFileException
    {
        private static final long serialVersionUID = 1L;
        
        public DataSetInUseException(final String name) {
            super(MessageFormat.format(ZFile.i18n.getString("data_set_in_use"), name), name);
        }
    }
}
