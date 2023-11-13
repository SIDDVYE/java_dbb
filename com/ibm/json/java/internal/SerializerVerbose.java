// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.json.java.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.io.Writer;

public class SerializerVerbose extends Serializer
{
    private int indent;
    
    public SerializerVerbose(final Writer writer) {
        super(writer);
        this.indent = 0;
    }
    
    public void space() throws IOException {
        this.writeRawString(" ");
    }
    
    public void newLine() throws IOException {
        this.writeRawString("\n");
    }
    
    public void indent() throws IOException {
        for (int i = 0; i < this.indent; ++i) {
            this.writeRawString("   ");
        }
    }
    
    public void indentPush() {
        ++this.indent;
    }
    
    public void indentPop() {
        --this.indent;
        if (this.indent < 0) {
            throw new IllegalStateException();
        }
    }
    
    public List getPropertyNames(final Map map) {
        final List propertyNames = super.getPropertyNames(map);
        Collections.sort((List<Comparable>)propertyNames);
        return propertyNames;
    }
}
