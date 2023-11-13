// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import com.ibm.jjson.beans.annotation.HtmlLink;

@HtmlLink(nameProperty = "name", urlProperty = "url")
public class Hyperlink
{
    public String name;
    public String url;
    
    public Hyperlink(final String name, final String url) {
        this.name = name;
        this.url = url;
    }
}
