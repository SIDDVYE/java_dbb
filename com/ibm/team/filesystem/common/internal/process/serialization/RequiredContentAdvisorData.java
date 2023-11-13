// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.process.serialization;

import com.ibm.team.filesystem.common.IFileItemHandle;
import com.ibm.team.repository.common.TeamRepositoryException;
import java.util.Iterator;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import com.ibm.team.scm.common.IWorkspaceHandle;
import com.ibm.team.scm.common.IBaselineHandle;
import org.w3c.dom.Node;
import com.ibm.team.filesystem.common.internal.Messages;
import com.ibm.team.scm.common.internal.process.UnifiedProcessDescriptionUtil;
import java.util.List;
import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.scm.common.IContextHandle;
import com.ibm.team.repository.common.UUID;
import com.ibm.team.scm.common.internal.process.AdvisorDataMarshaller;

public class RequiredContentAdvisorData implements AdvisorDataMarshaller.IScmAdvisorMarshallable
{
    public String insertText;
    public String requiredText;
    public UUID repoRoot;
    public IContextHandle ctx;
    public IComponentHandle comp;
    public List<RequiredContentAdvisorDataFile> files;
    public transient List iFiles;
    
    public String toAML() throws TeamRepositoryException {
        final Document doc = UnifiedProcessDescriptionUtil.createXmlDoc();
        final Element root = doc.createElement("description");
        final Element message = doc.createElement("paragraph");
        if (this.files.size() > 1) {
            message.setTextContent(Messages.getString("RequiredContentAdvisor.MISSING_CONTENT_PLURAL"));
        }
        else {
            message.setTextContent(Messages.getString("RequiredContentAdvisor.MISSING_CONTENT_SINGULAR"));
        }
        root.appendChild(message);
        final Element list = doc.createElement("list");
        list.setAttribute("type", "bullets");
        for (final RequiredContentAdvisorDataFile badFile : this.files) {
            final Element badness = doc.createElement("versionable-link");
            badness.setTextContent(badFile.name);
            badness.setAttribute("repository", this.repoRoot.getUuidValue());
            badness.setAttribute("uuid", badFile.handle.getItemId().getUuidValue());
            badness.setAttribute("state", badFile.handle.getStateId().getUuidValue());
            badness.setAttribute("type", "file");
            if (this.ctx != null) {
                if (this.ctx instanceof IBaselineHandle) {
                    badness.setAttribute("context-type", "baseline");
                }
                else if (this.ctx instanceof IWorkspaceHandle) {
                    badness.setAttribute("context-type", "workspace");
                }
                badness.setAttribute("context-uuid", this.ctx.getItemId().getUuidValue());
            }
            badness.setAttribute("component-uuid", this.comp.getItemId().getUuidValue());
            final Element li = doc.createElement("item");
            li.appendChild(badness);
            list.appendChild(li);
        }
        root.appendChild(list);
        doc.appendChild(root);
        return UnifiedProcessDescriptionUtil.serializeDoc(doc);
    }
    
    public static class RequiredContentAdvisorDataFile implements AdvisorDataMarshaller.IScmAdvisorMarshallable
    {
        public String name;
        public IFileItemHandle handle;
        
        public RequiredContentAdvisorDataFile() {
        }
        
        public RequiredContentAdvisorDataFile(final String name, final IFileItemHandle item) {
            this.name = name;
            this.handle = item;
        }
    }
}
