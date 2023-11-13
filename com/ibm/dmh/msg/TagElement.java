// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

public class TagElement
{
    private final TagElementGeneric tag;
    private final int location;
    
    public TagElement(final String xmlTag, final int locationIdx) {
        this.tag = TagElementGeneric.getTag(xmlTag);
        this.location = locationIdx;
    }
    
    public int getLocation() {
        return this.location;
    }
    
    @Override
    public String toString() {
        return this.getText();
    }
    
    public String getHtml() {
        return this.tag.getHtml();
    }
    
    public String getText() {
        return this.tag.getText();
    }
    
    public String getXml() {
        return this.tag.getXml();
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (obj instanceof TagElement) {
            final TagElement other = (TagElement)obj;
            return other.tag.equals(this.tag) && other.location == this.location;
        }
        return super.equals(obj);
    }
    
    @Override
    public int hashCode() {
        return this.tag.hashCode() + this.location;
    }
}
