// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core.impl;

import java.io.IOException;
import java.util.Comparator;
import java.util.TreeMap;
import java.io.Writer;
import java.util.Iterator;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeServiceDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeMethodDTO;
import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeRepoDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeRootDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class MetronomeRootDTOImpl extends EObjectImpl implements MetronomeRootDTO
{
    protected int ALL_FLAGS;
    protected EList repos;
    private static final String NL;
    
    static {
        NL = System.getProperty("line.separator");
    }
    
    protected MetronomeRootDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return DebugRestClientDTOPackage.Literals.METRONOME_ROOT_DTO;
    }
    
    public List getRepos() {
        if (this.repos == null) {
            this.repos = (EList)new EObjectResolvingEList.Unsettable((Class)MetronomeRepoDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.repos;
    }
    
    public void unsetRepos() {
        if (this.repos != null) {
            ((InternalEList.Unsettable)this.repos).unset();
        }
    }
    
    public boolean isSetRepos() {
        return this.repos != null && ((InternalEList.Unsettable)this.repos).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getRepos();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getRepos().clear();
                this.getRepos().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetRepos();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetRepos();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public MetronomeMethodDTO getMethod(final String uri, final String methodPath) {
        final int lastDot = methodPath.lastIndexOf(46);
        if (lastDot < 0) {
            throw new IllegalArgumentException();
        }
        final String type = methodPath.substring(0, lastDot);
        final MetronomeServiceDTO service = this.getService(uri, type);
        if (service == null) {
            return null;
        }
        final String called = methodPath.substring(lastDot + 1, methodPath.length());
        for (final MetronomeMethodDTO candidate : service.getMethods()) {
            if (called.equals(candidate.getName())) {
                return candidate;
            }
        }
        return null;
    }
    
    public MetronomeServiceDTO getService(final String uri, final String typePath) {
        MetronomeRepoDTO repo = null;
        for (final MetronomeRepoDTO candidate : this.getRepos()) {
            if (uri.equals(candidate.getUri())) {
                repo = candidate;
                break;
            }
        }
        if (repo == null) {
            return null;
        }
        for (final MetronomeServiceDTO candidate2 : repo.getServices()) {
            if (typePath.equals(candidate2.getName())) {
                return candidate2;
            }
        }
        return null;
    }
    
    public long getMethodCallCount(final String uri, final String path) {
        final MetronomeMethodDTO method = this.getMethod(uri, path);
        if (method == null) {
            return 0L;
        }
        return method.getCallCount();
    }
    
    public long getMethodTime(final String uri, final String path) {
        final MetronomeMethodDTO method = this.getMethod(uri, path);
        if (method == null) {
            return 0L;
        }
        return method.getElapsedTime();
    }
    
    public long getServiceCallCount(final String uri, final String path) {
        final MetronomeServiceDTO service = this.getService(uri, path);
        if (service == null) {
            return 0L;
        }
        return service.getCallCount();
    }
    
    public long getServiceTime(final String uri, final String path) {
        final MetronomeServiceDTO service = this.getService(uri, path);
        if (service == null) {
            return 0L;
        }
        return service.getElapsedTime();
    }
    
    public void tabulate(final Writer onto) throws IOException {
        final TreeMap<String, MetronomeRepoDTO> repos = new TreeMap<String, MetronomeRepoDTO>(String.CASE_INSENSITIVE_ORDER);
        for (final MetronomeRepoDTO repo : this.getRepos()) {
            final String name = String.valueOf(repo.getUri()) + repo.getRepoId();
            repos.put(name, repo);
        }
        for (final MetronomeRepoDTO repo : repos.values()) {
            onto.write(repo.getUri());
            onto.write(" (");
            onto.write(repo.getRepoId());
            onto.write(")");
            onto.write(MetronomeRootDTOImpl.NL);
            final TreeMap<String, MetronomeServiceDTO> svcs = new TreeMap<String, MetronomeServiceDTO>();
            for (final MetronomeServiceDTO svc : repo.getServices()) {
                svcs.put(svc.getName(), svc);
            }
            for (final MetronomeServiceDTO svc : svcs.values()) {
                onto.write(" ");
                onto.write(svc.getName());
                onto.write(" ");
                onto.write(Long.toString(svc.getCallCount()));
                onto.write(", ");
                onto.write(Long.toString(svc.getElapsedTime()));
                onto.write("ms");
                onto.write(MetronomeRootDTOImpl.NL);
                final TreeMap<String, MetronomeMethodDTO> methods = new TreeMap<String, MetronomeMethodDTO>();
                for (final MetronomeMethodDTO m : svc.getMethods()) {
                    methods.put(m.getName(), m);
                }
                for (final MetronomeMethodDTO m : methods.values()) {
                    onto.write("  ");
                    onto.write(m.getName());
                    onto.write(" ");
                    onto.write(Long.toString(m.getCallCount()));
                    onto.write(", ");
                    onto.write(Long.toString(m.getElapsedTime()));
                    onto.write("ms");
                    onto.write(MetronomeRootDTOImpl.NL);
                }
            }
        }
    }
}
