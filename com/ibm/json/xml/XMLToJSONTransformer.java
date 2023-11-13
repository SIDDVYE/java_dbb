// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.json.xml;

import java.io.FileInputStream;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.io.ByteArrayOutputStream;
import org.xml.sax.XMLReader;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.InputSource;
import java.io.BufferedInputStream;
import org.xml.sax.ErrorHandler;
import org.xml.sax.ContentHandler;
import com.ibm.json.xml.internal.JSONSAXHandler;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import org.xml.sax.SAXException;
import java.util.logging.Level;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.logging.Logger;

public class XMLToJSONTransformer
{
    private static String className;
    private static Logger logger;
    
    public static void transform(final InputStream inputStream, final OutputStream outputStream) throws SAXException, IOException {
        if (XMLToJSONTransformer.logger.isLoggable(Level.FINER)) {
            XMLToJSONTransformer.logger.entering(XMLToJSONTransformer.className, "transform(InputStream, OutputStream)");
        }
        transform(inputStream, outputStream, false);
        if (XMLToJSONTransformer.logger.isLoggable(Level.FINER)) {
            XMLToJSONTransformer.logger.entering(XMLToJSONTransformer.className, "transform(InputStream, OutputStream)");
        }
    }
    
    public static void transform(final InputStream in, final OutputStream outputStream, final boolean b) throws SAXException, IOException {
        if (XMLToJSONTransformer.logger.isLoggable(Level.FINER)) {
            XMLToJSONTransformer.logger.entering(XMLToJSONTransformer.className, "transform(InputStream, OutputStream)");
        }
        if (in == null) {
            throw new NullPointerException("XMLStream cannot be null");
        }
        if (outputStream == null) {
            throw new NullPointerException("JSONStream cannot be null");
        }
        if (XMLToJSONTransformer.logger.isLoggable(Level.FINEST)) {
            XMLToJSONTransformer.logger.logp(Level.FINEST, XMLToJSONTransformer.className, "transform", "Fetching a SAX parser for use with JSONSAXHandler");
        }
        try {
            final SAXParserFactory instance = SAXParserFactory.newInstance();
            instance.setNamespaceAware(true);
            final XMLReader xmlReader = instance.newSAXParser().getXMLReader();
            final JSONSAXHandler jsonsaxHandler = new JSONSAXHandler(outputStream, b);
            xmlReader.setContentHandler(jsonsaxHandler);
            xmlReader.setErrorHandler(jsonsaxHandler);
            final InputSource inputSource = new InputSource(new BufferedInputStream(in));
            if (XMLToJSONTransformer.logger.isLoggable(Level.FINEST)) {
                XMLToJSONTransformer.logger.logp(Level.FINEST, XMLToJSONTransformer.className, "transform", "Parsing the XML content to JSON");
            }
            inputSource.setEncoding("UTF-8");
            xmlReader.parse(inputSource);
            jsonsaxHandler.flushBuffer();
        }
        catch (ParserConfigurationException ex) {
            throw new SAXException("Could not get a parser: " + ex.toString());
        }
        if (XMLToJSONTransformer.logger.isLoggable(Level.FINER)) {
            XMLToJSONTransformer.logger.exiting(XMLToJSONTransformer.className, "transform(InputStream, OutputStream)");
        }
    }
    
    public static String transform(final InputStream inputStream) throws SAXException, IOException {
        return transform(inputStream, false);
    }
    
    public static String transform(final InputStream inputStream, final boolean b) throws SAXException, IOException {
        if (XMLToJSONTransformer.logger.isLoggable(Level.FINER)) {
            XMLToJSONTransformer.logger.exiting(XMLToJSONTransformer.className, "transform(InputStream, boolean)");
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String string;
        try {
            transform(inputStream, byteArrayOutputStream, b);
            string = byteArrayOutputStream.toString("UTF-8");
            byteArrayOutputStream.close();
        }
        catch (UnsupportedEncodingException cause) {
            final IOException ex = new IOException(cause.toString());
            ex.initCause(cause);
            throw ex;
        }
        if (XMLToJSONTransformer.logger.isLoggable(Level.FINER)) {
            XMLToJSONTransformer.logger.exiting(XMLToJSONTransformer.className, "transform(InputStream, boolean)");
        }
        return string;
    }
    
    public static String transform(final File file, final boolean b) throws SAXException, IOException {
        if (XMLToJSONTransformer.logger.isLoggable(Level.FINER)) {
            XMLToJSONTransformer.logger.exiting(XMLToJSONTransformer.className, "transform(InputStream, boolean)");
        }
        final FileInputStream fileInputStream = new FileInputStream(file);
        final String transform = transform(fileInputStream, b);
        fileInputStream.close();
        if (XMLToJSONTransformer.logger.isLoggable(Level.FINER)) {
            XMLToJSONTransformer.logger.exiting(XMLToJSONTransformer.className, "transform(InputStream, boolean)");
        }
        return transform;
    }
    
    public static String transform(final File file) throws SAXException, IOException {
        return transform(file, false);
    }
    
    static {
        XMLToJSONTransformer.className = "com.ibm.json.xml.transform.XMLToJSONTransformer";
        XMLToJSONTransformer.logger = Logger.getLogger(XMLToJSONTransformer.className, (String)null);
    }
}
