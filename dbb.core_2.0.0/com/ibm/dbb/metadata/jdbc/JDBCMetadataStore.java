// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata.jdbc;

import org.slf4j.LoggerFactory;
import com.ibm.os390.security.PlatformThread;
import com.ibm.dbb.metadata.common.PasswordUtil;
import com.ibm.os390.security.PlatformUser;
import java.util.HashSet;
import java.util.Set;
import java.sql.Blob;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import com.ibm.dbb.metadata.Attachment;
import java.util.LinkedHashMap;
import com.ibm.dbb.build.report.records.Record;
import com.ibm.dbb.build.report.BuildReportFactory;
import com.ibm.dbb.build.report.records.BuildResultRecord;
import java.sql.Timestamp;
import java.util.Date;
import java.sql.Statement;
import java.util.Iterator;
import java.util.HashMap;
import com.ibm.dbb.metadata.Collection;
import com.ibm.dbb.dependency.LogicalDependency;
import java.util.ArrayList;
import com.ibm.dbb.dependency.LogicalFile;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.sql.SQLException;
import com.ibm.dbb.build.BuildException;
import java.sql.DriverManager;
import java.sql.Driver;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.metadata.BuildResult;
import java.util.Map;
import org.slf4j.Logger;
import java.sql.Connection;
import com.ibm.dbb.metadata.MetadataStore;

public class JDBCMetadataStore implements MetadataStore, JDBCMetadataStoreConstants
{
    private Connection connection;
    private boolean isDBBADMNS;
    private boolean isDBBUSERS;
    private boolean isDBBGUEST;
    protected String DBBUser;
    private String url;
    private static Logger logger;
    static final Map<BuildResult.QueryParms, String> br_query_map;
    static final Map<String, String> br_field_map;
    static final String GET_LOGICAL_FILE_QUERY = "SELECT DISTINCT lf.C_ID, lf.LF_CICS, lf.LF_DLI, lf.LF_FILE, lf.LF_LNAME, lf.LF_MQ, lf.LF_SQL, lflang.C_LANGUAGE FROM LOGICAL_FILE lf, COL_LF_MAPPING clfmap, COLLECTION c, LF_LANGUAGES lflang WHERE c.C_NAME = ? AND clfmap.COLLECTION_ID = c.C_ID AND lf.C_ID = clfmap.LF_ID AND lflang.C_ID = lf.LANG_ID AND lf.LF_FILE = ?";
    static final String GET_LOGICAL_FILES_QUERY = "SELECT DISTINCT lf.C_ID, lf.LF_CICS, lf.LF_DLI, lf.LF_FILE, lf.LF_LNAME, lf.LF_MQ, lf.LF_SQL, lflang.C_LANGUAGE FROM LOGICAL_FILE lf, COL_LF_MAPPING clfmap, COLLECTION c, LF_LANGUAGES lflang WHERE c.C_NAME = ? AND clfmap.COLLECTION_ID = c.C_ID AND lf.C_ID = clfmap.LF_ID AND lflang.C_ID = lf.LANG_ID";
    static final String GET_LOGICAL_FILES_QUERY_LNAME = "SELECT DISTINCT lf.C_ID, lf.LF_CICS, lf.LF_DLI, lf.LF_FILE, lf.LF_LNAME, lf.LF_MQ, lf.LF_SQL, lflang.C_LANGUAGE FROM LOGICAL_FILE lf, COL_LF_MAPPING clfmap, COLLECTION c, LF_LANGUAGES lflang WHERE c.C_ID = ? AND lf.LF_LNAME = ? AND clfmap.COLLECTION_ID = c.C_ID AND lf.C_ID = clfmap.LF_ID AND lflang.C_ID = lf.LANG_ID";
    static final String GET_LOGICAL_FILE_QUERY_LD = "SELECT DISTINCT lf.C_ID, lf.LF_CICS, lf.LF_DLI, lf.LF_FILE, lf.LF_LNAME, lf.LF_MQ, lf.LF_SQL, lflang.C_LANGUAGE FROM LF_DEP_MAPPING lfldmap, COL_LF_MAPPING clfmap, LF_LANGUAGES lflang, LD_CATEGORIES ldcat, LD_LIBRARIES ldlib, LOGICAL_DEPENDENCY ld, COLLECTION c, LOGICAL_FILE lf WHERE c.C_ID = ? AND clfmap.COLLECTION_ID = c.C_ID AND lf.C_ID = clfmap.LF_ID AND lfldmap.LF_ID = lf.C_ID AND ld.C_ID = lfldmap.DEP_ID AND lflang.C_ID = lf.LANG_ID";
    static final String GET_LOGICAL_FILE_QUERY_LD_LNAME = " AND ld.C_LNAME = ?";
    static final String GET_LOGICAL_FILE_QUERY_LD_CATEGORY = " AND ldcat.C_ID = ld.CATEGORY_ID AND ldcat.C_CATEGORY = ?";
    static final String GET_LOGICAL_FILE_QUERY_LD_LIBRARY = " AND ldlib.C_ID = ld.LIBRARY_ID AND ldlib.C_LIBRARY = ?";
    static final String GET_IMPACTED_FILES_QUERY = "SELECT DISTINCT c.C_NAME, lf.C_ID, lf.LF_CICS, lf.LF_DLI, lf.LF_FILE, lf.LF_LNAME, lf.LF_MQ, lf.LF_SQL, lflang.C_LANGUAGE FROM LF_DEP_MAPPING lfldmap, COL_LF_MAPPING clfmap, LF_LANGUAGES lflang, LD_CATEGORIES ldcat, LD_LIBRARIES ldlib, LOGICAL_DEPENDENCY ld, COLLECTION c, LOGICAL_FILE lf WHERE clfmap.COLLECTION_ID = c.C_ID AND lf.C_ID = clfmap.LF_ID AND lfldmap.LF_ID = lf.C_ID AND ld.C_ID = lfldmap.DEP_ID AND lflang.C_ID = lf.LANG_ID";
    static final String GET_IMPACTED_FILES_QUERY_CAT_ID = " AND ldcat.C_ID = ld.CATEGORY_ID";
    static final String GET_IMPACTED_FILES_QUERY_LIB_ID = " AND ldlib.C_ID = ld.LIBRARY_ID";
    static final String DELETE_COL_LF_MAPPING = "delete COL_LF_MAPPING where COLLECTION_ID = ? AND LF_ID = ?";
    static final String LOCK_LOGICAL_FILE_TABLE = "lock table LOGICAL_FILE in exclusive mode";
    static final String LOGICAL_FILE_LD_QUERY = "SELECT C_ID from LOGICAL_FILE where C_ID = ? AND C_ID in (SELECT LF_ID FROM COL_LF_MAPPING)";
    static final String DELETE_LF_LD_MAPPING = "delete LF_DEP_MAPPING where LF_ID = ?";
    static final String DELETE_LOGICAL_FILE = "delete LOGICAL_FILE where C_ID = ?";
    static final String LF_LD_MAPPING_QUERY = "SELECT C_ID from LOGICAL_DEPENDENCY where C_ID = ? AND C_ID in (SELECT DEP_ID FROM LF_DEP_MAPPING)";
    static final String DELETE_LOGICAL_DEPENDENCY = "delete LOGICAL_DEPENDENCY where C_ID = ?";
    static final String DELETE_COL_LF_MAPPING_ALL = "delete COL_LF_MAPPING where COLLECTION_ID = ?";
    static final String DELETE_COLLECTION = "delete COLLECTION c where c.C_ID = ?";
    static final String SELECT_COLLECTION_LF_MAPPING = "SELECT LF_ID FROM COL_LF_MAPPING WHERE COLLECTION_ID = ?";
    static final String INSERT_COLLECTION_LF_MAPPING = "INSERT INTO COL_LF_MAPPING ( COLLECTION_ID, LF_ID) VALUES(?,?)";
    static final String INSERT_COLLECTION = "INSERT INTO COLLECTION (C_ID, C_NAME, C_CREATED_BY, C_CREATED, C_LAST_UPDATED_BY, C_LAST_UPDATED, PERMISSIONS_C_ID) VALUES (?, ?, ?, ?, ?, ?, ?)";
    static final String INSERT_PERMISSIONS = "INSERT INTO PERMISSIONS (C_ID, P_MANAGED_ID, P_OWNER, P_PERMISSION, P_TEAM) VALUES (?, ?, ?, ?, ?)";
    static final String LOCK_SEQ_TABLE = "lock table DBB_SEQ_TABLE in exclusive mode";
    static final String SELECT_SEQ_VALUE = "select * FROM DBB_SEQ_TABLE s where s.DBB_SEQ_NAME = 'DBB_ID_SEQ'";
    static final String INSERT_BUILD_RESULT = "INSERT INTO BUILD_RESULT (C_ID, BR_GROUP, BR_LABEL, BR_STATUS, BR_STATE, C_CREATED_BY, C_CREATED, C_LAST_UPDATED_BY, C_LAST_UPDATED, PERMISSIONS_C_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    static final String SELECT_BUILD_RESULTS = "Select distinct br.C_ID, br.BR_GROUP, br.BR_LABEL, br.BR_STATE, br.BR_STATUS, br.C_CREATED, br.C_LAST_UPDATED, br.C_CREATED_BY, br.C_LAST_UPDATED_BY, br.PERMISSIONS_C_ID ";
    static final String SELECT_COLLECTIONS = "Select * from COLLECTION JOIN PERMISSIONS on COLLECTION.PERMISSIONS_C_ID = PERMISSIONS.C_ID";
    static final String SELECT_COLLECTIONS_NAME = "Select * from COLLECTION where C_NAME = ?";
    static final String SELECT_BUILD_RESULT_GROUPS = "Select distinct BR_GROUP from BUILD_RESULT ASC";
    static final String SELECT_PERMISSIONS_IN_GROUP = "Select PERMISSIONS_C_ID from BUILD_RESULT where BR_GROUP = ? order by BR_LABEL ASC";
    static final String SELECT_BR_LABELS_IN_GROUP = "Select distinct BR_LABEL, PERMISSIONS_C_ID from BUILD_RESULT where BR_GROUP = ? order by BR_LABEL ASC";
    static final String DELETE_BR = "delete BUILD_RESULT br where br.C_ID = ?";
    static final String DELETE_BR_REPORT_MAPPING = "delete BR_REPORT_MAPPING where BR_ID = ? and REP_ID = ?";
    static final String DELETE_ARTIFACT = "delete ARTIFACT where C_ID = ?";
    static final String DELETE_BR_REPORT_DATA_MAPPING = "delete BR_REPORT_DATA_MAPPING where BR_ID = ? and REP_D_ID = ?";
    static final String SELECT_CONTENT_MAPPING = "SELECT CONTENT_ID FROM A_CONTENT_MAPPING where A_ID = ?";
    static final String DELETE_CONTENT_MAPPING = "delete A_CONTENT_MAPPING where A_ID = ?";
    static final String DELETE_CONTENT = "delete ARTIFACT_CONTENT where C_ID = ?";
    static final String SELECT_BR_PROPERTY = "SELECT p.C_ID FROM BUILD_RESULT_PROPERTY p, BR_PROP_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND p.C_ID = map.PROP_ID AND p.PROPERTY_NAME = ?";
    static final String WHERE_VALUE = " AND p.PROPERTY_VALUE = ?";
    static final String DELETE_BR_PROPERTY_MAPPING = "delete BR_PROP_MAPPING where BR_ID = ? and PROP_ID = ?";
    static final String DELETE_BR_PROPERTY = "delete BUILD_RESULT_PROPERTY where C_ID = ?";
    static final String INSERT_BR_PROPERTY_MAPPING = "Insert into BR_PROP_MAPPING (BR_ID, PROP_ID) values (?, ?)";
    static final String INSERT_BR_PROPERTY = "Insert into BUILD_RESULT_PROPERTY (C_ID, PROPERTY_NAME, PROPERTY_VALUE) values (?, ?, ?)";
    static final String SELECT_BR_PROPERTY_BY_NAME = "SELECT p.C_ID FROM BUILD_RESULT_PROPERTY p, BR_PROP_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND p.C_ID = map.PROP_ID AND p.PROPERTY_NAME = ?";
    static final String UPDATE_BR_PROPERTY = "Update BUILD_RESULT_PROPERTY set PROPERTY_VALUE=? where C_ID=?";
    static final String INSERT_BR_ATTACHMENT_MAPPING = "Insert into BR_ATTACHMENT_MAPPING (BR_ID, ATTACHMENT_ID) values (?,?)";
    static final String INSERT_ARTIFACT = "Insert into ARTIFACT (C_ID, A_NAME, A_TYPE, A_CHECKSUM, A_SIZE) values (?,?,?,?,?)";
    static final String INSERT_CONTENT_MAPPING = "Insert into A_CONTENT_MAPPING (A_ID, CONTENT_ID) values (?,?)";
    static final String INSERT_CONTENT = "Insert into ARTIFACT_CONTENT (C_ID, CONTENT_DATA) values (?,?)";
    static final String DELETE_BR_ATTACHMENT_MAPPING = "delete BR_ATTACHMENT_MAPPING where BR_ID = ? AND ATTACHMENT_ID = ?";
    static final String SELECT_BUILD_REPORT = "SELECT DISTINCT a.C_ID, a.A_CHECKSUM, a.A_TYPE, a.A_NAME, a.A_SIZE FROM ARTIFACT a, BR_REPORT_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND a.C_ID = map.REP_ID";
    static final String SELECT_BUILD_REPORT_DATA = "SELECT DISTINCT a.C_ID, a.A_CHECKSUM, a.A_TYPE, a.A_NAME, a.A_SIZE FROM ARTIFACT a, BR_REPORT_DATA_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND a.C_ID = map.REP_D_ID";
    static final String UPDATE_BR_STATE = "Update BUILD_RESULT set BR_STATE=? where C_ID=?";
    static final String UPDATE_BR_STATUS = "Update BUILD_RESULT set BR_STATUS=? where C_ID=?";
    static final String UPDATE_BR_GROUP = "Update BUILD_RESULT set BR_GROUP=? where C_ID=?";
    static final String UPDATE_BR_LABEL = "Update BUILD_RESULT set BR_LABEL=? where C_ID=?";
    static final String UPDATE_COLLECTION_NAME = "Update COLLECTION set C_NAME=? where C_ID=?";
    static final String INSERT_BR_REPORT_MAPPING = "Insert into BR_REPORT_MAPPING (BR_ID, REP_ID) values (?,?)";
    static final String INSERT_BR_REPORT_DATA_MAPPING = "Insert into BR_REPORT_DATA_MAPPING (BR_ID, REP_D_ID) values (?,?)";
    static final String SELECT_BR_ATTACHMENTS = "SELECT DISTINCT a.C_ID, a.A_CHECKSUM, a.A_TYPE, a.A_NAME, a.A_SIZE FROM ARTIFACT a, BR_ATTACHMENT_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND a.C_ID = map.ATTACHMENT_ID";
    static final String SELECT_CONTENT_DATA = "SELECT c.C_ID, c.CONTENT_DATA FROM ARTIFACT a, A_CONTENT_MAPPING map, ARTIFACT_CONTENT c WHERE a.C_ID = ? AND map.A_ID = a.C_ID AND c.C_ID = map.CONTENT_ID";
    static final String SELECT_PERMISSION = "Select * from PERMISSIONS where C_ID = ?";
    static final String UPDATE_PERMISSION = "Update PERMISSIONS set P_OWNER=?, P_TEAM=?, P_PERMISSION=? where C_ID = ?";
    static final String SELECT_BR_PROPERTIES = "SELECT DISTINCT p.PROPERTY_NAME, p.PROPERTY_VALUE FROM BUILD_RESULT_PROPERTY p, BR_PROP_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND p.C_ID = map.PROP_ID";
    static final String SELECT_BR_PROPERTY_IDS = "SELECT DISTINCT p.C_ID FROM BUILD_RESULT_PROPERTY p, BR_PROP_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND p.C_ID = map.PROP_ID";
    static final String INSERT_COL_LF_MAPPING = "Insert into COL_LF_MAPPING (COLLECTION_ID, LF_ID) values (?,?)";
    static final String SELECT_COLLECTION = "select * FROM COLLECTION c where c.C_ID = ?";
    static final String SELECT_BUILD_RESULT = "select * FROM BUILD_RESULT where C_ID = ?";
    static final String SELECT_LF_BY_FILE = "SELECT * from LOGICAL_FILE lf, LF_LANGUAGES lang where lf.LF_FILE = ? AND lang.C_ID = lf.LANG_ID ";
    static final String INSERT_LOGICAL_FILE = "Insert into LOGICAL_FILE ( C_ID, LF_FILE, LF_LNAME, LANG_ID, LF_CICS, LF_SQL, LF_DLI, LF_MQ) values(?, ?, ?, ?, ?, ?, ?, ?)";
    static final String INSERT_LOGICAL_FILE_MAPPING = "Insert into LF_DEP_MAPPING ( LF_ID, DEP_ID ) values (?, ?)";
    static final String SELECT_LANGUAGES = "Select * from LF_LANGUAGES where C_LANGUAGE = ?";
    static final String INSERT_LANGUAGE = "Insert into LF_LANGUAGES (C_ID, C_LANGUAGE) values (?,?)";
    static final String SELECT_CATEGORIES = "Select * from LD_CATEGORIES where C_CATEGORY = ?";
    static final String INSERT_CATEGORY = "Insert into LD_CATEGORIES (C_ID, C_CATEGORY) values (?,?)";
    static final String SELECT_LIBRARIES = "Select * from LD_LIBRARIES where C_LIBRARY = ?";
    static final String INSERT_LIBRARY = "Insert into LD_LIBRARIES (C_ID, C_LIBRARY) values (?,?)";
    static final String SELECT_LOGICAL_DEPENDENCIES = "SELECT * from LOGICAL_DEPENDENCY ld, LD_CATEGORIES cat, LD_LIBRARIES lib where ld.C_LNAME = ? AND ld.CATEGORY_ID = cat.C_ID AND cat.C_CATEGORY = ? AND ld.LIBRARY_ID = lib.C_ID AND lib.C_LIBRARY = ?";
    static final String INSERT_LOGICAL_DEPENDENCY = "Insert into LOGICAL_DEPENDENCY ( C_ID, C_LNAME, CATEGORY_ID, LIBRARY_ID) values(?, ?, ?, ?)";
    static final String SELECT_LF_LOGICAL_DEPENDENCIES = "SELECT DISTINCT ld.C_ID, ld.C_LNAME, cat.C_CATEGORY, lib.C_LIBRARY FROM LOGICAL_DEPENDENCY ld, LF_DEP_MAPPING map, LOGICAL_FILE lf, LD_CATEGORIES cat, LD_LIBRARIES lib WHERE lf.C_ID = ? AND lf.C_ID = map.LF_ID AND ld.C_ID = map.DEP_ID AND cat.C_ID = ld.CATEGORY_ID AND lib.C_ID = ld.LIBRARY_ID";
    static final Map<String, Integer> TABLE_VERSIONS;
    static final String TBL_VERSION_QUERY = "SELECT DBB_TBL_VERSION FROM DBB_TABLE_VERSIONS WHERE DBB_TBL_NAME = ?";
    
