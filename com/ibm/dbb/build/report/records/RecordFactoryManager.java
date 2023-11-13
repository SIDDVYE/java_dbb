// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import java.util.HashSet;
import java.util.Set;
import com.ibm.json.java.JSONObject;
import java.util.Iterator;
import com.ibm.dbb.build.internal.SettingsManager;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class RecordFactoryManager
{
    private static RecordFactoryManager _instance;
    private List<IRecordFactory> factories;
    private Map<String, Integer> type2NextIdCache;
    private static final char SEPARATOR = '_';
    
    private RecordFactoryManager() {
        this.factories = new ArrayList<IRecordFactory>();
        this.type2NextIdCache = new HashMap<String, Integer>();
        this.factories.add(new DefaultRecordFactory());
        for (final IRecordFactory recordFactory : SettingsManager.getInstance().getReportRecordFactories()) {
            this.factories.add(recordFactory);
        }
    }
    
    public static RecordFactoryManager getInstance() {
        if (RecordFactoryManager._instance == null) {
            RecordFactoryManager._instance = new RecordFactoryManager();
        }
        return RecordFactoryManager._instance;
    }
    
    public static void staticReset() {
        RecordFactoryManager._instance = null;
    }
    
    public Record parse(final JSONObject jsonObj) {
        for (final IRecordFactory factory : this.factories) {
            final Record record = factory.parseRecord(jsonObj);
            if (record != null) {
                return record;
            }
        }
        return null;
    }
    
    public String getNextId(final String type) {
        Integer nextNum = this.type2NextIdCache.get(type);
        if (nextNum == null) {
            nextNum = 1;
        }
        final String nextId = type + '_' + nextNum;
        this.type2NextIdCache.put(type, (int)(++nextNum));
        return nextId;
    }
    
    public Set<String> getAllRecordTypes() {
        final Set<String> types = new HashSet<String>();
        for (final IRecordFactory factory : this.factories) {
            for (final String type : factory.getAllSupportedTypes()) {
                types.add(type);
            }
        }
        return types;
    }
}
