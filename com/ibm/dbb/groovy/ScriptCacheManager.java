// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.groovy;

import org.slf4j.LoggerFactory;
import java.lang.invoke.MethodHandles;
import java.beans.Transient;
import groovy.transform.Internal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.io.IOException;
import java.util.Iterator;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import java.util.HashMap;
import groovy.lang.GroovyClassLoader;
import java.io.File;
import groovy.transform.Generated;
import groovy.lang.MetaClass;
import org.codehaus.groovy.reflection.ClassInfo;
import org.slf4j.Logger;
import java.util.Map;
import groovy.lang.GroovyObject;

public class ScriptCacheManager implements GroovyObject
{
    private static Map<String, Map<String, Object>> _scripts;
    private static Logger _logger;
    private static final Object $LOCK;
    private static /* synthetic */ ClassInfo $staticClassInfo;
    private transient /* synthetic */ MetaClass metaClass;
    
    @Generated
    public ScriptCacheManager() {
        this.metaClass = this.$getStaticMetaClass();
    }
    
    public static void setScripts(final Map<String, Map<String, Object>> scripts) {
        synchronized (ScriptCacheManager.$LOCK) {
            ScriptCacheManager._scripts = scripts;
        }
        // monitorexit(ScriptCacheManager.$LOCK)
    }
    
    public static Map<String, Map<String, Object>> getScripts() {
        synchronized (ScriptCacheManager.$LOCK) {
            // monitorexit(ScriptCacheManager.$LOCK)
            return ScriptCacheManager._scripts;
        }
    }
    
    public static Object put(final String scriptLocation) {
        final File sourceFile = invokedynamic(cast:(Ljava/lang/Object;)Ljava/io/File;, invokedynamic(init:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;, File.class, scriptLocation));
        final Long lastModified = invokedynamic(cast:(Ljava/lang/Object;)Ljava/lang/Long;, invokedynamic(init:(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;, Long.class, invokedynamic(invoke:(Ljava/io/File;)Ljava/lang/Object;, sourceFile)));
        final Class groovyClass = invokedynamic(cast:(Ljava/lang/Object;)Ljava/lang/Class;, invokedynamic(invoke:(Ljava/lang/Object;Ljava/io/File;)Ljava/lang/Object;, invokedynamic(init:(Ljava/lang/Class;)Ljava/lang/Object;, GroovyClassLoader.class), sourceFile));
        final Map scriptInfo = invokedynamic(cast:(Ljava/lang/Object;)Ljava/util/Map;, invokedynamic(init:(Ljava/lang/Class;)Ljava/lang/Object;, HashMap.class));
        // invokedynamic(invoke:(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;, scriptInfo, "class", groovyClass)
        // invokedynamic(invoke:(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Object;, scriptInfo, "lastModified", lastModified)
        // invokedynamic(invoke:(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;, scriptInfo, "lastSha256", invokedynamic(invoke:(Ljava/lang/Class;Ljava/io/File;)Ljava/lang/Object;, ScriptCacheManager.class, sourceFile))
        return invokedynamic(invoke:(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/Class;)Ljava/lang/Object;, ScriptCacheManager.class), scriptLocation, scriptInfo);
    }
    
