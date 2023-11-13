// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify;

public class ClassifierReservedWord
{
    private int tokenAttrTypeId;
    private int tokenWordType;
    private int tokenWeight;
    private String token;
    private String tokenType;
    
    public ClassifierReservedWord(final String iToken, final int iTokenAttrTypeId, final String iTokenType, final int iTokenWeight) {
        this.token = iToken;
        this.tokenAttrTypeId = iTokenAttrTypeId;
        this.tokenType = iTokenType;
        this.tokenWeight = iTokenWeight;
        this.tokenWordType = 0;
    }
    
    public String getToken() {
        return this.token;
    }
    
    public int getTokenAttrTypeId() {
        return this.tokenAttrTypeId;
    }
    
    public String getTokenType() {
        return this.tokenType;
    }
    
    public int getTokenWordType() {
        return this.tokenWordType;
    }
    
    public int getTokenWeight() {
        return this.tokenWeight;
    }
    
    public void setTokenWeight(final int iSetting) {
        this.tokenWeight = iSetting;
    }
    
    public void setTokenWordType(final int iSetting) {
        this.tokenWordType = iSetting;
    }
}
