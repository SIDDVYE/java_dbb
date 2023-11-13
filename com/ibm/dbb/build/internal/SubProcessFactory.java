// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import java.util.Iterator;
import org.slf4j.LoggerFactory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import org.slf4j.Logger;

public class SubProcessFactory
{
    private static Logger logger;
    private static ReentrantLock lock;
    private static ConcurrentLinkedQueue<SubProcess> subProcesses;
    
    public static SubProcess newSubProcess() {
        try {
            SubProcessFactory.lock.lock();
            final SubProcess subProcess = new SubProcess();
            SubProcessFactory.subProcesses.add(subProcess);
            return subProcess;
        }
        finally {
            SubProcessFactory.lock.unlock();
        }
    }
    
    static {
        SubProcessFactory.logger = LoggerFactory.getLogger((Class)SubProcessFactory.class);
        SubProcessFactory.lock = new ReentrantLock();
        SubProcessFactory.subProcesses = new ConcurrentLinkedQueue<SubProcess>();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                SubProcessFactory.logger.debug("Shutting down " + SubProcessFactory.subProcesses.size() + " sub-processes ");
                for (final SubProcess subProcess : SubProcessFactory.subProcesses) {
                    try {
                        final int rc = subProcess.stop();
                        SubProcessFactory.logger.debug("Stopping: " + subProcess.getPid() + " successfully : " + rc);
                    }
                    catch (Exception e) {
                        SubProcessFactory.logger.error(e.getMessage(), (Throwable)e);
                    }
                }
            }
        });
    }
}
