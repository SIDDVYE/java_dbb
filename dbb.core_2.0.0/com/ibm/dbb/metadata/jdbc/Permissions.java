// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.jdbc;

public enum Permissions
{
    NONE(0), 
    WRITE(2), 
    READ(4), 
    READ_WRITE(6);
    
    private int permission;
    
    private Permissions(final int permission) {
        this.permission = permission;
    }
    
    public int getPermission() {
        return this.permission;
    }
}
