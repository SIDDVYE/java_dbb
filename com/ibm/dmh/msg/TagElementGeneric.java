// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Map;

public class TagElementGeneric
{
    private final String xmlVersion;
    private static Map<String, TagElementGeneric> map;
    
    TagElementGeneric(final String innerXml) {
        this.xmlVersion = innerXml;
    }
    
    private static String getInnerXML(final String xml) {
        final int start = xml.indexOf(60) + 1;
        int end = xml.lastIndexOf(62);
        if (end == -1) {
            end = xml.length();
        }
        return xml.substring(start, end);
    }
    
    public static synchronized TagElementGeneric getTag(final String xml) {
        final String innerXml = getInnerXML(xml);
        if (TagElementGeneric.map.containsKey(innerXml)) {
            return TagElementGeneric.map.get(innerXml);
        }
        final TagElementGeneric tag = new TagElementGeneric(innerXml);
        TagElementGeneric.map.put(innerXml, tag);
        return tag;
    }
    
    public String getXml() {
        if (this.xmlVersion.charAt(0) == '&') {
            return this.xmlVersion;
        }
        return "<" + this.xmlVersion + ">";
    }
    
    public String getText() {
        final String tagName = this.getName(this.xmlVersion);
        String text = "";
        if (!tagName.equals("cit")) {
            if (!tagName.equals("defn")) {
                if (!tagName.equals("/defn")) {
                    if (tagName.equals("dl")) {
                        text = "[";
                    }
                    else if (tagName.equals("/dl")) {
                        text = "]";
                    }
                    else if (tagName.equals("dlentry")) {
                        text = "(";
                    }
                    else if (tagName.equals("/dlentry")) {
                        text = ")";
                    }
                    else if (tagName.equals("li")) {
                        text = "(";
                    }
                    else if (tagName.equals("/li")) {
                        text = ")";
                    }
                    else if (!tagName.equals("mv")) {
                        if (!tagName.equals("/mv")) {
                            if (!tagName.equals("p")) {
                                if (tagName.equals("/p")) {
                                    text = "  ";
                                }
                                else if (!tagName.equals("ph")) {
                                    if (!tagName.equals("/ph")) {
                                        if (!tagName.equals("term")) {
                                            if (tagName.equals("/term")) {
                                                text = " - ";
                                            }
                                            else if (tagName.equals("ul")) {
                                                text = "[";
                                            }
                                            else if (tagName.equals("/ul")) {
                                                text = "]";
                                            }
                                            else if (!tagName.equals("xmp")) {
                                                if (!tagName.equals("/xmp")) {
                                                    if (tagName.equals("&gt;")) {
                                                        text = ">";
                                                    }
                                                    else if (tagName.equals("&lt;")) {
                                                        text = "<";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return text;
    }
    
    private String getName(final String xml) {
        final StringTokenizer tokens = new StringTokenizer(xml);
        return tokens.nextToken();
    }
    
    private String getAttributes(final String xml, final String name) {
        return xml.substring(name.length()).trim();
    }
    
    public String getHtml() {
        final String tagName = this.getName(this.xmlVersion);
        String text = "";
        if (!tagName.equals("cit")) {
            if (tagName.equals("defn")) {
                text = "dd";
            }
            else if (tagName.equals("/defn")) {
                text = "/dd";
            }
            else if (tagName.equals("dl")) {
                text = "dl";
            }
            else if (tagName.equals("/dl")) {
                text = "/dl";
            }
            else if (tagName.equals("dlentry")) {
                text = "";
            }
            else if (tagName.equals("/dlentry")) {
                text = "";
            }
            else if (tagName.equals("li")) {
                text = "li";
            }
            else if (tagName.equals("/li")) {
                text = "/li";
            }
            else if (tagName.equals("mv")) {
                text = "span class='msgVar'";
            }
            else if (tagName.equals("/mv")) {
                text = "/span";
            }
            else if (tagName.equals("p")) {
                text = "p";
            }
            else if (tagName.equals("/p")) {
                text = "/p";
            }
            else if (tagName.equals("ph")) {
                text = "span " + this.convertPhTag(this.xmlVersion, tagName);
            }
            else if (tagName.equals("/ph")) {
                text = "/span";
            }
            else if (tagName.equals("term")) {
                text = "dt";
            }
            else if (tagName.equals("/term")) {
                text = "/dt";
            }
            else if (tagName.equals("ul")) {
                text = "ul";
            }
            else if (tagName.equals("/ul")) {
                text = "/ul";
            }
            else if (tagName.equals("xmp")) {
                text = "code";
            }
            else if (tagName.equals("/xmp")) {
                text = "/code";
            }
            else if (tagName.equals("&gt;")) {
                text = "&gt;";
            }
            else if (tagName.equals("&lt;")) {
                text = "&lt;";
            }
        }
        text = text.trim();
        if (text.equals("")) {
            return text;
        }
        if (text.charAt(0) == '&') {
            return text;
        }
        return "<" + text + ">";
    }
    
    @Override
    public boolean equals(final Object obj) {
        return super.equals(obj);
    }
    
    @Override
    public int hashCode() {
        return this.xmlVersion.hashCode();
    }
    
    @Override
    public String toString() {
        return this.xmlVersion;
    }
    
    private String convertPhTag(final String xml, final String name) {
        StringBuffer attributes = new StringBuffer(this.getAttributes(xml, name));
        int startIdx = attributes.toString().indexOf("italic");
        if (startIdx != -1) {
            attributes = attributes.replace(startIdx, "italic".length() + startIdx, "font-style: italic;");
        }
        startIdx = attributes.toString().indexOf("bold");
        if (startIdx != -1) {
            attributes = attributes.replace(startIdx, "bold".length() + startIdx, "font-weight: bold;");
        }
        return attributes.toString();
    }
    
    static {
        TagElementGeneric.map = new HashMap<String, TagElementGeneric>(101);
    }
}
