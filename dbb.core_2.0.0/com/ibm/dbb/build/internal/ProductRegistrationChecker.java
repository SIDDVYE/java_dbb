// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import org.slf4j.LoggerFactory;
import com.ibm.dbb.build.internal.jni.Executable;
import java.util.Iterator;
import com.ibm.dbb.build.BuildException;
import java.util.List;
import java.util.ArrayList;
import org.slf4j.Logger;

public class ProductRegistrationChecker
{
    private static ProductInformation _productInformation;
    private static Logger logger;
    private static final int IFAEDSTA_SUCCESS = 0;
    private static final int IFAEDSTA_NOTDEFINED = 4;
    private static final int IFAEDSTA_NOTAVAILABLE = 8;
    private static final int IFAEDREG_SUCCESS = 0;
    private static final int IFAEDREG_DISABLED = 4;
    private static final int IFAEDREG_NOTAVAILABLE = 8;
    private static final int IFAEDREG_LIMITEXCEEDED = 12;
    
    public static void staticReset() {
        ProductRegistrationChecker._productInformation = null;
    }
    
    public static ProductInformation getProductInformation() {
        return ProductRegistrationChecker._productInformation;
    }
    
    public static boolean check() throws BuildException {
        ProductRegistrationChecker.logger.debug("Checking product registration");
        if (ProductRegistrationChecker._productInformation != null) {
            ProductRegistrationChecker.logger.debug("Registration product = " + ProductRegistrationChecker._productInformation);
            return true;
        }
        final ArrayList<ProductInformation> products = new ArrayList<ProductInformation>();
        products.add(new ProductInformation("IBM APP DLIV FND", "DBB", "5755-A01"));
        products.add(new ProductInformation("IBM IDz EE", "DBB", "5755-A05"));
        products.add(new ProductInformation("IBM Wazi Code", "DBB", "5900-A8N"));
        products.add(new ProductInformation("GitLab Ultimate", "DBB", "5737-N86"));
        products.add(new ProductInformation("IBM DBB", "DBB", "5737-K80"));
        boolean registered = false;
        try {
            registered = new Boolean(check(products));
        }
        catch (BuildException be) {
            if (!ProductTrial.isValid()) {
                throw be;
            }
            ProductRegistrationChecker._productInformation = new ProductInformation("IBM Z Open Dev Trial", "DBB", "5737-I22");
        }
        ProductRegistrationChecker.logger.debug("Registered for product = " + ProductRegistrationChecker._productInformation);
        return registered;
    }
    
    public static boolean check(final String productName, final String featureName, final String productId) throws BuildException {
        ProductRegistrationChecker.logger.debug("Checking product registration");
        final ArrayList<ProductInformation> products = new ArrayList<ProductInformation>();
        products.add(new ProductInformation(productName, featureName, productId));
        final boolean r = check(products);
        ProductRegistrationChecker.logger.debug("Registration flag = " + r);
        return r;
    }
    
    private static boolean check(final List<ProductInformation> productList) throws BuildException {
        final Iterator<ProductInformation> products = productList.iterator();
        ProductInformation product = null;
        ProductRegistrationResult registrationResult = null;
        while (products.hasNext()) {
            product = products.next();
            ProductRegistrationChecker.logger.debug("Checking product status for : " + product);
            final byte[] result = getProductStatus(product.getProductName(), product.getFeatureName(), product.getProductVendor(), product.getProductId());
            final int returnCode = result[3] & 0xFF;
            final int flag = result[4] & 0xFF;
            ProductRegistrationChecker.logger.debug("result = " + result + " returnCode = " + returnCode + " flag = " + flag);
            if (returnCode != 0 && returnCode != 4 && returnCode != 8) {
                final String msg = "Query_Status service has some fatal error, return code=" + returnCode;
                ProductRegistrationChecker.logger.debug("Product Registration: " + msg);
                throw new BuildException(msg);
            }
            if (returnCode != 0 || (0x40 & flag) != 0x0) {
                continue;
            }
            final boolean alreadyRegistered = (flag & 0xA0) == 0xA0;
            if (alreadyRegistered) {
                ProductRegistrationChecker._productInformation = product;
                return true;
            }
            registrationResult = registerProduct(product);
            if (registrationResult.getRc() == 0) {
                ProductRegistrationChecker._productInformation = product;
                return true;
            }
            if (!products.hasNext()) {
                throw new BuildException(registrationResult.getMsg());
            }
        }
        return false;
    }
    
    public static ProductRegistrationResult registerProduct(final ProductInformation pi) throws BuildException {
        ProductRegistrationChecker.logger.debug("Product Registration: Start registering the product id, " + pi.getProductId());
        int returnCode = 0;
        final byte[] token = new byte[8];
        String msg = "";
        ProductRegistrationResult registrationResult = null;
        final Executable executable = new Executable();
        final byte[] result = executable.registerProduct(pi.getProductName(), pi.getFeatureName(), pi.getVersion(), pi.getRelease(), pi.getModification(), pi.getProductVendor(), pi.getProductId(), pi.getProductMeta());
        returnCode = (result[3] & 0xFF);
        switch (returnCode) {
            case 0: {
                ProductRegistrationChecker.logger.debug("Product registration was completed with NAME=" + pi.getProductName() + " FEATURE=" + pi.getFeatureName() + " VERSION=" + pi.getVersion() + "." + pi.getRelease() + "." + pi.getModification() + " ID=" + pi.getProductId());
                break;
            }
            case 4: {
                msg = "Product registration service disabled. NAME= " + pi.getProductName() + " FEATURE= " + pi.getFeatureName();
                ProductRegistrationChecker.logger.debug(msg);
                break;
            }
            case 8: {
                msg = "Product registration service not available. NAME= " + pi.getProductName() + " FEATURE= " + pi.getFeatureName();
                ProductRegistrationChecker.logger.debug(msg);
                break;
            }
            case 12: {
                msg = "Product registration service limit exceeded. NAME= " + pi.getProductName() + " FEATURE= " + pi.getFeatureName();
                ProductRegistrationChecker.logger.debug(msg);
                break;
            }
            default: {
                msg = "Product registration denied. NAME= " + pi.getProductName() + " FEATURE= " + pi.getFeatureName() + " return code=" + returnCode;
                ProductRegistrationChecker.logger.debug(msg);
                break;
            }
        }
        for (int i = 0; i < 8; ++i) {
            token[i] = result[i + 4];
        }
        registrationResult = new ProductRegistrationResult(pi, returnCode, msg, token);
        return registrationResult;
    }
    
    public static byte[] getProductStatus(final String productName, final String featureName, final String vendor, final String productId) {
        final Executable executable = new Executable();
        return executable.getProductStatus(productName, featureName, vendor, productId);
    }
    
    public static byte[] deregisterProduct(final byte[] token) {
        final Executable executable = new Executable();
        return executable.deregisterProduct(token);
    }
    
    public static byte[] deregisterProduct(final String token) {
        final Executable executable = new Executable();
        return executable.deregisterProduct(token);
    }
    
    static {
        ProductRegistrationChecker._productInformation = null;
        ProductRegistrationChecker.logger = LoggerFactory.getLogger((Class)ProductRegistrationChecker.class);
    }
}
