// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency;

import org.slf4j.LoggerFactory;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import java.io.Reader;
import java.util.List;
import com.ibm.dbb.build.internal.Messages;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import java.io.UnsupportedEncodingException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import org.slf4j.Logger;

public class ZUnitConfigScanner extends AbstractDependencyScanner
{
    private static String _TESTCASE_ELEMENT;
    private static String _PLAYBACK_ELEMENT;
    private static String _MODULE_NAME;
    private static String _PLAYBACK_FILE;
    private static String _PREFIXED_PLAYBACK_FILE;
    private static String _NAME;
    private static String _LOCAL_NAME;
    String DEFAULT_DEPENDENCY_REFERENCE_TYPE;
    protected static Logger logger;
    
    public ZUnitConfigScanner() {
        this.DEFAULT_DEPENDENCY_REFERENCE_TYPE = "ZUNITINC";
    }
    
    @Override
    protected Object runScan(final String file, final InputStream inputStream, final String encoding) {
        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        final List<String> playbackFiles = new ArrayList<String>();
        String testCase = null;
        String program = null;
        final LogicalFile lfile = new LogicalFile(this.createLogicalName(file), file, "ZUNITCFG", false, false, false);
        Reader reader;
        try {
            reader = new InputStreamReader(inputStream, encoding);
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return lfile;
        }
        final InputSource is = new InputSource(reader);
        is.setEncoding(encoding);
        try {
            final DocumentBuilder builder = factory.newDocumentBuilder();
            builder.setErrorHandler(new ErrorHandler() {
                @Override
                public void warning(final SAXParseException e) throws SAXException {
                }
                
                @Override
                public void fatalError(final SAXParseException e) throws SAXException {
                    throw e;
                }
                
                @Override
                public void error(final SAXParseException e) throws SAXException {
                    throw e;
                }
            });
            final Document doc = builder.parse(is);
            final Element root = doc.getDocumentElement();
            final NodeList nodes = root.getChildNodes();
            for (int i = 0; i < nodes.getLength(); ++i) {
                if (nodes.item(i).getNodeType() == 1) {
                    final Element runnerNode = (Element)nodes.item(i);
                    if (runnerNode.getNodeName().equals(ZUnitConfigScanner._TESTCASE_ELEMENT)) {
                        testCase = this.createLogicalName(runnerNode.getAttribute(ZUnitConfigScanner._MODULE_NAME));
                    }
                    if (runnerNode.getNodeName().equals(ZUnitConfigScanner._PLAYBACK_ELEMENT)) {
                        final NodeList playbackNodes = runnerNode.getChildNodes();
                        program = this.createLogicalName(runnerNode.getAttribute(ZUnitConfigScanner._MODULE_NAME));
                        for (int j = 0; j < playbackNodes.getLength(); ++j) {
                            if (playbackNodes.item(j).getNodeType() == 1) {
                                final Element playbackNode = (Element)playbackNodes.item(j);
                                final String playbackNodeName = playbackNode.getNodeName();
                                if (playbackNodeName.equals(ZUnitConfigScanner._PREFIXED_PLAYBACK_FILE) || playbackNodeName.equals(ZUnitConfigScanner._PLAYBACK_FILE)) {
                                    final String playbackFile = playbackNode.getAttribute(ZUnitConfigScanner._NAME);
                                    final String playbackLocalFile = playbackNode.getAttribute(ZUnitConfigScanner._LOCAL_NAME);
                                    final String result = this.getPlaybackMemberName(playbackFile, playbackLocalFile);
                                    if (playbackFile != null && !playbackFile.isEmpty()) {
                                        playbackFiles.add(result);
                                    }
                                }
                            }
                        }
                    }
                    ZUnitConfigScanner.logger.debug("" + nodes.item(i).getTextContent());
                }
            }
        }
        catch (SAXParseException se) {
            ZUnitConfigScanner.logger.debug(se.getMessage());
            ZUnitConfigScanner.logger.warn(Messages.getMessage("ZUNIT_CONFIG_SCANNER_NOT_XML_FILE", file));
            return lfile;
        }
        catch (Exception ex) {
            ZUnitConfigScanner.logger.error(ex.getMessage(), (Throwable)ex);
            return lfile;
        }
        if (program != null) {
            lfile.addLogicalDependency(new LogicalDependency(program, "SYSPROG", this.DEFAULT_DEPENDENCY_REFERENCE_TYPE));
        }
        if (testCase != null) {
            lfile.addLogicalDependency(new LogicalDependency(testCase, "SYSTEST", this.DEFAULT_DEPENDENCY_REFERENCE_TYPE));
        }
        for (final String playbackFile2 : playbackFiles) {
            lfile.addLogicalDependency(new LogicalDependency(playbackFile2, "SYSPLAY", this.DEFAULT_DEPENDENCY_REFERENCE_TYPE));
        }
        return lfile;
    }
    
    @Override
    protected LogicalFile createLogicalFile(final String file, final Object scanMetadata) {
        return (LogicalFile)scanMetadata;
    }
    
    private String getPlaybackMemberName(final String name, String localName) {
        String result = null;
        if (localName == null || localName.isEmpty()) {
            if (name == null || name.isEmpty()) {
                result = null;
            }
            else {
                String fName = name;
                final int pos = fName.lastIndexOf(".");
                ZUnitConfigScanner.logger.debug("fName = " + fName + " pos = " + pos);
                if (pos > 0) {
                    fName = fName.substring(pos + 1);
                }
                result = fName.toUpperCase();
            }
        }
        else {
            localName = localName.replace('\\', '/');
            final Path p = Paths.get(localName, new String[0]);
            final String fName2 = p.getFileName().toString();
            result = this.createLogicalName(fName2);
        }
        return result;
    }
    
    static {
        ZUnitConfigScanner._TESTCASE_ELEMENT = "runner:testCase";
        ZUnitConfigScanner._PLAYBACK_ELEMENT = "runner:playback";
        ZUnitConfigScanner._MODULE_NAME = "moduleName";
        ZUnitConfigScanner._PLAYBACK_FILE = "playbackFile";
        ZUnitConfigScanner._PREFIXED_PLAYBACK_FILE = "runner:playbackFile";
        ZUnitConfigScanner._NAME = "name";
        ZUnitConfigScanner._LOCAL_NAME = "localName";
        ZUnitConfigScanner.logger = LoggerFactory.getLogger((Class)ZUnitConfigScanner.class);
    }
}
