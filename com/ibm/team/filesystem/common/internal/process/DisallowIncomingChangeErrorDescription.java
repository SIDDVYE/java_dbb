// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.process;

import org.w3c.dom.NodeList;
import org.eclipse.osgi.util.NLS;
import com.ibm.team.filesystem.common.internal.Messages;
import com.ibm.team.scm.common.internal.process.AdvisorDetailConstants;
import java.util.Iterator;
import com.ibm.team.repository.common.TeamRepositoryException;
import org.w3c.dom.Node;
import com.ibm.team.scm.common.internal.process.UnifiedProcessDescriptionUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import org.xml.sax.SAXException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import com.ibm.team.scm.common.internal.util.XMLUtil;
import java.util.ArrayList;
import java.util.List;
import com.ibm.team.repository.common.UUID;
import com.ibm.team.scm.common.internal.process.AdvisorDataMarshaller;

public class DisallowIncomingChangeErrorDescription implements AdvisorDataMarshaller.IScmAdvisorMarshallable
{
    private static final String ATTR_TARGET_NAME = "target-name";
    private static final String ATTR_TARGET_UUID = "target-uuid";
    private static final String ATTR_SOURCE_NAME = "source-name";
    private static final String ATTR_SOURCE_UUID = "source-uuid";
    private static final String ATTR_REPO_UUID = "repository-uuid";
    private static final String TAG_DISALLOWED = "disallowed";
    private static final String TAG_WORKSPACE = "workspace";
    private static final String TAG_COMPONENT = "component";
    private static final String ATTR_VERSION = "version";
    private static final String ATTR_NAME = "name";
    private static final String ATTR_UUID = "uuid";
    public UUID targetRepoId;
    public String sourceName;
    public UUID sourceUuid;
    public List<DisallowedComponent> components;
    public ErrorNature nature;
    
    public DisallowIncomingChangeErrorDescription(final UUID targetRepoId, final String sourceName, final UUID sourceUuid, final ErrorNature nature) {
        this.components = new ArrayList<DisallowedComponent>();
        this.targetRepoId = targetRepoId;
        this.sourceName = sourceName;
        this.sourceUuid = sourceUuid;
        this.nature = nature;
    }
    
    public DisallowIncomingChangeErrorDescription() {
        this.components = new ArrayList<DisallowedComponent>();
    }
    
    public static DisallowIncomingChangeErrorDescription deserialize(final String s) throws ParseException {
        Element root;
        try {
            final DocumentBuilderFactory factory = XMLUtil.getSecureDocumentBuilderFactory();
            final Document doc = factory.newDocumentBuilder().parse(new ByteArrayInputStream(s.getBytes()));
            root = doc.getDocumentElement();
        }
        catch (SAXException e) {
            throw new ParseException(e);
        }
        catch (IOException e2) {
            throw new ParseException(e2);
        }
        catch (ParserConfigurationException e3) {
            throw new ParseException(e3);
        }
        if (!"disallowed".equals(root.getTagName())) {
            throw new IllegalArgumentException();
        }
        return loadVersion1(root);
    }
    
    public String serialize() throws TeamRepositoryException {
        final Document doc = UnifiedProcessDescriptionUtil.createXmlDoc();
        final Element disallowedTag = doc.createElement("disallowed");
        doc.appendChild(disallowedTag);
        disallowedTag.setAttribute("version", "1");
        final Element wsTag = doc.createElement("workspace");
        wsTag.setAttribute("repository-uuid", this.targetRepoId.getUuidValue());
        wsTag.setAttribute("source-uuid", this.sourceUuid.getUuidValue());
        wsTag.setAttribute("source-name", this.sourceName);
        disallowedTag.appendChild(wsTag);
        for (final DisallowedComponent comp : this.components) {
            final Element compTag = doc.createElement("component");
            compTag.setAttribute("uuid", comp.uuid.getUuidValue());
            compTag.setAttribute("name", comp.name);
            compTag.setAttribute("target-uuid", comp.targetUuid.getUuidValue());
            compTag.setAttribute("target-name", comp.targetName);
            wsTag.appendChild(compTag);
        }
        final Element unifiedRoot = doc.createElement("unified");
        disallowedTag.appendChild(unifiedRoot);
        try {
            AdvisorDataMarshaller.marshallInto((AdvisorDataMarshaller.IScmAdvisorMarshallable)new AdvisorDataMarshaller.AdvisorData(this.toAml(), (AdvisorDataMarshaller.IScmAdvisorMarshallable)this), doc, unifiedRoot, this.targetRepoId);
        }
        catch (AdvisorDataMarshaller.MarshallerException e) {
            throw new TeamRepositoryException((Throwable)e);
        }
        return UnifiedProcessDescriptionUtil.serializeDoc(doc);
    }
    
