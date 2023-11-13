// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import com.ibm.team.repository.common.transport.ITeamRestService;

public interface IOslcScmService extends ITeamRestService
{
    public static final String OSLC_SCM_SERVICE_NAME = "oslc-scm";
    public static final String REPORT_KIND = "reportKind";
    public static final String COMPARE = "compare";
    public static final String COMPARE_WITH = "compareWith";
    public static final String PROPERTY_REQUEST = "propertyRequest";
    public static final String OSLC_ORDER_BY = "oslc.orderBy";
    public static final String OSLC_PROPERTIES = "oslc.properties";
    public static final String OSLC_RECURSE = "oslc_scm.recurse";
    public static final String OSLC_SCM_CONTEXT = "oslc_scm.context";
    public static final String WORD_CONTENT = "content";
    public static final String WORD_METADATA = "metadata";
    public static final String WORD_REQUEST_TYPE = "requestType";
}
