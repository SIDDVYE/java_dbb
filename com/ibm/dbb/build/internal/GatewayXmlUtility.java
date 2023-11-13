// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

public class GatewayXmlUtility
{
    private String gatewayType;
    private String service;
    private boolean reuseIspfSession;
    private int loglevel;
    private String sessionId;
    private boolean prompt;
    private int returnCode;
    private String output;
    private static final String SERVICE_RESPONSE = "SERVICE-RESPONSE";
    private static final String CDATA_BEGIN = "<![CDATA[";
    private static final String CDATA_END = "]]>";
    
    public GatewayXmlUtility(final String gatewayType, final String service, final boolean reuseIspfSession, final int loglevel) {
        this.gatewayType = gatewayType;
        this.service = service;
        this.reuseIspfSession = reuseIspfSession;
        this.loglevel = loglevel;
    }
    
    public String createStartSessionXML(final String procedureName, final String accountNumber, final String groupId, final String regionSize) {
        final StringBuilder xml = new StringBuilder();
        xml.append(this.getBeginXML());
        xml.append("<request>" + (this.reuseIspfSession ? "RECONN" : "NEW") + "TSO" + (this.service.equals("ISPF") ? this.service : "") + "</request>\n");
        xml.append("<procname>" + procedureName + "</procname>\n");
        xml.append("<acctnum>" + accountNumber + "</acctnum>\n");
        xml.append("<groupid>" + groupId + "</groupid>\n");
        xml.append("<regionsz>" + regionSize + "</regionsz>\n");
        xml.append("<loglevel>" + this.loglevel + "</loglevel>\n");
        xml.append(this.getEndXML());
        return xml.toString();
    }
    
    public String createCommandXML(final String command, final String options, final String sessionId) {
        final StringBuilder xml = new StringBuilder();
        xml.append(this.getBeginXML());
        if (this.gatewayType.equals("legacy")) {
            xml.append("<service>" + options + "</service>\n");
            xml.append("<session>" + (this.reuseIspfSession ? "REUSE" : "NONE") + "</session>\n");
            xml.append("<command>" + command + "</command>\n");
        }
        else {
            xml.append("<request>REUSE</request>\n");
            xml.append("<sessid>" + sessionId + "</sessid>\n");
            xml.append("<cmdresp>" + ((options == null) ? command : (command + " " + options)) + "</cmdresp>\n");
            xml.append("<loglevel>" + this.loglevel + "</loglevel>\n");
        }
        xml.append(this.getEndXML());
        return xml.toString();
    }
    
    public String createResponseXML(final String response, final String sessionId) {
        final StringBuilder xml = new StringBuilder();
        xml.append(this.getBeginXML());
        xml.append("<request>RESPOND</request>\n");
        xml.append("<sessid>" + sessionId + "</sessid>\n");
        xml.append("<cmdresp>RESPONSE \"" + response + "\"</cmdresp>\n");
        xml.append("<loglevel>" + this.loglevel + "</loglevel>\n");
        xml.append(this.getEndXML());
        return xml.toString();
    }
    
    public String createStopSessionXML(final String sessionId) {
        final StringBuilder xml = new StringBuilder();
        xml.append(this.getBeginXML());
        xml.append("<request>" + (this.reuseIspfSession ? "DORMANT" : "LOGOFF") + "</request>\n");
        xml.append("<sessid>" + sessionId + "</sessid>\n");
        xml.append("<loglevel>" + this.loglevel + "</loglevel>\n");
        xml.append(this.getEndXML());
        return xml.toString();
    }
    
    public String createCancelXML(final String sessionId) {
        final StringBuilder xml = new StringBuilder();
        xml.append(this.getBeginXML());
        xml.append("<request>CANCEL</request>\n");
        xml.append("<sessid>" + sessionId + "</sessid>\n");
        xml.append("<loglevel>" + this.loglevel + "</loglevel>\n");
        xml.append(this.getEndXML());
        return xml.toString();
    }
    
