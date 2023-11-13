// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.ext.buildprocess;

import java.security.Permission;
import java.util.Scanner;

public abstract class AbstractBuildProcess
{
    protected boolean debug;
    
    public void run() {
        while (true) {
            final Scanner in = new Scanner(System.in);
            System.setSecurityManager(new CatchExitSecurityManager());
            this.debug("Starting " + this.getClass().getCanonicalName() + " . . .");
            while (true) {
                try {
                    Thread.sleep(250L);
                    while (in.hasNextLine()) {
                        final String input = in.nextLine();
                        this.debug("Input: " + input);
                        if (input.equals("__STOP__")) {
                            System.out.println("__RC=-999__");
                            in.close();
                            return;
                        }
                        if (input.equals("__PING__")) {
                            System.out.println("__RC=0__");
                        }
                        else {
                            try {
                                this.runProcess(input);
                                System.out.println("__RC=0__");
                            }
                            catch (SecurityException se) {
                                final String message = se.getMessage();
                                if (message != null && message.startsWith("__RC=")) {
                                    System.out.println(message);
                                }
                                else {
                                    se.printStackTrace(System.out);
                                    System.out.println("__RC=-100__");
                                }
                            }
                            catch (Exception e) {
                                e.printStackTrace(System.out);
                                System.out.println("__RC=-100__");
                            }
                        }
                    }
                }
                catch (IllegalStateException e2) {}
                catch (Exception e) {
                    e.printStackTrace();
                }
                finally {
                    in.close();
                }
                continue;
            }
        }
    }
    
    public abstract void runProcess(final String p0) throws Exception;
    
    protected void debug(final String message) {
        if (this.debug) {
            System.out.println(message);
        }
    }
    
    public class CatchExitSecurityManager extends SecurityManager
    {
        @Override
        public void checkExit(final int status) {
            throw new SecurityException("__RC=" + status + "__");
        }
        
        @Override
        public void checkPermission(final Permission perm) {
        }
        
        @Override
        public void checkPermission(final Permission perm, final Object context) {
        }
    }
}
