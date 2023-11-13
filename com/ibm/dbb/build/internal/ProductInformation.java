// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import java.io.IOException;
import com.ibm.json.java.JSONObject;

public class ProductInformation
{
    private String productName;
    private String featureName;
    private String productId;
    private String productVendor;
    private String productMeta;
    private String version;
    private String release;
    private String modification;
    
    public ProductInformation(final String productName, final String featureName, final String productId) {
        this.productName = "";
        this.featureName = "";
        this.productId = "";
        this.productVendor = "";
        this.productMeta = "";
        this.version = "*";
        this.release = "*";
        this.modification = "*";
        this.productName = productName;
        this.featureName = featureName;
        this.productId = productId;
    }
    
    public String getProductName() {
        return this.productName;
    }
    
    public String getFeatureName() {
        return this.featureName;
    }
    
    public String getProductId() {
        return this.productId;
    }
    
    public void setProductName(final String productName) {
        this.productName = productName;
    }
    
    public void setFeatureName(final String featureName) {
        this.featureName = featureName;
    }
    
    public void setProductId(final String productId) {
        this.productId = productId;
    }
    
    public String getProductVendor() {
        return this.productVendor;
    }
    
    public void setProductVendor(final String productVendor) {
        this.productVendor = productVendor;
    }
    
    public JSONObject toJSON() {
        final JSONObject jObj = new JSONObject();
        if (this.featureName != null && this.featureName.length() > 0) {
            jObj.put((Object)"featureName", (Object)this.featureName);
        }
        if (this.productId != null && this.productId.length() > 0) {
            jObj.put((Object)"productId", (Object)this.productId);
        }
        if (this.productName != null && this.productName.length() > 0) {
            jObj.put((Object)"productName", (Object)this.productName);
        }
        if (this.productVendor != null && this.productVendor.length() > 0) {
            jObj.put((Object)"productVendor", (Object)this.productVendor);
        }
        return jObj;
    }
    
    @Override
    public String toString() {
        String s = null;
        try {
            s = this.toJSON().serialize();
        }
        catch (IOException ioe) {
            s = ioe.getMessage();
        }
        return s;
    }
    
    public String getVersion() {
        return this.version;
    }
    
    public String getRelease() {
        return this.release;
    }
    
    public String getModification() {
        return this.modification;
    }
    
    public void setVersion(final String version) {
        this.version = version;
    }
    
    public void setRelease(final String release) {
        this.release = release;
    }
    
    public void setModification(final String modification) {
        this.modification = modification;
    }
    
    public String getProductMeta() {
        return this.productMeta;
    }
    
    public void setProductMeta(final String productMeta) {
        this.productMeta = productMeta;
    }
}
