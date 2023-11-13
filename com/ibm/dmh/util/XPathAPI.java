// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import com.ibm.dmh.msg.WsaaException;
import com.ibm.dmh.msg.MsgMgr;
import java.util.Arrays;
import org.w3c.dom.NamedNodeMap;
import javax.xml.transform.TransformerException;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;
import java.util.LinkedList;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import java.util.HashMap;

public class XPathAPI
{
    public static HashMap<String, XPath> preCompiledXPaths;
    
    public static NodeList selectNodeList(final Element root, final String xPathString) throws TransformerException {
        final LinkedList<Node> results = new LinkedList<Node>();
        XPath xPath = XPathAPI.preCompiledXPaths.get(xPathString);
        if (xPath == null) {
            xPath = new XPath(xPathString);
            XPathAPI.preCompiledXPaths.put(xPathString, xPath);
        }
        for (int i = 0; i < xPath.singlePaths.length; ++i) {
            final XPath.SinglePath sp = xPath.singlePaths[i];
            List<Node> children = new LinkedList<Node>();
            List<Node> parents = new LinkedList<Node>();
            List<Node> l = null;
            if (sp.spType == XPath.SinglePath.ABSOLUTE) {
                parents.add(root);
            }
            else if (sp.spType == XPath.SinglePath.RELATIVE) {
                if (sp.tokens[0].type == 2) {
                    addToList(results, root.getAttributeNode(sp.tokens[0].name));
                }
                else {
                    addToList(parents, root.getChildNodes());
                }
            }
            else if (sp.spType == XPath.SinglePath.ALL) {
                parents.add(root);
                addToList(parents, root.getElementsByTagName(sp.tokens[0].name));
            }
            for (int j = 0; j < sp.tokens.length; ++j) {
                final XPath.Token token = sp.tokens[j];
                for (final Node n : parents) {
                    final int nType = n.getNodeType();
                    if (token.type == nType) {
                        if (token.type == 3) {
                            results.add(n);
                        }
                        else {
                            if (token.type != 1) {
                                continue;
                            }
                            final Element e = (Element)n;
                            final boolean nameMatches = token.name == null || e.getNodeName().equals(token.name);
                            final boolean attrMatches = token.attrMatchName == null || e.getAttribute(token.attrMatchName).equals(token.attrMatchVal);
                            if (!nameMatches || !attrMatches) {
                                continue;
                            }
                            if (j + 1 == sp.tokens.length) {
                                results.add(e);
                            }
                            else if (sp.tokens[j + 1].type == 2) {
                                addToList(results, e.getAttributeNode(sp.tokens[j + 1].name));
                            }
                            else {
                                addToList(children, n.getChildNodes());
                            }
                        }
                    }
                }
                l = parents;
                parents = children;
                children = l;
                children.clear();
            }
        }
        return new NodeListImpl(results);
    }
    
    private static void addToList(final List<Node> l, final NodeList nl) {
        for (int length = nl.getLength(), i = 0; i < length; ++i) {
            l.add(nl.item(i));
        }
    }
    
    private static void addToList(final List<Node> l, final Node n) {
        if (n != null) {
            l.add(n);
        }
    }
    
    public static Node selectSingleNode(final Element root, final String xPathString) throws TransformerException {
        final NodeList nl = selectNodeList(root, xPathString);
        if (nl.getLength() == 0) {
            return null;
        }
        return nl.item(0);
    }
    
    public static String printNode(final Node n) {
        if (n.getNodeType() == 1) {
            final StringBuffer sb = new StringBuffer("<" + n.getNodeName());
            final NamedNodeMap nnm = ((Element)n).getAttributes();
            for (int i = 0; i < nnm.getLength(); ++i) {
                sb.append(" " + nnm.item(i).getNodeName() + "='" + nnm.item(i).getNodeValue() + "'");
            }
            return sb.append("/>").toString();
        }
        if (n.getNodeType() == 2) {
            return "@" + n.getNodeName() + "=" + n.getNodeValue();
        }
        if (n.getNodeType() == 3) {
            return "'" + n.getNodeValue() + "'";
        }
        return null;
    }
    
    public static String printNodeList(final NodeList nl) {
        final String[] s = new String[nl.getLength()];
        for (int i = 0; i < nl.getLength(); ++i) {
            s[i] = printNode(nl.item(i));
        }
        Arrays.sort(s);
        return StringUtils.join(s, ",");
    }
    
    public static Element[] getChildren(final Element element, final String childXPath) throws WsaaException {
        try {
            final NodeList nl = selectNodeList(element, childXPath);
            final int len = nl.getLength();
            final Element[] children = new Element[len];
            for (int i = 0; i < len; ++i) {
                final Node node = nl.item(i);
                if (1 != node.getNodeType()) {
                    throw new WsaaException(MsgMgr.dmh7560e(childXPath), null);
                }
                children[i] = (Element)node;
            }
            return children;
        }
        catch (TransformerException e) {
            throw new WsaaException(MsgMgr.dmh7561e(childXPath), e);
        }
    }
    
    static {
        XPathAPI.preCompiledXPaths = new HashMap<String, XPath>();
    }
    
    public static class NodeListImpl implements NodeList
    {
        private final Node[] list;
        
        NodeListImpl(final List<Node> l) {
            this.list = l.toArray(new Node[l.size()]);
        }
        
        @Override
        public int getLength() {
            return this.list.length;
        }
        
        @Override
        public Node item(final int index) {
            return this.list[index];
        }
    }
}
