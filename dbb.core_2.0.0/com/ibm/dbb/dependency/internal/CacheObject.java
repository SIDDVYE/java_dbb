// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency.internal;

final class CacheObject<T>
{
    private long sequence;
    private T cachedObject;
    
    public CacheObject(final long seq, final T obj) {
        this.sequence = 0L;
        this.cachedObject = null;
        this.setSequence(seq);
        this.setCachedObject(obj);
    }
    
    public void setSequence(final long seq) {
        this.sequence = seq;
    }
    
    public long getSequence() {
        return this.sequence;
    }
    
    public void setCachedObject(final T obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cached Object must not be null");
        }
        this.cachedObject = obj;
    }
    
    public T getCachedObject() {
        return this.cachedObject;
    }
    
    @Override
    public boolean equals(final Object obj) {
        return this.getClass() == obj.getClass() && this.cachedObject.equals(((CacheObject)obj).getCachedObject());
    }
    
    @Override
    public int hashCode() {
        return this.cachedObject.hashCode();
    }
    
    @Override
    public String toString() {
        return "Sequence:" + this.sequence + ", Object:" + this.cachedObject + ", hashCode:" + this.hashCode() + "\n";
    }
}
