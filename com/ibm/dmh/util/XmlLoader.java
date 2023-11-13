// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import java.util.ResourceBundle;
import java.io.Reader;
import org.xml.sax.InputSource;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import com.ibm.dmh.cfgmgr.vars.ConfigVar;
import com.ibm.dmh.cfgmgr.vars.AbstractVar;
import com.ibm.dmh.cfgmgr.vars.VarTracker;
import com.ibm.dmh.cfgmgr.vars.ResourceBundleVar;
import java.net.URL;
import java.io.FileNotFoundException;
import java.io.File;
import com.ibm.dmh.cfgmgr.vars.VarResolver;
import org.w3c.dom.Document;

public class XmlLoader
{
    public Document doc;
    
    public XmlLoader(final String fileName, final String[] searchPaths, final String encoding, final VarResolver vr) throws Exception {
        this(fileName, searchPaths, encoding, vr, true);
    }
    
    public XmlLoader(final String fileName, final String[] searchPaths, final String encoding, final VarResolver vr, final boolean trackUsedLVars) throws Exception {
        for (int i = 0; i < searchPaths.length; ++i) {
            final String path = searchPaths[i] + '/' + fileName;
            if (new File(path).exists()) {
                this.init(path, encoding, vr, trackUsedLVars);
                return;
            }
        }
        for (int i = 0; i < searchPaths.length; ++i) {
            final String path = searchPaths[i] + '/' + fileName;
            URL url = ClassLoader.getSystemResource(path);
            if (url == null) {
                url = this.getClass().getClassLoader().getResource(path);
            }
            if (url != null) {
                final boolean isFile = url.toURI().toString().indexOf("file:") == 0;
                this.init(path, isFile ? LocaleMgr.getAssetAnalyzerFileEncoding() : "UTF-8", vr, trackUsedLVars);
                return;
            }
        }
        throw new FileNotFoundException("XmlLoader could not find file [" + fileName + "] in search path [" + StringUtils.join(searchPaths, ",") + "] or CLASSPATH");
    }
    
    public XmlLoader(final String path, final String encoding, final VarResolver vr) throws Exception {
        this.init(path, encoding, vr, false);
    }
    
    private void init(final String path, final String iEncoding, VarResolver vr, final boolean trackUsedLVars) throws Exception {
        final TextFileContents fc = new TextFileContents();
        final String encoding = (iEncoding == null) ? LocaleMgr.getAssetAnalyzerFileEncoding() : iEncoding;
        fc.readFile(path, encoding);
        if (vr == null) {
            vr = new VarResolver();
        }
        final ResourceBundle rb = LocaleMgr.getBundleForFile(path);
        if (rb != null) {
            vr.addVar("L", new ResourceBundleVar(rb), new VarTracker(trackUsedLVars, true));
        }
        vr.addVar("C", new ConfigVar(), new VarTracker(false, true));
        final ReplaceVars replaceVars = new ReplaceVars(fc.getFileName(), fc.getContents());
        replaceVars.insertVars(vr);
        fc.setContents(replaceVars.getNewContents());
        final DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        final InputSource is = new InputSource(new StringReader(fc.getContents()));
        is.setSystemId(new File(".").toURL().toString());
        this.doc = builder.parse(is);
    }
    
    public Element getRootElement() {
        return this.doc.getDocumentElement();
    }
    
    public Document getDocument() {
        return this.doc;
    }
}
