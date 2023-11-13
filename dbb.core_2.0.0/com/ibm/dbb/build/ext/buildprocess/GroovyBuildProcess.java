// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.ext.buildprocess;

import org.codehaus.groovy.control.CompilationFailedException;
import groovy.lang.GroovyObject;
import java.util.List;
import com.ibm.dbb.groovy.ScriptLoader;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.util.StringTokenizer;
import com.ibm.dbb.StaticMemoryReset;
import java.util.Map;
import com.ibm.dbb.groovy.ScriptCacheManager;
import java.util.HashMap;

public class GroovyBuildProcess extends AbstractBuildProcess
{
    public GroovyBuildProcess() {
        ScriptCacheManager.setScripts((Map)new HashMap());
    }
    
    @Override
    public void runProcess(final String processCommand) throws CompilationFailedException, InstantiationException, IllegalAccessException, IOException {
        this.debug("+GroovyBuildProcess.runProcess(" + processCommand + ")");
        StaticMemoryReset.reset();
        ScriptCacheManager.purgeScriptCache();
        final StringTokenizer t = new StringTokenizer(processCommand);
        final String groovyFile = t.hasMoreTokens() ? t.nextToken() : null;
        final File file = new File(groovyFile);
        this.debug("Groovy file = " + file);
        if (!file.exists()) {
            throw new IOException("File " + file + " does not exist");
        }
        final List<String> commandArgList = new ArrayList<String>();
        while (t.hasMoreTokens()) {
            commandArgList.add(t.nextToken());
        }
        final String[] commandArgs = new String[commandArgList.size()];
        commandArgList.toArray(commandArgs);
        this.debug("args = " + Arrays.toString(commandArgs));
        final GroovyObject script = this.loadScript(file);
        this.debug("Executing script . . ");
        if (script instanceof ScriptLoader) {
            script.invokeMethod("_run", (Object)commandArgs);
        }
        else {
            script.invokeMethod("main", (Object)commandArgs);
        }
    }
    
    private GroovyObject loadScript(final File script) throws IOException, IllegalAccessException, InstantiationException {
        final String scriptLocation = script.getPath();
        this.debug("Loading script for " + scriptLocation);
        if (ScriptCacheManager.getScripts().get(scriptLocation) == null) {
            this.debug("Script '" + scriptLocation + "' does not exist in cache. Parsing and adding to cache.");
            ScriptCacheManager.put(scriptLocation);
        }
        else {
            this.debug("Script '" + scriptLocation + "' exist in cache. Load the script from the cache.");
        }
        final GroovyObject inst = ScriptCacheManager.getScripts().get(scriptLocation).get("class").newInstance();
        return inst;
    }
    
    public static void main(final String[] args) {
        final GroovyBuildProcess process = new GroovyBuildProcess();
        if ((args.length > 0 && args[0].equals("-debug")) || "true".equals(System.getProperty("debugGroovyBuildProcess"))) {
            process.debug = true;
        }
        process.run();
    }
}
