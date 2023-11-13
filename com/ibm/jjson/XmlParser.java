// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.util.HashMap;
import org.w3c.dom.Text;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import com.ibm.jjson.beans.BeanMapFactory;
import org.w3c.dom.Element;
import java.util.Collection;
import java.util.List;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.InputSource;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.Reader;
import java.util.Map;

public class XmlParser extends Parser
{
    public static final XmlParser DEFAULT;
    private static final int OBJECT = 1;
    private static final int ARRAY = 2;
    private static final int STRING = 3;
    private static final int NUMBER = 4;
    private static final int BOOLEAN = 5;
    private static final Map<String, Integer> types;
    
    public XmlParser clone() {
        try {
            return (XmlParser)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Object parse(final Reader r, final long length) throws ParseException, IOException {
        try {
            final DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            final InputSource is = new InputSource(r);
            return this.parseElement(builder.parse(is).getDocumentElement());
        }
        catch (Exception e) {
            throw new ParseException(e);
        }
    }
    
    @Override
    protected void parseInto(final Reader r, final long length, final Object o) throws ParseException {
        try {
            final DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            final InputSource is = new InputSource(r);
            final Element root = builder.parse(is).getDocumentElement();
            if (o instanceof Map) {
                ((Map)o).putAll((Map)this.parseElement(root));
            }
            else if (o instanceof List) {
                ((List)o).addAll((Collection)this.parseElement(root));
            }
        }
        catch (ClassCastException e2) {
            throw new ParseException("", 0, "Parsed XML did not conform to the data type [" + o.getClass().getName() + "]");
        }
        catch (ParseException e) {
            throw e;
        }
        catch (Exception e3) {
            throw new ParseException("", 0, "Document was not valid XML.");
        }
    }
    
    public Object parseElement(final Element e) {
        final int type = this.getJsonType(e);
        if (type == 1) {
            final Map m = new JsonMap();
            final NodeList nl = e.getChildNodes();
            for (int i = 0; i < nl.getLength(); ++i) {
                final Node n = nl.item(i);
                if (n.getNodeType() == 1) {
                    m.put(this.getJsonAttrName((Element)n), this.parseElement((Element)n));
                }
            }
            try {
                if (m.containsKey("_class")) {
                    return BeanMapFactory.DEFAULT.newInstance(Class.forName(m.get("_class")), m).getBean();
                }
            }
            catch (Exception ex) {}
            return m;
        }
        if (type == 2) {
            final List l = new JsonList();
            final NodeList nl = e.getChildNodes();
            for (int i = 0; i < nl.getLength(); ++i) {
                final Node n = nl.item(i);
                if (n.getNodeType() == 1) {
                    l.add(this.parseElement((Element)n));
                }
            }
            return l;
        }
        if (type == 3) {
            return this.getTextContent(e);
        }
        if (type == 4) {
            return JsonParser.parseNumber(this.getTextContent(e), new JsonParser.MutableInt(0));
        }
        if (type == 5) {
            return new Boolean(this.getTextContent(e).charAt(0) == 't');
        }
        return null;
    }
    
    private String getTextContent(final Element e) {
        final NodeList nl = e.getChildNodes();
        for (int i = 0; i < nl.getLength(); ++i) {
            final Node n = nl.item(i);
            if (n.getNodeType() == 3) {
                return ((Text)n).getNodeValue();
            }
        }
        return "";
    }
    
    private int getJsonType(final Element e) {
        return e.hasAttribute("type") ? XmlParser.types.get(e.getAttribute("type")) : ((int)XmlParser.types.get(e.getNodeName()));
    }
    
    private String getJsonAttrName(final Element e) {
        final String n = e.getNodeName();
        return (XmlParser.types.get(n) == null) ? this.decodeName(n) : null;
    }
    
    private String decodeName(final String s) {
        if (s == null) {
            return null;
        }
        if (s.indexOf(95) == -1) {
            return s;
        }
        final StringBuffer sb = new StringBuffer(s.length());
        for (int i = 0; i < s.length(); ++i) {
            final char c = s.charAt(i);
            if (c == '_' && i < s.length() - 1 && s.charAt(i + 1) == 'x') {
                sb.append((char)Integer.parseInt(s.substring(i + 2, i + 6), 16));
                i += 6;
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    static {
        DEFAULT = new XmlParser();
        (types = new HashMap<String, Integer>()).put("object", 1);
        XmlParser.types.put("array", 2);
        XmlParser.types.put("string", 3);
        XmlParser.types.put("number", 4);
        XmlParser.types.put("boolean", 5);
        XmlParser.types.put("null", 6);
    }
}
