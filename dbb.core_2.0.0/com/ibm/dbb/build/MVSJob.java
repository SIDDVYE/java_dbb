// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import org.slf4j.LoggerFactory;
import com.ibm.dbb.build.internal.DDProcessFactory;
import com.ibm.dbb.build.internal.TempDDAssignment;
import java.util.ArrayList;
import java.util.List;
import com.ibm.dbb.build.internal.DDProcess;
import org.slf4j.Logger;

public class MVSJob
{
    private static Logger logger;
    private DDProcess ddProcess;
    private List<IExecute> executables;
    private int maxRC;
    private int failedStepNumber;
    
    public MVSJob() {
        this.maxRC = -1;
        this.executables = new ArrayList<IExecute>();
    }
    
    public void start() {
        TempDDAssignment.reset();
        this.ddProcess = DDProcessFactory.getDDProcess();
    }
    
    public void stop() {
        MVSJob.logger.debug("Stopping MVS Job and free all DD allocated in this Job");
        this.ddProcess.freeAll(true);
        this.ddProcess.dispose();
    }
    
    public int execute() throws BuildException {
        MVSJob.logger.debug("Executing " + this.executables.size() + " steps in this Job");
        int rc = 0;
        if (this.executables.size() > 0) {
            this.start();
            for (int i = 0; i < this.executables.size(); ++i) {
                final IExecute exec = this.executables.get(i);
                rc = exec.execute();
                if (this.maxRC > -1 && rc > this.maxRC) {
                    this.failedStepNumber = i + 1;
                    break;
                }
            }
            this.stop();
        }
        MVSJob.logger.debug("Found " + this.failedStepNumber + " failed to execute in this Job");
        return rc;
    }
    
    public List<IExecute> getExecutables() {
        return this.executables;
    }
    
    public void setExecutables(final List<IExecute> executables) {
        this.executables = executables;
    }
    
    public void addExecutable(final IExecute executable) {
        this.executables.add(executable);
    }
    
    public int getMaxRC() {
        return this.maxRC;
    }
    
    public int getFailedStepNumber() {
        return this.failedStepNumber;
    }
    
    public void setMaxRC(final int maxRC) {
        this.maxRC = maxRC;
    }
    
    public MVSJob executable(final IExecute executable) {
        this.addExecutable(executable);
        return this;
    }
    
    public MVSJob maxRC(final int maxRC) {
        this.setMaxRC(maxRC);
        return this;
    }
    
    static {
        MVSJob.logger = LoggerFactory.getLogger((Class)MVSJob.class);
    }
}
