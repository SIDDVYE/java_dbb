// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.atomic.AtomicInteger;

public class TempDDAssignment
{
    private static final String TEMP_DD_PREFIX = "TMP";
    private static final String TEMP_DD_PADDED = "%05d";
    private static AtomicInteger currentIndex;
    private static ReentrantLock lock;
    
    public static String getNextTempDDName() {
        try {
            TempDDAssignment.lock.lock();
            final int index = TempDDAssignment.currentIndex.getAndIncrement();
            return "TMP" + String.format("%05d", index);
        }
        finally {
            TempDDAssignment.lock.unlock();
        }
    }
    
    public static void reset() {
        try {
            TempDDAssignment.lock.lock();
            TempDDAssignment.currentIndex.set(1);
        }
        finally {
            TempDDAssignment.lock.unlock();
        }
    }
    
    static {
        TempDDAssignment.currentIndex = new AtomicInteger(1);
        TempDDAssignment.lock = new ReentrantLock();
    }
}
