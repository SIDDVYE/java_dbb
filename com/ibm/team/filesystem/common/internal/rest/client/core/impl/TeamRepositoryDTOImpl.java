// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.TeamRepositoryDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class TeamRepositoryDTOImpl extends EObjectImpl implements TeamRepositoryDTO
{
    protected int ALL_FLAGS;
    protected static final int CONNECTION_TIMEOUT_EDEFAULT = 0;
    protected int connectionTimeout;
    protected static final int CONNECTION_TIMEOUT_ESETFLAG = 1;
    protected static final boolean ERROR_STATE_AUTH_EDEFAULT = false;
    protected static final int ERROR_STATE_AUTH_EFLAG = 2;
    protected static final int ERROR_STATE_AUTH_ESETFLAG = 4;
    protected static final boolean ERROR_STATE_IO_EDEFAULT = false;
    protected static final int ERROR_STATE_IO_EFLAG = 8;
    protected static final int ERROR_STATE_IO_ESETFLAG = 16;
    protected static final boolean ERROR_STATE_NONE_EDEFAULT = false;
    protected static final int ERROR_STATE_NONE_EFLAG = 32;
    protected static final int ERROR_STATE_NONE_ESETFLAG = 64;
    protected static final String LAST_ERROR_EDEFAULT;
    protected String lastError;
    protected static final int LAST_ERROR_ESETFLAG = 128;
    protected static final String NAME_EDEFAULT;
    protected String name;
    protected static final int NAME_ESETFLAG = 256;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 512;
    protected static final String REPOSITORY_ITEM_ID_ID_EDEFAULT;
    protected String repositoryItemIdId;
    protected static final int REPOSITORY_ITEM_ID_ID_ESETFLAG = 1024;
    protected static final String REPOSITORY_URI_EDEFAULT;
    protected String repositoryURI;
    protected static final int REPOSITORY_URI_ESETFLAG = 2048;
    protected static final boolean STATE_LOGGED_IN_EDEFAULT = false;
    protected static final int STATE_LOGGED_IN_EFLAG = 4096;
    protected static final int STATE_LOGGED_IN_ESETFLAG = 8192;
    protected static final boolean STATE_LOGGING_IN_EDEFAULT = false;
    protected static final int STATE_LOGGING_IN_EFLAG = 16384;
    protected static final int STATE_LOGGING_IN_ESETFLAG = 32768;
    protected static final boolean STATE_LOGGED_OUT_EDEFAULT = false;
    protected static final int STATE_LOGGED_OUT_EFLAG = 65536;
    protected static final int STATE_LOGGED_OUT_ESETFLAG = 131072;
    protected static final boolean STATE_LOGGING_OUT_EDEFAULT = false;
    protected static final int STATE_LOGGING_OUT_EFLAG = 262144;
    protected static final int STATE_LOGGING_OUT_ESETFLAG = 524288;
    protected static final String USER_ID_EDEFAULT;
    protected String userId;
    protected static final int USER_ID_ESETFLAG = 1048576;
    protected static final String CONTRIBUTOR_ITEM_ID_LOGGED_IN_CONTRIBUTOR_EDEFAULT;
    protected String contributorItemIdLoggedInContributor;
    protected static final int CONTRIBUTOR_ITEM_ID_LOGGED_IN_CONTRIBUTOR_ESETFLAG = 2097152;
    
    static {
        LAST_ERROR_EDEFAULT = null;
        NAME_EDEFAULT = null;
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_ITEM_ID_ID_EDEFAULT = null;
        REPOSITORY_URI_EDEFAULT = null;
        USER_ID_EDEFAULT = null;
        CONTRIBUTOR_ITEM_ID_LOGGED_IN_CONTRIBUTOR_EDEFAULT = null;
    }
    
    protected TeamRepositoryDTOImpl() {
        this.ALL_FLAGS = 0;
        this.connectionTimeout = 0;
        this.lastError = TeamRepositoryDTOImpl.LAST_ERROR_EDEFAULT;
        this.name = TeamRepositoryDTOImpl.NAME_EDEFAULT;
        this.repositoryId = TeamRepositoryDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryItemIdId = TeamRepositoryDTOImpl.REPOSITORY_ITEM_ID_ID_EDEFAULT;
        this.repositoryURI = TeamRepositoryDTOImpl.REPOSITORY_URI_EDEFAULT;
        this.userId = TeamRepositoryDTOImpl.USER_ID_EDEFAULT;
        this.contributorItemIdLoggedInContributor = TeamRepositoryDTOImpl.CONTRIBUTOR_ITEM_ID_LOGGED_IN_CONTRIBUTOR_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.TEAM_REPOSITORY_DTO;
    }
    
    public String getRepositoryURI() {
        return this.repositoryURI;
    }
    
    public void setRepositoryURI(final String newRepositoryURI) {
        final String oldRepositoryURI = this.repositoryURI;
        this.repositoryURI = newRepositoryURI;
        final boolean oldRepositoryURIESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS |= 0x800;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldRepositoryURI, (Object)this.repositoryURI, !oldRepositoryURIESet));
        }
    }
    
    public void unsetRepositoryURI() {
        final String oldRepositoryURI = this.repositoryURI;
        final boolean oldRepositoryURIESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.repositoryURI = TeamRepositoryDTOImpl.REPOSITORY_URI_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldRepositoryURI, (Object)TeamRepositoryDTOImpl.REPOSITORY_URI_EDEFAULT, oldRepositoryURIESet));
        }
    }
    
    public boolean isSetRepositoryURI() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    public boolean isStateLoggingIn() {
        return (this.ALL_FLAGS & 0x4000) != 0x0;
    }
    
    public void setStateLoggingIn(final boolean newStateLoggingIn) {
        final boolean oldStateLoggingIn = (this.ALL_FLAGS & 0x4000) != 0x0;
        if (newStateLoggingIn) {
            this.ALL_FLAGS |= 0x4000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFBFFF;
        }
        final boolean oldStateLoggingInESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.ALL_FLAGS |= 0x8000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, oldStateLoggingIn, newStateLoggingIn, !oldStateLoggingInESet));
        }
    }
    
    public void unsetStateLoggingIn() {
        final boolean oldStateLoggingIn = (this.ALL_FLAGS & 0x4000) != 0x0;
        final boolean oldStateLoggingInESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFBFFF;
        this.ALL_FLAGS &= 0xFFFF7FFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, oldStateLoggingIn, false, oldStateLoggingInESet));
        }
    }
    
    public boolean isSetStateLoggingIn() {
        return (this.ALL_FLAGS & 0x8000) != 0x0;
    }
    
    public boolean isStateLoggedIn() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    public void setStateLoggedIn(final boolean newStateLoggedIn) {
        final boolean oldStateLoggedIn = (this.ALL_FLAGS & 0x1000) != 0x0;
        if (newStateLoggedIn) {
            this.ALL_FLAGS |= 0x1000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFEFFF;
        }
        final boolean oldStateLoggedInESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS |= 0x2000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, oldStateLoggedIn, newStateLoggedIn, !oldStateLoggedInESet));
        }
    }
    
    public void unsetStateLoggedIn() {
        final boolean oldStateLoggedIn = (this.ALL_FLAGS & 0x1000) != 0x0;
        final boolean oldStateLoggedInESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, oldStateLoggedIn, false, oldStateLoggedInESet));
        }
    }
    
    public boolean isSetStateLoggedIn() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    public boolean isStateLoggingOut() {
        return (this.ALL_FLAGS & 0x40000) != 0x0;
    }
    
    public void setStateLoggingOut(final boolean newStateLoggingOut) {
        final boolean oldStateLoggingOut = (this.ALL_FLAGS & 0x40000) != 0x0;
        if (newStateLoggingOut) {
            this.ALL_FLAGS |= 0x40000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFBFFFF;
        }
        final boolean oldStateLoggingOutESet = (this.ALL_FLAGS & 0x80000) != 0x0;
        this.ALL_FLAGS |= 0x80000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 12, oldStateLoggingOut, newStateLoggingOut, !oldStateLoggingOutESet));
        }
    }
    
    public void unsetStateLoggingOut() {
        final boolean oldStateLoggingOut = (this.ALL_FLAGS & 0x40000) != 0x0;
        final boolean oldStateLoggingOutESet = (this.ALL_FLAGS & 0x80000) != 0x0;
        this.ALL_FLAGS &= 0xFFFBFFFF;
        this.ALL_FLAGS &= 0xFFF7FFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 12, oldStateLoggingOut, false, oldStateLoggingOutESet));
        }
    }
    
    public boolean isSetStateLoggingOut() {
        return (this.ALL_FLAGS & 0x80000) != 0x0;
    }
    
    public boolean isStateLoggedOut() {
        return (this.ALL_FLAGS & 0x10000) != 0x0;
    }
    
    public void setStateLoggedOut(final boolean newStateLoggedOut) {
        final boolean oldStateLoggedOut = (this.ALL_FLAGS & 0x10000) != 0x0;
        if (newStateLoggedOut) {
            this.ALL_FLAGS |= 0x10000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFEFFFF;
        }
        final boolean oldStateLoggedOutESet = (this.ALL_FLAGS & 0x20000) != 0x0;
        this.ALL_FLAGS |= 0x20000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11, oldStateLoggedOut, newStateLoggedOut, !oldStateLoggedOutESet));
        }
    }
    
    public void unsetStateLoggedOut() {
        final boolean oldStateLoggedOut = (this.ALL_FLAGS & 0x10000) != 0x0;
        final boolean oldStateLoggedOutESet = (this.ALL_FLAGS & 0x20000) != 0x0;
        this.ALL_FLAGS &= 0xFFFEFFFF;
        this.ALL_FLAGS &= 0xFFFDFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11, oldStateLoggedOut, false, oldStateLoggedOutESet));
        }
    }
    
    public boolean isSetStateLoggedOut() {
        return (this.ALL_FLAGS & 0x20000) != 0x0;
    }
    
    public boolean isErrorStateNone() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public void setErrorStateNone(final boolean newErrorStateNone) {
        final boolean oldErrorStateNone = (this.ALL_FLAGS & 0x20) != 0x0;
        if (newErrorStateNone) {
            this.ALL_FLAGS |= 0x20;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFDF;
        }
        final boolean oldErrorStateNoneESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, oldErrorStateNone, newErrorStateNone, !oldErrorStateNoneESet));
        }
    }
    
    public void unsetErrorStateNone() {
        final boolean oldErrorStateNone = (this.ALL_FLAGS & 0x20) != 0x0;
        final boolean oldErrorStateNoneESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, oldErrorStateNone, false, oldErrorStateNoneESet));
        }
    }
    
    public boolean isSetErrorStateNone() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public boolean isErrorStateIO() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public void setErrorStateIO(final boolean newErrorStateIO) {
        final boolean oldErrorStateIO = (this.ALL_FLAGS & 0x8) != 0x0;
        if (newErrorStateIO) {
            this.ALL_FLAGS |= 0x8;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFF7;
        }
        final boolean oldErrorStateIOESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldErrorStateIO, newErrorStateIO, !oldErrorStateIOESet));
        }
    }
    
    public void unsetErrorStateIO() {
        final boolean oldErrorStateIO = (this.ALL_FLAGS & 0x8) != 0x0;
        final boolean oldErrorStateIOESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldErrorStateIO, false, oldErrorStateIOESet));
        }
    }
    
    public boolean isSetErrorStateIO() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public boolean isErrorStateAuth() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public void setErrorStateAuth(final boolean newErrorStateAuth) {
        final boolean oldErrorStateAuth = (this.ALL_FLAGS & 0x2) != 0x0;
        if (newErrorStateAuth) {
            this.ALL_FLAGS |= 0x2;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFD;
        }
        final boolean oldErrorStateAuthESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldErrorStateAuth, newErrorStateAuth, !oldErrorStateAuthESet));
        }
    }
    
    public void unsetErrorStateAuth() {
        final boolean oldErrorStateAuth = (this.ALL_FLAGS & 0x2) != 0x0;
        final boolean oldErrorStateAuthESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldErrorStateAuth, false, oldErrorStateAuthESet));
        }
    }
    
    public boolean isSetErrorStateAuth() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getLastError() {
        return this.lastError;
    }
    
    public void setLastError(final String newLastError) {
        final String oldLastError = this.lastError;
        this.lastError = newLastError;
        final boolean oldLastErrorESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldLastError, (Object)this.lastError, !oldLastErrorESet));
        }
    }
    
    public void unsetLastError() {
        final String oldLastError = this.lastError;
        final boolean oldLastErrorESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.lastError = TeamRepositoryDTOImpl.LAST_ERROR_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldLastError, (Object)TeamRepositoryDTOImpl.LAST_ERROR_EDEFAULT, oldLastErrorESet));
        }
    }
    
    public boolean isSetLastError() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldName, (Object)this.name, !oldNameESet));
        }
    }
    
    public void unsetName() {
        final String oldName = this.name;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.name = TeamRepositoryDTOImpl.NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldName, (Object)TeamRepositoryDTOImpl.NAME_EDEFAULT, oldNameESet));
        }
    }
    
    public boolean isSetName() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.repositoryId = TeamRepositoryDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldRepositoryId, (Object)TeamRepositoryDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public String getRepositoryItemIdId() {
        return this.repositoryItemIdId;
    }
    
    public void setRepositoryItemIdId(final String newRepositoryItemIdId) {
        final String oldRepositoryItemIdId = this.repositoryItemIdId;
        this.repositoryItemIdId = newRepositoryItemIdId;
        final boolean oldRepositoryItemIdIdESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldRepositoryItemIdId, (Object)this.repositoryItemIdId, !oldRepositoryItemIdIdESet));
        }
    }
    
    public void unsetRepositoryItemIdId() {
        final String oldRepositoryItemIdId = this.repositoryItemIdId;
        final boolean oldRepositoryItemIdIdESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.repositoryItemIdId = TeamRepositoryDTOImpl.REPOSITORY_ITEM_ID_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldRepositoryItemIdId, (Object)TeamRepositoryDTOImpl.REPOSITORY_ITEM_ID_ID_EDEFAULT, oldRepositoryItemIdIdESet));
        }
    }
    
    public boolean isSetRepositoryItemIdId() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(final String newUserId) {
        final String oldUserId = this.userId;
        this.userId = newUserId;
        final boolean oldUserIdESet = (this.ALL_FLAGS & 0x100000) != 0x0;
        this.ALL_FLAGS |= 0x100000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 13, (Object)oldUserId, (Object)this.userId, !oldUserIdESet));
        }
    }
    
    public void unsetUserId() {
        final String oldUserId = this.userId;
        final boolean oldUserIdESet = (this.ALL_FLAGS & 0x100000) != 0x0;
        this.userId = TeamRepositoryDTOImpl.USER_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFEFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 13, (Object)oldUserId, (Object)TeamRepositoryDTOImpl.USER_ID_EDEFAULT, oldUserIdESet));
        }
    }
    
    public boolean isSetUserId() {
        return (this.ALL_FLAGS & 0x100000) != 0x0;
    }
    
    public int getConnectionTimeout() {
        return this.connectionTimeout;
    }
    
    public void setConnectionTimeout(final int newConnectionTimeout) {
        final int oldConnectionTimeout = this.connectionTimeout;
        this.connectionTimeout = newConnectionTimeout;
        final boolean oldConnectionTimeoutESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldConnectionTimeout, this.connectionTimeout, !oldConnectionTimeoutESet));
        }
    }
    
    public void unsetConnectionTimeout() {
        final int oldConnectionTimeout = this.connectionTimeout;
        final boolean oldConnectionTimeoutESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.connectionTimeout = 0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldConnectionTimeout, 0, oldConnectionTimeoutESet));
        }
    }
    
    public boolean isSetConnectionTimeout() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getContributorItemIdLoggedInContributor() {
        return this.contributorItemIdLoggedInContributor;
    }
    
    public void setContributorItemIdLoggedInContributor(final String newContributorItemIdLoggedInContributor) {
        final String oldContributorItemIdLoggedInContributor = this.contributorItemIdLoggedInContributor;
        this.contributorItemIdLoggedInContributor = newContributorItemIdLoggedInContributor;
        final boolean oldContributorItemIdLoggedInContributorESet = (this.ALL_FLAGS & 0x200000) != 0x0;
        this.ALL_FLAGS |= 0x200000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 14, (Object)oldContributorItemIdLoggedInContributor, (Object)this.contributorItemIdLoggedInContributor, !oldContributorItemIdLoggedInContributorESet));
        }
    }
    
    public void unsetContributorItemIdLoggedInContributor() {
        final String oldContributorItemIdLoggedInContributor = this.contributorItemIdLoggedInContributor;
        final boolean oldContributorItemIdLoggedInContributorESet = (this.ALL_FLAGS & 0x200000) != 0x0;
        this.contributorItemIdLoggedInContributor = TeamRepositoryDTOImpl.CONTRIBUTOR_ITEM_ID_LOGGED_IN_CONTRIBUTOR_EDEFAULT;
        this.ALL_FLAGS &= 0xFFDFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 14, (Object)oldContributorItemIdLoggedInContributor, (Object)TeamRepositoryDTOImpl.CONTRIBUTOR_ITEM_ID_LOGGED_IN_CONTRIBUTOR_EDEFAULT, oldContributorItemIdLoggedInContributorESet));
        }
    }
    
    public boolean isSetContributorItemIdLoggedInContributor() {
        return (this.ALL_FLAGS & 0x200000) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return new Integer(this.getConnectionTimeout());
            }
            case 1: {
                return this.isErrorStateAuth() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 2: {
                return this.isErrorStateIO() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 3: {
                return this.isErrorStateNone() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 4: {
                return this.getLastError();
            }
            case 5: {
                return this.getName();
            }
            case 6: {
                return this.getRepositoryId();
            }
            case 7: {
                return this.getRepositoryItemIdId();
            }
            case 8: {
                return this.getRepositoryURI();
            }
            case 9: {
                return this.isStateLoggedIn() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 10: {
                return this.isStateLoggingIn() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 11: {
                return this.isStateLoggedOut() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 12: {
                return this.isStateLoggingOut() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 13: {
                return this.getUserId();
            }
            case 14: {
                return this.getContributorItemIdLoggedInContributor();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setConnectionTimeout((int)newValue);
            }
            case 1: {
                this.setErrorStateAuth((boolean)newValue);
            }
            case 2: {
                this.setErrorStateIO((boolean)newValue);
            }
            case 3: {
                this.setErrorStateNone((boolean)newValue);
            }
            case 4: {
                this.setLastError((String)newValue);
            }
            case 5: {
                this.setName((String)newValue);
            }
            case 6: {
                this.setRepositoryId((String)newValue);
            }
            case 7: {
                this.setRepositoryItemIdId((String)newValue);
            }
            case 8: {
                this.setRepositoryURI((String)newValue);
            }
            case 9: {
                this.setStateLoggedIn((boolean)newValue);
            }
            case 10: {
                this.setStateLoggingIn((boolean)newValue);
            }
            case 11: {
                this.setStateLoggedOut((boolean)newValue);
            }
            case 12: {
                this.setStateLoggingOut((boolean)newValue);
            }
            case 13: {
                this.setUserId((String)newValue);
            }
            case 14: {
                this.setContributorItemIdLoggedInContributor((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetConnectionTimeout();
            }
            case 1: {
                this.unsetErrorStateAuth();
            }
            case 2: {
                this.unsetErrorStateIO();
            }
            case 3: {
                this.unsetErrorStateNone();
            }
            case 4: {
                this.unsetLastError();
            }
            case 5: {
                this.unsetName();
            }
            case 6: {
                this.unsetRepositoryId();
            }
            case 7: {
                this.unsetRepositoryItemIdId();
            }
            case 8: {
                this.unsetRepositoryURI();
            }
            case 9: {
                this.unsetStateLoggedIn();
            }
            case 10: {
                this.unsetStateLoggingIn();
            }
            case 11: {
                this.unsetStateLoggedOut();
            }
            case 12: {
                this.unsetStateLoggingOut();
            }
            case 13: {
                this.unsetUserId();
            }
            case 14: {
                this.unsetContributorItemIdLoggedInContributor();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetConnectionTimeout();
            }
            case 1: {
                return this.isSetErrorStateAuth();
            }
            case 2: {
                return this.isSetErrorStateIO();
            }
            case 3: {
                return this.isSetErrorStateNone();
            }
            case 4: {
                return this.isSetLastError();
            }
            case 5: {
                return this.isSetName();
            }
            case 6: {
                return this.isSetRepositoryId();
            }
            case 7: {
                return this.isSetRepositoryItemIdId();
            }
            case 8: {
                return this.isSetRepositoryURI();
            }
            case 9: {
                return this.isSetStateLoggedIn();
            }
            case 10: {
                return this.isSetStateLoggingIn();
            }
            case 11: {
                return this.isSetStateLoggedOut();
            }
            case 12: {
                return this.isSetStateLoggingOut();
            }
            case 13: {
                return this.isSetUserId();
            }
            case 14: {
                return this.isSetContributorItemIdLoggedInContributor();
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
        result.append(" (connectionTimeout: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.connectionTimeout);
        }
        else {
            result.append("<unset>");
        }
        result.append(", errorStateAuth: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append((this.ALL_FLAGS & 0x2) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", errorStateIO: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append((this.ALL_FLAGS & 0x8) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", errorStateNone: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append((this.ALL_FLAGS & 0x20) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", lastError: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.lastError);
        }
        else {
            result.append("<unset>");
        }
        result.append(", name: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.name);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryItemIdId: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append(this.repositoryItemIdId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryURI: ");
        if ((this.ALL_FLAGS & 0x800) != 0x0) {
            result.append(this.repositoryURI);
        }
        else {
            result.append("<unset>");
        }
        result.append(", stateLoggedIn: ");
        if ((this.ALL_FLAGS & 0x2000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", stateLoggingIn: ");
        if ((this.ALL_FLAGS & 0x8000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", stateLoggedOut: ");
        if ((this.ALL_FLAGS & 0x20000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x10000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", stateLoggingOut: ");
        if ((this.ALL_FLAGS & 0x80000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x40000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", userId: ");
        if ((this.ALL_FLAGS & 0x100000) != 0x0) {
            result.append(this.userId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", ContributorItemIdLoggedInContributor: ");
        if ((this.ALL_FLAGS & 0x200000) != 0x0) {
            result.append(this.contributorItemIdLoggedInContributor);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
