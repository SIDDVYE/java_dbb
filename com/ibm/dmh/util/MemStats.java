// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.TimerTask;
import java.util.Timer;

public class MemStats
{
    private static final String copyright = "Licensed Material - Property of IBM\n56724-V27\nCopyright IBM Corp. 2009, 2016\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    public long maxMaxMemory;
    public long maxTotalMemory;
    public long maxFreeMemory;
    public long maxUsedMemory;
    public long initUsedMemory;
    private Runtime r;
    private boolean isStarted;
    private Timer timer;
    
    public MemStats() {
        this.r = Runtime.getRuntime();
        this.initUsedMemory = this.r.totalMemory() - this.r.freeMemory();
        this.calcStats();
    }
    
    private void calcStats() {
        final long maxMemory = this.r.maxMemory();
        final long totalMemory = this.r.totalMemory();
        final long freeMemory = this.r.freeMemory();
        final long usedMemory = totalMemory - freeMemory;
        this.maxMaxMemory = Math.max(this.maxMaxMemory, maxMemory);
        this.maxTotalMemory = Math.max(this.maxTotalMemory, totalMemory);
        this.maxFreeMemory = Math.max(this.maxFreeMemory, freeMemory);
        this.maxUsedMemory = Math.max(this.maxUsedMemory, usedMemory);
    }
    
    public String instantStats() {
        this.calcStats();
        return "Max memory=[" + this.getMaxMemory() + "], Total memory=[" + this.getTotalMemory() + "], Used memory=[" + this.getUsedMemory() + "], Delta used memory=[" + this.getDeltaUsedMemory() + "]";
    }
    
    public int getPercentFreeMemory() {
        this.calcStats();
        final long usedMemory = this.r.totalMemory() - this.r.freeMemory();
        final long maxMemory = this.r.maxMemory();
        return (int)((maxMemory - usedMemory) * 100L / maxMemory);
    }
    
    public void startup(final long period) {
        if (this.isStarted) {
            return;
        }
        (this.timer = new Timer()).schedule(new TimerTask() {
            @Override
            public void run() {
                MemStats.this.calcStats();
            }
        }, period, period);
        this.isStarted = true;
    }
    
    public void shutdown() {
        this.timer.cancel();
    }
    
    public String getMaxMemory() {
        return getByteLabel(this.r.maxMemory());
    }
    
    public String getMaxMaxMemory() {
        return getByteLabel(this.maxMaxMemory);
    }
    
    public String getTotalMemory() {
        return getByteLabel(this.r.totalMemory());
    }
    
    public String getMaxTotalMemory() {
        return getByteLabel(this.maxTotalMemory);
    }
    
    public String getUsedMemory() {
        return getByteLabel(this.r.totalMemory() - this.r.freeMemory());
    }
    
    public String getMaxUsedMemory() {
        return getByteLabel(this.maxUsedMemory);
    }
    
    public String getFreeMemory() {
        return getByteLabel(this.r.freeMemory());
    }
    
    public String getMaxFreeMemory() {
        return getByteLabel(this.maxFreeMemory);
    }
    
    public String getDeltaUsedMemory() {
        return getByteLabel(this.r.totalMemory() - this.r.freeMemory() - this.initUsedMemory);
    }
    
    private static String getByteLabel(long n) {
        final boolean isNegative = n < 0L;
        n = Math.abs(n);
        double f = (double)n;
        String units = null;
        int precision = 0;
        if (n >= 1.0E9) {
            f /= 1.0E9;
            precision = 9;
            units = "GB";
        }
        else if (n >= 1000000.0) {
            f /= 1000000.0;
            precision = 6;
            units = "MB";
        }
        else {
            if (n < 1000.0) {
                n *= (isNegative ? -1 : 1);
                return n + " B";
            }
            f /= 1000.0;
            precision = 3;
            units = "kB";
        }
        f *= (isNegative ? -1 : 1);
        return String.format("%." + precision + "f %s", f, units);
    }
}
