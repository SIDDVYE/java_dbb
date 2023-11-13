// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.json.java.internal;

import com.ibm.json.java.JSONArray;
import com.ibm.json.java.OrderedJSONObject;
import com.ibm.json.java.JSONObject;
import java.io.IOException;
import java.io.Reader;

public class Parser
{
    private Tokenizer tokenizer;
    private Token lastToken;
    
    public Parser(final Reader reader) throws IOException {
        this.tokenizer = new Tokenizer(reader);
    }
    
    public JSONObject parse() throws IOException {
        return this.parse(false);
    }
    
    public JSONObject parse(final boolean b) throws IOException {
        this.lastToken = this.tokenizer.next();
        return this.parseObject(b);
    }
    
    public JSONObject parseObject() throws IOException {
        return this.parseObject(false);
    }
    
    public JSONObject parseObject(final boolean b) throws IOException {
        JSONObject jsonObject;
        if (!b) {
            jsonObject = new JSONObject();
        }
        else {
            jsonObject = new OrderedJSONObject();
        }
        if (this.lastToken != Token.TokenBraceL) {
            throw new IOException("Expecting '{' " + this.tokenizer.onLineCol() + " instead, obtained token: '" + this.lastToken + "'");
        }
        this.lastToken = this.tokenizer.next();
        while (this.lastToken != Token.TokenEOF) {
            if (this.lastToken == Token.TokenBraceR) {
                this.lastToken = this.tokenizer.next();
                return jsonObject;
            }
            if (!this.lastToken.isString()) {
                throw new IOException("Expecting string key " + this.tokenizer.onLineCol());
            }
            final String string = this.lastToken.getString();
            this.lastToken = this.tokenizer.next();
            if (this.lastToken != Token.TokenColon) {
                throw new IOException("Expecting colon " + this.tokenizer.onLineCol());
            }
            this.lastToken = this.tokenizer.next();
            jsonObject.put(string, this.parseValue(b));
            if (this.lastToken == Token.TokenComma) {
                this.lastToken = this.tokenizer.next();
            }
            else {
                if (this.lastToken != Token.TokenBraceR) {
                    throw new IOException("expecting either ',' or '}' " + this.tokenizer.onLineCol());
                }
                continue;
            }
        }
        throw new IOException("Unterminated object " + this.tokenizer.onLineCol());
    }
    
    public JSONArray parseArray() throws IOException {
        return this.parseArray(false);
    }
    
    public JSONArray parseArray(final boolean b) throws IOException {
        final JSONArray jsonArray = new JSONArray();
        if (this.lastToken != Token.TokenBrackL) {
            throw new IOException("Expecting '[' " + this.tokenizer.onLineCol());
        }
        this.lastToken = this.tokenizer.next();
        while (this.lastToken != Token.TokenEOF) {
            if (this.lastToken == Token.TokenBrackR) {
                this.lastToken = this.tokenizer.next();
                return jsonArray;
            }
            jsonArray.add(this.parseValue(b));
            if (this.lastToken == Token.TokenComma) {
                this.lastToken = this.tokenizer.next();
            }
            else {
                if (this.lastToken != Token.TokenBrackR) {
                    throw new IOException("expecting either ',' or ']' " + this.tokenizer.onLineCol());
                }
                continue;
            }
        }
        throw new IOException("Unterminated array " + this.tokenizer.onLineCol());
    }
    
    public Object parseValue() throws IOException {
        return this.parseValue(false);
    }
    
    public Object parseValue(final boolean b) throws IOException {
        if (this.lastToken == Token.TokenEOF) {
            throw new IOException("Expecting property value " + this.tokenizer.onLineCol());
        }
        if (this.lastToken.isNumber()) {
            final Number number = this.lastToken.getNumber();
            this.lastToken = this.tokenizer.next();
            return number;
        }
        if (this.lastToken.isString()) {
            final String string = this.lastToken.getString();
            this.lastToken = this.tokenizer.next();
            return string;
        }
        if (this.lastToken == Token.TokenFalse) {
            this.lastToken = this.tokenizer.next();
            return Boolean.FALSE;
        }
        if (this.lastToken == Token.TokenTrue) {
            this.lastToken = this.tokenizer.next();
            return Boolean.TRUE;
        }
        if (this.lastToken == Token.TokenNull) {
            this.lastToken = this.tokenizer.next();
            return null;
        }
        if (this.lastToken == Token.TokenBrackL) {
            return this.parseArray(b);
        }
        if (this.lastToken == Token.TokenBraceL) {
            return this.parseObject(b);
        }
        throw new IOException("Invalid token " + this.tokenizer.onLineCol());
    }
}
