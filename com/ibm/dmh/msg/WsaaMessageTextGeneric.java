// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

import java.util.Collection;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class WsaaMessageTextGeneric
{
    private final String textVersion;
    private final TagElement[] tags;
    
    public WsaaMessageTextGeneric(final String partialXML) {
        final StringBuffer buf = new StringBuffer();
        final List<TagElement> tagsList = new LinkedList<TagElement>();
        extractTags(partialXML, buf, tagsList);
        this.tags = tagsList.toArray(new TagElement[0]);
        this.textVersion = buf.toString();
    }
    
    WsaaMessageTextGeneric(final String textVersion, final TagElement[] tags) {
        this.textVersion = textVersion;
        this.tags = tags;
    }
    
    static void extractTags(final String partialXML, final StringBuffer buf, final List<TagElement> tagsList) {
        int i = 0;
        while (i < partialXML.length()) {
            switch (partialXML.charAt(i)) {
                case '<': {
                    final int endTag = partialXML.indexOf(62, i);
                    final TagElement curTag = new TagElement(partialXML.substring(i + 1, endTag), buf.length());
                    tagsList.add(curTag);
                    buf.append(curTag.getText());
                    i = endTag + 1;
                    continue;
                }
                case '&': {
                    final int endTag = partialXML.indexOf(59, i);
                    if (endTag != -1 && endTag < partialXML.indexOf(32, i)) {
                        final TagElement curTag = new TagElement(partialXML.substring(i, endTag + 1), buf.length());
                        tagsList.add(curTag);
                        buf.append(curTag.getText());
                        i = endTag + 1;
                        continue;
                    }
                    break;
                }
            }
            buf.append(partialXML.charAt(i));
            ++i;
        }
    }
    
    public String getXml(final String[] varKeys, final String[] varValues) {
        final StringBuffer buf = new StringBuffer();
        int startLocation = 0;
        for (int i = 0; i < this.tags.length; ++i) {
            buf.append(this.textVersion.substring(startLocation, this.tags[i].getLocation()));
            if (this.tags[i].getXml().equals("<mv>")) {
                String varName;
                int varIdx;
                for (varName = this.textVersion.substring(this.tags[i].getLocation(), this.tags[i + 1].getLocation()), varIdx = 0; varIdx < varKeys.length && !varKeys[varIdx].equals(varName); ++varIdx) {}
                if (varIdx < varKeys.length) {
                    buf.append(varValues[varIdx]);
                    ++i;
                }
                else {
                    buf.append(this.tags[i].getXml());
                }
            }
            else {
                buf.append(this.tags[i].getXml());
            }
            startLocation = this.tags[i].getLocation() + this.tags[i].getText().length();
        }
        buf.append(this.textVersion.substring(startLocation));
        return buf.toString();
    }
    
    public String getText(final String[] varKeys, final String[] varValues) {
        final StringBuffer buf = new StringBuffer();
        int startLocation = 0;
        for (int i = 0; i < this.tags.length; ++i) {
            if (this.tags[i].getXml().equals("<mv>")) {
                buf.append(this.textVersion.substring(startLocation, this.tags[i].getLocation()));
                String varName;
                int varIdx;
                for (varName = this.textVersion.substring(this.tags[i].getLocation() + this.tags[i].getText().length(), this.tags[i + 1].getLocation()), varIdx = 0; varIdx < varKeys.length && !varKeys[varIdx].equals(varName); ++varIdx) {}
                if (varIdx < varKeys.length) {
                    buf.append(varValues[varIdx]);
                    ++i;
                }
                else {
                    buf.append(this.tags[i].getText());
                }
                startLocation = this.tags[i].getLocation() + this.tags[i].getText().length();
            }
        }
        buf.append(this.textVersion.substring(startLocation));
        return buf.toString();
    }
    
    public String getHtml(final String[] varKeys, final String[] varValues) {
        final StringBuffer buf = new StringBuffer();
        int startLocation = 0;
        for (int i = 0; i < this.tags.length; ++i) {
            buf.append(this.textVersion.substring(startLocation, this.tags[i].getLocation()));
            buf.append(this.tags[i].getHtml());
            if (this.tags[i].getXml().equals("<mv>")) {
                String varName;
                int varIdx;
                for (varName = this.textVersion.substring(this.tags[i].getLocation() + this.tags[i].getText().length(), this.tags[i + 1].getLocation()), varIdx = 0; varIdx < varKeys.length && !varKeys[varIdx].equals(varName); ++varIdx) {}
                if (varIdx < varKeys.length) {
                    buf.append(varValues[varIdx]);
                    ++i;
                    buf.append(this.tags[i].getHtml());
                }
            }
            startLocation = this.tags[i].getLocation() + this.tags[i].getText().length();
        }
        buf.append(this.textVersion.substring(startLocation));
        return buf.toString();
    }
    
    @Override
    public String toString() {
        return this.getText();
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof WsaaMessageTextGeneric)) {
            return super.equals(obj);
        }
        final WsaaMessageTextGeneric wmt = (WsaaMessageTextGeneric)obj;
        if (!this.textVersion.equals(wmt.textVersion)) {
            return false;
        }
        if (this.tags == null) {
            return wmt.tags == null || wmt.tags.length == 0;
        }
        if (wmt.tags == null) {
            return this.tags == null || this.tags.length == 0;
        }
        final List<TagElement> l1 = Arrays.asList(this.tags);
        final List<TagElement> l2 = Arrays.asList(wmt.tags);
        return l1.containsAll(l2) && l2.containsAll(l1);
    }
    
    @Override
    public int hashCode() {
        return this.textVersion.hashCode();
    }
    
    public TagElement[] getTags() {
        return this.tags;
    }
    
    String getText() {
        return this.getText(new String[0], new String[0]);
    }
    
    String getHtml() {
        return this.getHtml(new String[0], new String[0]);
    }
    
    String getXml() {
        return this.getXml(new String[0], new String[0]);
    }
}
