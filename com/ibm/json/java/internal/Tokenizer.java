// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.json.java.internal;

import java.io.IOException;
import java.io.Reader;

public class Tokenizer
{
    private Reader reader;
    private int lineNo;
    private int colNo;
    private int lastChar;
    
    public Tokenizer(final Reader reader) throws IOException {
        this.reader = reader;
        this.lineNo = 0;
        this.colNo = 0;
        this.lastChar = 10;
        this.readChar();
    }
    
    public Token next() throws IOException {
        while (Character.isWhitespace((char)this.lastChar)) {
            this.readChar();
        }
        switch (this.lastChar) {
            case -1: {
                this.readChar();
                return Token.TokenEOF;
            }
            case 123: {
                this.readChar();
                return Token.TokenBraceL;
            }
            case 125: {
                this.readChar();
                return Token.TokenBraceR;
            }
            case 91: {
                this.readChar();
                return Token.TokenBrackL;
            }
            case 93: {
                this.readChar();
                return Token.TokenBrackR;
            }
            case 58: {
                this.readChar();
                return Token.TokenColon;
            }
            case 44: {
                this.readChar();
                return Token.TokenComma;
            }
            case 34:
            case 39: {
                return new Token(this.readString());
            }
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57: {
                return new Token(this.readNumber());
            }
            case 102:
            case 110:
            case 116: {
                final String identifier = this.readIdentifier();
                if (identifier.equals("null")) {
                    return Token.TokenNull;
                }
                if (identifier.equals("true")) {
                    return Token.TokenTrue;
                }
                if (identifier.equals("false")) {
                    return Token.TokenFalse;
                }
                throw new IOException("Unexpected identifier '" + identifier + "' " + this.onLineCol());
            }
            default: {
                throw new IOException("Unexpected character '" + (char)this.lastChar + "' " + this.onLineCol());
            }
        }
    }
    
    private String readString() throws IOException {
        final StringBuffer sb = new StringBuffer();
        final int lastChar = this.lastChar;
        final int lineNo = this.lineNo;
        final int colNo = this.colNo;
        this.readChar();
        while (-1 != this.lastChar && lastChar != this.lastChar) {
            if (this.lastChar != 92) {
                sb.append((char)this.lastChar);
                this.readChar();
            }
            else {
                this.readChar();
                switch (this.lastChar) {
                    case 98: {
                        this.readChar();
                        sb.append('\b');
                        continue;
                    }
                    case 102: {
                        this.readChar();
                        sb.append('\f');
                        continue;
                    }
                    case 110: {
                        this.readChar();
                        sb.append('\n');
                        continue;
                    }
                    case 114: {
                        this.readChar();
                        sb.append('\r');
                        continue;
                    }
                    case 116: {
                        this.readChar();
                        sb.append('\t');
                        continue;
                    }
                    case 39: {
                        this.readChar();
                        sb.append('\'');
                        continue;
                    }
                    case 34: {
                        this.readChar();
                        sb.append('\"');
                        continue;
                    }
                    case 92: {
                        this.readChar();
                        sb.append('\\');
                        continue;
                    }
                    case 47: {
                        this.readChar();
                        sb.append('/');
                        continue;
                    }
                    case 117:
                    case 120: {
                        final StringBuffer sb2 = new StringBuffer();
                        int n = 2;
                        if (this.lastChar == 117) {
                            n = 4;
                        }
                        for (int i = 0; i < n; ++i) {
                            this.readChar();
                            if (!this.isHexDigit(this.lastChar)) {
                                throw new IOException("non-hex digit " + this.onLineCol());
                            }
                            sb2.append((char)this.lastChar);
                        }
                        this.readChar();
                        try {
                            sb.append((char)Integer.parseInt(sb2.toString(), 16));
                            continue;
                        }
                        catch (NumberFormatException ex) {
                            throw new IOException("non-hex digit " + this.onLineCol());
                        }
                        break;
                    }
                }
                if (!this.isOctalDigit(this.lastChar)) {
                    throw new IOException("non-hex digit " + this.onLineCol());
                }
                final StringBuffer sb3 = new StringBuffer();
                sb3.append((char)this.lastChar);
                for (int j = 0; j < 2; ++j) {
                    this.readChar();
                    if (!this.isOctalDigit(this.lastChar)) {
                        break;
                    }
                    sb3.append((char)this.lastChar);
                }
                try {
                    sb.append((char)Integer.parseInt(sb3.toString(), 8));
                    continue;
                }
                catch (NumberFormatException ex2) {
                    throw new IOException("non-hex digit " + this.onLineCol());
                }
                break;
            }
        }
        if (-1 == this.lastChar) {
            throw new IOException("String not terminated " + this.onLineCol(lineNo, colNo));
        }
        this.readChar();
        return sb.toString();
    }
    
    private Number readNumber() throws IOException {
        final StringBuffer sb = new StringBuffer();
        final int lineNo = this.lineNo;
        final int colNo = this.colNo;
        while (this.isDigitChar(this.lastChar)) {
            sb.append((char)this.lastChar);
            this.readChar();
        }
        String str = sb.toString();
        try {
            if (-1 != str.indexOf(46)) {
                return Double.valueOf(str);
            }
            String s = "";
            if (str.startsWith("-")) {
                s = "-";
                str = str.substring(1);
            }
            if (str.toUpperCase().startsWith("0X")) {
                return Long.valueOf(s + str.substring(2), 16);
            }
            if (str.equals("0")) {
                return new Long(0L);
            }
            if (str.startsWith("0") && str.length() > 1) {
                return Long.valueOf(s + str.substring(1), 8);
            }
            if (str.indexOf("e") != -1 || str.indexOf("E") != -1) {
                return Double.valueOf(s + str);
            }
            return Long.valueOf(s + str, 10);
        }
        catch (NumberFormatException cause) {
            final IOException ex = new IOException("Invalid number literal " + this.onLineCol(lineNo, colNo));
            ex.initCause(cause);
            throw ex;
        }
    }
    
    private boolean isHexDigit(final int n) {
        switch (n) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    private boolean isOctalDigit(final int n) {
        switch (n) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    private boolean isDigitChar(final int n) {
        switch (n) {
            case 43:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 69:
            case 88:
            case 101:
            case 120: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    private String readIdentifier() throws IOException {
        final StringBuffer sb = new StringBuffer();
        while (-1 != this.lastChar && Character.isLetter((char)this.lastChar)) {
            sb.append((char)this.lastChar);
            this.readChar();
        }
        return sb.toString();
    }
    
    private void readChar() throws IOException {
        if (10 == this.lastChar) {
            this.colNo = 0;
            ++this.lineNo;
        }
        this.lastChar = this.reader.read();
        if (-1 == this.lastChar) {
            return;
        }
        ++this.colNo;
    }
    
    private String onLineCol(final int i, final int j) {
        return "on line " + i + ", column " + j;
    }
    
    public String onLineCol() {
        return this.onLineCol(this.lineNo, this.colNo);
    }
}
