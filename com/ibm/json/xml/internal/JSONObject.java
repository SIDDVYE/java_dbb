// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.json.xml.internal;

import java.util.Enumeration;
import java.io.IOException;
import java.io.Writer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.Hashtable;
import java.util.Properties;
import java.util.logging.Logger;

public class JSONObject
{
    private static String className;
    private static Logger logger;
    private static final String indent = "   ";
    private String objectName;
    private Properties attrs;
    private Hashtable jsonObjects;
    private String tagText;
    
    public JSONObject(final String objectName, final Properties attrs) {
        this.objectName = null;
        this.attrs = null;
        this.jsonObjects = null;
        this.tagText = null;
        this.objectName = objectName;
        this.attrs = attrs;
        this.jsonObjects = new Hashtable();
    }
    
    public void addJSONObject(final JSONObject jsonObject) {
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.entering(JSONObject.className, "addJSONObject(JSONObject)");
        }
        final Vector<JSONObject> vector = this.jsonObjects.get(jsonObject.objectName);
        if (vector != null) {
            vector.add(jsonObject);
        }
        else {
            final Vector<JSONObject> value = new Vector<JSONObject>();
            value.add(jsonObject);
            this.jsonObjects.put(jsonObject.objectName, value);
        }
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.exiting(JSONObject.className, "addJSONObject(JSONObject)");
        }
    }
    
    public void setTagText(final String tagText) {
        this.tagText = tagText;
    }
    
    public String getTagText() {
        return this.tagText;
    }
    
    public void writeObject(final Writer writer, final int n, final boolean b) throws IOException {
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.entering(JSONObject.className, "writeObject(Writer, int, boolean)");
        }
        this.writeObject(writer, n, b, false);
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.entering(JSONObject.className, "writeObject(Writer, int, boolean)");
        }
    }
    
    public void writeObject(final Writer writer, final int n, final boolean b, final boolean b2) throws IOException {
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.entering(JSONObject.className, "writeObject(Writer, int, boolean, boolean)");
        }
        if (writer != null) {
            Label_0111: {
                try {
                    if (this.isEmptyObject()) {
                        this.writeEmptyObject(writer, n, b, b2);
                    }
                    else if (this.isTextOnlyObject()) {
                        this.writeTextOnlyObject(writer, n, b, b2);
                    }
                    else {
                        this.writeComplexObject(writer, n, b, b2);
                    }
                    break Label_0111;
                }
                catch (Exception cause) {
                    final IOException ex = new IOException("Error occurred on serialization of JSON text.");
                    ex.initCause(cause);
                    throw ex;
                }
                throw new IOException("The writer cannot be null.");
            }
            if (JSONObject.logger.isLoggable(Level.FINER)) {
                JSONObject.logger.entering(JSONObject.className, "writeObject(Writer, int, boolean, boolean)");
            }
            return;
        }
        throw new IOException("The writer cannot be null.");
    }
    
    private void writeAttribute(final Writer writer, final String s, final String s2, final int n, final boolean b) throws IOException {
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.entering(JSONObject.className, "writeAttribute(Writer, String, String, int)");
        }
        if (!b) {
            this.writeIndention(writer, n);
        }
        try {
            if (!b) {
                writer.write("\"" + s + "\"" + " : " + "\"" + this.escapeStringSpecialCharacters(s2) + "\"");
            }
            else {
                writer.write("\"" + s + "\"" + ":" + "\"" + this.escapeStringSpecialCharacters(s2) + "\"");
            }
        }
        catch (Exception cause) {
            final IOException ex = new IOException("Error occurred on serialization of JSON text.");
            ex.initCause(cause);
            throw ex;
        }
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.exiting(JSONObject.className, "writeAttribute(Writer, String, String, int)");
        }
    }
    
    private void writeIndention(final Writer writer, final int n) throws IOException {
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.entering(JSONObject.className, "writeIndention(Writer, int)");
        }
        try {
            for (int i = 0; i < n; ++i) {
                writer.write("   ");
            }
        }
        catch (Exception cause) {
            final IOException ex = new IOException("Error occurred on serialization of JSON text.");
            ex.initCause(cause);
            throw ex;
        }
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.exiting(JSONObject.className, "writeIndention(Writer, int)");
        }
    }
    
    private void writeAttributes(final Writer writer, final Properties properties, final int n, final boolean b) throws IOException {
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.entering(JSONObject.className, "writeAttributes(Writer, Properties, int, boolean)");
        }
        if (properties != null) {
            final Enumeration<?> propertyNames = properties.propertyNames();
            if (propertyNames != null && propertyNames.hasMoreElements()) {
                while (propertyNames.hasMoreElements()) {
                    final String key = propertyNames.nextElement();
                    this.writeAttribute(writer, this.escapeAttributeNameSpecialCharacters(key), (String)properties.get(key), n + 1, b);
                    if (propertyNames.hasMoreElements()) {
                        try {
                            if (!b) {
                                writer.write(",\n");
                            }
                            else {
                                writer.write(",");
                            }
                            continue;
                        }
                        catch (Exception cause) {
                            final IOException ex = new IOException("Error occurred on serialization of JSON text.");
                            ex.initCause(cause);
                            throw ex;
                        }
                        break;
                    }
                }
            }
        }
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.exiting(JSONObject.className, "writeAttributes(Writer, Properties, int, boolean)");
        }
    }
    
    private String escapeAttributeNameSpecialCharacters(String string) {
        if (string != null) {
            final StringBuffer sb = new StringBuffer("");
            for (int i = 0; i < string.length(); ++i) {
                final char char1 = string.charAt(i);
                switch (char1) {
                    case 58: {
                        sb.append("_ns-sep_");
                        break;
                    }
                    default: {
                        sb.append(char1);
                        break;
                    }
                }
            }
            string = sb.toString();
        }
        return string;
    }
    
    private String escapeStringSpecialCharacters(String string) {
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.exiting(JSONObject.className, "escapeStringSpecialCharacters(String)");
        }
        if (string != null) {
            final StringBuffer sb = new StringBuffer("");
            for (int i = 0; i < string.length(); ++i) {
                final char char1 = string.charAt(i);
                switch (char1) {
                    case 34: {
                        sb.append("\\\"");
                        break;
                    }
                    case 9: {
                        sb.append("\\t");
                        break;
                    }
                    case 8: {
                        sb.append("\\b");
                        break;
                    }
                    case 92: {
                        sb.append("\\\\");
                        break;
                    }
                    case 12: {
                        sb.append("\\f");
                        break;
                    }
                    case 13: {
                        sb.append("\\r");
                        break;
                    }
                    case 47: {
                        sb.append("\\/");
                        break;
                    }
                    default: {
                        if (char1 >= ' ' && char1 <= '~') {
                            sb.append(char1);
                            break;
                        }
                        sb.append("\\u");
                        final StringBuffer sb2 = new StringBuffer(Integer.toHexString(char1));
                        while (sb2.length() < 4) {
                            sb2.insert(0, '0');
                        }
                        sb.append(sb2.toString());
                        break;
                    }
                }
            }
            string = sb.toString();
        }
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.exiting(JSONObject.className, "escapeStringSpecialCharacters(String)");
        }
        return string;
    }
    
    private void writeChildren(final Writer writer, final int n, final boolean b) throws IOException {
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.entering(JSONObject.className, "writeChildren(Writer, int, boolean)");
        }
        if (!this.jsonObjects.isEmpty()) {
            final Enumeration<String> keys = (Enumeration<String>)this.jsonObjects.keys();
            while (keys.hasMoreElements()) {
                final String str = keys.nextElement();
                final Vector<JSONObject> vector = this.jsonObjects.get(str);
                if (vector != null && !vector.isEmpty()) {
                    if (vector.size() != 1) {
                        if (JSONObject.logger.isLoggable(Level.FINEST)) {
                            JSONObject.logger.logp(Level.FINEST, JSONObject.className, "writeChildren(Writer, int, boolean)", "Writing array of JSON objects with attribute name: [" + str + "]");
                        }
                        try {
                            if (!b) {
                                this.writeIndention(writer, n + 1);
                                writer.write("\"" + str + "\"");
                                writer.write(" : [\n");
                            }
                            else {
                                writer.write("\"" + str + "\"");
                                writer.write(":[");
                            }
                            for (int i = 0; i < vector.size(); ++i) {
                                final JSONObject jsonObject = vector.elementAt(i);
                                jsonObject.writeObject(writer, n + 2, true, b);
                                if (i != vector.size() - 1) {
                                    if (!b) {
                                        if (!jsonObject.isTextOnlyObject() && !jsonObject.isEmptyObject()) {
                                            this.writeIndention(writer, n + 2);
                                        }
                                        writer.write(",\n");
                                    }
                                    else {
                                        writer.write(",");
                                    }
                                }
                            }
                            if (!b) {
                                writer.write("\n");
                                this.writeIndention(writer, n + 1);
                            }
                            writer.write("]");
                            if (keys.hasMoreElements()) {
                                writer.write(",");
                            }
                            if (b) {
                                continue;
                            }
                            writer.write("\n");
                            continue;
                        }
                        catch (Exception cause) {
                            final IOException ex = new IOException("Error occurred on serialization of JSON text.");
                            ex.initCause(cause);
                            throw ex;
                        }
                        break;
                    }
                    if (JSONObject.logger.isLoggable(Level.FINEST)) {
                        JSONObject.logger.logp(Level.FINEST, JSONObject.className, "writeChildren(Writer, int, boolean)", "Writing child object: [" + str + "]");
                    }
                    final JSONObject jsonObject2 = vector.elementAt(0);
                    jsonObject2.writeObject(writer, n + 1, false, b);
                    if (keys.hasMoreElements()) {
                        try {
                            if (!b) {
                                if (!jsonObject2.isTextOnlyObject() && !jsonObject2.isEmptyObject()) {
                                    this.writeIndention(writer, n + 1);
                                }
                                writer.write(",\n");
                            }
                            else {
                                writer.write(",");
                            }
                            continue;
                        }
                        catch (Exception cause2) {
                            final IOException ex2 = new IOException("Error occurred on serialization of JSON text.");
                            ex2.initCause(cause2);
                            throw ex2;
                        }
                    }
                    if (!jsonObject2.isTextOnlyObject() || b) {
                        continue;
                    }
                    writer.write("\n");
                }
            }
        }
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.exiting(JSONObject.className, "writeChildren(Writer, int, boolean)");
        }
    }
    
    private void writeEmptyObject(final Writer writer, final int n, final boolean b, final boolean b2) throws IOException {
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.entering(JSONObject.className, "writeEmptyObject(Writer, int, boolean, boolean)");
        }
        if (!b) {
            if (!b2) {
                this.writeIndention(writer, n);
                writer.write("\"" + this.objectName + "\"");
                writer.write(" : true");
            }
            else {
                writer.write("\"" + this.objectName + "\"");
                writer.write(":true");
            }
        }
        else if (!b2) {
            this.writeIndention(writer, n);
            writer.write("true");
        }
        else {
            writer.write("true");
        }
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.exiting(JSONObject.className, "writeEmptyObject(Writer, int, boolean, boolean)");
        }
    }
    
    private void writeTextOnlyObject(final Writer writer, final int n, final boolean b, final boolean b2) throws IOException {
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.entering(JSONObject.className, "writeTextOnlyObject(Writer, int, boolean, boolean)");
        }
        if (!b) {
            this.writeAttribute(writer, this.objectName, this.tagText.trim(), n, b2);
        }
        else if (!b2) {
            this.writeIndention(writer, n);
            writer.write("\"" + this.escapeStringSpecialCharacters(this.tagText.trim()) + "\"");
        }
        else {
            writer.write("\"" + this.escapeStringSpecialCharacters(this.tagText.trim()) + "\"");
        }
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.exiting(JSONObject.className, "writeTextOnlyObject(Writer, int, boolean, boolean)");
        }
    }
    
    private void writeComplexObject(final Writer writer, final int n, final boolean b, final boolean b2) throws IOException {
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.entering(JSONObject.className, "writeComplexObject(Writer, int, boolean, boolean)");
        }
        boolean b3 = false;
        if (!b) {
            if (JSONObject.logger.isLoggable(Level.FINEST)) {
                JSONObject.logger.logp(Level.FINEST, JSONObject.className, "writeComplexObject(Writer, int, boolean, boolean)", "Writing object: [" + this.objectName + "]");
            }
            if (!b2) {
                this.writeIndention(writer, n);
            }
            writer.write("\"" + this.objectName + "\"");
            if (!b2) {
                writer.write(" : {\n");
            }
            else {
                writer.write(":{");
            }
        }
        else {
            if (JSONObject.logger.isLoggable(Level.FINEST)) {
                JSONObject.logger.logp(Level.FINEST, JSONObject.className, "writeObject(Writer, int, boolean, boolean)", "Writing object contents as an anonymous object (usually an array entry)");
            }
            if (!b2) {
                this.writeIndention(writer, n);
                writer.write("{\n");
            }
            else {
                writer.write("{");
            }
        }
        if (this.tagText != null && !this.tagText.equals("") && !this.tagText.trim().equals("")) {
            this.writeAttribute(writer, "content", this.tagText.trim(), n + 1, b2);
            b3 = true;
        }
        if (this.attrs != null && !this.attrs.isEmpty() && b3) {
            if (!b2) {
                writer.write(",\n");
            }
            else {
                writer.write(",");
            }
        }
        this.writeAttributes(writer, this.attrs, n, b2);
        if (!this.jsonObjects.isEmpty()) {
            if (this.attrs != null && (!this.attrs.isEmpty() || b3)) {
                if (!b2) {
                    writer.write(",\n");
                }
                else {
                    writer.write(",");
                }
            }
            else if (!b2) {
                writer.write("\n");
            }
            this.writeChildren(writer, n, b2);
        }
        else if (!b2) {
            writer.write("\n");
        }
        if (!b2) {
            this.writeIndention(writer, n);
            writer.write("}\n");
        }
        else {
            writer.write("}");
        }
        if (JSONObject.logger.isLoggable(Level.FINER)) {
            JSONObject.logger.exiting(JSONObject.className, "writeComplexObject(Writer, int, boolean, boolean)");
        }
    }
    
    private boolean isEmptyObject() {
        boolean b = false;
        if ((this.attrs == null || (this.attrs != null && this.attrs.isEmpty())) && this.jsonObjects.isEmpty() && (this.tagText == null || (this.tagText != null && this.tagText.trim().equals("")))) {
            b = true;
        }
        return b;
    }
    
    private boolean isTextOnlyObject() {
        boolean b = false;
        if ((this.attrs == null || (this.attrs != null && this.attrs.isEmpty())) && this.jsonObjects.isEmpty() && this.tagText != null && !this.tagText.trim().equals("")) {
            b = true;
        }
        return b;
    }
    
    static {
        JSONObject.className = "com.ibm.json.xml.internal.JSONObject";
        JSONObject.logger = Logger.getLogger(JSONObject.className, (String)null);
    }
}
