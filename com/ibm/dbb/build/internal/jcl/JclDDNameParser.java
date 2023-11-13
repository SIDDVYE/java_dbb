// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal.jcl;

public class JclDDNameParser
{
    private String ddName;
    private String stepName;
    private String procStepName;
    
    public JclDDNameParser(final String ddName) {
        this.ddName = null;
        this.stepName = null;
        this.procStepName = null;
        if (ddName == null) {
            throw new NullPointerException("ddName");
        }
        final String[] parts = ddName.split(":", -1);
        this.ddName = parts[0];
        this.stepName = ((parts.length < 2) ? "*" : parts[1]);
        this.procStepName = ((parts.length < 3) ? "*" : parts[2]);
    }
    
    public boolean isAllDDNames() {
        return this.ddName.equals("*");
    }
    
    public boolean isAllStepNames() {
        return this.stepName.equals("*");
    }
    
    public boolean isAllProcStepNames() {
        return this.procStepName.equals("*");
    }
    
    public String getDDName() {
        return this.ddName;
    }
    
    public String getStepName() {
        return this.stepName;
    }
    
    public String getProcStepName() {
        return this.procStepName;
    }
    
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(this.ddName + ":" + this.stepName + ":" + this.procStepName);
        return builder.toString();
    }
}
