// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.json.java.internal;

public class Token
{
    public static final Token TokenEOF;
    public static final Token TokenBraceL;
    public static final Token TokenBraceR;
    public static final Token TokenBrackL;
    public static final Token TokenBrackR;
    public static final Token TokenColon;
    public static final Token TokenComma;
    public static final Token TokenTrue;
    public static final Token TokenFalse;
    public static final Token TokenNull;
    private String valueString;
    private Number valueNumber;
    
    public Token() {
    }
    
    public Token(final String valueString) {
        this.valueString = valueString;
    }
    
    public Token(final Number valueNumber) {
        this.valueNumber = valueNumber;
    }
    
    public String getString() {
        return this.valueString;
    }
    
    public Number getNumber() {
        return this.valueNumber;
    }
    
    public boolean isString() {
        return null != this.valueString;
    }
    
    public boolean isNumber() {
        return null != this.valueNumber;
    }
    
    public String toString() {
        if (this == Token.TokenEOF) {
            return "Token: EOF";
        }
        if (this == Token.TokenBraceL) {
            return "Token: {";
        }
        if (this == Token.TokenBraceR) {
            return "Token: }";
        }
        if (this == Token.TokenBrackL) {
            return "Token: [";
        }
        if (this == Token.TokenBrackR) {
            return "Token: ]";
        }
        if (this == Token.TokenColon) {
            return "Token: :";
        }
        if (this == Token.TokenComma) {
            return "Token: ,";
        }
        if (this == Token.TokenTrue) {
            return "Token: true";
        }
        if (this == Token.TokenFalse) {
            return "Token: false";
        }
        if (this == Token.TokenNull) {
            return "Token: null";
        }
        if (this.isNumber()) {
            return "Token: Number - " + this.getNumber();
        }
        if (this.isString()) {
            return "Token: String - '" + this.getString() + "'";
        }
        return "Token: unknown.";
    }
    
    static {
        TokenEOF = new Token();
        TokenBraceL = new Token();
        TokenBraceR = new Token();
        TokenBrackL = new Token();
        TokenBrackR = new Token();
        TokenColon = new Token();
        TokenComma = new Token();
        TokenTrue = new Token();
        TokenFalse = new Token();
        TokenNull = new Token();
    }
}
