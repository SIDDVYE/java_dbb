// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.records;

import com.ibm.dbb.build.report.ParseException;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.json.java.JSONObject;

public abstract class AbstractRecordFactory implements IRecordFactory
{
    @Override
    public Record parseRecord(final JSONObject jsonObj) {
        if (jsonObj == null) {
            throw new ParseException(Messages.getMessage("ParseException_RECORD_MISSING_FIELD", "jsonObj"));
        }
        final String id = (String)jsonObj.get((Object)"id");
        final String type = (String)jsonObj.get((Object)"type");
        if (type == null) {
            throw new ParseException(Messages.getMessage("ParseException_RECORD_MISSING_FIELD", "type"));
        }
        return this.doParseRecord(jsonObj, id, type);
    }
    
    protected abstract Record doParseRecord(final JSONObject p0, final String p1, final String p2);
}
