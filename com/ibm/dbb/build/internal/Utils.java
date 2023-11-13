// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import org.slf4j.LoggerFactory;
import java.io.StringReader;
import com.ibm.dbb.EnvVars;
import java.util.Map;
import com.ibm.dbb.build.DDStatement;
import com.ibm.dbb.build.DBBConstants;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import com.ibm.jzos.ZFileException;
import java.util.List;
import com.ibm.jzos.ErrnoException;
import java.io.IOException;
import com.ibm.jzos.FileAttribute;
import java.io.File;
import com.ibm.jzos.FileFactory;
import com.ibm.jzos.RcException;
import com.ibm.dbb.build.BuildException;
import com.ibm.jzos.ZFile;
import com.ibm.dbb.build.BuildProperties;
import java.util.HashMap;
import org.slf4j.Logger;

public class Utils
{
    private static Logger logger;
    private static final String ENCODING_ENVIRONMENT_VARIABLE = "ZLANG";
    private static final String NL;
    private static final String TWO_SLASHES = "//";
    private static final String APOSTROPHE = "'";
    private static final String TWO_AMPERSANDS = "&&";
    private static final String DD_COLON = "DD:";
    private static final String DOLLAR = "$";
    private static final String EMPTY = "";
    private static final String FILE_SEPARATOR;
    private static final String FILE_TAGGING_OPTION_NAME = "dbb.file.tagging";
    private static final char CCSID_UTF_8 = '\u04b8';
    private static final HashMap<String, String> cpMap;
    
    public static boolean isSetFileTagging() {
        boolean fileTagging = false;
        final String prop = BuildProperties.getProperty("dbb.file.tagging");
        if (prop != null) {
            fileTagging = Boolean.valueOf(prop);
        }
        return fileTagging;
    }
    
    public static String stripFileExtension(final String filename) {
        final int dotIndex = filename.lastIndexOf(46);
        if (dotIndex > -1) {
            return filename.substring(0, dotIndex);
        }
        return filename;
    }
    
    public static String getFileExtension(final String filename) {
        final int dotIndex = filename.lastIndexOf(46);
        if (dotIndex > -1 && filename.length() > dotIndex) {
            return filename.substring(dotIndex + 1);
        }
        return null;
    }
    
    public static void bpxwdyn(final String command) throws BuildException {
        try {
            Utils.logger.debug("bpxwdyn: " + command);
            ZFile.bpxwdyn(command);
        }
        catch (RcException e) {
            throw new BuildException(Messages.getMessage("Utils_ERROR_BPXWDYN", command), (Throwable)e);
        }
    }
    
    public static String formatDatasetNameForZFileOperation(final String dsname) {
        return (dsname == null || dsname.startsWith("&&")) ? dsname : ("//'" + dsname + "'");
    }
    
    public static String formatDDNameForZFileOperation(final String ddName) {
        return "//DD:" + ddName;
    }
    
    public static String retrieveEncoding() {
        final String zLang = System.getenv("ZLANG");
        return (zLang != null && zLang.length() > 0) ? zLang : FileFactory.getDefaultZFileEncoding();
    }
    
    public static String retrieveEncoding(final String encoding) {
        if (encoding == null) {
            return retrieveEncoding();
        }
        return encoding;
    }
    
    public static String retrieveHFSEncoding(final File file) throws IOException {
        if (file != null) {
            FileAttribute.Tag tag = null;
            try {
                final FileAttribute.Stat stat = FileAttribute.getStat(file.getAbsolutePath());
                tag = stat.getTag();
            }
            catch (ErrnoException e) {
                throw new IOException(Messages.getMessage("JZOS_NO_FILE", file.getAbsolutePath(), e.getMessage()), (Throwable)e);
            }
            if (tag != null) {
                final char x = tag.getCodeCharacterSetID();
                if (x != '\0' && tag.isTextOnly()) {
                    return "ibm-" + (int)x;
                }
            }
        }
        return retrieveEncoding();
    }
    
    public static boolean isBinary(final File file) throws IOException {
        FileAttribute.Tag tag = null;
        try {
            final FileAttribute.Stat stat = FileAttribute.getStat(file.getAbsolutePath());
            tag = stat.getTag();
        }
        catch (ErrnoException e) {
            throw new IOException(Messages.getMessage("JZOS_NO_FILE", file.getAbsolutePath(), e.getMessage()), (Throwable)e);
        }
        return tag.getCodeCharacterSetID() == '\uffff' && !tag.isTextOnly();
    }
    
    public static String getFullyQualifiedDsn(final String dataset, final String member) {
        if (member == null) {
            return dataset;
        }
        return dataset + '(' + member + ')';
    }
    
    public static String getSlashSlashQuotedDsn(final String dataset, final String member) {
        final String fullyQualifiedDsn = getFullyQualifiedDsn(dataset, member);
        return "//'" + fullyQualifiedDsn + "'";
    }
    
    public static void appendLine(final String text, final StringBuilder buffer) {
        buffer.append(text).append(Utils.NL);
    }
    
    public static void storeToPDS(final String dsname, final List<String> lines) throws BuildException {
        final String output = formatDatasetNameForZFileOperation(dsname);
        final String encoding = retrieveEncoding();
        ZFile zFileOut = null;
        try {
            zFileOut = new ZFile(output, "wb,type=record,recfm=vb,lrecl=255,noseek");
            for (final String line : lines) {
                final byte[] b = line.getBytes(encoding);
                zFileOut.write(b, 0, b.length);
            }
            zFileOut.flush();
            if (!dsname.startsWith("&&")) {
                zFileOut.close();
            }
        }
        catch (ZFileException | UnsupportedEncodingException ex2) {
            final IOException ex;
            final IOException e = ex;
            throw new BuildException(Messages.getMessage("Error_WRITING_TO_DATASET", dsname), e);
        }
    }
    
