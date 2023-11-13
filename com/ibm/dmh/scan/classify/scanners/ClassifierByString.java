// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import com.ibm.dmh.scan.classify.ScanProperties;

public class ClassifierByString extends Classifier
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2011, 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    
    protected ClassifierByString(final ScanProperties scanProperties) {
        super(scanProperties);
    }
    
    public boolean checkString(final String iFileContent) {
        return false;
    }
}
