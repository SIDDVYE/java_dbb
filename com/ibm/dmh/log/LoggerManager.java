// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.log;

import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.LogRecord;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.ConsoleHandler;
import com.ibm.dmh.util.LocaleMgr;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.io.File;
import com.ibm.dmh.util.StringUtils;
import java.util.logging.Formatter;
import java.util.Map;
import java.util.logging.Logger;
import java.util.logging.Level;

public class LoggerManager
{
    public static final int LOG_FORMAT_1 = 1;
    public static final int LOG_FORMAT_2 = 2;
    private static boolean doAppend;
    private static boolean isInitialized;
    private static int maxLogFileSize;
    private static int numberOfLogsToKeep;
    private static Level consoleLogLevel;
    private static Level logLevel;
    private static Logger mainLogger;
    private static Map<String, Logger> loggers;
    private static String logDir;
    private static final String LINE_SEPARATOR;
    private static Formatter formatter1;
    private static Formatter formatter2;
    
    public static void init(final String logLevel, final String logDir, final String mainLoggerName, final boolean useGlobalLogger) {
        init(logLevel, logDir, mainLoggerName, useGlobalLogger, 1);
    }
    
    public static void init(String logLevel, String logDir, final String mainLoggerName, final boolean useGlobalLogger, final int logFormat) {
        if (LoggerManager.isInitialized) {
            return;
        }
        if (logLevel == null) {
            logLevel = StringUtils.getString(System.getProperty("LOGLEVEL"), "INFO");
        }
        if (logDir == null) {
            logDir = StringUtils.getString(System.getProperty("LOGDIR"), "%t");
        }
        final File logDirFile = new File(logDir);
        if (!logDir.equals("%t")) {
            logDirFile.mkdirs();
        }
        LoggerManager.logLevel = Level.parse(logLevel);
        LoggerManager.consoleLogLevel = LoggerManager.logLevel;
        LoggerManager.logDir = logDir;
        System.err.println("logLevel=[" + LoggerManager.logLevel + "], logDir=[" + logDirFile.getAbsolutePath() + "], mainLoggerName=[" + mainLoggerName + "], useGlobalLogger=[" + useGlobalLogger + "], logFormat=[" + logFormat + "]");
        LoggerManager.isInitialized = true;
        if (useGlobalLogger) {
            final Logger globalLogger = Logger.getLogger("");
            initLogger(globalLogger, mainLoggerName);
            LoggerManager.mainLogger = Logger.getLogger(mainLoggerName);
            LoggerManager.loggers.put(mainLoggerName, LoggerManager.mainLogger);
        }
        else {
            LoggerManager.mainLogger = getLogger(StringUtils.getString(mainLoggerName, ""), logFormat);
            Logger.getLogger("").setLevel(Level.OFF);
            for (final Handler h : Logger.getLogger("").getHandlers()) {
                h.setLevel(Level.OFF);
            }
        }
    }
    
    public static Logger getLogger(final String name) {
        return getLogger(name, name);
    }
    
    public static Logger getLogger(final String name, final int iLogFormat) {
        return getLogger(name, name, iLogFormat);
    }
    
    private static Logger getLogger(final String name, final String logFileName) {
        return getLogger(name, logFileName, 1);
    }
    
    private static Logger getLogger(final String name, final String logFileName, final int iLogFormat) {
        if (!LoggerManager.isInitialized) {
            return Logger.getLogger("global");
        }
        Logger logger;
        if (LoggerManager.loggers.containsKey(name)) {
            logger = LoggerManager.loggers.get(name);
        }
        else {
            logger = Logger.getLogger(name);
            initLogger(logger, name, iLogFormat);
            LoggerManager.loggers.put(name, logger);
        }
        return logger;
    }
    
    private static void initLogger(final Logger logger, final String logFileName) {
        initLogger(logger, logFileName, 1);
    }
    
