// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ConcurrentHashMap;

public class BlockingMap<K, V> extends ConcurrentHashMap<K, V>
{
    private Semaphore semaphore;
    
    public BlockingMap() {
        this.semaphore = new Semaphore(1);
    }
    
    public boolean waitUntilEmpty(final long timeout, final TimeUnit unit) {
        try {
            if (!this.semaphore.tryAcquire(timeout, unit)) {
                return false;
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    @Override
    public V put(final K key, final V value) {
        final V v = super.put(key, value);
        this.setSemaphoreState();
        return v;
    }
    
    @Override
    public V remove(final Object key) {
        final V v = super.remove(key);
        this.setSemaphoreState();
        return v;
    }
    
    @Override
    public void clear() {
        super.clear();
        this.setSemaphoreState();
    }
    
    private void setSemaphoreState() {
        try {
            if (this.isEmpty()) {
                if (this.semaphore.availablePermits() == 0) {
                    this.semaphore.release();
                }
            }
            else if (this.semaphore.availablePermits() == 1) {
                this.semaphore.acquire();
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
