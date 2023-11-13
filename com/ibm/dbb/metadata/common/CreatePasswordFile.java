// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.common;

import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;
import java.io.Console;
import com.ibm.jzos.FileAttribute;
import java.io.IOException;
import java.nio.file.Files;
import java.io.File;
import java.nio.file.attribute.PosixFilePermissions;

public class CreatePasswordFile
{
    public static void main(final String[] args) {
        final String fileName = args[0];
        final Console console = System.console();
        final char[] password = console.readPassword("Enter password: ", new Object[0]);
        final Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-------");
        final File passwordFile = new File(fileName);
        final PasswordUtil util = new PasswordUtil();
        try {
            util.encryptPasswordFile(passwordFile, password);
            Files.setPosixFilePermissions(passwordFile.toPath(), permissions);
        }
        catch (IOException ioe) {
            System.err.println("IO Exception caught: " + ioe);
        }
        final FileAttribute.Tag tag = new FileAttribute.Tag('\u0333', true);
        FileAttribute.setTag(passwordFile.getAbsolutePath(), tag);
    }
}