    private static void initLogger(final Logger logger, final String logFileName, final int iLogFormat) {
        for (final Handler h : logger.getHandlers()) {
            h.setLevel(Level.OFF);
        }
        try {
            final boolean consoleHandlerExist = false;
            final boolean fileHandlerExist = false;
            if (!fileHandlerExist) {
                final Handler h2 = new FileHandler(LoggerManager.logDir + "/" + logFileName + ".%g.%u.log", LoggerManager.maxLogFileSize, LoggerManager.numberOfLogsToKeep, LoggerManager.doAppend);
                h2.setLevel(LoggerManager.logLevel);
                setFormatter(h2, iLogFormat);
                h2.setEncoding(LocaleMgr.getExternalDefaultEncoding());
                logger.addHandler(h2);
            }
            if (!consoleHandlerExist && LoggerManager.consoleLogLevel.intValue() < Level.OFF.intValue()) {
                final Handler h2 = new ConsoleHandler();
                h2.setLevel(LoggerManager.consoleLogLevel);
                setFormatter(h2, iLogFormat);
                logger.addHandler(h2);
            }
        }
        catch (Exception e) {
            logger.log(Level.WARNING, "Exception caught trying to instantiate logger.", e);
        }
        logger.setLevel(LoggerManager.logLevel);
    }
    
    private static void setFormatter(final Handler h, final int logFormat) {
        if (logFormat == 1) {
            h.setFormatter(LoggerManager.formatter1);
        }
        else if (logFormat == 2) {
            h.setFormatter(LoggerManager.formatter2);
        }
    }
    
    public static Logger getMainLogger() {
        return (LoggerManager.mainLogger == null) ? Logger.getLogger("global") : LoggerManager.mainLogger;
    }
    
    public static File getLogDir() {
        String s = LoggerManager.logDir;
        if (s.indexOf("%t") != -1) {
            final String tmpOrUserHome = StringUtils.coalesce(System.getProperty("java.io.tmpdir"), System.getProperty("user.home"));
            s = LoggerManager.logDir.replaceAll("\\%t", tmpOrUserHome.replace('\\', '/'));
        }
        return new File(s);
    }
    
    public static void setLevel(final Logger l) {
        if (l != null) {
            l.setLevel(LoggerManager.logLevel);
        }
    }
    
    public static void shutdown() {
        if (!LoggerManager.isInitialized) {
            return;
        }
        for (final Handler h : LoggerManager.mainLogger.getHandlers()) {
            h.close();
        }
        for (final Logger l : LoggerManager.loggers.values()) {
            for (final Handler h2 : l.getHandlers()) {
                h2.close();
            }
        }
        LoggerManager.isInitialized = false;
    }
    
    public static void setLogCount(final int count) {
        LoggerManager.numberOfLogsToKeep = count;
    }
    
    public static void setLogLimit(final int limit) {
        LoggerManager.maxLogFileSize = limit;
    }
    
    static {
        LoggerManager.doAppend = false;
        LoggerManager.maxLogFileSize = 10000000;
        LoggerManager.numberOfLogsToKeep = 3;
        LoggerManager.loggers = new HashMap<String, Logger>();
        LINE_SEPARATOR = System.getProperty("line.separator");
        LoggerManager.formatter1 = new Formatter() {
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
            
            @Override
            public String format(final LogRecord record) {
                final String loggerName = StringUtils.chop(record.getLoggerName(), 13, true, false);
                String msg = "[" + this.df.format(record.getMillis()) + "] " + loggerName + " " + record.getLevel() + ": " + record.getMessage() + LoggerManager.LINE_SEPARATOR;
                final Throwable t = record.getThrown();
                if (t != null) {
                    try {
                        final StringWriter sw = new StringWriter();
                        final PrintWriter pw = new PrintWriter(sw);
                        t.printStackTrace(pw);
                        pw.close();
                        msg = msg + sw.toString() + LoggerManager.LINE_SEPARATOR;
                    }
                    catch (Exception e) {
                        e.printStackTrace(System.err);
                    }
                }
                return msg;
            }
        };
        LoggerManager.formatter2 = new Formatter() {
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
            
            @Override
            public String format(final LogRecord record) {
                String msg = "[" + this.df.format(record.getMillis()) + "] " + record.getMessage() + LoggerManager.LINE_SEPARATOR;
                final Throwable t = record.getThrown();
                if (t != null) {
                    try {
                        final StringWriter sw = new StringWriter();
                        final PrintWriter pw = new PrintWriter(sw);
                        t.printStackTrace(pw);
                        pw.close();
                        msg = msg + sw.toString() + LoggerManager.LINE_SEPARATOR;
                    }
                    catch (Exception e) {
                        e.printStackTrace(System.err);
                    }
                }
                return msg;
            }
        };
    }
}
