// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.json.xml.internal;

import java.io.Writer;
import org.xml.sax.SAXException;
import java.util.Properties;
import org.xml.sax.Attributes;
import java.io.IOException;
import java.util.logging.Level;
import java.io.OutputStream;
import java.util.Stack;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;
import org.xml.sax.helpers.DefaultHandler;

public class JSONSAXHandler extends DefaultHandler
{
    private static String className;
    private static Logger logger;
    private OutputStreamWriter osWriter;
    private JSONObject current;
    private Stack previousObjects;
    private JSONObject head;
    private boolean compact;
    
    public JSONSAXHandler(final OutputStream out) throws IOException {
        this.osWriter = null;
        this.current = null;
        this.previousObjects = new Stack();
        this.head = null;
        this.compact = false;
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.entering(JSONSAXHandler.className, "JSONHander(OutputStream) <constructor>");
        }
        this.osWriter = new OutputStreamWriter(out, "UTF-8");
        this.compact = true;
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.exiting(JSONSAXHandler.className, "JSONHander(OutputStream) <constructor>");
        }
    }
    
    public JSONSAXHandler(final OutputStream out, final boolean b) throws IOException {
        this.osWriter = null;
        this.current = null;
        this.previousObjects = new Stack();
        this.head = null;
        this.compact = false;
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.entering(JSONSAXHandler.className, "JSONHander(OutputStream, boolean) <constructor>");
        }
        this.osWriter = new OutputStreamWriter(out, "UTF-8");
        this.compact = !b;
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.exiting(JSONSAXHandler.className, "JSONHander(OutputStream, boolean) <constructor>");
        }
    }
    
    public void startElement(final String s, final String s2, final String s3, final Attributes attributes) throws SAXException {
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.exiting(JSONSAXHandler.className, "startElement(String,String,String,org.xml.sax.Attributes)");
        }
        final Properties properties = new Properties();
        for (int length = attributes.getLength(), i = 0; i < length; ++i) {
            properties.put(attributes.getQName(i), attributes.getValue(i));
        }
        final JSONObject jsonObject = new JSONObject(s2, properties);
        if (this.head == null) {
            this.head = jsonObject;
            this.current = this.head;
        }
        else {
            if (this.current != null) {
                this.previousObjects.push(this.current);
                this.current.addJSONObject(jsonObject);
            }
            this.current = jsonObject;
        }
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.exiting(JSONSAXHandler.className, "startElement(String,String,String,org.xml.sax.Attributes)");
        }
    }
    
    public void endElement(final String s, final String s2, final String s3) throws SAXException {
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.entering(JSONSAXHandler.className, "endElement(String,String,String)");
        }
        if (!this.previousObjects.isEmpty()) {
            this.current = this.previousObjects.pop();
        }
        else {
            this.current = null;
        }
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.exiting(JSONSAXHandler.className, "endElement(String,String,String)");
        }
    }
    
    public void characters(final char[] value, final int offset, final int count) throws SAXException {
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.entering(JSONSAXHandler.className, "characters(char[], int, int)");
        }
        String string = new String(value, offset, count);
        if (this.current.getTagText() != null) {
            string = this.current.getTagText() + string;
        }
        this.current.setTagText(string);
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.exiting(JSONSAXHandler.className, "characters(char[], int, int)");
        }
    }
    
    public void startDocument() throws SAXException {
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.entering(JSONSAXHandler.className, "startDocument()");
        }
        this.startJSON();
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.exiting(JSONSAXHandler.className, "startDocument()");
        }
    }
    
    public void endDocument() throws SAXException {
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.exiting(JSONSAXHandler.className, "endDocument()");
        }
        this.endJSON();
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.exiting(JSONSAXHandler.className, "endDocument()");
        }
    }
    
    public void flushBuffer() throws IOException {
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.entering(JSONSAXHandler.className, "flushBuffer()");
        }
        if (this.osWriter != null) {
            this.osWriter.flush();
        }
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.exiting(JSONSAXHandler.className, "flushBuffer()");
        }
    }
    
    private void startJSON() throws SAXException {
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.entering(JSONSAXHandler.className, "startJSON()");
        }
        this.head = new JSONObject("", null);
        this.current = this.head;
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.exiting(JSONSAXHandler.className, "startJSON()");
        }
    }
    
    private void endJSON() throws SAXException {
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.entering(JSONSAXHandler.className, "endJSON()");
        }
        try {
            this.head.writeObject(this.osWriter, 0, true, this.compact);
            this.head = null;
            this.current = null;
            this.previousObjects.clear();
        }
        catch (Exception ex2) {
            final SAXException ex = new SAXException(ex2);
            ex.initCause(ex2);
            throw ex;
        }
        if (JSONSAXHandler.logger.isLoggable(Level.FINER)) {
            JSONSAXHandler.logger.exiting(JSONSAXHandler.className, "endJSON()");
        }
    }
    
    static {
        JSONSAXHandler.className = "com.ibm.json.xml.transform.impl.JSONSAXHandler";
        JSONSAXHandler.logger = Logger.getLogger(JSONSAXHandler.className, (String)null);
    }
}