    public static void createFile(final File file, final String content) throws BuildException {
        createFile(file, content, null);
    }
    
    public static void createFile(final File file, final String content, final String encoding) throws BuildException {
        final String charset = (encoding == null) ? Charset.defaultCharset().name() : encoding;
        FileOutputStream fos = null;
        try {
            try {
                file.getParentFile().mkdirs();
                fos = new FileOutputStream(file);
                fos.write(content.getBytes(charset));
                fos.flush();
                if (isSetFileTagging()) {
                    if (charset.equals("UTF-8")) {
                        final FileAttribute.Tag tag = new FileAttribute.Tag('\u04b8', true);
                        FileAttribute.setTag(file.getAbsolutePath(), tag);
                    }
                    else if (charset.equals("ISO8859-1")) {
                        final FileAttribute.Tag tag = new FileAttribute.Tag('\u0333', true);
                        FileAttribute.setTag(file.getAbsolutePath(), tag);
                    }
                }
            }
            finally {
                if (fos != null) {
                    fos.close();
                }
            }
        }
        catch (IOException e) {
            throw new BuildException(Messages.getMessage("Error_CREATING_FILE", file.getAbsoluteFile(), e));
        }
    }
    
    public static void saveContentToFile(final InputStream content, final File destinationFile, final String contentEncoding, final String fileEncoding, final boolean append) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        final String charset = (fileEncoding == null) ? Charset.defaultCharset().name() : fileEncoding;
        InputStreamReader isr = null;
        try {
            isr = ((contentEncoding == null) ? new InputStreamReader(content) : new InputStreamReader(content, contentEncoding));
            br = new BufferedReader(isr);
            final FileOutputStream fos = new FileOutputStream(destinationFile, append);
            final OutputStreamWriter osw = (fileEncoding == null) ? new OutputStreamWriter(fos) : new OutputStreamWriter(fos, fileEncoding);
            bw = new BufferedWriter(osw);
            String x;
            while ((x = br.readLine()) != null) {
                bw.write(x + DBBConstants.DEFAULT_NEWLINE);
            }
            bw.flush();
            if (isSetFileTagging()) {
                if (charset.equals("UTF-8")) {
                    final FileAttribute.Tag tag = new FileAttribute.Tag('\u04b8', true);
                    FileAttribute.setTag(destinationFile.getAbsolutePath(), tag);
                }
                else if (charset.equals("ISO8859-1")) {
                    final FileAttribute.Tag tag = new FileAttribute.Tag('\u0333', true);
                    FileAttribute.setTag(destinationFile.getAbsolutePath(), tag);
                }
                else {
                    final String ccsidKey = fileEncoding;
                    final int ccsidNum = getCCSIDFromCodePage(ccsidKey);
                    final char CCSID_VALUE = (char)ccsidNum;
                    if (ccsidNum != 0) {
                        final FileAttribute.Tag tag2 = new FileAttribute.Tag(CCSID_VALUE, true);
                        FileAttribute.setTag(destinationFile.getAbsolutePath(), tag2);
                    }
                }
            }
        }
        finally {
            if (bw != null) {
                bw.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
        }
    }
    
    public static DDStatement findDD(final List<DDStatement> ddStatements, final String ddName) {
        if (ddStatements != null) {
            for (final DDStatement ddStatement : ddStatements) {
                if (ddStatement.getName().equals(ddName)) {
                    return ddStatement;
                }
            }
        }
        return null;
    }
    
    public static void deleteDataset(final String dsname) throws BuildException {
        try {
            ZFile.remove(formatDatasetNameForZFileOperation(dsname));
        }
        catch (ZFileException e) {
            throw new BuildException(Messages.getMessage("Error_DELETING_DATASET", dsname), (Throwable)e);
        }
    }
    
    public static String createMemberName(final String filepath) {
        final File file = new File(filepath);
        String name = file.getName();
        final int idx = name.lastIndexOf(46);
        if (idx > -1) {
            name = name.substring(0, idx);
        }
        return name.toUpperCase();
    }
    
    public static File createFile(String file, String sourceDir) {
        if (sourceDir == null) {
            return new File(file);
        }
        if (file.startsWith("/")) {
            file = file.substring(1);
        }
        if (!sourceDir.endsWith("/")) {
            sourceDir += "/";
        }
        return new File(sourceDir + file);
    }
    
    public static String createAbsoluteFileName(String file, String sourceDir) {
        if (sourceDir == null) {
            return file;
        }
        if (file.startsWith("/")) {
            file = file.substring(1);
        }
        if (!sourceDir.endsWith("/")) {
            sourceDir += "/";
        }
        return sourceDir + file;
    }
    
