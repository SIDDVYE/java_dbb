// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.filesystem;

import java.io.Reader;
import java.io.FileReader;
import java.io.Writer;
import java.io.FileWriter;
import com.ibm.json.java.JSONObject;
import java.util.Map;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Set;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import com.ibm.dbb.build.BuildException;
import java.nio.file.LinkOption;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.StandardCopyOption;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.FileVisitOption;
import java.nio.file.Paths;
import java.io.File;
import com.ibm.dbb.metadata.common.MetadataStoreConstants;

public class Utils implements MetadataStoreConstants
{
    public static boolean deleteDirectory(final File directory) {
        if (!directory.exists()) {
            return false;
        }
        final File[] allFilesAndFolders = directory.listFiles();
        if (allFilesAndFolders != null) {
            for (final File file : allFilesAndFolders) {
                deleteDirectory(file);
            }
        }
        return directory.delete();
    }
    
    public static void copyDirectory(final File sourceDir, final File destDir) {
        copyDirectory(sourceDir.getAbsolutePath(), destDir.getAbsolutePath());
    }
    
    public static void copyDirectory(final String sourceDir, final String destDir) {
        try {
            final Path destination;
            Files.walk(Paths.get(sourceDir, new String[0]), new FileVisitOption[0]).forEach(source -> {
                destination = Paths.get(destDir, source.toString().substring(sourceDir.length()));
                try {
                    Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
                }
                catch (DirectoryNotEmptyException ex) {}
                catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            });
        }
        catch (IOException ioe) {
            System.out.println("Unable to copy...");
        }
    }
    
    protected static void setOwner(final String owner, final File file) throws BuildException {
        final UserPrincipalLookupService lookupService = FileSystems.getDefault().getUserPrincipalLookupService();
        try {
            final UserPrincipal newOwner = lookupService.lookupPrincipalByName(owner);
            Files.getFileAttributeView(file.toPath(), FileOwnerAttributeView.class, new LinkOption[0]).setOwner(newOwner);
        }
        catch (UserPrincipalNotFoundException upnfe) {
            throw new BuildException("Unable to set owner '" + owner + "' for file " + file.getAbsolutePath() + ". User does not Exist. ", upnfe);
        }
        catch (FileSystemException fse) {
            throw new BuildException("An exception occurred while setting owner for " + file.getAbsolutePath() + ". Do you have elevated permissions? ", fse);
        }
        catch (IOException ioe) {
            throw new BuildException("An exception occured while setting owner for " + file.getAbsolutePath(), ioe);
        }
    }
    
    protected static void setGroup(final String groupName, final File file) throws BuildException {
        final UserPrincipalLookupService lookupService = FileSystems.getDefault().getUserPrincipalLookupService();
        try {
            final GroupPrincipal group = lookupService.lookupPrincipalByGroupName(groupName);
            Files.getFileAttributeView(file.toPath(), PosixFileAttributeView.class, LinkOption.NOFOLLOW_LINKS).setGroup(group);
        }
        catch (UserPrincipalNotFoundException upnfe) {
            throw new BuildException("Unable to set group '" + groupName + "' for file " + file.getAbsolutePath() + ". Group does not Exist. ", upnfe);
        }
        catch (IOException ioe) {
            throw new BuildException("An exception occured while setting group for " + file.getAbsolutePath(), ioe);
        }
    }
    
    protected static void setPosixFilePermissions(final int permissions, final File file) throws IOException {
        int mask = 256;
        final Set<PosixFilePermission> perms = new HashSet<PosixFilePermission>();
        if ((mask & permissions) != 0x0) {
            perms.add(PosixFilePermission.OWNER_READ);
        }
        mask >>= 1;
        if ((mask & permissions) != 0x0) {
            perms.add(PosixFilePermission.OWNER_WRITE);
        }
        mask >>= 1;
        if ((mask & permissions) != 0x0) {
            perms.add(PosixFilePermission.OWNER_EXECUTE);
        }
        mask >>= 1;
        if ((mask & permissions) != 0x0) {
            perms.add(PosixFilePermission.GROUP_READ);
        }
        mask >>= 1;
        if ((mask & permissions) != 0x0) {
            perms.add(PosixFilePermission.GROUP_WRITE);
        }
        mask >>= 1;
        if ((mask & permissions) != 0x0) {
            perms.add(PosixFilePermission.GROUP_EXECUTE);
        }
        mask >>= 1;
        if ((mask & permissions) != 0x0) {
            perms.add(PosixFilePermission.OTHERS_READ);
        }
        mask >>= 1;
        if ((mask & permissions) != 0x0) {
            perms.add(PosixFilePermission.OTHERS_WRITE);
        }
        mask >>= 1;
        if ((mask & permissions) != 0x0) {
            perms.add(PosixFilePermission.OTHERS_EXECUTE);
        }
        mask >>= 1;
        Files.setPosixFilePermissions(file.toPath(), perms);
    }
    
    public static String relativizePath(final File base, final File file) {
        return relativizePath(base.getAbsolutePath(), file.getAbsolutePath());
    }
    
    public static String relativizePath(final String base, final String absolutePath) {
        final Path basePath = Paths.get(base, new String[0]);
        final Path filePath = Paths.get(absolutePath, new String[0]);
        final Path relativePath = basePath.relativize(filePath);
        return relativePath.toString();
    }
    
    public static String createSafeFileName(final String name) {
        return name.replaceAll("\\W+", "");
    }
    
    public static String encodeFilename(final String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 is an unknown encoding!?");
        }
    }
    
    public static String decodeFilename(final String s) {
        try {
            return URLDecoder.decode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 is an unknown encoding!?");
        }
    }
    
    public static String createBuildName(final Integer number) {
        return "build-" + number.toString();
    }
    
    public static boolean isFileModified(final File file, final long lastModifiedTime) {
        final long modified = file.lastModified();
        return modified != lastModifiedTime;
    }
    
    protected static List<String> listDecodeFilenames(final File folder) {
        final List<String> decodedFilenames = new ArrayList<String>();
        for (final String pathname : listFilenames(folder)) {
            decodedFilenames.add(decodeFilename(pathname));
        }
        return decodedFilenames;
    }
    
    public static List<String> listFilenames(final File folder) {
        return Arrays.asList(folder.list());
    }
    
    protected static void saveMap(final Map<?, ?> map, final File saveFile) throws FileSystemStoreException {
        if (map instanceof JSONObject) {
            final JSONObject jObj = (JSONObject)map;
            try {
                final FileWriter fw = new FileWriter(saveFile);
                jObj.serialize((Writer)fw);
            }
            catch (SecurityException se) {
                throw new FileSystemStoreException("Unable to save file. User does not have required permissions", se);
            }
            catch (Exception e) {
                throw new FileSystemStoreException("An error occured while saving file.", e);
            }
            return;
        }
        throw new FileSystemStoreException("Unable to save map, not instance of JSONObject");
    }
    
    protected static void loadMap(final Map<?, ?> map, final File saveFile) throws FileSystemStoreException {
        try {
            final FileReader reader = new FileReader(saveFile);
            map.clear();
            map.putAll((Map<?, ?>)JSONObject.parse((Reader)reader));
        }
        catch (SecurityException se) {
            throw new FileSystemStoreException("Unable to load file. User does not have required permissions. ", se);
        }
        catch (ClassCastException cce) {
            throw new FileSystemStoreException("An unnexpected object encountered during JSON parsing.", cce);
        }
        catch (Exception e) {
            throw new FileSystemStoreException("An error occured while loading file.", e);
        }
    }
}