    public JDBCMetadataStore(final String url, final String userid, final String encryptedPassword) throws BuildException {
        this.connection = null;
        this.isDBBADMNS = false;
        this.isDBBUSERS = false;
        this.isDBBGUEST = false;
        this.DBBUser = null;
        this.url = null;
        if (url == null) {
            throw new IllegalArgumentException(Messages.getMessage("INVALID_NULL_PARAMETER", "url"));
        }
        String password = null;
        if (encryptedPassword != null && encryptedPassword.length() > 0) {
            password = this.decryptPassword(encryptedPassword);
        }
        try {
            final Class driverClass = Class.forName("com.ibm.db2.jcc.DB2Driver");
            DriverManager.registerDriver(driverClass.newInstance());
            this.connection = DriverManager.getConnection(url, userid, password);
            this.url = url;
            if (!url.contains("currentSchema")) {
                this.connection.setSchema("DBBZ");
            }
        }
        catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException ex2) {
            final Exception ex;
            final Exception e = ex;
            throw new BuildException(e);
        }
        this.setRoles();
        this.validateTableVersions();
    }
    
    public JDBCMetadataStore(final String userid, final String encryptedPassword, Properties db2Properties) throws BuildException {
        this.connection = null;
        this.isDBBADMNS = false;
        this.isDBBUSERS = false;
        this.isDBBGUEST = false;
        this.DBBUser = null;
        this.url = null;
        db2Properties = (Properties)db2Properties.clone();
        final String url = db2Properties.getProperty("url");
        db2Properties.remove("url");
        if (url == null) {
            throw new IllegalArgumentException(Messages.getMessage("INVALID_NULL_PARAMETER", "url"));
        }
        if (userid != null && userid.length() > 0) {
            db2Properties.setProperty("user", userid);
        }
        if (encryptedPassword != null && encryptedPassword.length() > 0) {
            db2Properties.setProperty("password", this.decryptPassword(encryptedPassword));
        }
        try {
            final Class driverClass = Class.forName("com.ibm.db2.jcc.DB2Driver");
            DriverManager.registerDriver(driverClass.newInstance());
            this.connection = DriverManager.getConnection(url, db2Properties);
            this.url = url;
            if (!url.contains("currentSchema") && db2Properties.getProperty("currentSchema") == null) {
                this.connection.setSchema("DBBZ");
            }
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex2) {
            final Exception ex;
            final Exception e = ex;
            throw new BuildException(e);
        }
        this.setRoles();
        this.validateTableVersions();
    }
    
    public LogicalFileImpl getLogicalFile(final CollectionImpl collection, final String file) throws BuildException {
        LogicalFileImpl logicalFile = null;
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("SELECT DISTINCT lf.C_ID, lf.LF_CICS, lf.LF_DLI, lf.LF_FILE, lf.LF_LNAME, lf.LF_MQ, lf.LF_SQL, lflang.C_LANGUAGE FROM LOGICAL_FILE lf, COL_LF_MAPPING clfmap, COLLECTION c, LF_LANGUAGES lflang WHERE c.C_NAME = ? AND clfmap.COLLECTION_ID = c.C_ID AND lf.C_ID = clfmap.LF_ID AND lflang.C_ID = lf.LANG_ID AND lf.LF_FILE = ?");
            stmt.setString(1, collection.getName());
            stmt.setString(2, file);
            final ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                logicalFile = this.newLogicalFile(rs);
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return logicalFile;
    }
    
    public List<LogicalFile> getLogicalFiles(final CollectionImpl collection) throws BuildException {
        final List<LogicalFile> logicalFiles = new ArrayList<LogicalFile>();
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("SELECT DISTINCT lf.C_ID, lf.LF_CICS, lf.LF_DLI, lf.LF_FILE, lf.LF_LNAME, lf.LF_MQ, lf.LF_SQL, lflang.C_LANGUAGE FROM LOGICAL_FILE lf, COL_LF_MAPPING clfmap, COLLECTION c, LF_LANGUAGES lflang WHERE c.C_NAME = ? AND clfmap.COLLECTION_ID = c.C_ID AND lf.C_ID = clfmap.LF_ID AND lflang.C_ID = lf.LANG_ID");
            stmt.setString(1, collection.getName());
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                logicalFiles.add(this.newLogicalFile(rs));
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return logicalFiles;
    }
    
    public List<LogicalFileImpl> getLogicalFiles(final CollectionImpl collection, final String logicalName) throws BuildException {
        final List<LogicalFileImpl> logicalFiles = new ArrayList<LogicalFileImpl>();
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("SELECT DISTINCT lf.C_ID, lf.LF_CICS, lf.LF_DLI, lf.LF_FILE, lf.LF_LNAME, lf.LF_MQ, lf.LF_SQL, lflang.C_LANGUAGE FROM LOGICAL_FILE lf, COL_LF_MAPPING clfmap, COLLECTION c, LF_LANGUAGES lflang WHERE c.C_ID = ? AND lf.LF_LNAME = ? AND clfmap.COLLECTION_ID = c.C_ID AND lf.C_ID = clfmap.LF_ID AND lflang.C_ID = lf.LANG_ID");
            stmt.setLong(1, collection.getId());
            stmt.setString(2, logicalName);
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                logicalFiles.add(this.newLogicalFile(rs));
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return logicalFiles;
    }
    
    private LogicalFileImpl newLogicalFile(final ResultSet rs) throws SQLException {
        LogicalFileImpl lf = null;
        final int id = rs.getInt("C_ID");
        final String lname = rs.getString("LF_LNAME");
        final boolean cics = this.getFlag(rs.getString("LF_CICS"));
        final boolean dli = this.getFlag(rs.getString("LF_DLI"));
        final boolean mq = this.getFlag(rs.getString("LF_MQ"));
        final boolean sql = this.getFlag(rs.getString("LF_SQL"));
        final String file = rs.getString("LF_FILE");
        final String language = rs.getString("C_LANGUAGE");
        lf = new LogicalFileImpl(id, lname, file, language, cics, sql, dli, mq);
        lf.setLogicalDependencies(this.getLogicalDependencies(lf));
        return lf;
    }
    
    private LogicalDependencyImpl newLogicalDependency(final ResultSet rs) throws SQLException {
        LogicalDependencyImpl ld = null;
        final int id = rs.getInt("C_ID");
        final String lname = rs.getString("C_LNAME");
        final String category = rs.getString("C_CATEGORY");
        final String library = rs.getString("C_LIBRARY");
        ld = new LogicalDependencyImpl(id, lname, library, category);
        return ld;
    }
    
    public List<LogicalFile> getLogicalFiles(final CollectionImpl collection, final LogicalDependency logicalDependency) throws BuildException {
        final List<LogicalFile> logicalFiles = new ArrayList<LogicalFile>();
        final StringBuffer query = new StringBuffer();
        query.append("SELECT DISTINCT lf.C_ID, lf.LF_CICS, lf.LF_DLI, lf.LF_FILE, lf.LF_LNAME, lf.LF_MQ, lf.LF_SQL, lflang.C_LANGUAGE FROM LF_DEP_MAPPING lfldmap, COL_LF_MAPPING clfmap, LF_LANGUAGES lflang, LD_CATEGORIES ldcat, LD_LIBRARIES ldlib, LOGICAL_DEPENDENCY ld, COLLECTION c, LOGICAL_FILE lf WHERE c.C_ID = ? AND clfmap.COLLECTION_ID = c.C_ID AND lf.C_ID = clfmap.LF_ID AND lfldmap.LF_ID = lf.C_ID AND ld.C_ID = lfldmap.DEP_ID AND lflang.C_ID = lf.LANG_ID");
        if (logicalDependency.getLname() != null) {
            query.append(" AND ld.C_LNAME = ?");
        }
        if (logicalDependency.getCategory() != null) {
            query.append(" AND ldcat.C_ID = ld.CATEGORY_ID AND ldcat.C_CATEGORY = ?");
        }
        if (logicalDependency.getLibrary() != null) {
            query.append(" AND ldlib.C_ID = ld.LIBRARY_ID AND ldlib.C_LIBRARY = ?");
        }
        try {
            final PreparedStatement stmt = this.connection.prepareStatement(query.toString());
            stmt.setLong(1, collection.getId());
            int indx = 2;
            if (logicalDependency.getLname() != null) {
                stmt.setString(indx++, logicalDependency.getLname());
            }
            if (logicalDependency.getCategory() != null) {
                stmt.setString(indx++, logicalDependency.getCategory());
            }
            if (logicalDependency.getLibrary() != null) {
                stmt.setString(indx++, logicalDependency.getLibrary());
            }
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                logicalFiles.add(this.newLogicalFile(rs));
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return logicalFiles;
    }
    
    @Override
    public List<Collection> getImpactedFiles(final List<String> collectionNames, final List<LogicalDependency> lds) throws BuildException {
        final StringBuffer query = new StringBuffer().append("SELECT DISTINCT c.C_NAME, lf.C_ID, lf.LF_CICS, lf.LF_DLI, lf.LF_FILE, lf.LF_LNAME, lf.LF_MQ, lf.LF_SQL, lflang.C_LANGUAGE FROM LF_DEP_MAPPING lfldmap, COL_LF_MAPPING clfmap, LF_LANGUAGES lflang, LD_CATEGORIES ldcat, LD_LIBRARIES ldlib, LOGICAL_DEPENDENCY ld, COLLECTION c, LOGICAL_FILE lf WHERE clfmap.COLLECTION_ID = c.C_ID AND lf.C_ID = clfmap.LF_ID AND lfldmap.LF_ID = lf.C_ID AND ld.C_ID = lfldmap.DEP_ID AND lflang.C_ID = lf.LANG_ID");
        if (collectionNames != null && !collectionNames.isEmpty()) {
            query.append(this.createInClause("c.C_NAME", collectionNames));
        }
        if (lds != null && !lds.isEmpty()) {
            final List<String> lnames = new ArrayList<String>();
            final List<String> libraries = new ArrayList<String>();
            final List<String> categories = new ArrayList<String>();
            for (final LogicalDependency ld : lds) {
                if (ld.getLname() != null) {
                    lnames.add(ld.getLname());
                }
                if (ld.getCategory() != null) {
                    categories.add(ld.getCategory());
                }
                if (ld.getLibrary() != null) {
                    libraries.add(ld.getLibrary());
                }
            }
            if (!lnames.isEmpty()) {
                query.append(this.createInClause("ld.C_LNAME", lnames));
            }
            if (!categories.isEmpty()) {
                query.append(" AND ldcat.C_ID = ld.CATEGORY_ID").append(this.createInClause("ldcat.C_CATEGORY", categories));
            }
            if (!libraries.isEmpty()) {
                query.append(" AND ldlib.C_ID = ld.LIBRARY_ID").append(this.createInClause("ldlib.C_LIBRARY", libraries));
            }
        }
        final Map<String, Collection> mCollections = new HashMap<String, Collection>();
        try {
            final Statement stmt = this.connection.createStatement();
            final ResultSet rs = stmt.executeQuery(query.toString());
            while (rs.next()) {
                final String cName = rs.getString("C_NAME");
                Collection collection = mCollections.get(cName);
                if (collection == null) {
                    collection = new com.ibm.dbb.metadata.common.Collection(this.getCollection(cName));
                    mCollections.put(cName, collection);
                }
                collection.addLogicalFile(this.newLogicalFile(rs));
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return new ArrayList<Collection>(mCollections.values());
    }
    
    private String createInClause(final String field, final List<String> list) {
        final StringBuffer inclause = new StringBuffer();
        inclause.append(" AND " + field + " in (");
        boolean isFirst = true;
        for (final String item : list) {
            if (!isFirst) {
                inclause.append(", ");
            }
            inclause.append("'" + item + "'");
            isFirst = false;
        }
        inclause.append(")");
        return inclause.toString();
    }
    
    Date deleteLogicalFile(final CollectionImpl collection, final String file) throws BuildException {
        Date lastUpdated = new Date();
        if (!this.isWriteable(collection.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "delete", "collection logical file"));
        }
        final LogicalFileImpl logicalFile = this.getLogicalFile(collection, file);
        try {
            this.connection.setAutoCommit(false);
            final PreparedStatement pstmt = this.connection.prepareStatement("delete COL_LF_MAPPING where COLLECTION_ID = ? AND LF_ID = ?");
            pstmt.setLong(1, collection.getId());
            pstmt.setLong(2, logicalFile.getId());
            pstmt.executeUpdate();
            pstmt.close();
            this.deleteLogicalFile(logicalFile);
            lastUpdated = this.updateLastUpdated(collection);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    private void deleteLogicalFile(final LogicalFileImpl logicalFile) throws BuildException {
        try {
            final Statement lockstmt = this.connection.createStatement();
            lockstmt.execute("lock table LOGICAL_FILE in exclusive mode");
            final PreparedStatement pStmt = this.connection.prepareStatement("SELECT C_ID from LOGICAL_FILE where C_ID = ? AND C_ID in (SELECT LF_ID FROM COL_LF_MAPPING)");
            pStmt.setLong(1, logicalFile.getId());
            final ResultSet rs = pStmt.executeQuery();
            if (!rs.next()) {
                final List<LogicalDependency> lds = logicalFile.getLogicalDependencies();
                final PreparedStatement pstmt = this.connection.prepareStatement("delete LF_DEP_MAPPING where LF_ID = ?");
                pstmt.setLong(1, logicalFile.getId());
                pstmt.executeUpdate();
                pstmt.close();
                final PreparedStatement deletestmt = this.connection.prepareStatement("delete LOGICAL_FILE where C_ID = ?");
                deletestmt.setLong(1, logicalFile.getId());
                deletestmt.executeUpdate();
                deletestmt.close();
                for (final LogicalDependency ld : lds) {
                    this.deleteLogicalDependency((LogicalDependencyImpl)ld);
                }
            }
            pStmt.close();
            lockstmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
    }
    
    private void deleteLogicalDependency(final LogicalDependencyImpl logicalDependency) throws BuildException {
        try {
            final PreparedStatement pStmt = this.connection.prepareStatement("SELECT C_ID from LOGICAL_DEPENDENCY where C_ID = ? AND C_ID in (SELECT DEP_ID FROM LF_DEP_MAPPING)");
            pStmt.setLong(1, logicalDependency.getId());
            final ResultSet rs = pStmt.executeQuery();
            if (!rs.next()) {
                final PreparedStatement deletestmt = this.connection.prepareStatement("delete LOGICAL_DEPENDENCY where C_ID = ?");
                deletestmt.setLong(1, logicalDependency.getId());
                deletestmt.executeUpdate();
                deletestmt.close();
            }
            pStmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
    }
    
    @Override
    public void deleteCollection(final String name) throws BuildException {
        final Collection collection = this.getCollection(name, false);
        if (collection != null) {
            this.deleteCollection(collection);
        }
    }
    
    private void validateCollectionParm(final Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("Collection is null or user is not authorized.");
        }
        if (!(collection instanceof CollectionImpl)) {
            throw new IllegalArgumentException("Expected " + CollectionImpl.class.getTypeName() + " and was passed a " + collection.getClass().getTypeName());
        }
    }
    
    private void validateBuildResultParm(final BuildResult buildResult) {
        if (buildResult == null) {
            throw new IllegalArgumentException(Messages.getMessage("INVALID_NULL_PARAMETER", "buildResult"));
        }
    }
    
    @Override
    public void deleteCollection(final Collection collection) throws BuildException {
        this.validateCollectionParm(collection);
        if (!this.isWriteable(((CollectionImpl)collection).getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "delete", "collection"));
        }
        final List<LogicalFile> lfs = collection.getLogicalFiles();
        try {
            this.connection.setAutoCommit(false);
            PreparedStatement stmt = this.connection.prepareStatement("delete COL_LF_MAPPING where COLLECTION_ID = ?");
            stmt.setLong(1, ((CollectionImpl)collection).getId());
            stmt.executeUpdate();
            stmt.close();
            stmt = this.connection.prepareStatement("delete COLLECTION c where c.C_ID = ?");
            stmt.setLong(1, ((CollectionImpl)collection).getId());
            stmt.executeUpdate();
            stmt.close();
            for (final LogicalFile lf : lfs) {
                this.deleteLogicalFile((LogicalFileImpl)lf);
            }
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
    }
    
    @Override
    public Collection copyCollection(final Collection collection, final String newName) throws BuildException {
        if (!this.authorizedToCreate()) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "create", "collection"));
        }
        if (this.collectionExists(newName)) {
            throw new BuildException(Messages.getMessage("MetadataStore_COLLECTION_EXISTS", newName));
        }
        this.validateCollectionParm(collection);
        Collection newCollection = null;
        try {
            this.connection.setAutoCommit(false);
            newCollection = this.createCollection(newName, ((CollectionImpl)collection).getOwner(), ((CollectionImpl)collection).getTeam(), ((CollectionImpl)collection).getPermission(), collection.getCreated(), collection.getCreatedBy(), collection.getLastUpdated(), collection.getLastUpdatedBy());
            final PreparedStatement queryStmt = this.connection.prepareStatement("SELECT LF_ID FROM COL_LF_MAPPING WHERE COLLECTION_ID = ?");
            queryStmt.setLong(1, ((CollectionImpl)collection).getId());
            final ResultSet rs = queryStmt.executeQuery();
            final PreparedStatement insertStmt = this.connection.prepareStatement("INSERT INTO COL_LF_MAPPING ( COLLECTION_ID, LF_ID) VALUES(?,?)");
            while (rs.next()) {
                insertStmt.setLong(1, ((CollectionImpl)newCollection).getId());
                insertStmt.setLong(2, rs.getLong("LF_ID"));
                insertStmt.addBatch();
            }
            insertStmt.executeBatch();
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return newCollection;
    }
    
    @Override
    public Collection copyCollection(final String collectionName, final String newName) throws BuildException {
        if (collectionName == null) {
            throw new IllegalArgumentException("Source collection name is null.");
        }
        return this.copyCollection(this.getCollection(collectionName, true, Permissions.READ), newName);
    }
    
    @Override
    public Collection createCollection(final String name) throws BuildException {
        return this.createCollection(name, this.getDBBUser(), null, 436);
    }
    
    @Override
    public Collection createCollection(final String name, final String owner, final String team, final int permission) throws BuildException {
        if (!this.authorizedToCreate()) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "create", "collection"));
        }
        final java.sql.Date creationDate = new java.sql.Date(new Date().getTime());
        Collection collection = null;
        try {
            this.connection.setAutoCommit(false);
            collection = this.createCollection(name, owner, team, permission, creationDate, this.getDBBUser(), creationDate, this.getDBBUser());
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return collection;
    }
    
    private Collection createCollection(final String name, final String owner, final String team, final int permission, final Date created, final String createdBy, final Date lastUpdated, final String lastUpdatedBy) throws BuildException {
        if (this.collectionExists(name)) {
            throw new BuildException(Messages.getMessage("MetadataStore_COLLECTION_EXISTS", name));
        }
        long id = -1L;
        long permissionId = -1L;
        try {
            id = this.getNextId();
            permissionId = this.getNextId();
            this.createPermission(permissionId, owner, team, permission, id);
            final PreparedStatement stmt = this.connection.prepareStatement("INSERT INTO COLLECTION (C_ID, C_NAME, C_CREATED_BY, C_CREATED, C_LAST_UPDATED_BY, C_LAST_UPDATED, PERMISSIONS_C_ID) VALUES (?, ?, ?, ?, ?, ?, ?)");
            stmt.setLong(1, id);
            stmt.setString(2, name);
            stmt.setString(3, createdBy);
            stmt.setTimestamp(4, new Timestamp(created.getTime()));
            stmt.setString(5, lastUpdatedBy);
            stmt.setTimestamp(6, new Timestamp(lastUpdated.getTime()));
            stmt.setLong(7, permissionId);
            stmt.executeUpdate();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return new CollectionImpl(id, name, permissionId, created, createdBy, lastUpdated, lastUpdatedBy);
    }
    
    @Override
    public boolean buildResultExists(final String group, final String label) throws BuildException {
        return this.getBuildResult(group, label, false, Permissions.READ) != null;
    }
    
    private void createPermission(final long id, final String owner, final String team, final int permission, final long managedID) throws BuildException {
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("INSERT INTO PERMISSIONS (C_ID, P_MANAGED_ID, P_OWNER, P_PERMISSION, P_TEAM) VALUES (?, ?, ?, ?, ?)");
            stmt.setLong(1, id);
            stmt.setLong(2, managedID);
            stmt.setString(3, owner);
            stmt.setInt(4, permission);
            stmt.setString(5, team);
            stmt.executeUpdate();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
    }
    
    private long getNextId() throws BuildException {
        return this.getNextId(false);
    }
    
    private long getNextId(final boolean inTransaction) throws BuildException {
        long id = -1L;
        try {
            if (!inTransaction) {
                this.connection.setAutoCommit(false);
            }
            final Statement lockstmt = this.connection.createStatement();
            lockstmt.execute("lock table DBB_SEQ_TABLE in exclusive mode");
            final Statement stmt = this.connection.createStatement(1005, 1008);
            final ResultSet rs = stmt.executeQuery("select * FROM DBB_SEQ_TABLE s where s.DBB_SEQ_NAME = 'DBB_ID_SEQ'");
            if (!rs.next()) {
                throw new BuildException(Messages.getMessage("MetadataStore_NO_SEQ_TABLE", "DBB_SEQ_TABLE"));
            }
            id = rs.getLong("DBB_SEQ_VALUE") + 1L;
            rs.updateLong("DBB_SEQ_VALUE", id);
            rs.updateRow();
            rs.close();
            stmt.close();
            if (!inTransaction) {
                this.connection.commit();
            }
        }
        catch (SQLException e) {
            if (!inTransaction) {
                try {
                    this.connection.rollback();
                }
                catch (SQLException ex) {}
            }
            throw new BuildException(e);
        }
        finally {
            if (!inTransaction) {
                try {
                    this.connection.setAutoCommit(true);
                }
                catch (SQLException e2) {
                    throw new BuildException(e2);
                }
            }
        }
        return id;
    }
    
    @Override
    public boolean collectionExists(final String name) throws BuildException {
        return this.getCollection(name, false) != null;
    }
    
    @Override
    public BuildResult createBuildResult(final String group, final String label) throws BuildException {
        return this.createBuildResult(group, label, this.getDBBUser(), null, 436);
    }
    
    @Override
    public BuildResult createBuildResult(final String group, final String label, final String owner, final String team, final int permission) throws BuildException {
        if (!this.authorizedToCreate()) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "create", "build result"));
        }
        if (this.getBuildResult(group, label) != null) {
            throw new BuildException(Messages.getMessage("MetadataStore_BUILD_RESULT_EXISTS", group + ":" + label));
        }
        long id = -1L;
        long permissionId = -1L;
        final Date creationDate = new Date();
        final String user = this.getDBBUser();
        try {
            id = this.getNextId();
            permissionId = this.getNextId();
            this.connection.setAutoCommit(false);
            this.createPermission(permissionId, owner, team, permission, id);
            final PreparedStatement stmt = this.connection.prepareStatement("INSERT INTO BUILD_RESULT (C_ID, BR_GROUP, BR_LABEL, BR_STATUS, BR_STATE, C_CREATED_BY, C_CREATED, C_LAST_UPDATED_BY, C_LAST_UPDATED, PERMISSIONS_C_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setLong(1, id);
            stmt.setString(2, group);
            stmt.setString(3, label);
            stmt.setInt(4, 0);
            stmt.setInt(5, 0);
            stmt.setString(6, user);
            stmt.setTimestamp(7, new Timestamp(creationDate.getTime()));
            stmt.setString(8, user);
            stmt.setTimestamp(9, new Timestamp(creationDate.getTime()));
            stmt.setLong(10, permissionId);
            stmt.executeUpdate();
            stmt.close();
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        final BuildResult buildResult = new BuildResultImpl(id, group, label, 0, 0, permissionId, creationDate, user, creationDate, user);
        final BuildResultRecord buildResultRecord = new BuildResultRecord();
        buildResultRecord.setGroup(group);
        buildResultRecord.setLabel(label);
        buildResultRecord.setStoreType("db2");
        buildResultRecord.setUrl(this.url);
        BuildReportFactory.getBuildReport().addRecord(buildResultRecord);
        return buildResult;
    }
    
    public List<BuildResult> getBuildResults() throws BuildException {
        final Map<BuildResult.QueryParms, String> queryParms = new HashMap<BuildResult.QueryParms, String>();
        return this.getBuildResults(queryParms, true, Permissions.READ);
    }
    
    @Override
    public List<BuildResult> getBuildResults(final String group) throws BuildException {
        final Map<BuildResult.QueryParms, String> queryParms = new HashMap<BuildResult.QueryParms, String>();
        queryParms.put(BuildResult.QueryParms.GROUP, group);
        return this.getBuildResults(queryParms);
    }
    
    @Override
    public BuildResult getLastBuildResult(final String group, final int state, final int status) throws BuildException {
        final Map<BuildResult.QueryParms, String> queryParms = new HashMap<BuildResult.QueryParms, String>();
        queryParms.put(BuildResult.QueryParms.GROUP, group);
        queryParms.put(BuildResult.QueryParms.STATE, Integer.toString(state));
        queryParms.put(BuildResult.QueryParms.STATUS, Integer.toString(status));
        queryParms.put(BuildResult.QueryParms.ORDER_BY, "lastUpdated");
        queryParms.put(BuildResult.QueryParms.ORDER, "DESC");
        final List<BuildResult> results = this.getBuildResults(queryParms, true, Permissions.READ);
        if (results.size() > 0) {
            return results.get(0);
        }
        return null;
    }
    
    @Override
    public List<BuildResult> getBuildResults(final Map<BuildResult.QueryParms, String> queryParms) throws BuildException {
        return this.getBuildResults(queryParms, true, Permissions.READ);
    }
    
    private List<BuildResult> getBuildResults(final Map<BuildResult.QueryParms, String> queryParms, final boolean authCheck, final Permissions permission) throws BuildException {
        final String query = this.generateQueryString(queryParms);
        JDBCMetadataStore.logger.debug("getBuildResults query: " + query);
        final List<BuildResult> buildresults = new ArrayList<BuildResult>();
        try {
            final PreparedStatement stmt = this.prepareQueryStatement(query, queryParms);
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                final BuildResultImpl buildresult = this.newBuildResult(rs);
                if (!authCheck || this.authorized(permission, buildresult.getPermissionObj())) {
                    buildresults.add(buildresult);
                }
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return buildresults;
    }
    
    private String generateQueryString(final Map<BuildResult.QueryParms, String> queryParms) throws BuildException {
        final Map<String, String> froms = new LinkedHashMap<String, String>();
        froms.put("BUILD_RESULT", "br");
        froms.put("PERMISSIONS", "per");
        final Map<String, String> wheres = new LinkedHashMap<String, String>();
        wheres.put("br.PERMISSIONS_C_ID", "per.C_ID");
        String orderby = null;
        String order = null;
        for (final BuildResult.QueryParms key : queryParms.keySet()) {
            if (key == BuildResult.QueryParms.ORDER_BY) {
                final String value = queryParms.get(key);
                orderby = ((value == null) ? null : JDBCMetadataStore.br_field_map.get(value));
                if (orderby == null) {
                    throw new BuildException(Messages.getMessage("INVALID_ORDERBY", value));
                }
                continue;
            }
            else if (key == BuildResult.QueryParms.ORDER) {
                final String value = queryParms.get(key);
                order = ((value == null) ? null : JDBCMetadataStore.br_field_map.get(value));
                if (order == null) {
                    throw new BuildException(Messages.getMessage("INVALID_ORDER", value));
                }
                continue;
            }
            else {
                final String queryField = JDBCMetadataStore.br_query_map.get(key);
                if (queryField != null) {
                    if (queryField.startsWith("prop.") && !froms.containsKey("BUILD_RESULT_PROPERTY")) {
                        froms.put("BUILD_RESULT_PROPERTY", "prop");
                        froms.put("BR_PROP_MAPPING", "map");
                        wheres.put("map.BR_ID", "br.C_ID");
                        wheres.put("prop.C_ID", "map.PROP_ID");
                    }
                    wheres.put(queryField, "?");
                }
                else {
                    JDBCMetadataStore.logger.info("Unsupported query field, " + key + ", has been ignored.");
                }
            }
        }
        final StringBuffer buffer = new StringBuffer();
        buffer.append("Select distinct br.C_ID, br.BR_GROUP, br.BR_LABEL, br.BR_STATE, br.BR_STATUS, br.C_CREATED, br.C_LAST_UPDATED, br.C_CREATED_BY, br.C_LAST_UPDATED_BY, br.PERMISSIONS_C_ID ");
        final StringBuffer fromBuffer = new StringBuffer();
        for (final String from : froms.keySet()) {
            if (fromBuffer.length() > 0) {
                fromBuffer.append(", ");
            }
            fromBuffer.append(from + " " + froms.get(from));
        }
        buffer.append("from " + fromBuffer.toString() + " ");
        final StringBuffer whereBuffer = new StringBuffer();
        for (final String where : wheres.keySet()) {
            if (whereBuffer.length() > 0) {
                whereBuffer.append(" AND ");
            }
            whereBuffer.append(where + " = " + wheres.get(where));
        }
        buffer.append("where " + whereBuffer.toString());
        if (orderby != null) {
            buffer.append(" ORDER BY " + orderby);
        }
        if (order != null) {
            buffer.append(" " + order);
        }
        return buffer.toString();
    }
    
    private PreparedStatement prepareQueryStatement(final String query, final Map<BuildResult.QueryParms, String> queryParms) throws SQLException {
        final PreparedStatement stmt = this.connection.prepareStatement(query);
        int ndx = 1;
        for (final BuildResult.QueryParms key : queryParms.keySet()) {
            if (key != BuildResult.QueryParms.ORDER_BY && key != BuildResult.QueryParms.ORDER) {
                if (key == BuildResult.QueryParms.STATE || key == BuildResult.QueryParms.STATUS) {
                    stmt.setInt(ndx++, Integer.parseInt(queryParms.get(key)));
                }
                else {
                    stmt.setString(ndx++, queryParms.get(key));
                }
            }
        }
        return stmt;
    }
    
    private BuildResultImpl newBuildResult(final ResultSet rs) throws SQLException {
        final int id = rs.getInt("C_ID");
        final String group = rs.getString("BR_GROUP").trim();
        final String label = rs.getString("BR_LABEL").trim();
        final int state = rs.getInt("BR_STATE");
        final int status = rs.getInt("BR_STATUS");
        final Date created = new Date(rs.getTimestamp("C_CREATED").getTime());
        final Date updated = new Date(rs.getTimestamp("C_LAST_UPDATED").getTime());
        final String createdBy = rs.getString("C_CREATED_BY").trim();
        final String updatedBy = rs.getString("C_LAST_UPDATED_BY").trim();
        final long permissionId = rs.getLong("PERMISSIONS_C_ID");
        return new BuildResultImpl(id, group, label, state, status, permissionId, created, createdBy, updated, updatedBy);
    }
    
    @Override
    public List<Collection> getCollections() throws BuildException {
        final List<Collection> results = new ArrayList<Collection>();
        try {
            final Statement stmt = this.connection.createStatement();
            final ResultSet rs = stmt.executeQuery("Select * from COLLECTION JOIN PERMISSIONS on COLLECTION.PERMISSIONS_C_ID = PERMISSIONS.C_ID");
            while (rs.next()) {
                final CollectionImpl collection = this.newCollection(rs);
                if (this.authorized(Permissions.READ, collection.getPermissionObj())) {
                    results.add(collection);
                }
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return results;
    }
    
    @Override
    public Collection getCollection(final String name) throws BuildException {
        return this.getCollection(name, true, Permissions.READ);
    }
    
    public Collection getCollection(final String name, final boolean authCheck) throws BuildException {
        return this.getCollection(name, authCheck, Permissions.READ);
    }
    
    private Collection getCollection(final String name, final boolean authCheck, final Permissions permissions) throws BuildException {
        CollectionImpl collection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = this.connection.prepareStatement("Select * from COLLECTION where C_NAME = ?");
            stmt.setString(1, name);
            rs = stmt.executeQuery();
            if (rs.next()) {
                collection = this.newCollection(rs);
                if (authCheck) {
                    final boolean isAuthorized = this.authorized(permissions, collection.getPermissionObj());
                    collection = (isAuthorized ? collection : null);
                }
            }
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                }
                catch (SQLException ex) {}
            }
            if (stmt != null) {
                try {
                    stmt.close();
                }
                catch (SQLException ex2) {}
            }
        }
        return collection;
    }
    
    private CollectionImpl newCollection(final ResultSet rs) throws SQLException {
        final int id = rs.getInt("C_ID");
        final String name = rs.getString("C_NAME").trim();
        final Date created = new Date(rs.getTimestamp("C_CREATED").getTime());
        final Date updated = new Date(rs.getTimestamp("C_LAST_UPDATED").getTime());
        final String createdBy = rs.getString("C_CREATED_BY").trim();
        final String updatedBy = rs.getString("C_LAST_UPDATED_BY").trim();
        final long permissionId = rs.getLong("PERMISSIONS_C_ID");
        return new CollectionImpl(id, name, permissionId, created, createdBy, updated, updatedBy);
    }
    
    @Override
    public BuildResult getBuildResult(final String group, final String label) throws BuildException {
        return this.getBuildResult(group, label, true, Permissions.READ);
    }
    
    private BuildResult getBuildResult(final String group, final String label, final boolean authCheck, final Permissions permission) throws BuildException {
        final Map<BuildResult.QueryParms, String> queryParms = new HashMap<BuildResult.QueryParms, String>();
        queryParms.put(BuildResult.QueryParms.GROUP, group);
        queryParms.put(BuildResult.QueryParms.LABEL, label);
        final List<BuildResult> results = this.getBuildResults(queryParms, authCheck, permission);
        if (results.size() > 1) {
            JDBCMetadataStore.logger.info("More than one build result returned for group (" + group + ") and label(" + label + ")");
        }
        if (results.size() > 0) {
            return results.get(0);
        }
        return null;
    }
    
    @Override
    public List<String> listBuildResultGroups() throws BuildException {
        final List<String> results = new ArrayList<String>();
        try {
            final Statement stmt = this.connection.createStatement();
            final ResultSet rs = stmt.executeQuery("Select distinct BR_GROUP from BUILD_RESULT ASC");
            while (rs.next()) {
                final String group = rs.getString("BR_GROUP").trim();
                results.add(group);
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return results;
    }
    
    private boolean hasReadableBuildResults(final String group) throws BuildException {
        boolean isReadable = false;
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("Select PERMISSIONS_C_ID from BUILD_RESULT where BR_GROUP = ? order by BR_LABEL ASC");
            stmt.setString(1, group);
            ResultSet rs;
            for (rs = stmt.executeQuery(); rs.next() && !isReadable; isReadable |= this.isReadable(rs.getInt("PERMISSIONS_C_ID"))) {}
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return isReadable;
    }
    
    @Override
    public List<String> listBuildResultLabels(final String group) throws BuildException {
        final List<String> results = new ArrayList<String>();
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("Select distinct BR_LABEL, PERMISSIONS_C_ID from BUILD_RESULT where BR_GROUP = ? order by BR_LABEL ASC");
            stmt.setString(1, group);
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                if (this.isReadable(rs.getInt("PERMISSIONS_C_ID"))) {
                    results.add(rs.getString("BR_LABEL").trim());
                }
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return results;
    }
    
    @Override
    public void deleteBuildResults(final String group) throws BuildException {
        final List<BuildResult> buildResults = this.getBuildResults(group);
        for (final BuildResult br : buildResults) {
            this.deleteBuildResult(br);
        }
    }
    
    @Override
    public void deleteBuildResult(final BuildResult buildResult) throws BuildException {
        this.validateBuildResultParm(buildResult);
        if (!this.isWriteable(((BuildResultImpl)buildResult).getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "delete", "build result"));
        }
        try {
            this.connection.setAutoCommit(false);
            this.deleteProperties((BuildResultImpl)buildResult);
            this.deleteBuildReport((BuildResultImpl)buildResult);
            this.deleteBuildReportData((BuildResultImpl)buildResult);
            this.deleteAttachments((BuildResultImpl)buildResult);
            final PreparedStatement stmt = this.connection.prepareStatement("delete BUILD_RESULT br where br.C_ID = ?");
            stmt.setLong(1, ((BuildResultImpl)buildResult).getId());
            stmt.executeUpdate();
            stmt.close();
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
    }
    
    Date deleteBuildReport(final BuildResultImpl buildResult) throws BuildException {
        if (!this.isWriteable(buildResult.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "update", "build result report"));
        }
        final AttachmentImpl report = (AttachmentImpl)buildResult.getBuildReport();
        if (report == null) {
            return buildResult.getLastUpdated();
        }
        Date lastUpdated = new Date();
        try {
            this.connection.setAutoCommit(false);
            PreparedStatement stmt = this.connection.prepareStatement("delete BR_REPORT_MAPPING where BR_ID = ? and REP_ID = ?");
            stmt.setLong(1, buildResult.getId());
            stmt.setLong(2, report.getId());
            stmt.executeUpdate();
            stmt.close();
            this.deleteAttachmentContent(report);
            stmt = this.connection.prepareStatement("delete ARTIFACT where C_ID = ?");
            stmt.setLong(1, report.getId());
            stmt.executeUpdate();
            stmt.close();
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    Date deleteBuildReportData(final BuildResultImpl buildResult) throws BuildException {
        Date lastUpdated = new Date();
        if (!this.isWriteable(buildResult.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "update", "build result report data"));
        }
        final AttachmentImpl reportData = (AttachmentImpl)buildResult.getBuildReportData();
        if (reportData == null) {
            return lastUpdated;
        }
        try {
            this.connection.setAutoCommit(false);
            PreparedStatement stmt = this.connection.prepareStatement("delete BR_REPORT_DATA_MAPPING where BR_ID = ? and REP_D_ID = ?");
            stmt.setLong(1, buildResult.getId());
            stmt.setLong(2, reportData.getId());
            stmt.executeUpdate();
            stmt.close();
            this.deleteAttachmentContent(reportData);
            stmt = this.connection.prepareStatement("delete ARTIFACT where C_ID = ?");
            stmt.setLong(1, reportData.getId());
            stmt.executeUpdate();
            stmt.close();
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    private void deleteAttachments(final BuildResultImpl buildResult) throws BuildException {
        final List<Attachment> attachments = buildResult.getAttachments();
        for (final Attachment attachment : attachments) {
            this.deleteAttachment(buildResult, (AttachmentImpl)attachment);
        }
    }
    
    private void deleteAttachmentContent(final AttachmentImpl attachment) throws BuildException {
        long contentId = -1L;
        try {
            PreparedStatement stmt = this.connection.prepareStatement("SELECT CONTENT_ID FROM A_CONTENT_MAPPING where A_ID = ?");
            stmt.setLong(1, attachment.getId());
            final ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                contentId = rs.getLong("CONTENT_ID");
            }
            stmt.close();
            if (contentId != -1L) {
                stmt = this.connection.prepareStatement("delete A_CONTENT_MAPPING where A_ID = ?");
                stmt.setLong(1, attachment.getId());
                stmt.executeUpdate();
                stmt.close();
                stmt = this.connection.prepareStatement("delete ARTIFACT_CONTENT where C_ID = ?");
                stmt.setLong(1, contentId);
                stmt.executeUpdate();
                stmt.close();
            }
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
    }
    
    private Date deleteProperties(final BuildResultImpl buildResult) throws BuildException {
        Date lastUpdated = new Date();
        final List<Long> propertyIDs = this.getPropertyIDs(buildResult);
        for (final long propertyID : propertyIDs) {
            lastUpdated = this.deleteProperty(buildResult, propertyID);
        }
        return lastUpdated;
    }
    
    Date deleteProperty(final BuildResultImpl buildResult, final String key) throws BuildException {
        return this.deleteProperty(buildResult, key, null);
    }
    
    Date deleteProperty(final BuildResultImpl buildResult, final String key, final String value) throws BuildException {
        Date lastUpdated = new Date();
        if (!this.isWriteable(buildResult.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "delete", "build result property"));
        }
        try {
            this.connection.setAutoCommit(false);
            final PreparedStatement stmt = this.connection.prepareStatement("SELECT p.C_ID FROM BUILD_RESULT_PROPERTY p, BR_PROP_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND p.C_ID = map.PROP_ID AND p.PROPERTY_NAME = ?" + ((value == null) ? "" : " AND p.PROPERTY_VALUE = ?"));
            stmt.setLong(1, buildResult.getId());
            stmt.setString(2, key);
            if (value != null) {
                stmt.setString(3, value);
            }
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                this.deleteProperty(buildResult, rs.getLong("C_ID"));
            }
            rs.close();
            stmt.close();
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    private Date deleteProperty(final BuildResultImpl buildResult, final long propertyId) throws BuildException {
        Date lastUpdated = new Date();
        try {
            this.connection.setAutoCommit(false);
            PreparedStatement stmt = this.connection.prepareStatement("delete BR_PROP_MAPPING where BR_ID = ? and PROP_ID = ?");
            stmt.setLong(1, buildResult.getId());
            stmt.setLong(2, propertyId);
            stmt.executeUpdate();
            stmt.close();
            stmt = this.connection.prepareStatement("delete BUILD_RESULT_PROPERTY where C_ID = ?");
            stmt.setLong(1, propertyId);
            stmt.executeUpdate();
            stmt.close();
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    Date addProperty(final BuildResultImpl buildResult, final String key, final String value) throws BuildException {
        Date lastUpdated = new Date();
        if (!this.isWriteable(buildResult.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "add", "build result property"));
        }
        try {
            final long pId = this.getNextId();
            this.connection.setAutoCommit(false);
            PreparedStatement stmt = this.connection.prepareStatement("Insert into BUILD_RESULT_PROPERTY (C_ID, PROPERTY_NAME, PROPERTY_VALUE) values (?, ?, ?)");
            stmt.setLong(1, pId);
            stmt.setString(2, key);
            stmt.setString(3, value);
            stmt.executeUpdate();
            stmt.close();
            stmt = this.connection.prepareStatement("Insert into BR_PROP_MAPPING (BR_ID, PROP_ID) values (?, ?)");
            stmt.setLong(1, buildResult.getId());
            stmt.setLong(2, pId);
            stmt.executeUpdate();
            stmt.close();
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    void updateProperty(final BuildResultImpl buildResult, final String key, final String value) throws BuildException {
        if (!this.isWriteable(buildResult.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "update", "property"));
        }
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("SELECT p.C_ID FROM BUILD_RESULT_PROPERTY p, BR_PROP_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND p.C_ID = map.PROP_ID AND p.PROPERTY_NAME = ?");
            stmt.setLong(1, buildResult.getId());
            stmt.setString(2, key);
            final ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                this.updateProperty(rs.getLong("C_ID"), value);
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
    }
    
    private void updateProperty(final long propertyId, final String value) throws BuildException {
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("Update BUILD_RESULT_PROPERTY set PROPERTY_VALUE=? where C_ID=?");
            stmt.setString(1, value);
            stmt.setLong(2, propertyId);
            stmt.executeUpdate();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
    }
    
    Date addAttachment(final BuildResultImpl buildResult, final AttachmentImpl attachment) throws BuildException {
        Date lastUpdated = new Date();
        if (!this.isWriteable(buildResult.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "add", "build result attachment"));
        }
        try {
            final long aId = this.getNextId();
            final long cId = this.getNextId();
            this.connection.setAutoCommit(false);
            PreparedStatement stmt = this.connection.prepareStatement("Insert into ARTIFACT (C_ID, A_NAME, A_TYPE, A_CHECKSUM, A_SIZE) values (?,?,?,?,?)");
            stmt.setLong(1, aId);
            stmt.setString(2, attachment.getName());
            stmt.setString(3, attachment.getContentType());
            stmt.setLong(4, attachment.getChecksum());
            stmt.setLong(5, attachment.getSize());
            stmt.executeUpdate();
            stmt.close();
            stmt = this.connection.prepareStatement("Insert into BR_ATTACHMENT_MAPPING (BR_ID, ATTACHMENT_ID) values (?,?)");
            stmt.setLong(1, buildResult.getId());
            stmt.setLong(2, aId);
            stmt.executeUpdate();
            stmt.close();
            this.createContent(attachment, aId, cId);
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    private void createContent(final AttachmentImpl attachment, final long aId, final long cId) throws BuildException {
        if (attachment.getContents() == null) {
            return;
        }
        try {
            final byte[] data = Utils.compress(attachment.getContents());
            PreparedStatement stmt = this.connection.prepareStatement("Insert into ARTIFACT_CONTENT (C_ID, CONTENT_DATA) values (?,?)");
            stmt.setLong(1, cId);
            stmt.setBlob(2, new ByteArrayInputStream(data));
            stmt.executeUpdate();
            stmt.close();
            stmt = this.connection.prepareStatement("Insert into A_CONTENT_MAPPING (A_ID, CONTENT_ID) values (?,?)");
            stmt.setLong(1, aId);
            stmt.setLong(2, cId);
            stmt.executeUpdate();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
    }
    
    Date deleteAttachment(final BuildResultImpl buildResult, final AttachmentImpl attachment) throws BuildException {
        Date lastUpdated = new Date();
        if (!this.isWriteable(buildResult.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "delete", "build result attachment"));
        }
        try {
            this.connection.setAutoCommit(false);
            PreparedStatement stmt = this.connection.prepareStatement("delete BR_ATTACHMENT_MAPPING where BR_ID = ? AND ATTACHMENT_ID = ?");
            stmt.setLong(1, buildResult.getId());
            stmt.setLong(2, attachment.getId());
            stmt.executeUpdate();
            stmt.close();
            this.deleteAttachmentContent(attachment);
            stmt = this.connection.prepareStatement("delete ARTIFACT where C_ID = ?");
            stmt.setLong(1, attachment.getId());
            stmt.executeUpdate();
            stmt.close();
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    Attachment getBuildReport(final BuildResultImpl buildResult) throws BuildException {
        Attachment report = null;
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("SELECT DISTINCT a.C_ID, a.A_CHECKSUM, a.A_TYPE, a.A_NAME, a.A_SIZE FROM ARTIFACT a, BR_REPORT_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND a.C_ID = map.REP_ID");
            stmt.setLong(1, buildResult.getId());
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                final long id = rs.getLong("C_ID");
                final long checksum = rs.getLong("A_CHECKSUM");
                final String name = rs.getString("A_NAME").trim();
                final String type = rs.getString("A_TYPE").trim();
                final long size = rs.getLong("A_SIZE");
                report = new AttachmentImpl(id, name, type, size, checksum);
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return report;
    }
    
    Attachment getBuildReportData(final BuildResultImpl buildResult) throws BuildException {
        Attachment reportData = null;
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("SELECT DISTINCT a.C_ID, a.A_CHECKSUM, a.A_TYPE, a.A_NAME, a.A_SIZE FROM ARTIFACT a, BR_REPORT_DATA_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND a.C_ID = map.REP_D_ID");
            stmt.setLong(1, buildResult.getId());
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                final long id = rs.getLong("C_ID");
                final long checksum = rs.getLong("A_CHECKSUM");
                final String name = rs.getString("A_NAME").trim();
                final String type = rs.getString("A_TYPE").trim();
                final long size = rs.getLong("A_SIZE");
                reportData = new AttachmentImpl(id, name, type, size, checksum);
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return reportData;
    }
    
    Date setBuildState(final BuildResultImpl buildResult, final int state) throws BuildException {
        if (!this.isWriteable(buildResult.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "update", "state"));
        }
        Date lastUpdated = new Date();
        try {
            this.connection.setAutoCommit(false);
            final PreparedStatement stmt = this.connection.prepareStatement("Update BUILD_RESULT set BR_STATE=? where C_ID=?");
            stmt.setInt(1, state);
            stmt.setLong(2, buildResult.getId());
            stmt.executeUpdate();
            stmt.close();
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    Date setBuildStatus(final BuildResultImpl buildResult, final int status) throws BuildException {
        if (!this.isWriteable(buildResult.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "update", "status"));
        }
        Date lastUpdated = new Date();
        try {
            this.connection.setAutoCommit(false);
            final PreparedStatement stmt = this.connection.prepareStatement("Update BUILD_RESULT set BR_STATUS=? where C_ID=?");
            stmt.setInt(1, status);
            stmt.setLong(2, buildResult.getId());
            stmt.executeUpdate();
            stmt.close();
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    Date setBuildResultGroup(final BuildResultImpl buildResult, final String group) throws BuildException {
        if (!this.isWriteable(buildResult.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "update", "build result group"));
        }
        Date lastUpdated = new Date();
        try {
            this.connection.setAutoCommit(false);
            final PreparedStatement stmt = this.connection.prepareStatement("Update BUILD_RESULT set BR_GROUP=? where C_ID=?");
            stmt.setString(1, group);
            stmt.setLong(2, buildResult.getId());
            stmt.executeUpdate();
            stmt.close();
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    Date setBuildResultLabel(final BuildResultImpl buildResult, final String label) throws BuildException {
        if (!this.isWriteable(buildResult.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "update", "build result label"));
        }
        Date lastUpdated = new Date();
        try {
            this.connection.setAutoCommit(false);
            final PreparedStatement stmt = this.connection.prepareStatement("Update BUILD_RESULT set BR_LABEL=? where C_ID=?");
            stmt.setString(1, label);
            stmt.setLong(2, buildResult.getId());
            stmt.executeUpdate();
            stmt.close();
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    Date setCollectionName(final CollectionImpl collection, final String name) throws BuildException {
        if (!this.isWriteable(collection.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "update", "collection name"));
        }
        Date lastUpdated = new Date();
        try {
            this.connection.setAutoCommit(false);
            final PreparedStatement stmt = this.connection.prepareStatement("Update COLLECTION set C_NAME=? where C_ID=?");
            stmt.setString(1, name);
            stmt.setLong(2, collection.getId());
            stmt.executeUpdate();
            stmt.close();
            lastUpdated = this.updateLastUpdated(collection);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    Date setBuildReport(final BuildResultImpl buildResult, final AttachmentImpl buildReport) throws BuildException {
        if (!this.isWriteable(buildResult.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "update", "build report"));
        }
        Date lastUpdated = new Date();
        try {
            final long rId = this.getNextId();
            final long cId = this.getNextId();
            this.connection.setAutoCommit(false);
            PreparedStatement stmt = this.connection.prepareStatement("Insert into ARTIFACT (C_ID, A_NAME, A_TYPE, A_CHECKSUM, A_SIZE) values (?,?,?,?,?)");
            stmt.setLong(1, rId);
            stmt.setString(2, buildReport.getName());
            stmt.setString(3, buildReport.getContentType());
            stmt.setLong(4, buildReport.getChecksum());
            stmt.setLong(5, buildReport.getSize());
            stmt.executeUpdate();
            stmt.close();
            stmt = this.connection.prepareStatement("Insert into BR_REPORT_MAPPING (BR_ID, REP_ID) values (?,?)");
            stmt.setLong(1, buildResult.getId());
            stmt.setLong(2, rId);
            stmt.executeUpdate();
            stmt.close();
            this.createContent(buildReport, rId, cId);
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    Date setBuildReportData(final BuildResultImpl buildResult, final AttachmentImpl buildReportData) throws BuildException {
        if (!this.isWriteable(buildResult.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "update", "build report data"));
        }
        Date lastUpdated = new Date();
        try {
            final long rId = this.getNextId();
            final long cId = this.getNextId();
            this.connection.setAutoCommit(false);
            PreparedStatement stmt = this.connection.prepareStatement("Insert into ARTIFACT (C_ID, A_NAME, A_TYPE, A_CHECKSUM, A_SIZE) values (?,?,?,?,?)");
            stmt.setLong(1, rId);
            stmt.setString(2, buildReportData.getName());
            stmt.setString(3, buildReportData.getContentType());
            stmt.setLong(4, buildReportData.getChecksum());
            stmt.setLong(5, buildReportData.getSize());
            stmt.executeUpdate();
            stmt.close();
            stmt = this.connection.prepareStatement("Insert into BR_REPORT_DATA_MAPPING (BR_ID, REP_D_ID) values (?,?)");
            stmt.setLong(1, buildResult.getId());
            stmt.setLong(2, rId);
            stmt.executeUpdate();
            stmt.close();
            this.createContent(buildReportData, rId, cId);
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    List<Attachment> getAttachments(final BuildResultImpl buildResult) throws BuildException {
        final List<Attachment> attachments = new ArrayList<Attachment>();
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("SELECT DISTINCT a.C_ID, a.A_CHECKSUM, a.A_TYPE, a.A_NAME, a.A_SIZE FROM ARTIFACT a, BR_ATTACHMENT_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND a.C_ID = map.ATTACHMENT_ID");
            stmt.setLong(1, buildResult.getId());
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                final long id = rs.getLong("C_ID");
                final long checksum = rs.getLong("A_CHECKSUM");
                final String name = rs.getString("A_NAME").trim();
                final String type = rs.getString("A_TYPE").trim();
                final long size = rs.getLong("A_SIZE");
                attachments.add(new AttachmentImpl(id, name, type, size, checksum));
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return attachments;
    }
    
    byte[] getAttachmentContent(final AttachmentImpl attachment) throws BuildException {
        byte[] contents = null;
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("SELECT c.C_ID, c.CONTENT_DATA FROM ARTIFACT a, A_CONTENT_MAPPING map, ARTIFACT_CONTENT c WHERE a.C_ID = ? AND map.A_ID = a.C_ID AND c.C_ID = map.CONTENT_ID");
            stmt.setLong(1, attachment.getId());
            final ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                JDBCMetadataStore.logger.debug("Reading attachment, id=" + attachment.getId() + ", content, id=" + rs.getLong("C_ID"));
                final Blob blob = rs.getBlob("CONTENT_DATA");
                if (blob != null) {
                    contents = blob.getBytes(1L, (int)blob.length());
                    contents = Utils.decompress(contents);
                }
            }
            else {
                JDBCMetadataStore.logger.debug("No content found for attachment, name=" + attachment.getName() + ", id=" + attachment.getId());
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return contents;
    }
    
    PermissionImpl getPermission(final long managedId) throws BuildException {
        PermissionImpl permissionObj = null;
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("Select * from PERMISSIONS where C_ID = ?");
            stmt.setLong(1, managedId);
            final ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                final int id = rs.getInt("C_ID");
                String owner = rs.getString("P_OWNER");
                owner = ((owner != null) ? owner.trim() : owner);
                String team = rs.getString("P_TEAM");
                team = ((team != null) ? team.trim() : team);
                final int permission = rs.getInt("P_PERMISSION");
                permissionObj = new PermissionImpl(id, owner, team, permission);
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return permissionObj;
    }
    
    Date updatePermission(final CollectionImpl collection) throws BuildException {
        Date lastUpdated = new Date();
        try {
            this.connection.setAutoCommit(false);
            this.updatePermission(collection.getPermissionObj());
            lastUpdated = this.updateLastUpdated(collection);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    Date updatePermission(final BuildResultImpl buildResult) throws BuildException {
        Date lastUpdated = new Date();
        try {
            this.connection.setAutoCommit(false);
            this.updatePermission(buildResult.getPermissionObj());
            lastUpdated = this.updateLastUpdated(buildResult);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        return lastUpdated;
    }
    
    private void updatePermission(final PermissionImpl permission) throws BuildException {
        if (!this.isWriteable(permission.getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "update", "permission"));
        }
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("Update PERMISSIONS set P_OWNER=?, P_TEAM=?, P_PERMISSION=? where C_ID = ?");
            stmt.setString(1, permission.getOwner());
            stmt.setString(2, permission.getTeam());
            stmt.setInt(3, permission.getPermission());
            stmt.setLong(4, permission.getId());
            stmt.executeUpdate();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
    }
    
    Map<String, Set<String>> getProperties(final BuildResultImpl buildResult) throws BuildException {
        final Map<String, Set<String>> properties = new HashMap<String, Set<String>>();
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("SELECT DISTINCT p.PROPERTY_NAME, p.PROPERTY_VALUE FROM BUILD_RESULT_PROPERTY p, BR_PROP_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND p.C_ID = map.PROP_ID");
            stmt.setLong(1, buildResult.getId());
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                final String name = rs.getString("PROPERTY_NAME").trim();
                final String value = rs.getString("PROPERTY_VALUE").trim();
                if (name != null) {
                    Set<String> values = properties.get(name);
                    if (values == null) {
                        values = new HashSet<String>();
                        properties.put(name, values);
                    }
                    values.add(value);
                }
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return properties;
    }
    
    private List<Long> getPropertyIDs(final BuildResultImpl buildResult) throws BuildException {
        final List<Long> ids = new ArrayList<Long>();
        try {
            final PreparedStatement stmt = this.connection.prepareStatement("SELECT DISTINCT p.C_ID FROM BUILD_RESULT_PROPERTY p, BR_PROP_MAPPING map, BUILD_RESULT br WHERE br.C_ID = ? AND map.BR_ID = br.C_ID AND p.C_ID = map.PROP_ID");
            stmt.setLong(1, buildResult.getId());
            final ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ids.add(rs.getLong("C_ID"));
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return ids;
    }
    
    LogicalFileImpl addLogicalFile(final CollectionImpl collection, final LogicalFile logicalFile) throws BuildException {
        Date lastUpdated = new Date();
        if (!this.isWriteable(collection.getPermissionObj().getId())) {
            throw new BuildException(Messages.getMessage("MetadataStore_NOT_AUTHORIZED", "add", "collection logical file"));
        }
        LogicalFileImpl lf = null;
        try {
            this.connection.setAutoCommit(false);
            final Statement lockstmt = this.connection.createStatement();
            lockstmt.execute("lock table LOGICAL_FILE in exclusive mode");
            lf = this.findOrCreateLogicalFile(logicalFile);
            final PreparedStatement pStmt = this.connection.prepareStatement("Insert into COL_LF_MAPPING (COLLECTION_ID, LF_ID) values (?,?)");
            pStmt.setLong(1, collection.getId());
            pStmt.setLong(2, lf.getId());
            pStmt.executeUpdate();
            pStmt.close();
            lastUpdated = this.updateLastUpdated(collection);
            this.connection.commit();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        finally {
            try {
                this.connection.setAutoCommit(true);
            }
            catch (SQLException e2) {
                throw new BuildException(e2);
            }
        }
        collection.setLastUpdated(lastUpdated);
        return lf;
    }
    
    private Date updateLastUpdated(final CollectionImpl collection) throws BuildException {
        Date lastUpdated = null;
        try {
            final PreparedStatement pStmt = this.connection.prepareStatement("select * FROM COLLECTION c where c.C_ID = ?", 1005, 1008);
            pStmt.setLong(1, collection.getId());
            final ResultSet rs = pStmt.executeQuery();
            if (!rs.next()) {
                throw new BuildException(Messages.getMessage("MetadataStore_COLLECTION_DNE", collection.getName()));
            }
            lastUpdated = new Date();
            rs.updateTimestamp("C_LAST_UPDATED", new Timestamp(lastUpdated.getTime()));
            rs.updateString("C_LAST_UPDATED_BY", this.getDBBUser());
            rs.updateRow();
            rs.close();
            pStmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return lastUpdated;
    }
    
    private Date updateLastUpdated(final BuildResultImpl buildResult) throws BuildException {
        Date lastUpdated = null;
        try {
            final PreparedStatement pStmt = this.connection.prepareStatement("select * FROM BUILD_RESULT where C_ID = ?", 1005, 1008);
            pStmt.setLong(1, buildResult.getId());
            final ResultSet rs = pStmt.executeQuery();
            if (!rs.next()) {
                throw new BuildException(Messages.getMessage("MetadataStore_BUILD_RESULT_DNE", buildResult.getLabel(), buildResult.getGroup()));
            }
            lastUpdated = new Date();
            rs.updateTimestamp("C_LAST_UPDATED", new Timestamp(lastUpdated.getTime()));
            rs.updateString("C_LAST_UPDATED_BY", this.getDBBUser());
            rs.updateRow();
            rs.close();
            pStmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return lastUpdated;
    }
    
    private LogicalFileImpl findOrCreateLogicalFile(final LogicalFile logicalFile) throws BuildException {
        LogicalFileImpl lf = this.findLogicalFile(logicalFile);
        if (lf == null) {
            lf = this.createLogicalFile(logicalFile);
        }
        return lf;
    }
    
    private LogicalFileImpl findLogicalFile(final LogicalFile logicalFile) throws BuildException {
        LogicalFileImpl lf = null;
        try {
            final PreparedStatement pstmt = this.connection.prepareStatement("SELECT * from LOGICAL_FILE lf, LF_LANGUAGES lang where lf.LF_FILE = ? AND lang.C_ID = lf.LANG_ID ");
            pstmt.setString(1, logicalFile.getFile());
            final ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                final LogicalFileImpl existingLF = this.newLogicalFile(rs);
                if (existingLF.equals(logicalFile)) {
                    lf = existingLF;
                    break;
                }
            }
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return lf;
    }
    
    private LogicalFileImpl createLogicalFile(final LogicalFile logicalFile) throws BuildException {
        LogicalFileImpl lf = null;
        try {
            final long langId = this.findOrCreateLanguage(logicalFile.getLanguage());
            final long lfId = this.getNextId(true);
            final PreparedStatement pstmt = this.connection.prepareStatement("Insert into LOGICAL_FILE ( C_ID, LF_FILE, LF_LNAME, LANG_ID, LF_CICS, LF_SQL, LF_DLI, LF_MQ) values(?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setLong(1, lfId);
            pstmt.setString(2, logicalFile.getFile());
            pstmt.setString(3, logicalFile.getLname());
            pstmt.setLong(4, langId);
            pstmt.setString(5, this.getFlag(logicalFile.isCICS()));
            pstmt.setString(6, this.getFlag(logicalFile.isSQL()));
            pstmt.setString(7, this.getFlag(logicalFile.isDLI()));
            pstmt.setString(8, this.getFlag(logicalFile.isMQ()));
            pstmt.executeUpdate();
            pstmt.close();
            lf = new LogicalFileImpl(lfId, logicalFile.getLname(), logicalFile.getFile(), logicalFile.getLanguage(), logicalFile.isCICS(), logicalFile.isSQL(), logicalFile.isDLI(), logicalFile.isMQ());
            final PreparedStatement mapping = this.connection.prepareStatement("Insert into LF_DEP_MAPPING ( LF_ID, DEP_ID ) values (?, ?)");
            for (final LogicalDependency ld : logicalFile.getLogicalDependencies()) {
                final LogicalDependencyImpl newld = this.findOrCreateLogicalDependency(ld);
                mapping.setLong(1, lfId);
                mapping.setLong(2, newld.getId());
                mapping.executeUpdate();
                lf.addLogicalDependency(newld);
            }
            mapping.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return lf;
    }
    
    private String getFlag(final boolean flag) {
        return flag ? "Y" : "N";
    }
    
    private boolean getFlag(final String flag) {
        return flag != null && flag.contentEquals("Y");
    }
    
    private long findOrCreateLanguage(final String language) throws BuildException {
        long langId = 0L;
        try {
            final PreparedStatement pStmt = this.connection.prepareStatement("Select * from LF_LANGUAGES where C_LANGUAGE = ?");
            pStmt.setString(1, language);
            final ResultSet rs = pStmt.executeQuery();
            if (rs.next()) {
                langId = rs.getLong("C_ID");
            }
            else {
                langId = this.getNextId(true);
                final PreparedStatement pStmt2 = this.connection.prepareStatement("Insert into LF_LANGUAGES (C_ID, C_LANGUAGE) values (?,?)");
                pStmt2.setLong(1, langId);
                pStmt2.setString(2, language);
                pStmt2.executeUpdate();
                pStmt2.close();
            }
            pStmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return langId;
    }
    
    private long findOrCreateCategory(final String catagory) throws BuildException {
        long catId = 0L;
        try {
            final PreparedStatement pStmt = this.connection.prepareStatement("Select * from LD_CATEGORIES where C_CATEGORY = ?");
            pStmt.setString(1, catagory);
            final ResultSet rs = pStmt.executeQuery();
            if (rs.next()) {
                catId = rs.getLong("C_ID");
            }
            else {
                catId = this.getNextId(true);
                final PreparedStatement pStmt2 = this.connection.prepareStatement("Insert into LD_CATEGORIES (C_ID, C_CATEGORY) values (?,?)");
                pStmt2.setLong(1, catId);
                pStmt2.setString(2, catagory);
                pStmt2.executeUpdate();
                pStmt2.close();
            }
            pStmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return catId;
    }
    
    private long findOrCreateLibrary(final String library) throws BuildException {
        long libId = 0L;
        try {
            final PreparedStatement pStmt = this.connection.prepareStatement("Select * from LD_LIBRARIES where C_LIBRARY = ?");
            pStmt.setString(1, library);
            final ResultSet rs = pStmt.executeQuery();
            if (rs.next()) {
                libId = rs.getLong("C_ID");
            }
            else {
                libId = this.getNextId(true);
                final PreparedStatement pStmt2 = this.connection.prepareStatement("Insert into LD_LIBRARIES (C_ID, C_LIBRARY) values (?,?)");
                pStmt2.setLong(1, libId);
                pStmt2.setString(2, library);
                pStmt2.executeUpdate();
                pStmt2.close();
            }
            pStmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return libId;
    }
    
    private LogicalDependencyImpl findOrCreateLogicalDependency(final LogicalDependency logicalDependency) throws BuildException {
        LogicalDependencyImpl ld = this.findLogicalDependency(logicalDependency);
        if (ld == null) {
            ld = this.createLogicalDependency(logicalDependency);
        }
        return ld;
    }
    
    private LogicalDependencyImpl findLogicalDependency(final LogicalDependency logicalDependency) throws BuildException {
        LogicalDependencyImpl ld = null;
        try {
            final PreparedStatement pstmt = this.connection.prepareStatement("SELECT * from LOGICAL_DEPENDENCY ld, LD_CATEGORIES cat, LD_LIBRARIES lib where ld.C_LNAME = ? AND ld.CATEGORY_ID = cat.C_ID AND cat.C_CATEGORY = ? AND ld.LIBRARY_ID = lib.C_ID AND lib.C_LIBRARY = ?");
            pstmt.setString(1, logicalDependency.getLname());
            pstmt.setString(2, logicalDependency.getCategory());
            pstmt.setString(3, logicalDependency.getLibrary());
            final ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                ld = this.newLogicalDependency(rs);
            }
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return ld;
    }
    
    private LogicalDependencyImpl createLogicalDependency(final LogicalDependency logicalDependency) throws BuildException {
        LogicalDependencyImpl ld = null;
        try {
            final long catId = this.findOrCreateCategory(logicalDependency.getCategory());
            final long libId = this.findOrCreateLibrary(logicalDependency.getLibrary());
            final long ldId = this.getNextId(true);
            final PreparedStatement pstmt = this.connection.prepareStatement("Insert into LOGICAL_DEPENDENCY ( C_ID, C_LNAME, CATEGORY_ID, LIBRARY_ID) values(?, ?, ?, ?)");
            pstmt.setLong(1, ldId);
            pstmt.setString(2, logicalDependency.getLname());
            pstmt.setLong(3, catId);
            pstmt.setLong(4, libId);
            pstmt.executeUpdate();
            pstmt.close();
            ld = new LogicalDependencyImpl(ldId, logicalDependency.getLname(), logicalDependency.getLibrary(), logicalDependency.getCategory());
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return ld;
    }
    
    private List<LogicalDependency> getLogicalDependencies(final LogicalFile logicalFile) throws SQLException {
        final List<LogicalDependency> logicalDependencies = new ArrayList<LogicalDependency>();
        final PreparedStatement stmt = this.connection.prepareStatement("SELECT DISTINCT ld.C_ID, ld.C_LNAME, cat.C_CATEGORY, lib.C_LIBRARY FROM LOGICAL_DEPENDENCY ld, LF_DEP_MAPPING map, LOGICAL_FILE lf, LD_CATEGORIES cat, LD_LIBRARIES lib WHERE lf.C_ID = ? AND lf.C_ID = map.LF_ID AND ld.C_ID = map.DEP_ID AND cat.C_ID = ld.CATEGORY_ID AND lib.C_ID = ld.LIBRARY_ID");
        stmt.setLong(1, ((LogicalFileImpl)logicalFile).getId());
        final ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            logicalDependencies.add(this.newLogicalDependency(rs));
        }
        rs.close();
        stmt.close();
        return logicalDependencies;
    }
    
    private boolean authorized(final int requested, final int permission) {
        return (requested & permission) == requested;
    }
    
    private boolean authorized(final Permissions requestedPermissions, final PermissionImpl permissions) throws BuildException {
        boolean authorized = false;
        if (this.isDBBADMNS) {
            authorized = true;
        }
        else if (this.isDBBUSERS) {
            if (permissions.getOwner().equalsIgnoreCase(this.getDBBUser())) {
                authorized |= this.authorized(requestedPermissions.getPermission() << 6, permissions.getPermission());
            }
            if (this.memberOfTeam(permissions.getTeam())) {
                authorized |= this.authorized(requestedPermissions.getPermission() << 3, permissions.getPermission());
            }
            authorized |= this.authorized(requestedPermissions.getPermission(), permissions.getPermission());
        }
        else if (this.isDBBGUEST) {
            authorized |= this.authorized(requestedPermissions.getPermission(), permissions.getPermission() & Permissions.READ.getPermission());
        }
        return authorized;
    }
    
    private boolean isWriteable(final long permission_id) throws BuildException {
        return this.authorized(Permissions.WRITE, this.getPermission(permission_id));
    }
    
    private boolean isReadable(final long permission_id) throws BuildException {
        return this.authorized(Permissions.READ, this.getPermission(permission_id));
    }
    
    private boolean authorizedToCreate() {
        return this.isDBBADMNS || this.isDBBUSERS;
    }
    
    protected boolean memberOfTeam(final String team) {
        final boolean isMember = team != null && !team.isEmpty() && PlatformUser.isUserInGroup(this.getDBBUser(), team);
        JDBCMetadataStore.logger.debug(this.getDBBUser() + " is a member of " + team + "? " + isMember);
        return isMember;
    }
    
    private String decryptPassword(final String encryptedPassword) {
        final PasswordUtil passwordUtil = new PasswordUtil();
        return String.valueOf(passwordUtil.decryptString(encryptedPassword));
    }
    
    protected void setRoles() throws BuildException {
        this.isDBBADMNS = this.memberOfTeam("DBBADMNS");
        this.isDBBUSERS = this.memberOfTeam("DBBUSERS");
        this.isDBBGUEST = this.memberOfTeam("DBBGUEST");
        if (!this.isDBBADMNS && !this.isDBBUSERS && !this.isDBBGUEST) {
            throw new BuildException(Messages.getMessage("MetadataStore_NO_DBB_ROLES", this.getDBBUser()));
        }
    }
    
    private String getDBBUser() {
        if (this.DBBUser == null) {
            this.DBBUser = this.getSystemUser();
        }
        return this.DBBUser;
    }
    
    protected String getSystemUser() {
        return PlatformThread.getUserName();
    }
    
    private void validateTableVersions() throws BuildException {
        for (final String key : JDBCMetadataStore.TABLE_VERSIONS.keySet()) {
            final int reqVersion = JDBCMetadataStore.TABLE_VERSIONS.get(key);
            final int actVersion = this.getTableVersion(key);
            if (actVersion == -1) {
                throw new BuildException(Messages.getMessage("MetadataStore_TABLE_VERSION_DNE", key));
            }
            if (actVersion != reqVersion) {
                throw new BuildException(Messages.getMessage("MetadataStore_TABLE_MIGRATION_NEEDED", key, actVersion, reqVersion));
            }
        }
    }
    
    private int getTableVersion(final String tableName) throws BuildException {
        int version = -1;
        try {
            final PreparedStatement pstmt = this.connection.prepareStatement("SELECT DBB_TBL_VERSION FROM DBB_TABLE_VERSIONS WHERE DBB_TBL_NAME = ?");
            pstmt.setString(1, tableName);
            final ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                version = rs.getInt("DBB_TBL_VERSION");
            }
            rs.close();
            pstmt.close();
        }
        catch (SQLException e) {
            throw new BuildException(e);
        }
        return version;
    }
    
    static {
        JDBCMetadataStore.logger = LoggerFactory.getLogger((Class)JDBCMetadataStore.class);
        br_query_map = new HashMap<BuildResult.QueryParms, String>();
        br_field_map = new HashMap<String, String>();
        JDBCMetadataStore.br_query_map.put(BuildResult.QueryParms.GROUP, "br.BR_GROUP");
        JDBCMetadataStore.br_query_map.put(BuildResult.QueryParms.LABEL, "br.BR_LABEL");
        JDBCMetadataStore.br_query_map.put(BuildResult.QueryParms.PROPERTY, "prop.PROPERTY_NAME");
        JDBCMetadataStore.br_query_map.put(BuildResult.QueryParms.VALUE, "prop.PROPERTY_VALUE");
        JDBCMetadataStore.br_query_map.put(BuildResult.QueryParms.STATE, "br.BR_STATE");
        JDBCMetadataStore.br_query_map.put(BuildResult.QueryParms.STATUS, "br.BR_STATUS");
        JDBCMetadataStore.br_query_map.put(BuildResult.QueryParms.ORDER_BY, "orderBy");
        JDBCMetadataStore.br_query_map.put(BuildResult.QueryParms.ORDER, "order");
        JDBCMetadataStore.br_field_map.put("group", "br.BR_GROUP");
        JDBCMetadataStore.br_field_map.put("label", "br.BR_LABEL");
        JDBCMetadataStore.br_field_map.put("created", "br.C_CREATED");
        JDBCMetadataStore.br_field_map.put("createdBy", "br.C_CREATED_BY");
        JDBCMetadataStore.br_field_map.put("status", "br.BR_STATUS");
        JDBCMetadataStore.br_field_map.put("state", "br.BR_STATE");
        JDBCMetadataStore.br_field_map.put("lastUpdated", "br.C_LAST_UPDATED");
        JDBCMetadataStore.br_field_map.put("lastUpdatedBy", "br.C_LAST_UPDATED_BY");
        JDBCMetadataStore.br_field_map.put("ASC", "ASC");
        JDBCMetadataStore.br_field_map.put("DESC", "DESC");
        (TABLE_VERSIONS = new HashMap<String, Integer>()).put("ARTIFACT", 2);
        JDBCMetadataStore.TABLE_VERSIONS.put("BUILD_RESULT", 2);
        JDBCMetadataStore.TABLE_VERSIONS.put("COLLECTION", 2);
        JDBCMetadataStore.TABLE_VERSIONS.put("LOGICAL_FILE", 2);
        JDBCMetadataStore.TABLE_VERSIONS.put("LOGICAL_DEPENDENCY", 1);
        JDBCMetadataStore.TABLE_VERSIONS.put("PERMISSIONS", 2);
    }
}
