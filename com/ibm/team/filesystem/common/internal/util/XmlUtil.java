// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.util;

import com.ibm.team.foundation.common.text.XMLString;

@Deprecated
public abstract class XmlUtil
{
    public static TagEscaper escapeTag(final String tag) {
        return new TagEscaper(tag, null);
    }
    
    public static class TagEscaper
    {
        private final StringBuffer buf;
        private final String tag;
        boolean selfTerminated;
        
        private TagEscaper(final String tag) {
            this.buf = new StringBuffer();
            this.selfTerminated = true;
            assert XMLString.createFromPlainText(tag).getXMLText().equals(tag);
            this.tag = tag;
            this.buf.append('<');
            this.buf.append(tag);
        }
        
        public void addAttribute(final String attributeKey, final String attributeValue) {
            assert XMLString.createFromPlainText(attributeKey).getXMLText().equals(attributeKey);
            this.buf.append(' ');
            this.buf.append(attributeKey);
            this.buf.append('=');
            this.buf.append('\"');
            this.buf.append(XMLString.createFromPlainText(attributeValue).getXMLText());
            this.buf.append('\"');
        }
        
        public void setSelfTerminated(final boolean selfTerminated) {
            this.selfTerminated = selfTerminated;
        }
        
        @Override
        public String toString() {
            return String.valueOf(this.buf.toString()) + (this.selfTerminated ? "/>" : ">");
        }
        
        public String close() {
            if (this.selfTerminated) {
                throw new IllegalStateException();
            }
            return "</" + this.tag + ">";
        }
    }
}
