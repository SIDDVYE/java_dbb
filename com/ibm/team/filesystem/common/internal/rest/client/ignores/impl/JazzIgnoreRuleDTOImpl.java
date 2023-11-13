// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.FilesystemRestClientDTOignoresPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.JazzIgnoreRuleDTO;

public class JazzIgnoreRuleDTOImpl extends IgnoreRuleDTOImpl implements JazzIgnoreRuleDTO
{
    protected static final String PATTERN_EDEFAULT;
    protected String pattern;
    protected static final int PATTERN_ESETFLAG = 2;
    protected static final String SCOPE_EDEFAULT;
    protected String scope;
    protected static final int SCOPE_ESETFLAG = 4;
    protected PathDTO path;
    protected static final int PATH_ESETFLAG = 8;
    
    static {
        PATTERN_EDEFAULT = null;
        SCOPE_EDEFAULT = null;
    }
    
    protected JazzIgnoreRuleDTOImpl() {
        this.pattern = JazzIgnoreRuleDTOImpl.PATTERN_EDEFAULT;
        this.scope = JazzIgnoreRuleDTOImpl.SCOPE_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOignoresPackage.Literals.JAZZ_IGNORE_RULE_DTO;
    }
    
    @Override
    public String getPattern() {
        return this.pattern;
    }
    
    @Override
    public void setPattern(final String newPattern) {
        final String oldPattern = this.pattern;
        this.pattern = newPattern;
        final boolean oldPatternESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldPattern, (Object)this.pattern, !oldPatternESet));
        }
    }
    
    @Override
    public void unsetPattern() {
        final String oldPattern = this.pattern;
        final boolean oldPatternESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.pattern = JazzIgnoreRuleDTOImpl.PATTERN_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldPattern, (Object)JazzIgnoreRuleDTOImpl.PATTERN_EDEFAULT, oldPatternESet));
        }
    }
    
    @Override
    public boolean isSetPattern() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    @Override
    public String getScope() {
        return this.scope;
    }
    
    @Override
    public void setScope(final String newScope) {
        final String oldScope = this.scope;
        this.scope = newScope;
        final boolean oldScopeESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldScope, (Object)this.scope, !oldScopeESet));
        }
    }
    
    @Override
    public void unsetScope() {
        final String oldScope = this.scope;
        final boolean oldScopeESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.scope = JazzIgnoreRuleDTOImpl.SCOPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldScope, (Object)JazzIgnoreRuleDTOImpl.SCOPE_EDEFAULT, oldScopeESet));
        }
    }
    
    @Override
    public boolean isSetScope() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    @Override
    public PathDTO getPath() {
        return this.path;
    }
    
    public NotificationChain basicSetPath(final PathDTO newPath, NotificationChain msgs) {
        final PathDTO oldPath = this.path;
        this.path = newPath;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldPath, (Object)newPath, !oldPathESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    @Override
    public void setPath(final PathDTO newPath) {
        if (newPath != this.path) {
            NotificationChain msgs = null;
            if (this.path != null) {
                msgs = ((InternalEObject)this.path).eInverseRemove((InternalEObject)this, -4, (Class)null, msgs);
            }
            if (newPath != null) {
                msgs = ((InternalEObject)newPath).eInverseAdd((InternalEObject)this, -4, (Class)null, msgs);
            }
            msgs = this.basicSetPath(newPath, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPathESet = (this.ALL_FLAGS & 0x8) != 0x0;
            this.ALL_FLAGS |= 0x8;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)newPath, (Object)newPath, !oldPathESet));
            }
        }
    }
    
    public NotificationChain basicUnsetPath(NotificationChain msgs) {
        final PathDTO oldPath = this.path;
        this.path = null;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldPath, (Object)null, oldPathESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    @Override
    public void unsetPath() {
        if (this.path != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.path).eInverseRemove((InternalEObject)this, -4, (Class)null, msgs);
            msgs = this.basicUnsetPath(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPathESet = (this.ALL_FLAGS & 0x8) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFF7;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)null, (Object)null, oldPathESet));
            }
        }
    }
    
    @Override
    public boolean isSetPath() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 3: {
                return this.basicUnsetPath(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 1: {
                return this.getPattern();
            }
            case 2: {
                return this.getScope();
            }
            case 3: {
                return this.getPath();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 1: {
                this.setPattern((String)newValue);
            }
            case 2: {
                this.setScope((String)newValue);
            }
            case 3: {
                this.setPath((PathDTO)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 1: {
                this.unsetPattern();
            }
            case 2: {
                this.unsetScope();
            }
            case 3: {
                this.unsetPath();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 1: {
                return this.isSetPattern();
            }
            case 2: {
                return this.isSetScope();
            }
            case 3: {
                return this.isSetPath();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (pattern: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.pattern);
        }
        else {
            result.append("<unset>");
        }
        result.append(", scope: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.scope);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
