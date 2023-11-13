// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import com.ibm.dbb.build.ValidationException;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.DDStatement;
import java.util.List;
import com.ibm.jzos.ZFile;
import java.io.File;

public class ValidationHelper
{
    public static void isTrue(final boolean condition, final String message) {
        if (!condition) {
            fail(message);
        }
    }
    
    public static void isNotNull(final Object object, final String message) {
        isTrue(object != null, message);
    }
    
    public static void fileExists(final File file, final String message) {
        isTrue(file.exists(), message);
    }
    
    public static void datasetExists(final String dataset, final String message) {
        try {
            isTrue(ZFile.exists(dataset), message);
        }
        catch (Exception e) {
            fail(message);
        }
    }
    
    public static void isDDDefined(final List<DDStatement> ddStatements, final String ddName, final String message) {
        if (Utils.findDD(ddStatements, ddName) == null) {
            fail(message);
        }
    }
    
    public static void handleBuildException(final BuildException be) {
        if (be != null) {
            fail(be.getMessage());
        }
    }
    
    private static void fail(final String message) {
        throw new ValidationException(message);
    }
}
