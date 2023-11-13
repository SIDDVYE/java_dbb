// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.jdbc;

public class PermissionImpl
{
    private long id;
    private String owner;
    private String team;
    private int permission;
    
    PermissionImpl(final long id, final String owner, final String team, final int permission) {
        this.id = -1L;
        this.permission = 436;
        this.id = id;
        this.owner = owner;
        this.team = team;
        this.permission = permission;
    }
    
    public long getId() {
        return this.id;
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        if (owner != null) {
            owner = owner.trim();
        }
        this.owner = owner;
    }
    
    public int getPermission() {
        return this.permission;
    }
    
    public void setPermission(final int permission) {
        this.permission = (permission & 0x1B6);
    }
    
    public String getTeam() {
        return this.team;
    }
    
    public void setTeam(String team) {
        if (team != null) {
            team = team.trim();
        }
        this.team = team;
    }
}
