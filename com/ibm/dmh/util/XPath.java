// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.regex.Matcher;
import javax.xml.transform.TransformerException;
import java.util.regex.Pattern;

public class XPath
{
    SinglePath[] singlePaths;
    protected static String validXmlChars;
    protected static Pattern p1;
    
    public XPath(final String xPath) throws TransformerException {
        try {
            final String[] pathStrings = StringUtils.split(xPath, '|');
            this.singlePaths = new SinglePath[pathStrings.length];
            for (int i = 0; i < pathStrings.length; ++i) {
                this.singlePaths[i] = new SinglePath(pathStrings[i]);
            }
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
            throw new TransformerException("Invalid/unsupported XPath encountered:  [" + xPath + "]");
        }
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("XPath: ");
        for (int i = 0; i < this.singlePaths.length; ++i) {
            sb.append("[" + this.singlePaths[i] + "] ");
        }
        return sb.toString();
    }
    
    static {
        XPath.validXmlChars = "[\\w\\d\\.\\_\\-]+";
        XPath.p1 = Pattern.compile("^(" + XPath.validXmlChars + ")\\[\\@(" + XPath.validXmlChars + ")\\=(\\S+)\\]$");
    }
    
    static class SinglePath
    {
        public static int RELATIVE;
        public static int ABSOLUTE;
        public static int ALL;
        public int spType;
        public Token[] tokens;
        
        public SinglePath(String p) {
            if (p.startsWith("//")) {
                this.spType = SinglePath.ALL;
                p = p.substring(2);
            }
            else if (p.startsWith("/")) {
                this.spType = SinglePath.ABSOLUTE;
                p = p.substring(1);
            }
            else {
                this.spType = SinglePath.RELATIVE;
            }
            final String[] s = StringUtils.split(p, '/');
            this.tokens = new Token[s.length];
            for (int i = 0; i < s.length; ++i) {
                this.tokens[i] = new Token(s[i]);
            }
        }
        
        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer();
            sb.append("spType=[" + this.spType + "],");
            for (int i = 0; i < this.tokens.length; ++i) {
                sb.append("[" + this.tokens[i] + "]");
            }
            return sb.toString();
        }
        
        static {
            SinglePath.RELATIVE = 0;
            SinglePath.ABSOLUTE = 1;
            SinglePath.ALL = 2;
        }
    }
    
    static class Token
    {
        short type;
        String name;
        String attrMatchName;
        String attrMatchVal;
        Matcher m;
        
        protected Token(String s) {
            s = s.replaceFirst("child::", "");
            s = s.replaceAll("[\"']+", "");
            if (s.length() == 0) {
                throw new RuntimeException();
            }
            if (s.charAt(0) == '@') {
                this.type = 2;
                this.name = s.substring(1);
            }
            else {
                final Matcher matcher = XPath.p1.matcher(s);
                this.m = matcher;
                if (matcher.matches()) {
                    this.type = 1;
                    this.name = this.m.group(1);
                    this.attrMatchName = this.m.group(2);
                    this.attrMatchVal = this.m.group(3);
                }
                else if (s.matches("text\\(\\)")) {
                    this.type = 3;
                }
                else {
                    if (!s.matches(XPath.validXmlChars)) {
                        throw new RuntimeException();
                    }
                    this.type = 1;
                    this.name = s;
                }
            }
        }
        
        @Override
        public String toString() {
            return "type=" + this.type + ",name=" + this.name + ",attrMatchName=" + this.attrMatchName + ",attrMatchVal=" + this.attrMatchVal;
        }
    }
}
