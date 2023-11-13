// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

import com.ibm.dmh.log.LoggerManager;
import java.io.File;
import java.util.HashMap;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import java.io.Reader;
import org.xml.sax.InputSource;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.logging.Level;
import java.util.List;
import java.util.LinkedList;
import java.util.Locale;
import java.io.InputStream;
import java.io.IOException;
import com.ibm.dmh.util.TextFileContents;
import java.util.logging.Logger;
import java.util.Map;

public class MsgMgrTable
{
    private static Map<Integer, WsaaMessageGeneric> messages;
    private static boolean isInitialized;
    protected static Logger logger;
    protected static boolean debug;
    private static final String prefix = "messages";
    private static final String suffix = ".xml";
    
    private static WsaaMessage createBadLoadMessage(final String iValue) {
        final WsaaMessageGeneric msg = WsaaHardCodedMessages.getInstance().getBadLoadMessage();
        final String key = "xmlfile";
        final String[] varKeys = { key };
        final String value = MsgMgrTable.class.getPackage().getName() + "." + iValue;
        final String[] varValues = { value };
        final WsaaMessage m = new WsaaMessage(msg, varKeys, varValues);
        return m;
    }
    
    public static synchronized void loadMessages(final String xmlContents) throws WsaaException {
        try {
            parseXML(xmlContents, MsgMgrTable.messages);
        }
        catch (Throwable t) {
            final WsaaMessage m = createBadLoadMessage(getXmlMessageFileName());
            throw new WsaaException(m, t);
        }
    }
    
    public static synchronized void init() throws WsaaException {
        if (!MsgMgrTable.isInitialized) {
            final String[] fileNames = getAllXmlFileNames();
            for (int i = fileNames.length - 1; i >= 0; --i) {
                loadMessages(getXmlMessageFileContents(fileNames[i]));
            }
            MsgMgrTable.isInitialized = true;
        }
    }
    
    private static String getXmlMessageFileContents(final String messageFileName) throws WsaaException {
        final TextFileContents fc = new TextFileContents();
        try {
            final InputStream in = MsgMgrTable.class.getResourceAsStream(messageFileName);
            fc.readFile(in, "UTF-8");
        }
        catch (IOException e) {
            final WsaaMessage m = createBadLoadMessage(messageFileName);
            throw new WsaaException(m, e);
        }
        return fc.getContents().replaceAll("[\r\n\t]", "");
    }
    
    public static String getXmlMessageFileName() {
        String localeCode = Locale.getDefault().toString();
        while (!localeCode.equals("")) {
            final String resource = "messages_" + localeCode + ".xml";
            if (MsgMgrTable.class.getResource(resource) != null) {
                return resource;
            }
            if (localeCode.lastIndexOf("_") == -1) {
                localeCode = "";
            }
            else {
                localeCode = localeCode.substring(0, localeCode.lastIndexOf("_"));
            }
        }
        return "messages.xml";
    }
    
    private static String[] getAllXmlFileNames() throws WsaaException {
        final List<String> fileNames = new LinkedList<String>();
        String localeCode = Locale.getDefault().toString();
        while (!localeCode.equals("")) {
            final String resource = "messages_" + localeCode + ".xml";
            if (MsgMgrTable.class.getResource(resource) != null) {
                fileNames.add(resource);
            }
            final int index = localeCode.lastIndexOf("_");
            if (index == -1) {
                localeCode = "";
            }
            else {
                localeCode = localeCode.substring(0, index);
            }
        }
        final String resource = "messages.xml";
        if (MsgMgrTable.class.getResource(resource) != null) {
            fileNames.add(resource);
        }
        if (fileNames.size() == 0) {
            final WsaaMessage m = createBadLoadMessage(resource);
            throw new WsaaException(m);
        }
        return fileNames.toArray(new String[0]);
    }
    
    public static WsaaMessageGeneric getMessage(final Integer messageIdentifier) {
        if (!MsgMgrTable.isInitialized) {
            try {
                init();
            }
            catch (WsaaException e) {
                MsgMgrTable.logger.log(Level.WARNING, e.getLocalizedMessage(), e);
            }
        }
        if (!MsgMgrTable.messages.containsKey(messageIdentifier)) {
            return WsaaHardCodedMessages.getInstance().getUnknownMessage(messageIdentifier.toString());
        }
        return MsgMgrTable.messages.get(messageIdentifier);
    }
    
    public static boolean messageExists(final Integer messageIdentifier) {
        return MsgMgrTable.messages.containsKey(messageIdentifier);
    }
    
    static void parseXML(final String buf, final Map<Integer, WsaaMessageGeneric> destMap) {
        try {
            final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringElementContentWhitespace(true);
            factory.setNamespaceAware(true);
            factory.setExpandEntityReferences(false);
            final DocumentBuilder builder = factory.newDocumentBuilder();
            final Element rootElement = builder.parse(new InputSource(new StringReader(buf))).getDocumentElement();
            final NodeList msgs = rootElement.getChildNodes();
            for (int i = 0; i < msgs.getLength(); ++i) {
                if (msgs.item(i).getNodeName().equals("msg")) {
                    final Node curMsg = msgs.item(i);
                    final WsaaMessageGeneric wsaaMsg = parseMsg(curMsg);
                    destMap.put(new Integer(wsaaMsg.getMessageNumber()), wsaaMsg);
                }
            }
        }
        catch (Throwable t) {
            throw new WsaaRuntimeException(t);
        }
    }
    
