// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.groovy;

import org.slf4j.LoggerFactory;
import java.util.Map;
import java.util.HashMap;
import java.lang.invoke.MethodHandles;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import groovy.lang.MetaClass;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import java.io.File;
import groovy.transform.Generated;
import org.codehaus.groovy.reflection.ClassInfo;
import org.slf4j.Logger;
import groovy.lang.Script;

public abstract class ScriptLoader extends Script
{
    private String _scriptDir;
    private static Logger _logger;
    
    @Generated
    public ScriptLoader() {
        this._scriptDir = invokedynamic(cast:(Ljava/lang/Object;)Ljava/lang/String;, null);
    }
    
    public GroovyObject loadScript(final File script) {
        public final class _loadScript_closure1 extends Closure implements GeneratedClosure
        {
            public _loadScript_closure1(final Object _outerInstance, final Object _thisObject) {
                super(_outerInstance, _thisObject);
            }
            
            public Object doCall(final Object k, final Object v) {
                return invokedynamic(invoke:(Ljava/lang/Object;Lgroovy/lang/GString;)Ljava/lang/Object;, invokedynamic(getProperty:(Lcom/ibm/dbb/groovy/ScriptLoader$_loadScript_closure1;)Ljava/lang/Object;, this), new GStringImpl(new Object[] { k, v }, new String[] { "   ", " -> ", "" }));
            }
            
            @Generated
            public Object call(final Object k, final Object v) {
                return invokedynamic(invoke:(Lcom/ibm/dbb/groovy/ScriptLoader$_loadScript_closure1;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, this, k, v);
            }
        }
        String scriptLocation = null;
        if (invokedynamic(cast:(Ljava/lang/Object;)Z, invokedynamic(invoke:(Ljava/io/File;)Ljava/lang/Object;, script))) {
            scriptLocation = invokedynamic(cast:(Ljava/lang/Object;)Ljava/lang/String;, invokedynamic(invoke:(Ljava/io/File;)Ljava/lang/Object;, script));
        }
        else {
            scriptLocation = invokedynamic(cast:(Lgroovy/lang/GString;)Ljava/lang/String;, new GStringImpl(new Object[] { invokedynamic(invoke:(Lcom/ibm/dbb/groovy/ScriptLoader;)Ljava/lang/Object;, this), invokedynamic(invoke:(Ljava/io/File;)Ljava/lang/Object;, script) }, new String[] { "", "/", "" }));
        }
        // invokedynamic(invoke:(Lorg/slf4j/Logger;Lgroovy/lang/GString;)Ljava/lang/Object;, ScriptLoader._logger, new GStringImpl(new Object[] { scriptLocation }, new String[] { "Enter loadScript: ", "" }))
        if (ScriptBytecodeAdapter.compareEqual(invokedynamic(invoke:(Ljava/lang/Class;)Ljava/lang/Object;, ScriptCacheManager.class), (Object)null)) {
        }
        // invokedynamic(invoke:(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;, ScriptCacheManager.class, invokedynamic(init:(Ljava/lang/Class;)Ljava/lang/Object;, HashMap.class))
        // invokedynamic(invoke:(Lorg/slf4j/Logger;Lgroovy/lang/GString;)Ljava/lang/Object;, ScriptLoader._logger, new GStringImpl(new Object[] { invokedynamic(invoke:(Ljava/lang/Object;)Ljava/lang/Object;, invokedynamic(invoke:(Lcom/ibm/dbb/groovy/ScriptLoader;)Ljava/lang/Object;, this)) }, new String[] { "Create a new script cache for: ", "" }))
        // invokedynamic(invoke:(Lorg/slf4j/Logger;Lgroovy/lang/GString;)Ljava/lang/Object;, ScriptLoader._logger, new GStringImpl(new Object[] { scriptLocation }, new String[] { "Loading script ", "" }))
        if (invokedynamic(cast:(Ljava/lang/Object;)Z, invokedynamic(invoke:(Lorg/slf4j/Logger;)Ljava/lang/Object;, ScriptLoader._logger)) && ScriptBytecodeAdapter.compareNotEqual(invokedynamic(invoke:(Ljava/lang/Class;)Ljava/lang/Object;, ScriptCacheManager.class), (Object)null)) {
        }
        // invokedynamic(invoke:(Lorg/slf4j/Logger;Lgroovy/lang/GString;)Ljava/lang/Object;, ScriptLoader._logger, new GStringImpl(new Object[] { invokedynamic(invoke:(Ljava/lang/Object;)Ljava/lang/Object;, invokedynamic(invoke:(Lcom/ibm/dbb/groovy/ScriptLoader;)Ljava/lang/Object;, this)) }, new String[] { "Script cache in ", ":" }))
        // invokedynamic(invoke:(Ljava/lang/Object;Lgroovy/lang/Closure;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/Class;)Ljava/lang/Object;, ScriptCacheManager.class), new _loadScript_closure1(this, this))
        if (ScriptBytecodeAdapter.compareEqual(invokedynamic(invoke:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/Class;)Ljava/lang/Object;, ScriptCacheManager.class), scriptLocation), (Object)null)) {
        }
        // invokedynamic(invoke:(Lorg/slf4j/Logger;Lgroovy/lang/GString;)Ljava/lang/Object;, ScriptLoader._logger, new GStringImpl(new Object[] { scriptLocation }, new String[] { "Parsing class for script ", "" }))
        // invokedynamic(invoke:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;, ScriptCacheManager.class, scriptLocation)
        final GroovyObject inst = invokedynamic(cast:(Ljava/lang/Object;)Lgroovy/lang/GroovyObject;, invokedynamic(invoke:(Ljava/lang/Object;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;, invokedynamic(invoke:(Ljava/lang/Class;)Ljava/lang/Object;, ScriptCacheManager.class), scriptLocation), "class")));
        // invokedynamic(invoke:(Lorg/slf4j/Logger;Lgroovy/lang/GString;)Ljava/lang/Object;, ScriptLoader._logger, new GStringImpl(new Object[] { scriptLocation }, new String[] { "Exit loadScript: ", "" }))
        return inst;
    }
    
    public void runScript(final File script, final Map<String, Object> argMap) {
        final GroovyObject scriptInstance = invokedynamic(cast:(Ljava/lang/Object;)Lgroovy/lang/GroovyObject;, invokedynamic(invoke:(Lcom/ibm/dbb/groovy/ScriptLoader;Ljava/io/File;)Ljava/lang/Object;, this, script));
        // invokedynamic(invoke:(Lorg/slf4j/Logger;Lgroovy/lang/GString;)Ljava/lang/Object;, ScriptLoader._logger, new GStringImpl(new Object[] { invokedynamic(invoke:(Ljava/lang/Object;)Ljava/lang/Object;, invokedynamic(invoke:(Lgroovy/lang/GroovyObject;)Ljava/lang/Object;, scriptInstance)) }, new String[] { "Calling ", ". . ." }))
        if (scriptInstance instanceof ScriptLoader) {
        }
        // invokedynamic(invoke:(Lgroovy/lang/GroovyObject;Ljava/util/Map;)Ljava/lang/Object;, scriptInstance, argMap)
        else {
        }
        // invokedynamic(invoke:(Lgroovy/lang/GroovyObject;Lorg/codehaus/groovy/runtime/wrappers/Wrapper;)Ljava/lang/Object;, scriptInstance, ScriptBytecodeAdapter.createPojoWrapper((Object)(String[])invokedynamic(invoke:(Ljava/util/List;Ljava/lang/Class;)Ljava/lang/Object;, ScriptBytecodeAdapter.createList(new Object[0]), String[].class), (Class)String[].class))
    }
    
    public void runScript(final File script, final String... args) {
        final GroovyObject scriptInstance = invokedynamic(cast:(Ljava/lang/Object;)Lgroovy/lang/GroovyObject;, invokedynamic(invoke:(Lcom/ibm/dbb/groovy/ScriptLoader;Ljava/io/File;)Ljava/lang/Object;, this, script));
        // invokedynamic(invoke:(Lorg/slf4j/Logger;Lgroovy/lang/GString;)Ljava/lang/Object;, ScriptLoader._logger, new GStringImpl(new Object[] { invokedynamic(invoke:(Ljava/lang/Object;)Ljava/lang/Object;, invokedynamic(invoke:(Lgroovy/lang/GroovyObject;)Ljava/lang/Object;, scriptInstance)) }, new String[] { "Calling ", ". . ." }))
        if (scriptInstance instanceof ScriptLoader) {
        }
        // invokedynamic(invoke:(Lgroovy/lang/GroovyObject;[Ljava/lang/String;)Ljava/lang/Object;, scriptInstance, args)
        else {
        }
        // invokedynamic(invoke:(Lgroovy/lang/GroovyObject;[Ljava/lang/String;)Ljava/lang/Object;, scriptInstance, args)
    }
    
    public String getScriptDir() {
        if (ScriptBytecodeAdapter.compareEqual((Object)this._scriptDir, (Object)null)) {
            this._scriptDir = invokedynamic(cast:(Ljava/lang/Object;)Ljava/lang/String;, invokedynamic(getProperty:(Ljava/lang/Object;)Ljava/lang/Object;, invokedynamic(init:(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;, File.class, invokedynamic(getProperty:(Ljava/lang/Object;)Ljava/lang/Object;, invokedynamic(getProperty:(Ljava/lang/Object;)Ljava/lang/Object;, invokedynamic(getProperty:(Ljava/lang/Object;)Ljava/lang/Object;, invokedynamic(getProperty:(Ljava/lang/Object;)Ljava/lang/Object;, invokedynamic(invoke:(Lcom/ibm/dbb/groovy/ScriptLoader;)Ljava/lang/Object;, this))))))));
        }
        // invokedynamic(invoke:(Lorg/slf4j/Logger;Lgroovy/lang/GString;)Ljava/lang/Object;, ScriptLoader._logger, new GStringImpl(new Object[] { this._scriptDir }, new String[] { "_scriptDir = ", "" }))
        return this._scriptDir;
    }
    
    public void _run(final Map<String, Object> argMap) {
    }
    // invokedynamic(invoke:(Lcom/ibm/dbb/groovy/ScriptLoader;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;, this, "argMap", argMap)
    // invokedynamic(invoke:(Lcom/ibm/dbb/groovy/ScriptLoader;Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;, this, "args", ScriptBytecodeAdapter.createList(new Object[0]))
    // invokedynamic(invoke:(Lcom/ibm/dbb/groovy/ScriptLoader;)Ljava/lang/Object;, this)
    
    public void _run(final String... args) {
    }
    // invokedynamic(invoke:(Lcom/ibm/dbb/groovy/ScriptLoader;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Object;, this, "args", args)
    // invokedynamic(invoke:(Lcom/ibm/dbb/groovy/ScriptLoader;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;, this, "argMap", ScriptBytecodeAdapter.createMap(new Object[0]))
    // invokedynamic(invoke:(Lcom/ibm/dbb/groovy/ScriptLoader;)Ljava/lang/Object;, this)
    
    @Generated
    public void runScript(final File script) {
        this.runScript((File)script, invokedynamic(cast:(Ljava/util/List;)[Ljava/lang/String;, ScriptBytecodeAdapter.createList(new Object[0])));
    }
    
    static {
        ScriptLoader._logger = invokedynamic(cast:(Ljava/lang/Object;)Lorg/slf4j/Logger;, invokedynamic(invoke:(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;, LoggerFactory.class, ScriptLoader.class));
    }
    
    @Generated
    public String get_scriptDir() {
        return this._scriptDir;
    }
    
    @Generated
    public void set_scriptDir(final String scriptDir) {
        this._scriptDir = scriptDir;
    }
    
    @Generated
    public static Logger get_logger() {
        return ScriptLoader._logger;
    }
    
    @Generated
    public static void set_logger(final Logger logger) {
        ScriptLoader._logger = logger;
    }
}
