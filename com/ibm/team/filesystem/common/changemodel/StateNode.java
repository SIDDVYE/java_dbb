// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.changemodel;

import com.ibm.team.scm.common.internal.util.NewCollection;
import java.util.List;

public final class StateNode
{
    private FileState theState;
    private List<FileChange> activeIncoming;
    private List<FileChange> incoming;
    private List<FileChange> outgoing;
    
    public StateNode(final FileState theState) {
        this.activeIncoming = (List<FileChange>)NewCollection.arrayList();
        this.incoming = (List<FileChange>)NewCollection.arrayList();
        this.outgoing = (List<FileChange>)NewCollection.arrayList();
        this.theState = theState;
    }
    
    public List<FileChange> getActiveIncoming() {
        return this.activeIncoming;
    }
    
    public void addOutgoing(final FileChange toAdd) {
        this.outgoing.add(toAdd);
    }
    
    public void addMerge(final FileChange toAdd) {
        this.incoming.add(toAdd);
    }
    
    public void addActiveIncoming(final FileChange toAdd) {
        this.activeIncoming.add(toAdd);
    }
    
    public List<FileChange> getOutgoing() {
        return this.outgoing;
    }
    
    public List<FileChange> getMerges() {
        return this.incoming;
    }
    
    public FileState getState() {
        return this.theState;
    }
}
