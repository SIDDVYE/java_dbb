// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.EncodingErrorDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class EncodingErrorDTOImpl extends EObjectImpl implements EncodingErrorDTO
{
    protected int ALL_FLAGS;
    protected ShareableDTO shareable;
    protected static final int SHAREABLE_ESETFLAG = 1;
    protected static final boolean MALFORMED_CONTENT_EDEFAULT = false;
    protected static final int MALFORMED_CONTENT_EFLAG = 2;
    protected static final int MALFORMED_CONTENT_ESETFLAG = 4;
    protected static final boolean UNKNOWN_ENCODING_EDEFAULT = false;
    protected static final int UNKNOWN_ENCODING_EFLAG = 8;
    protected static final int UNKNOWN_ENCODING_ESETFLAG = 16;
    protected static final String ENCODING_EDEFAULT;
    protected String encoding;
    protected static final int ENCODING_ESETFLAG = 32;
    protected static final String PREDECESSOR_ENCODING_EDEFAULT;
    protected String predecessorEncoding;
    protected static final int PREDECESSOR_ENCODING_ESETFLAG = 64;
    protected static final boolean ATOMIC_COMMIT_EDEFAULT = false;
    protected static final int ATOMIC_COMMIT_EFLAG = 128;
    protected static final int ATOMIC_COMMIT_ESETFLAG = 256;
    protected static final boolean DIRECTION_PROVIDED_EDEFAULT = false;
    protected static final int DIRECTION_PROVIDED_EFLAG = 512;
    protected static final int DIRECTION_PROVIDED_ESETFLAG = 1024;
    
    static {
        ENCODING_EDEFAULT = null;
        PREDECESSOR_ENCODING_EDEFAULT = null;
    }
    
    protected EncodingErrorDTOImpl() {
        this.ALL_FLAGS = 0;
        this.encoding = EncodingErrorDTOImpl.ENCODING_EDEFAULT;
        this.predecessorEncoding = EncodingErrorDTOImpl.PREDECESSOR_ENCODING_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.ENCODING_ERROR_DTO;
    }
    
    public ShareableDTO getShareable() {
        return this.shareable;
    }
    
    public NotificationChain basicSetShareable(final ShareableDTO newShareable, NotificationChain msgs) {
        final ShareableDTO oldShareable = this.shareable;
        this.shareable = newShareable;
        final boolean oldShareableESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldShareable, (Object)newShareable, !oldShareableESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setShareable(final ShareableDTO newShareable) {
        if (newShareable != this.shareable) {
            NotificationChain msgs = null;
            if (this.shareable != null) {
                msgs = ((InternalEObject)this.shareable).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            }
            if (newShareable != null) {
                msgs = ((InternalEObject)newShareable).eInverseAdd((InternalEObject)this, -1, (Class)null, msgs);
            }
            msgs = this.basicSetShareable(newShareable, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldShareableESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)newShareable, (Object)newShareable, !oldShareableESet));
            }
        }
    }
    
    public NotificationChain basicUnsetShareable(NotificationChain msgs) {
        final ShareableDTO oldShareable = this.shareable;
        this.shareable = null;
        final boolean oldShareableESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldShareable, (Object)null, oldShareableESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetShareable() {
        if (this.shareable != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.shareable).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            msgs = this.basicUnsetShareable(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldShareableESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)null, (Object)null, oldShareableESet));
            }
        }
    }
    
    public boolean isSetShareable() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public boolean isMalformedContent() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public void setMalformedContent(final boolean newMalformedContent) {
        final boolean oldMalformedContent = (this.ALL_FLAGS & 0x2) != 0x0;
        if (newMalformedContent) {
            this.ALL_FLAGS |= 0x2;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFD;
        }
        final boolean oldMalformedContentESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldMalformedContent, newMalformedContent, !oldMalformedContentESet));
        }
    }
    
    public void unsetMalformedContent() {
        final boolean oldMalformedContent = (this.ALL_FLAGS & 0x2) != 0x0;
        final boolean oldMalformedContentESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldMalformedContent, false, oldMalformedContentESet));
        }
    }
    
    public boolean isSetMalformedContent() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public boolean isUnknownEncoding() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public void setUnknownEncoding(final boolean newUnknownEncoding) {
        final boolean oldUnknownEncoding = (this.ALL_FLAGS & 0x8) != 0x0;
        if (newUnknownEncoding) {
            this.ALL_FLAGS |= 0x8;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFF7;
        }
        final boolean oldUnknownEncodingESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldUnknownEncoding, newUnknownEncoding, !oldUnknownEncodingESet));
        }
    }
    
    public void unsetUnknownEncoding() {
        final boolean oldUnknownEncoding = (this.ALL_FLAGS & 0x8) != 0x0;
        final boolean oldUnknownEncodingESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldUnknownEncoding, false, oldUnknownEncodingESet));
        }
    }
    
    public boolean isSetUnknownEncoding() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public String getEncoding() {
        return this.encoding;
    }
    
    public void setEncoding(final String newEncoding) {
        final String oldEncoding = this.encoding;
        this.encoding = newEncoding;
        final boolean oldEncodingESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldEncoding, (Object)this.encoding, !oldEncodingESet));
        }
    }
    
    public void unsetEncoding() {
        final String oldEncoding = this.encoding;
        final boolean oldEncodingESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.encoding = EncodingErrorDTOImpl.ENCODING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldEncoding, (Object)EncodingErrorDTOImpl.ENCODING_EDEFAULT, oldEncodingESet));
        }
    }
    
    public boolean isSetEncoding() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getPredecessorEncoding() {
        return this.predecessorEncoding;
    }
    
    public void setPredecessorEncoding(final String newPredecessorEncoding) {
        final String oldPredecessorEncoding = this.predecessorEncoding;
        this.predecessorEncoding = newPredecessorEncoding;
        final boolean oldPredecessorEncodingESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldPredecessorEncoding, (Object)this.predecessorEncoding, !oldPredecessorEncodingESet));
        }
    }
    
    public void unsetPredecessorEncoding() {
        final String oldPredecessorEncoding = this.predecessorEncoding;
        final boolean oldPredecessorEncodingESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.predecessorEncoding = EncodingErrorDTOImpl.PREDECESSOR_ENCODING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldPredecessorEncoding, (Object)EncodingErrorDTOImpl.PREDECESSOR_ENCODING_EDEFAULT, oldPredecessorEncodingESet));
        }
    }
    
    public boolean isSetPredecessorEncoding() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public boolean isAtomicCommit() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public void setAtomicCommit(final boolean newAtomicCommit) {
        final boolean oldAtomicCommit = (this.ALL_FLAGS & 0x80) != 0x0;
        if (newAtomicCommit) {
            this.ALL_FLAGS |= 0x80;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFF7F;
        }
        final boolean oldAtomicCommitESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldAtomicCommit, newAtomicCommit, !oldAtomicCommitESet));
        }
    }
    
    public void unsetAtomicCommit() {
        final boolean oldAtomicCommit = (this.ALL_FLAGS & 0x80) != 0x0;
        final boolean oldAtomicCommitESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldAtomicCommit, false, oldAtomicCommitESet));
        }
    }
    
    public boolean isSetAtomicCommit() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public boolean isDirectionProvided() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public void setDirectionProvided(final boolean newDirectionProvided) {
        final boolean oldDirectionProvided = (this.ALL_FLAGS & 0x200) != 0x0;
        if (newDirectionProvided) {
            this.ALL_FLAGS |= 0x200;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFDFF;
        }
        final boolean oldDirectionProvidedESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, oldDirectionProvided, newDirectionProvided, !oldDirectionProvidedESet));
        }
    }
    
    public void unsetDirectionProvided() {
        final boolean oldDirectionProvided = (this.ALL_FLAGS & 0x200) != 0x0;
        final boolean oldDirectionProvidedESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, oldDirectionProvided, false, oldDirectionProvidedESet));
        }
    }
    
    public boolean isSetDirectionProvided() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetShareable(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getShareable();
            }
            case 1: {
                return this.isMalformedContent() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 2: {
                return this.isUnknownEncoding() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 3: {
                return this.getEncoding();
            }
            case 4: {
                return this.getPredecessorEncoding();
            }
            case 5: {
                return this.isAtomicCommit() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 6: {
                return this.isDirectionProvided() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setShareable((ShareableDTO)newValue);
            }
            case 1: {
                this.setMalformedContent((boolean)newValue);
            }
            case 2: {
                this.setUnknownEncoding((boolean)newValue);
            }
            case 3: {
                this.setEncoding((String)newValue);
            }
            case 4: {
                this.setPredecessorEncoding((String)newValue);
            }
            case 5: {
                this.setAtomicCommit((boolean)newValue);
            }
            case 6: {
                this.setDirectionProvided((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetShareable();
            }
            case 1: {
                this.unsetMalformedContent();
            }
            case 2: {
                this.unsetUnknownEncoding();
            }
            case 3: {
                this.unsetEncoding();
            }
            case 4: {
                this.unsetPredecessorEncoding();
            }
            case 5: {
                this.unsetAtomicCommit();
            }
            case 6: {
                this.unsetDirectionProvided();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetShareable();
            }
            case 1: {
                return this.isSetMalformedContent();
            }
            case 2: {
                return this.isSetUnknownEncoding();
            }
            case 3: {
                return this.isSetEncoding();
            }
            case 4: {
                return this.isSetPredecessorEncoding();
            }
            case 5: {
                return this.isSetAtomicCommit();
            }
            case 6: {
                return this.isSetDirectionProvided();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (malformedContent: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append((this.ALL_FLAGS & 0x2) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", unknownEncoding: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append((this.ALL_FLAGS & 0x8) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", encoding: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.encoding);
        }
        else {
            result.append("<unset>");
        }
        result.append(", predecessorEncoding: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.predecessorEncoding);
        }
        else {
            result.append("<unset>");
        }
        result.append(", atomicCommit: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append((this.ALL_FLAGS & 0x80) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", directionProvided: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append((this.ALL_FLAGS & 0x200) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
