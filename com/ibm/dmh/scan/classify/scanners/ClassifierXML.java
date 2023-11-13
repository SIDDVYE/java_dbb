// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify.scanners;

import org.xml.sax.SAXParseException;
import javax.xml.parsers.SAXParser;
import java.util.regex.Matcher;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.io.Reader;
import org.xml.sax.InputSource;
import java.io.StringReader;
import javax.xml.parsers.SAXParserFactory;
import com.ibm.dmh.scan.classify.ScanProperties;
import java.util.regex.Pattern;

public class ClassifierXML extends ClassifierByString implements IClassifierByString
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2009, 2017\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private static Pattern docTypePattern;
    
    public ClassifierXML(final ScanProperties scanProperties) {
        super(scanProperties);
    }
    
    @Override
    public String getLanguageCd() {
        return "XML";
    }
    
    @Override
    public boolean checkString(String iFileContent) {
        try {
            if (iFileContent == null || !iFileContent.startsWith("<")) {
                return false;
            }
            final Matcher m = ClassifierXML.docTypePattern.matcher(iFileContent);
            iFileContent = m.replaceFirst("");
            final SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setValidating(false);
            final SAXParser saxParser = factory.newSAXParser();
            final SAXHandler handler = new SAXHandler();
            final StringReader reader = new StringReader(iFileContent);
            final InputSource inputSource = new InputSource(reader);
            saxParser.parse(inputSource, handler);
            return handler.isValid;
        }
        catch (SAXException e2) {
            return false;
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
            return false;
        }
    }
    
    static {
        ClassifierXML.docTypePattern = Pattern.compile("\\<\\!DOCTYPE[^\\>]*\\>");
    }
    
    private static class SAXHandler extends DefaultHandler
    {
        boolean isValid;
        
        private SAXHandler() {
            this.isValid = true;
        }
        
        @Override
        public void fatalError(final SAXParseException e) {
            this.isValid = false;
        }
    }
}