    static WsaaMessageGeneric parseMsg(final Node curMsg) {
        String identifier = "";
        String title = "";
        String module = "";
        String explanation = "";
        String systemAction = "";
        String userResponse = "";
        final NodeList fields = curMsg.getChildNodes();
        for (int i = 0; i < fields.getLength(); ++i) {
            final Node curField = fields.item(i);
            if (curField instanceof Element) {
                final String curFieldText = getChildText(curField).trim();
                if (curField.getNodeName().equals("msgtext")) {
                    title = curFieldText;
                }
                else if (curField.getNodeName().equals("msgnum")) {
                    identifier = curFieldText;
                }
                else {
                    final NamedNodeMap attributes = curField.getAttributes();
                    final Node classAttribute = attributes.getNamedItem("class");
                    final String classValue = classAttribute.getNodeValue();
                    if (classValue.equals("module")) {
                        module = curFieldText;
                    }
                    else if (classValue.equals("xpl")) {
                        explanation = curFieldText;
                    }
                    else if (classValue.equals("sysact")) {
                        systemAction = curFieldText;
                    }
                    else {
                        userResponse = curFieldText;
                    }
                }
            }
        }
        return new WsaaMessageGeneric(identifier, title, module, explanation, systemAction, userResponse);
    }
    
    static String getChildText(final Node parent) {
        String domText = "";
        if (!parent.hasChildNodes()) {
            return "";
        }
        final NodeList list = parent.getChildNodes();
        for (int i = 0; i < list.getLength(); ++i) {
            domText += getChildTextHelper(list.item(i));
        }
        return domText;
    }
    
    private static String getChildTextHelper(final Node parent) {
        String domText = "";
        switch (parent.getNodeType()) {
            case 1: {
                domText = domText + "<" + parent.getNodeName();
                domText += getAttributeText(parent);
                if (!parent.hasChildNodes()) {
                    domText += "/>";
                    break;
                }
                domText += ">";
                final NodeList children = parent.getChildNodes();
                for (int i = 0; i < children.getLength(); ++i) {
                    domText += getChildTextHelper(children.item(i));
                }
                domText = domText + "</" + parent.getNodeName() + ">";
                break;
            }
            case 3: {
                final StringBuffer nodeText = new StringBuffer(parent.getNodeValue());
                for (int j = 0; j < nodeText.length(); ++j) {
                    switch (nodeText.charAt(j)) {
                        case '<': {
                            nodeText.replace(j, j + 1, "&lt;");
                            break;
                        }
                        case '>': {
                            nodeText.replace(j, j + 1, "&gt;");
                            break;
                        }
                    }
                }
                domText += nodeText.toString();
                break;
            }
            default: {
                final WsaaMessage m = new WsaaMessage(WsaaHardCodedMessages.getInstance().getUnknownMessage("5354"), new String[] { "node type", "parent string" }, new String[] { String.valueOf(parent.getNodeType()), parent.toString() });
                try {
                    if (MsgMgrTable.debug) {
                        MsgMgrTable.logger.log(Level.FINE, m.toString());
                    }
                }
                catch (Throwable t) {
                    System.err.println(m);
                }
                break;
            }
        }
        return domText;
    }
    
    private static String getAttributeText(final Node parent) {
        String domText = "";
        final NamedNodeMap attributes = parent.getAttributes();
        for (int i = 0; i < attributes.getLength(); ++i) {
            final Attr attribute = (Attr)attributes.item(i);
            domText = domText + " " + attribute.getName() + "=\"" + attribute.getValue() + "\"";
        }
        return domText;
    }
    
    public static synchronized void reset() {
        MsgMgrTable.isInitialized = false;
        MsgMgrTable.messages = new HashMap<Integer, WsaaMessageGeneric>();
    }
    
    public static Map<Integer, WsaaMessageGeneric> getAllMessages() {
        return MsgMgrTable.messages;
    }
    
    static void setMessages(final Map<Integer, WsaaMessageGeneric> map) {
        MsgMgrTable.messages = map;
    }
    
    public static String getMsgListSchemaUrl() {
        return MsgMgrTable.class.getResource("msglist.xsd").toString();
    }
    
    public static void main(final String[] args) {
        System.out.println(new File(MsgMgrTable.class.getResource("messages.xml").getFile()));
        System.out.println(Locale.getDefault());
    }
    
    static {
        MsgMgrTable.messages = new HashMap<Integer, WsaaMessageGeneric>();
        MsgMgrTable.isInitialized = false;
        MsgMgrTable.logger = LoggerManager.getMainLogger();
        MsgMgrTable.debug = MsgMgrTable.logger.isLoggable(Level.FINE);
    }
}
