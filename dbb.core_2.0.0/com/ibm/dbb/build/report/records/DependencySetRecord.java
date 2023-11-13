// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import java.util.Iterator;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;
import java.util.Collection;
import java.util.ArrayList;
import com.ibm.dbb.dependency.PhysicalDependency;
import java.util.List;

public class DependencySetRecord extends Record
{
    private static final String PROP_DEPENDENCY_SET = "dependencySet";
    private List<PhysicalDependency> dependencySet;
    public static final String PROP_FILE = "file";
    private String file;
    
    public DependencySetRecord() {
        super("DEPENDENCY_SET");
        this.dependencySet = new ArrayList<PhysicalDependency>();
    }
    
    public DependencySetRecord(final String id) {
        super(id, "DEPENDENCY_SET");
        this.dependencySet = new ArrayList<PhysicalDependency>();
    }
    
    public void addDependency(final PhysicalDependency dependency) {
        this.dependencySet.add(dependency);
    }
    
    public void addAllDependencies(final List<PhysicalDependency> dependencies) {
        this.dependencySet.addAll(dependencies);
    }
    
    public List<PhysicalDependency> getAllDependencies() {
        return this.dependencySet;
    }
    
    public String getFile() {
        return this.file;
    }
    
    public void setFile(final String file) {
        this.file = file;
    }
    
    @Override
    public JSONObject toJSON() {
        final JSONObject jsonObj = super.toJSON();
        jsonObj.put((Object)"file", (Object)this.file);
        final JSONArray depObjs = new JSONArray();
        for (final PhysicalDependency dependency : this.dependencySet) {
            depObjs.add((Object)dependency.toJSON());
        }
        if (depObjs.size() > 0) {
            jsonObj.put((Object)"dependencySet", (Object)depObjs);
        }
        return jsonObj;
    }
    
    @Override
    public Record parse(final JSONObject jsonObj) {
        super.parse(jsonObj);
        this.file = (String)jsonObj.get((Object)"file");
        this.dependencySet.clear();
        final JSONArray depObjs = (JSONArray)jsonObj.get((Object)"dependencySet");
        if (depObjs != null && depObjs.size() > 0) {
            for (int i = 0; i < depObjs.size(); ++i) {
                final JSONObject depObj = (JSONObject)depObjs.get(i);
                final PhysicalDependency dep = new PhysicalDependency();
                dep.parseFromJSON(depObj);
                this.dependencySet.add(dep);
            }
        }
        return this;
    }
}
