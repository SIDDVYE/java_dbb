// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

public class ProductRegistrationResult
{
    ProductInformation product;
    int rc;
    String msg;
    byte[] token;
    
    ProductRegistrationResult(final ProductInformation product, final int rc, final String msg, final byte[] token) {
        this.product = product;
        this.rc = rc;
        this.msg = msg;
        this.token = token;
    }
    
    public ProductInformation getProduct() {
        return this.product;
    }
    
    public int getRc() {
        return this.rc;
    }
    
    public String getMsg() {
        return this.msg;
    }
    
    public byte[] getToken() {
        return this.token;
    }
    
    public void setProduct(final ProductInformation product) {
        this.product = product;
    }
    
    public void setRc(final int rc) {
        this.rc = rc;
    }
    
    public void setMsg(final String msg) {
        this.msg = msg;
    }
    
    public void setToken(final byte[] token) {
        this.token = token;
    }
}