    public static String readFromStream(final InputStream inputStream, final String encoding) throws IOException {
        if (inputStream == null) {
            return null;
        }
        final StringBuilder buffer = new StringBuilder();
        final BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, encoding));
        String line;
        while ((line = br.readLine()) != null) {
            appendLine(line, buffer);
        }
        return buffer.toString();
    }
    
    public static String readFromPlugin(final String fullyQualifiedPath, final String encoding) throws IOException {
        final InputStream inputStream = Utils.class.getResourceAsStream(fullyQualifiedPath);
        return readFromStream(inputStream, encoding);
    }
    
    public static Process runInProcess(final String commandAndOptions, final StringBuilder error) throws IOException {
        return runInProcess(commandAndOptions, error, null);
    }
    
    public static Process runInProcess(final String commandAndOptions, final StringBuilder error, final Map<String, String> envVars) throws IOException {
        final String[] commands = commandAndOptions.split(" ");
        final ProcessBuilder processBuilder = new ProcessBuilder(commands);
        updateEnvironmentVariables(processBuilder, envVars);
        final Process process = processBuilder.start();
        if (error != null) {
            final ProcessOutputHandler outputHandler = new ProcessOutputHandler(process.getErrorStream(), error);
            outputHandler.start();
        }
        try {
            process.waitFor();
        }
        catch (InterruptedException ex) {}
        return process;
    }
    
    private static void updateEnvironmentVariables(final ProcessBuilder processBuilder, final Map<String, String> envVars) {
        if (envVars == null) {
            return;
        }
        final Map<String, String> existing = processBuilder.environment();
        for (final String key : envVars.keySet()) {
            String value = envVars.get(key);
            if (value == null) {
                existing.remove(key);
            }
            else {
                final int ndx;
                if ((ndx = value.toUpperCase().indexOf(("$" + key).toUpperCase())) != -1) {
                    String existingValue;
                    if ((existingValue = existing.get(key)) == null) {
                        existingValue = "";
                    }
                    value = value.substring(0, ndx) + existingValue + value.substring(ndx + ("$" + key).length());
                }
                existing.put(key, value);
            }
        }
    }
    
    public static File getDBBSubDir(final String subDirName) throws BuildException {
        final String home = EnvVars.getHome();
        return new File(home.endsWith(Utils.FILE_SEPARATOR) ? (home + subDirName) : (home + Utils.FILE_SEPARATOR + subDirName));
    }
    
    public static BufferedReader readUncatalogedDataset(final String fullyQualifiedDataset, final String volser, final String encoding) throws IOException {
        BufferedReader br = null;
        final String dummyDD = ZFile.allocDummyDDName();
        try {
            bpxwdyn("alloc dd(" + dummyDD + ") dsn(" + fullyQualifiedDataset + ") vol(" + volser + ") shr reuse msg(1)");
            final StringBuilder buffer = new StringBuilder();
            br = FileFactory.newBufferedReader(formatDDNameForZFileOperation(dummyDD), encoding);
            String line = null;
            while ((line = br.readLine()) != null) {
                buffer.append(line).append(DBBConstants.DEFAULT_NEWLINE);
            }
            return new BufferedReader(new StringReader(buffer.toString()));
        }
        catch (BuildException e) {
            throw new IOException(Messages.getMessage("Error_READ_UNCATALOGED_DATASET", fullyQualifiedDataset, volser), e);
        }
        finally {
            if (br != null) {
                br.close();
            }
            try {
                bpxwdyn("free dd(" + dummyDD + ")");
            }
            catch (BuildException e2) {
                throw new IOException(e2);
            }
        }
    }
    
    public static int parseInt(final String str, final int defaultValue) {
        try {
            return Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            return defaultValue;
        }
    }
    
    private static Integer getCCSIDFromCodePage(final String codePage) {
        int ccsidValue = 0;
        if (Utils.cpMap.size() > 0) {
            if (Utils.cpMap.containsKey(codePage)) {
                final String ccsidNum = Utils.cpMap.get(codePage);
                ccsidValue = Integer.parseInt(ccsidNum);
            }
        }
        else {
            Utils.cpMap.put("IBM-037", "37");
            Utils.cpMap.put("00256", "256");
            Utils.cpMap.put("00259", "259");
            Utils.cpMap.put("IBM-273", "273");
            Utils.cpMap.put("IBM-274", "274");
            Utils.cpMap.put("IBM-275", "275");
            Utils.cpMap.put("IBM-277", "277");
            Utils.cpMap.put("IBM-278", "278");
            Utils.cpMap.put("IBM-280", "280");
            Utils.cpMap.put("IBM-281", "281");
            Utils.cpMap.put("IBM-282", "282");
            Utils.cpMap.put("IBM-284", "284");
            Utils.cpMap.put("IBM-285", "285");
            Utils.cpMap.put("00286", "286");
            Utils.cpMap.put("IBM-290", "290");
            Utils.cpMap.put("00293", "293");
            Utils.cpMap.put("IBM-297", "297");
            Utils.cpMap.put("IBM-300", "300");
            Utils.cpMap.put("IBM-301", "301");
            Utils.cpMap.put("00367", "367");
            Utils.cpMap.put("IBM-420", "420");
            Utils.cpMap.put("00421", "421");
            Utils.cpMap.put("00423", "423");
            Utils.cpMap.put("IBM-424", "424");
            Utils.cpMap.put("IBM-425", "425");
            Utils.cpMap.put("IBM-437", "437");
            Utils.cpMap.put("IBM-500", "500");
            Utils.cpMap.put("00720", "720");
            Utils.cpMap.put("00737", "737");
            Utils.cpMap.put("00775", "775");
            Utils.cpMap.put("00803", "803");
            Utils.cpMap.put("00806", "806");
            Utils.cpMap.put("IBM-808", "808");
            Utils.cpMap.put("ISO8859-7", "813");
            Utils.cpMap.put("ISO8859-1", "819");
            Utils.cpMap.put("IBM-833", "833");
            Utils.cpMap.put("IBM-834", "834");
            Utils.cpMap.put("IBM-835", "835");
            Utils.cpMap.put("IBM-836", "836");
            Utils.cpMap.put("IBM-837", "837");
            Utils.cpMap.put("IBM-838", "838");
            Utils.cpMap.put("IBM-848", "848");
            Utils.cpMap.put("00849", "849");
            Utils.cpMap.put("IBM-850", "850");
            Utils.cpMap.put("00851", "851");
            Utils.cpMap.put("IBM-852", "852");
            Utils.cpMap.put("00853", "853");
            Utils.cpMap.put("IBM-855", "855");
            Utils.cpMap.put("IBM-856", "856");
            Utils.cpMap.put("00857", "857");
            Utils.cpMap.put("IBM-858", "858");
            Utils.cpMap.put("IBM-859", "859");
            Utils.cpMap.put("00860", "860");
            Utils.cpMap.put("IBM-861", "861");
            Utils.cpMap.put("IBM-862", "862");
            Utils.cpMap.put("00863", "863");
            Utils.cpMap.put("IBM-864", "864");
            Utils.cpMap.put("00865", "865");
            Utils.cpMap.put("IBM-866", "866");
            Utils.cpMap.put("IBM-867", "867");
            Utils.cpMap.put("00868", "868");
            Utils.cpMap.put("IBM-869", "869");
            Utils.cpMap.put("IBM-870", "870");
            Utils.cpMap.put("IBM-871", "871");
            Utils.cpMap.put("IBM-872", "872");
            Utils.cpMap.put("TIS-620", "874");
            Utils.cpMap.put("IBM-875", "875");
            Utils.cpMap.put("00876", "876");
            Utils.cpMap.put("00878", "878");
            Utils.cpMap.put("IBM-880", "880");
            Utils.cpMap.put("00891", "891");
            Utils.cpMap.put("00895", "895");
            Utils.cpMap.put("00896", "896");
            Utils.cpMap.put("00897", "897");
            Utils.cpMap.put("00899", "899");
            Utils.cpMap.put("IBM-901", "901");
            Utils.cpMap.put("IBM-902", "902");
            Utils.cpMap.put("00903", "903");
            Utils.cpMap.put("IBM-904", "904");
            Utils.cpMap.put("00905", "905");
            Utils.cpMap.put("ISO8859-2", "912");
            Utils.cpMap.put("00913", "913");
            Utils.cpMap.put("ISO8859-4", "914");
            Utils.cpMap.put("ISO8859-5", "915");
            Utils.cpMap.put("ISO8859-8", "916");
            Utils.cpMap.put("00918", "918");
            Utils.cpMap.put("ISO8859-9", "920");
            Utils.cpMap.put("ISO8859-13", "921");
            Utils.cpMap.put("IBM-922", "922");
            Utils.cpMap.put("ISO8859-15", "923");
            Utils.cpMap.put("IBM-924", "924");
            Utils.cpMap.put("00926", "926");
            Utils.cpMap.put("IBM-927", "927");
            Utils.cpMap.put("IBM-928", "928");
            Utils.cpMap.put("IBM-930", "930");
            Utils.cpMap.put("00931", "931");
            Utils.cpMap.put("IBM-eucJC", "932");
            Utils.cpMap.put("IBM-933", "933");
            Utils.cpMap.put("00934", "934");
            Utils.cpMap.put("IBM-935", "935");
            Utils.cpMap.put("IBM-936", "936");
            Utils.cpMap.put("IBM-937", "937");
            Utils.cpMap.put("IBM-938", "938");
            Utils.cpMap.put("IBM-939", "939");
            Utils.cpMap.put("00941", "941");
            Utils.cpMap.put("IBM-942", "942");
            Utils.cpMap.put("IBM-943", "943");
            Utils.cpMap.put("00944", "944");
            Utils.cpMap.put("IBM-946", "946");
            Utils.cpMap.put("IBM-947", "947");
            Utils.cpMap.put("IBM-948", "948");
            Utils.cpMap.put("IBM-949", "949");
            Utils.cpMap.put("BIG5", "950");
            Utils.cpMap.put("IBM-951", "951");
            Utils.cpMap.put("00952", "952");
            Utils.cpMap.put("00953", "953");
            Utils.cpMap.put("00954", "954");
            Utils.cpMap.put("00955", "955");
            Utils.cpMap.put("IBM-956", "956");
            Utils.cpMap.put("IBM-957", "957");
            Utils.cpMap.put("IBM-958", "958");
            Utils.cpMap.put("IBM-959", "959");
            Utils.cpMap.put("00960", "960");
            Utils.cpMap.put("00961", "961");
            Utils.cpMap.put("00963", "963");
            Utils.cpMap.put("IBM-eucTW", "964");
            Utils.cpMap.put("00965", "965");
            Utils.cpMap.put("00966", "966");
            Utils.cpMap.put("IBM-eucKR", "970");
            Utils.cpMap.put("00971", "971");
            Utils.cpMap.put("01002", "1002");
            Utils.cpMap.put("01004", "1004");
            Utils.cpMap.put("01006", "1006");
            Utils.cpMap.put("01008", "1008");
            Utils.cpMap.put("01009", "1009");
            Utils.cpMap.put("01010", "1010");
            Utils.cpMap.put("01011", "1011");
            Utils.cpMap.put("01012", "1012");
            Utils.cpMap.put("01013", "1013");
            Utils.cpMap.put("01014", "1014");
            Utils.cpMap.put("01015", "1015");
            Utils.cpMap.put("01016", "1016");
            Utils.cpMap.put("01017", "1017");
            Utils.cpMap.put("01018", "1018");
            Utils.cpMap.put("01019", "1019");
            Utils.cpMap.put("01020", "1020");
            Utils.cpMap.put("01021", "1021");
            Utils.cpMap.put("01023", "1023");
            Utils.cpMap.put("IBM-1025", "1025");
            Utils.cpMap.put("IBM-1026", "1026");
            Utils.cpMap.put("IBM-1027", "1027");
            Utils.cpMap.put("01040", "1040");
            Utils.cpMap.put("01041", "1041");
            Utils.cpMap.put("01042", "1042");
            Utils.cpMap.put("01043", "1043");
            Utils.cpMap.put("IBM-1046", "1046");
            Utils.cpMap.put("IBM-1047", "1047");
            Utils.cpMap.put("01051", "1051");
            Utils.cpMap.put("IBM-1088", "1088");
            Utils.cpMap.put("ISO8859-6", "1089");
            Utils.cpMap.put("01097", "1097");
            Utils.cpMap.put("01098", "1098");
            Utils.cpMap.put("01100", "1100");
            Utils.cpMap.put("01101", "1101");
            Utils.cpMap.put("01102", "1102");
            Utils.cpMap.put("01103", "1103");
            Utils.cpMap.put("01104", "1104");
            Utils.cpMap.put("01105", "1105");
            Utils.cpMap.put("01106", "1106");
            Utils.cpMap.put("01107", "1107");
            Utils.cpMap.put("IBM-1112", "1112");
            Utils.cpMap.put("01114", "1114");
            Utils.cpMap.put("IBM-1115", "1115");
            Utils.cpMap.put("IBM-1122", "1122");
            Utils.cpMap.put("IBM-1123", "1123");
            Utils.cpMap.put("IBM-1124", "1124");
            Utils.cpMap.put("IBM-1125", "1125");
            Utils.cpMap.put("IBM-1126", "1126");
            Utils.cpMap.put("01129", "1129");
            Utils.cpMap.put("01130", "1130");
            Utils.cpMap.put("01131", "1131");
            Utils.cpMap.put("01132", "1132");
            Utils.cpMap.put("01133", "1133");
            Utils.cpMap.put("01137", "1137");
            Utils.cpMap.put("IBM-1140", "1140");
            Utils.cpMap.put("IBM-1141", "1141");
            Utils.cpMap.put("IBM-1142", "1142");
            Utils.cpMap.put("IBM-1143", "1143");
            Utils.cpMap.put("IBM-1144", "1144");
            Utils.cpMap.put("IBM-1145", "1145");
            Utils.cpMap.put("IBM-1146", "1146");
            Utils.cpMap.put("IBM-1147", "1147");
            Utils.cpMap.put("IBM-1148", "1148");
            Utils.cpMap.put("IBM-1149", "1149");
            Utils.cpMap.put("IBM-1153", "1153");
            Utils.cpMap.put("IBM-1154", "1154");
            Utils.cpMap.put("IBM-1155", "1155");
            Utils.cpMap.put("IBM-1156", "1156");
            Utils.cpMap.put("IBM-1157", "1157");
            Utils.cpMap.put("IBM-1158", "1158");
            Utils.cpMap.put("IBM-1159", "1159");
            Utils.cpMap.put("IBM-1160", "1160");
            Utils.cpMap.put("IBM-1161", "1161");
            Utils.cpMap.put("01162", "1162");
            Utils.cpMap.put("01163", "1163");
            Utils.cpMap.put("01164", "1164");
            Utils.cpMap.put("IBM-1165", "1165");
            Utils.cpMap.put("01166", "1166");
            Utils.cpMap.put("01167", "1167");
            Utils.cpMap.put("01168", "1168");
            Utils.cpMap.put("01200", "1200");
            Utils.cpMap.put("01202", "1202");
            Utils.cpMap.put("UTF-8", "1208");
            Utils.cpMap.put("01210", "1210");
            Utils.cpMap.put("01232", "1232");
            Utils.cpMap.put("IBM-1250", "1250");
            Utils.cpMap.put("IBM-1251", "1251");
            Utils.cpMap.put("IBM-1252", "1252");
            Utils.cpMap.put("IBM-1253", "1253");
            Utils.cpMap.put("IBM-1254", "1254");
            Utils.cpMap.put("IBM-1255", "1255");
            Utils.cpMap.put("IBM-1256", "1256");
            Utils.cpMap.put("01257", "1257");
            Utils.cpMap.put("01258", "1258");
            Utils.cpMap.put("01275", "1275");
            Utils.cpMap.put("01276", "1276");
            Utils.cpMap.put("01277", "1277");
            Utils.cpMap.put("01280", "1280");
            Utils.cpMap.put("01281", "1281");
            Utils.cpMap.put("01282", "1282");
            Utils.cpMap.put("01283", "1283");
            Utils.cpMap.put("01284", "1284");
            Utils.cpMap.put("01285", "1285");
            Utils.cpMap.put("01287", "1287");
            Utils.cpMap.put("01288", "1288");
            Utils.cpMap.put("01350", "1350");
            Utils.cpMap.put("01351", "1351");
            Utils.cpMap.put("IBM-1362", "1362");
            Utils.cpMap.put("IBM-1363", "1363");
            Utils.cpMap.put("IBM-1364", "1364");
            Utils.cpMap.put("IBM-1370", "1370");
            Utils.cpMap.put("IBM-1371", "1371");
            Utils.cpMap.put("01374", "1374");
            Utils.cpMap.put("01375", "1375");
            Utils.cpMap.put("IBM-1380", "1380");
            Utils.cpMap.put("IBM-1381", "1381");
            Utils.cpMap.put("01382", "1382");
            Utils.cpMap.put("IBM-eucCN", "1383");
            Utils.cpMap.put("01385", "1385");
            Utils.cpMap.put("IBM-1386", "1386");
            Utils.cpMap.put("IBM-1388", "1388");
            Utils.cpMap.put("IBM-1390", "1390");
            Utils.cpMap.put("01391", "1391");
            Utils.cpMap.put("01392", "1392");
            Utils.cpMap.put("IBM-1399", "1399");
            Utils.cpMap.put("04133", "4133");
            Utils.cpMap.put("04369", "4369");
            Utils.cpMap.put("04370", "4370");
            Utils.cpMap.put("04371", "4371");
            Utils.cpMap.put("04373", "4373");
            Utils.cpMap.put("04374", "4374");
            Utils.cpMap.put("04376", "4376");
            Utils.cpMap.put("04378", "4378");
            Utils.cpMap.put("04380", "4380");
            Utils.cpMap.put("04381", "4381");
            Utils.cpMap.put("04386", "4386");
            Utils.cpMap.put("04393", "4393");
            Utils.cpMap.put("IBM-4396", "4396");
            Utils.cpMap.put("04397", "4397");
            Utils.cpMap.put("04516", "4516");
            Utils.cpMap.put("04517", "4517");
            Utils.cpMap.put("04519", "4519");
            Utils.cpMap.put("04520", "4520");
            Utils.cpMap.put("04533", "4533");
            Utils.cpMap.put("04596", "4596");
            Utils.cpMap.put("04899", "4899");
            Utils.cpMap.put("04904", "4904");
            Utils.cpMap.put("IBM-4909", "4909");
            Utils.cpMap.put("04929", "4929");
            Utils.cpMap.put("IBM-4930", "4930");
            Utils.cpMap.put("04931", "4931");
            Utils.cpMap.put("04932", "4932");
            Utils.cpMap.put("IBM-4933", "4933");
            Utils.cpMap.put("04934", "4934");
            Utils.cpMap.put("04944", "4944");
            Utils.cpMap.put("04945", "4945");
            Utils.cpMap.put("IBM-4946", "4946");
            Utils.cpMap.put("04947", "4947");
            Utils.cpMap.put("04948", "4948");
            Utils.cpMap.put("04949", "4949");
            Utils.cpMap.put("04951", "4951");
            Utils.cpMap.put("04952", "4952");
            Utils.cpMap.put("04953", "4953");
            Utils.cpMap.put("04954", "4954");
            Utils.cpMap.put("04955", "4955");
            Utils.cpMap.put("04956", "4956");
            Utils.cpMap.put("04957", "4957");
            Utils.cpMap.put("04958", "4958");
            Utils.cpMap.put("04959", "4959");
            Utils.cpMap.put("04960", "4960");
            Utils.cpMap.put("04961", "4961");
            Utils.cpMap.put("04962", "4962");
            Utils.cpMap.put("04963", "4963");
            Utils.cpMap.put("04964", "4964");
            Utils.cpMap.put("04965", "4965");
            Utils.cpMap.put("04966", "4966");
            Utils.cpMap.put("04967", "4967");
            Utils.cpMap.put("04970", "4970");
            Utils.cpMap.put("IBM-4971", "4971");
            Utils.cpMap.put("04976", "4976");
            Utils.cpMap.put("04992", "4992");
            Utils.cpMap.put("04993", "4993");
            Utils.cpMap.put("05012", "5012");
            Utils.cpMap.put("05014", "5014");
            Utils.cpMap.put("05023", "5023");
            Utils.cpMap.put("IBM-5026", "5026");
            Utils.cpMap.put("05028", "5028");
            Utils.cpMap.put("05029", "5029");
            Utils.cpMap.put("IBM-5031", "5031");
            Utils.cpMap.put("05033", "5033");
            Utils.cpMap.put("IBM-5035", "5035");
            Utils.cpMap.put("05038", "5038");
            Utils.cpMap.put("05039", "5039");
            Utils.cpMap.put("05043", "5043");
            Utils.cpMap.put("05045", "5045");
            Utils.cpMap.put("05046", "5046");
            Utils.cpMap.put("05047", "5047");
            Utils.cpMap.put("05048", "5048");
            Utils.cpMap.put("05049", "5049");
            Utils.cpMap.put("05050", "5050");
            Utils.cpMap.put("ISO-2022-JP", "5052");
            Utils.cpMap.put("IBM-5053", "5053");
            Utils.cpMap.put("IBM-5054", "5054");
            Utils.cpMap.put("IBM-5055", "5055");
            Utils.cpMap.put("05056", "5056");
            Utils.cpMap.put("05067", "5067");
            Utils.cpMap.put("05100", "5100");
            Utils.cpMap.put("05104", "5104");
            Utils.cpMap.put("IBM-5123", "5123");
            Utils.cpMap.put("05137", "5137");
            Utils.cpMap.put("05142", "5142");
            Utils.cpMap.put("05143", "5143");
            Utils.cpMap.put("05210", "5210");
            Utils.cpMap.put("05211", "5211");
            Utils.cpMap.put("IBM-5346", "5346");
            Utils.cpMap.put("IBM-5347", "5347");
            Utils.cpMap.put("IBM-5348", "5348");
            Utils.cpMap.put("IBM-5349", "5349");
            Utils.cpMap.put("IBM-5350", "5350");
            Utils.cpMap.put("IBM-5351", "5351");
            Utils.cpMap.put("IBM-5352", "5352");
            Utils.cpMap.put("05353", "5353");
            Utils.cpMap.put("05354", "5354");
            Utils.cpMap.put("05470", "5470");
            Utils.cpMap.put("05471", "5471");
            Utils.cpMap.put("05472", "5472");
            Utils.cpMap.put("05473", "5473");
            Utils.cpMap.put("05476", "5476");
            Utils.cpMap.put("05477", "5477");
            Utils.cpMap.put("05478", "5478");
            Utils.cpMap.put("05479", "5479");
            Utils.cpMap.put("05486", "5486");
            Utils.cpMap.put("05487", "5487");
            Utils.cpMap.put("IBM-5488", "5488");
            Utils.cpMap.put("05495", "5495");
            Utils.cpMap.put("08229", "8229");
            Utils.cpMap.put("08448", "8448");
            Utils.cpMap.put("IBM-8482", "8482");
            Utils.cpMap.put("08492", "8492");
            Utils.cpMap.put("08493", "8493");
            Utils.cpMap.put("08612", "8612");
            Utils.cpMap.put("08629", "8629");
            Utils.cpMap.put("08692", "8692");
            Utils.cpMap.put("09025", "9025");
            Utils.cpMap.put("09026", "9026");
            Utils.cpMap.put("IBM-9027", "9027");
            Utils.cpMap.put("09028", "9028");
            Utils.cpMap.put("09030", "9030");
            Utils.cpMap.put("09042", "9042");
            Utils.cpMap.put("IBM-9044", "9044");
            Utils.cpMap.put("09047", "9047");
            Utils.cpMap.put("09048", "9048");
            Utils.cpMap.put("09049", "9049");
            Utils.cpMap.put("09056", "9056");
            Utils.cpMap.put("09060", "9060");
            Utils.cpMap.put("IBM-9061", "9061");
            Utils.cpMap.put("09064", "9064");
            Utils.cpMap.put("09066", "9066");
            Utils.cpMap.put("09088", "9088");
            Utils.cpMap.put("09089", "9089");
            Utils.cpMap.put("09122", "9122");
            Utils.cpMap.put("09124", "9124");
            Utils.cpMap.put("09125", "9125");
            Utils.cpMap.put("09127", "9127");
            Utils.cpMap.put("09131", "9131");
            Utils.cpMap.put("09139", "9139");
            Utils.cpMap.put("09142", "9142");
            Utils.cpMap.put("09144", "9144");
            Utils.cpMap.put("09145", "9145");
            Utils.cpMap.put("09146", "9146");
            Utils.cpMap.put("09163", "9163");
            Utils.cpMap.put("IBM-9238", "9238");
            Utils.cpMap.put("09306", "9306");
            Utils.cpMap.put("09444", "9444");
            Utils.cpMap.put("09447", "9447");
            Utils.cpMap.put("09448", "9448");
            Utils.cpMap.put("09449", "9449");
            Utils.cpMap.put("09572", "9572");
            Utils.cpMap.put("09574", "9574");
            Utils.cpMap.put("09575", "9575");
            Utils.cpMap.put("09577", "9577");
            Utils.cpMap.put("09580", "9580");
            Utils.cpMap.put("12544", "12544");
            Utils.cpMap.put("12588", "12588");
            Utils.cpMap.put("IBM-12712", "12712");
            Utils.cpMap.put("12725", "12725");
            Utils.cpMap.put("12788", "12788");
            Utils.cpMap.put("IBM-13121", "13121");
            Utils.cpMap.put("IBM-13124", "13124");
            Utils.cpMap.put("13125", "13125");
            Utils.cpMap.put("13140", "13140");
            Utils.cpMap.put("13143", "13143");
            Utils.cpMap.put("13145", "13145");
            Utils.cpMap.put("13152", "13152");
            Utils.cpMap.put("13156", "13156");
            Utils.cpMap.put("13157", "13157");
            Utils.cpMap.put("13162", "13162");
            Utils.cpMap.put("13184", "13184");
            Utils.cpMap.put("13185", "13185");
            Utils.cpMap.put("13218", "13218");
            Utils.cpMap.put("13219", "13219");
            Utils.cpMap.put("13221", "13221");
            Utils.cpMap.put("13223", "13223");
            Utils.cpMap.put("13235", "13235");
            Utils.cpMap.put("13238", "13238");
            Utils.cpMap.put("13240", "13240");
            Utils.cpMap.put("13241", "13241");
            Utils.cpMap.put("13242", "13242");
            Utils.cpMap.put("UCS-2", "13488");
            Utils.cpMap.put("13671", "13671");
            Utils.cpMap.put("13676", "13676");
            Utils.cpMap.put("16421", "16421");
            Utils.cpMap.put("IBM-16684", "16684");
            Utils.cpMap.put("IBM-16804", "16804");
            Utils.cpMap.put("16821", "16821");
            Utils.cpMap.put("16884", "16884");
            Utils.cpMap.put("17221", "17221");
            Utils.cpMap.put("17240", "17240");
            Utils.cpMap.put("IBM-17248", "17248");
            Utils.cpMap.put("17314", "17314");
            Utils.cpMap.put("17331", "17331");
            Utils.cpMap.put("17337", "17337");
            Utils.cpMap.put("17354", "17354");
            Utils.cpMap.put("17584", "17584");
            Utils.cpMap.put("20517", "20517");
            Utils.cpMap.put("20780", "20780");
            Utils.cpMap.put("20917", "20917");
            Utils.cpMap.put("20980", "20980");
            Utils.cpMap.put("21314", "21314");
            Utils.cpMap.put("21317", "21317");
            Utils.cpMap.put("21344", "21344");
            Utils.cpMap.put("21427", "21427");
            Utils.cpMap.put("21433", "21433");
            Utils.cpMap.put("21450", "21450");
            Utils.cpMap.put("21680", "21680");
            Utils.cpMap.put("24613", "24613");
            Utils.cpMap.put("24876", "24876");
            Utils.cpMap.put("24877", "24877");
            Utils.cpMap.put("25013", "25013");
            Utils.cpMap.put("25076", "25076");
            Utils.cpMap.put("25426", "25426");
            Utils.cpMap.put("25427", "25427");
            Utils.cpMap.put("25428", "25428");
            Utils.cpMap.put("25429", "25429");
            Utils.cpMap.put("25431", "25431");
            Utils.cpMap.put("25432", "25432");
            Utils.cpMap.put("25433", "25433");
            Utils.cpMap.put("25436", "25436");
            Utils.cpMap.put("25437", "25437");
            Utils.cpMap.put("25438", "25438");
            Utils.cpMap.put("25439", "25439");
            Utils.cpMap.put("25440", "25440");
            Utils.cpMap.put("25441", "25441");
            Utils.cpMap.put("25442", "25442");
            Utils.cpMap.put("25444", "25444");
            Utils.cpMap.put("25445", "25445");
            Utils.cpMap.put("25450", "25450");
            Utils.cpMap.put("25467", "25467");
            Utils.cpMap.put("25473", "25473");
            Utils.cpMap.put("25479", "25479");
            Utils.cpMap.put("25480", "25480");
            Utils.cpMap.put("25502", "25502");
            Utils.cpMap.put("25503", "25503");
            Utils.cpMap.put("25504", "25504");
            Utils.cpMap.put("25508", "25508");
            Utils.cpMap.put("25510", "25510");
            Utils.cpMap.put("25512", "25512");
            Utils.cpMap.put("25514", "25514");
            Utils.cpMap.put("25518", "25518");
            Utils.cpMap.put("25520", "25520");
            Utils.cpMap.put("25522", "25522");
            Utils.cpMap.put("25524", "25524");
            Utils.cpMap.put("25525", "25525");
            Utils.cpMap.put("25527", "25527");
            Utils.cpMap.put("25546", "25546");
            Utils.cpMap.put("25580", "25580");
            Utils.cpMap.put("25616", "25616");
            Utils.cpMap.put("25617", "25617");
            Utils.cpMap.put("25618", "25618");
            Utils.cpMap.put("25619", "25619");
            Utils.cpMap.put("25664", "25664");
            Utils.cpMap.put("25690", "25690");
            Utils.cpMap.put("25691", "25691");
            Utils.cpMap.put("IBM-28709", "28709");
            Utils.cpMap.put("29109", "29109");
            Utils.cpMap.put("29172", "29172");
            Utils.cpMap.put("29522", "29522");
            Utils.cpMap.put("29523", "29523");
            Utils.cpMap.put("29524", "29524");
            Utils.cpMap.put("29525", "29525");
            Utils.cpMap.put("29527", "29527");
            Utils.cpMap.put("29528", "29528");
            Utils.cpMap.put("29529", "29529");
            Utils.cpMap.put("29532", "29532");
            Utils.cpMap.put("29533", "29533");
            Utils.cpMap.put("29534", "29534");
            Utils.cpMap.put("29535", "29535");
            Utils.cpMap.put("29536", "29536");
            Utils.cpMap.put("29537", "29537");
            Utils.cpMap.put("29540", "29540");
            Utils.cpMap.put("29541", "29541");
            Utils.cpMap.put("29546", "29546");
            Utils.cpMap.put("29614", "29614");
            Utils.cpMap.put("29616", "29616");
            Utils.cpMap.put("29618", "29618");
            Utils.cpMap.put("29620", "29620");
            Utils.cpMap.put("29621", "29621");
            Utils.cpMap.put("29623", "29623");
            Utils.cpMap.put("29712", "29712");
            Utils.cpMap.put("29713", "29713");
            Utils.cpMap.put("29714", "29714");
            Utils.cpMap.put("29715", "29715");
            Utils.cpMap.put("29760", "29760");
            Utils.cpMap.put("32805", "32805");
            Utils.cpMap.put("33058", "33058");
            Utils.cpMap.put("33205", "33205");
            Utils.cpMap.put("33268", "33268");
            Utils.cpMap.put("33618", "33618");
            Utils.cpMap.put("33619", "33619");
            Utils.cpMap.put("33620", "33620");
            Utils.cpMap.put("33621", "33621");
            Utils.cpMap.put("33623", "33623");
            Utils.cpMap.put("33624", "33624");
            Utils.cpMap.put("33632", "33632");
            Utils.cpMap.put("33636", "33636");
            Utils.cpMap.put("33637", "33637");
            Utils.cpMap.put("33665", "33665");
            Utils.cpMap.put("33698", "33698");
            Utils.cpMap.put("33699", "33699");
            Utils.cpMap.put("33700", "33700");
            Utils.cpMap.put("33717", "33717");
            Utils.cpMap.put("EUCJP", "33722");
            Utils.cpMap.put("37301", "37301");
            Utils.cpMap.put("37719", "37719");
            Utils.cpMap.put("37728", "37728");
            Utils.cpMap.put("37732", "37732");
            Utils.cpMap.put("37761", "37761");
            Utils.cpMap.put("37813", "37813");
            Utils.cpMap.put("41397", "41397");
            Utils.cpMap.put("41460", "41460");
            Utils.cpMap.put("41824", "41824");
            Utils.cpMap.put("41828", "41828");
            Utils.cpMap.put("45493", "45493");
            Utils.cpMap.put("45556", "45556");
            Utils.cpMap.put("45920", "45920");
            Utils.cpMap.put("49589", "49589");
            Utils.cpMap.put("49652", "49652");
            Utils.cpMap.put("IBM-53668", "53668");
            Utils.cpMap.put("53685", "53685");
            Utils.cpMap.put("53748", "53748");
            Utils.cpMap.put("54189", "54189");
            Utils.cpMap.put("IBM-54191", "54191");
            Utils.cpMap.put("54289", "54289");
            Utils.cpMap.put("61696", "61696");
            Utils.cpMap.put("61697", "61697");
            Utils.cpMap.put("61698", "61698");
            Utils.cpMap.put("61699", "61699");
            Utils.cpMap.put("61700", "61700");
            Utils.cpMap.put("61710", "61710");
            Utils.cpMap.put("61711", "61711");
            Utils.cpMap.put("61712", "61712");
            Utils.cpMap.put("61953", "61953");
            Utils.cpMap.put("61956", "61956");
            Utils.cpMap.put("62337", "62337");
            Utils.cpMap.put("62381", "62381");
            Utils.cpMap.put("IBM-62383", "62383");
            if (Utils.cpMap.containsKey(codePage)) {
                final String ccsidNum = Utils.cpMap.get(codePage);
                ccsidValue = Integer.parseInt(ccsidNum);
            }
        }
        return ccsidValue;
    }
    
    public static Boolean isBuildReportOnly() {
        return Boolean.valueOf(BuildProperties.getProperty("dbb.command.reportOnly"));
    }
    
    static {
        Utils.logger = LoggerFactory.getLogger((Class)Utils.class);
        NL = System.getProperty("line.separator");
        FILE_SEPARATOR = System.getProperty("file.separator");
        cpMap = new HashMap<String, String>();
    }
    
    private static class ProcessOutputHandler extends Thread
    {
        private InputStream is;
        private StringBuilder buffer;
        
        public ProcessOutputHandler(final InputStream is, final StringBuilder buffer) {
            this.is = is;
            this.buffer = buffer;
        }
        
        @Override
        public void run() {
            try {
                final BufferedReader br = new BufferedReader(new InputStreamReader(this.is));
                String line;
                while ((line = br.readLine()) != null) {
                    this.buffer.append(line);
                    this.buffer.append(DBBConstants.DEFAULT_NEWLINE);
                }
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            finally {
                try {
                    if (this.is != null) {
                        this.is.close();
                    }
                }
                catch (IOException ex) {}
            }
        }
    }
}