    public static void purgeScriptCache() throws IOException {
        // invokedynamic(invoke:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;, ScriptCacheManager.class, "Purging script cache. . .")
        final Iterator it = invokedynamic(cast:(Ljava/lang/Object;)Ljava/util/Iterator;, invokedynamic(invoke:(Ljava/lang/Object;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/Object;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/Class;)Ljava/lang/Object;, ScriptCacheManager.class))));
        while (invokedynamic(cast:(Ljava/lang/Object;)Z, invokedynamic(invoke:(Ljava/util/Iterator;)Ljava/lang/Object;, it))) {
            final Map.Entry entry = invokedynamic(cast:(Ljava/lang/Object;)Ljava/util/Map$Entry;, invokedynamic(invoke:(Ljava/util/Iterator;)Ljava/lang/Object;, it));
            final File sourceFile = invokedynamic(cast:(Ljava/lang/Object;)Ljava/io/File;, invokedynamic(init:(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;, File.class, invokedynamic(invoke:(Ljava/util/Map$Entry;)Ljava/lang/Object;, entry)));
            if (invokedynamic(cast:(Ljava/lang/Object;)Z, invokedynamic(invoke:(Ljava/io/File;)Ljava/lang/Object;, sourceFile))) {
                final long lastModified = DefaultTypeTransformation.longUnbox(invokedynamic(invoke:(Ljava/io/File;)Ljava/lang/Object;, sourceFile));
                final Map value = invokedynamic(cast:(Ljava/lang/Object;)Ljava/util/Map;, invokedynamic(invoke:(Ljava/util/Map$Entry;)Ljava/lang/Object;, entry));
                if (ScriptBytecodeAdapter.compareEqual((Object)value, (Object)null)) {
                }
                // invokedynamic(invoke:(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;, ScriptCacheManager.class, invokedynamic(invoke:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;, "Script '", invokedynamic(invoke:(Ljava/util/Map$Entry;)Ljava/lang/Object;, entry)), "' has a null value.  Purging cache entry."))
                // invokedynamic(invoke:(Ljava/util/Iterator;)Ljava/lang/Object;, it)
                final Long cachedLastModified = invokedynamic(cast:(Ljava/lang/Object;)Ljava/lang/Long;, invokedynamic(invoke:(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;, value, "lastModified"));
                if (!ScriptBytecodeAdapter.compareEqual((Object)cachedLastModified, (Object)null)) {
                    if (!ScriptBytecodeAdapter.compareNotEqual(invokedynamic(invoke:(Ljava/lang/Long;)Ljava/lang/Object;, cachedLastModified), (Object)lastModified)) {
                        continue;
                    }
                    final String lastSha256 = invokedynamic(cast:(Ljava/lang/Object;)Ljava/lang/String;, invokedynamic(invoke:(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;, value, "lastSha256"));
                    if (!ScriptBytecodeAdapter.compareNotEqual((Object)lastSha256, invokedynamic(invoke:(Ljava/lang/Class;Ljava/io/File;)Ljava/lang/Object;, ScriptCacheManager.class, sourceFile))) {
                        continue;
                    }
                }
                // invokedynamic(invoke:(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;, ScriptCacheManager.class, invokedynamic(invoke:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/Object;J)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;, "Cached script '", invokedynamic(invoke:(Ljava/util/Map$Entry;)Ljava/lang/Object;, entry)), "' is out of date with file system. "), invokedynamic(invoke:(Ljava/lang/Long;)Ljava/lang/Object;, cachedLastModified)), "!="), lastModified), " Purging cache entry."))
                // invokedynamic(invoke:(Ljava/util/Iterator;)Ljava/lang/Object;, it)
            }
            else {
            }
            // invokedynamic(invoke:(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;, ScriptCacheManager.class, invokedynamic(invoke:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;, "Script '", invokedynamic(invoke:(Ljava/util/Map$Entry;)Ljava/lang/Object;, entry)), "' does not exist.  Purging cache entry."))
            // invokedynamic(invoke:(Ljava/util/Iterator;)Ljava/lang/Object;, it)
        }
    }
    
    private static void debug(final String message) {
    }
    // invokedynamic(invoke:(Lorg/slf4j/Logger;Ljava/lang/String;)Ljava/lang/Object;, ScriptCacheManager._logger, message)
    
    private static String getChecksum(final File file, final Object type) {
        final MessageDigest digest = invokedynamic(cast:(Ljava/lang/Object;)Ljava/security/MessageDigest;, invokedynamic(invoke:(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;, MessageDigest.class, type));
        // invokedynamic(invoke:(Ljava/security/MessageDigest;Ljava/lang/Object;)Ljava/lang/Object;, digest, invokedynamic(getProperty:(Ljava/io/File;)Ljava/lang/Object;, file))
        return invokedynamic(cast:(Ljava/lang/Object;)Ljava/lang/String;, invokedynamic(invoke:(Ljava/lang/Object;I)Ljava/lang/Object;, invokedynamic(init:(Ljava/lang/Class;ILjava/lang/Object;)Ljava/lang/Object;, BigInteger.class, true, invokedynamic(invoke:(Ljava/security/MessageDigest;)Ljava/lang/Object;, digest)), 16));
    }
    
    @Generated
    private static String getChecksum(final File file) {
        return getChecksum(file, "SHA256");
    }
    
    protected /* synthetic */ MetaClass $getStaticMetaClass() {
        if (this.getClass() != ScriptCacheManager.class) {
            return ScriptBytecodeAdapter.initMetaClass((Object)this);
        }
        ClassInfo $staticClassInfo = ScriptCacheManager.$staticClassInfo;
        if ($staticClassInfo == null) {
            $staticClassInfo = (ScriptCacheManager.$staticClassInfo = ClassInfo.getClassInfo((Class)this.getClass()));
        }
        return $staticClassInfo.getMetaClass();
    }
    
    @Generated
    @Internal
    @Transient
    public MetaClass getMetaClass() {
        final MetaClass metaClass = this.metaClass;
        if (metaClass != null) {
            return metaClass;
        }
        this.metaClass = this.$getStaticMetaClass();
        return this.metaClass;
    }
    
    @Generated
    @Internal
    public void setMetaClass(final MetaClass metaClass) {
        this.metaClass = metaClass;
    }
    
    static {
        ScriptCacheManager._logger = invokedynamic(cast:(Ljava/lang/Object;)Lorg/slf4j/Logger;, invokedynamic(invoke:(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;, LoggerFactory.class, ScriptCacheManager.class));
        $LOCK = new Object[(int)0];
    }
    
    @Generated
    public static Map<String, Map<String, Object>> get_scripts() {
        return ScriptCacheManager._scripts;
    }
    
    @Generated
    public static void set_scripts(final Map<String, Map<String, Object>> scripts) {
        ScriptCacheManager._scripts = scripts;
    }
    
    @Generated
    public static Logger get_logger() {
        return ScriptCacheManager._logger;
    }
    
    @Generated
    public static void set_logger(final Logger logger) {
        ScriptCacheManager._logger = logger;
    }
}