    public void parse(final String xmlResponse) {
        this.output = this.getText(xmlResponse, this.service);
        if (this.gatewayType.equals("legacy") && this.output != null) {
            final int returnCodeIdx = this.output.indexOf("ISPF_RETURN_CODE");
            if (returnCodeIdx > -1) {
                final int equalSignIdx = this.output.indexOf(61, returnCodeIdx);
                this.returnCode = this.readInt(this.output, equalSignIdx + 1);
                this.output = this.output.substring(0, returnCodeIdx);
            }
        }
        else if (this.gatewayType.equals("interactive")) {
            final String rc = this.getText(xmlResponse, "RETURN-CODE");
            if (rc != null) {
                this.returnCode = Integer.parseInt(rc);
            }
            else {
                this.returnCode = 0;
            }
        }
        this.sessionId = this.getText(xmlResponse, "SESS");
        final String flag = this.getText(xmlResponse, "TSOPROMPT");
        if (flag != null) {
            this.prompt = flag.equalsIgnoreCase("YES");
        }
        else {
            this.prompt = false;
        }
    }
    
    private String getBeginXML() {
        final StringBuilder xml = new StringBuilder("<?xml version=\"1.0\"?>\n");
        xml.append("<ISPF-INPUT>\n");
        if (this.gatewayType.equals("interactive")) {
            xml.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n");
            xml.append("xsi:noNamespaceSchemaLocation=\"ispf.xsd\"\n");
        }
        xml.append("<SERVICE-REQUEST>\n");
        return xml.toString();
    }
    
    private String getEndXML() {
        final StringBuilder xml = new StringBuilder();
        xml.append("</SERVICE-REQUEST>\n");
        xml.append("</ISPF-INPUT>\n");
        return xml.toString();
    }
    
    private String getText(final String xml, final String searchTag) {
        final String startResponseTag = "<SERVICE-RESPONSE>";
        final String endResponseTag = "</SERVICE-RESPONSE>";
        final String startSearchTag = "<" + searchTag + ">";
        final String endSearchTag = "</" + searchTag + ">";
        final int responseStartIdx = xml.indexOf(startResponseTag);
        if (responseStartIdx > -1) {
            final int responseEndIdx = xml.indexOf(endResponseTag, responseStartIdx);
            if (responseEndIdx > -1) {
                final String resp = xml.substring(responseStartIdx + startResponseTag.length(), responseEndIdx);
                final int searchTagStartIdx = resp.indexOf(startSearchTag);
                if (searchTagStartIdx > -1) {
                    final int searchTagEndIdx = resp.indexOf(endSearchTag, searchTagStartIdx);
                    if (searchTagEndIdx > -1) {
                        final String text = resp.substring(searchTagStartIdx + startSearchTag.length(), searchTagEndIdx);
                        final int cDataStartIndex = text.indexOf("<![CDATA[");
                        if (cDataStartIndex <= -1) {
                            return text;
                        }
                        final int cDataEndIndex = text.indexOf("]]>", cDataStartIndex);
                        if (cDataEndIndex > -1) {
                            return text.substring(cDataStartIndex + "<![CDATA[".length(), cDataEndIndex);
                        }
                    }
                }
            }
        }
        return null;
    }
    
    private int readInt(final String text, final int startChar) {
        int rc = 0;
        final StringBuilder buffer = new StringBuilder();
        boolean start = false;
        for (int i = startChar; i < text.length(); ++i) {
            final char ch = text.charAt(i);
            if (Character.isWhitespace(ch)) {
                if (!start) {
                    start = true;
                }
                else {
                    if (buffer.length() > 0) {
                        try {
                            rc = Integer.parseInt(buffer.toString());
                        }
                        catch (NumberFormatException ex) {}
                        break;
                    }
                    break;
                }
            }
            else {
                buffer.append(ch);
            }
        }
        return rc;
    }
    
    public String getSessionId() {
        return this.sessionId;
    }
    
    public boolean isPrompt() {
        return this.prompt;
    }
    
    public int getReturnCode() {
        return this.returnCode;
    }
    
    public String getOutput() {
        return this.output;
    }
}