    private String toAml() throws TeamRepositoryException {
        final Document doc = UnifiedProcessDescriptionUtil.createXmlDoc();
        final Element desc = AdvisorDetailConstants.makeDescAndAppend(doc);
        final Element probPara = AdvisorDetailConstants.makeParaAndAppend(doc, desc);
        String paraTextSingular;
        String paraTextPlural;
        if (this.nature == null || this.nature == ErrorNature.INCOMING_CHANGE_SETS) {
            paraTextSingular = Messages.getString("DisallowIncomingChangeErrorDescription.SINGULAR_INCOMING_CHANGES");
            paraTextPlural = Messages.getString("DisallowIncomingChangeErrorDescription.PLURAL_INCOMING_CHANGES");
        }
        else {
            paraTextSingular = Messages.getString("DisallowIncomingChangeErrorDescription.SINGULAR_INCOMING_COMPONENT");
            paraTextPlural = Messages.getString("DisallowIncomingChangeErrorDescription.PLURAL_INCOMING_COMPONENT");
        }
        if (this.components == null || this.components.isEmpty()) {
            probPara.setTextContent("Missing components");
        }
        else {
            final Element wsLink = AdvisorDetailConstants.makeWorkspaceLink(doc, NLS.bind(Messages.getString("DisallowIncomingChangeErrorDescription.WORKSPACE_LINK_TEXT"), (Object)this.sourceName), this.targetRepoId, this.sourceUuid, this.sourceName);
            if (this.components.size() == 1) {
                final DisallowedComponent dc = this.components.get(0);
                final Element compLink = AdvisorDetailConstants.makeComponentLink(doc, NLS.bind(Messages.getString("DisallowIncomingChangeErrorDescription.COMPONENT_LINK_TEXT"), (Object)dc.name), this.targetRepoId, dc.uuid, dc.name, this.sourceUuid, "workspace");
                UnifiedProcessDescriptionUtil.xmlBind(doc, probPara, paraTextSingular, new Object[] { wsLink, compLink });
            }
            else {
                UnifiedProcessDescriptionUtil.xmlBind(doc, probPara, paraTextPlural, new Object[] { wsLink });
                final Element list = AdvisorDetailConstants.makeList(doc, AdvisorDetailConstants.ListType.BULLETS);
                desc.appendChild(list);
                for (final DisallowedComponent dc2 : this.components) {
                    final Element li = doc.createElement("item");
                    final Element compLink2 = AdvisorDetailConstants.makeComponentLink(doc, dc2.name, this.targetRepoId, dc2.uuid, dc2.name, this.sourceUuid, "workspace");
                    li.appendChild(compLink2);
                    list.appendChild(li);
                }
            }
        }
        return UnifiedProcessDescriptionUtil.serializeDoc(doc);
    }
    
    private static ArrayList<Element> findElements(final NodeList nodes) {
        final ArrayList<Element> toReturn = new ArrayList<Element>(nodes.getLength());
        for (int i = 0; i < nodes.getLength(); ++i) {
            final Node n = nodes.item(i);
            if (n instanceof Element) {
                toReturn.add((Element)n);
            }
        }
        return toReturn;
    }
    
    private static DisallowIncomingChangeErrorDescription loadVersion1(final Element root) throws ParseException {
        DisallowIncomingChangeErrorDescription toReturn = null;
        for (final Element wsEl : findElements(root.getChildNodes())) {
            if ("workspace".equals(wsEl.getTagName())) {
                if (toReturn != null) {
                    throw new ParseException("Only one workspace allowed");
                }
                toReturn = new DisallowIncomingChangeErrorDescription(UUID.valueOf(wsEl.getAttribute("repository-uuid")), wsEl.getAttribute("source-name"), UUID.valueOf(wsEl.getAttribute("source-uuid")), null);
                for (final Element compEl : findElements(wsEl.getChildNodes())) {
                    if ("component".equals(compEl.getTagName())) {
                        toReturn.components.add(new DisallowedComponent(compEl.getAttribute("name"), UUID.valueOf(compEl.getAttribute("uuid")), compEl.getAttribute("target-name"), UUID.valueOf(compEl.getAttribute("target-uuid"))));
                    }
                }
            }
        }
        return toReturn;
    }
    
    public enum ErrorNature implements AdvisorDataMarshaller.IScmAdvisorMarshallable
    {
        INCOMING_CHANGE_SETS("INCOMING_CHANGE_SETS", 0), 
        MISSING_COMPONENT("MISSING_COMPONENT", 1);
        
        private ErrorNature(final String name, final int ordinal) {
        }
    }
    
    public static class DisallowedComponent implements AdvisorDataMarshaller.IScmAdvisorMarshallable
    {
        public final String name;
        public final UUID uuid;
        public final String targetName;
        public final UUID targetUuid;
        
        public DisallowedComponent(final String name, final UUID uuid, final String targetName, final UUID targetUuid) {
            this.name = name;
            this.uuid = uuid;
            this.targetName = targetName;
            this.targetUuid = targetUuid;
        }
    }
    
    public static class ParseException extends Exception
    {
        public ParseException(final Exception e) {
            super(e);
        }
        
        public ParseException(final String error) {
            super(error);
        }
    }
}
