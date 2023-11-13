// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import org.slf4j.LoggerFactory;
import java.util.concurrent.locks.ReentrantLock;
import org.slf4j.Logger;

public class DDProcessFactory
{
    private static Logger logger;
    private static ThreadLocal<DDProcess> cache;
    private static ReentrantLock lock;
    
    public static DDProcess getDDProcess() {
        DDProcess ddProcess = DDProcessFactory.cache.get();
        if (ddProcess == null) {
            ddProcess = createNewDDProcess();
            DDProcessFactory.cache.set(ddProcess);
        }
        return ddProcess;
    }
    
    private static DDProcess createNewDDProcess() {
        try {
            DDProcessFactory.lock.lock();
            final boolean isEnabledSubProcess = Boolean.parseBoolean(System.getProperty("DBB_SUBPROCESS_ENABLED"));
            DDProcessFactory.logger.debug("Enable SubProcess: " + isEnabledSubProcess);
            DDProcess ddProcess;
            if (isEnabledSubProcess) {
                ddProcess = SubProcessFactory.newSubProcess();
            }
            else {
                ddProcess = newJzosDDProcess();
            }
            return ddProcess;
        }
        finally {
            DDProcessFactory.lock.unlock();
        }
    }
    
    public static DDProcess newJzosDDProcess() {
        return new JzosDDProcess();
    }
    
    static {
        DDProcessFactory.logger = LoggerFactory.getLogger((Class)DDProcessFactory.class);
        DDProcessFactory.cache = new ThreadLocal<DDProcess>();
        DDProcessFactory.lock = new ReentrantLock();
    }
}
