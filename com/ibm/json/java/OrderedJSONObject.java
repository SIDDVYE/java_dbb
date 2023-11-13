// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.json.java;

import java.util.Iterator;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.StringReader;
import java.io.IOException;
import com.ibm.json.java.internal.Parser;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;

public class OrderedJSONObject extends JSONObject
{
    private static final long serialVersionUID = -3269263069889337299L;
    private ArrayList order;
    
    public OrderedJSONObject() {
        this.order = null;
        this.order = new ArrayList();
    }
    
    public static JSONObject parse(final Reader in) throws IOException {
        return new Parser(new BufferedReader(in)).parse(true);
    }
    
    public static JSONObject parse(final String s) throws IOException {
        return parse(new StringReader(s));
    }
    
    public static JSONObject parse(final InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        }
        catch (Exception ex) {
            inputStreamReader = new InputStreamReader(inputStream);
        }
        return parse(inputStreamReader);
    }
    
    public Object put(final Object o, final Object o2) {
        if (null == o) {
            throw new IllegalArgumentException("key must not be null");
        }
        if (!(o instanceof String)) {
            throw new IllegalArgumentException("key must be a String");
        }
        if (JSONObject.isValidObject(o2)) {
            if (!this.containsKey(o)) {
                this.order.add(o);
            }
            return super.put(o, o2);
        }
        if (o2 != null) {
            throw new IllegalArgumentException("Invalid type of value.  Type: [" + o2.getClass().getName() + "] with value: [" + o2.toString() + "]");
        }
        throw new IllegalArgumentException("Invalid type of value.");
    }
    
    public Object remove(final Object obj) {
        Object remove = null;
        if (null == obj) {
            throw new IllegalArgumentException("key must not be null");
        }
        if (this.containsKey(obj)) {
            remove = super.remove(obj);
            for (int i = 0; i < this.order.size(); ++i) {
                if (this.order.get(i).equals(obj)) {
                    this.order.remove(i);
                    break;
                }
            }
        }
        return remove;
    }
    
    public void clear() {
        super.clear();
        this.order.clear();
    }
    
    public Object clone() {
        final OrderedJSONObject orderedJSONObject = (OrderedJSONObject)super.clone();
        final Iterator order = orderedJSONObject.getOrder();
        final ArrayList<Object> order2 = new ArrayList<Object>();
        while (order.hasNext()) {
            order2.add(order.next());
            orderedJSONObject.order = order2;
        }
        return orderedJSONObject;
    }
    
    public Iterator getOrder() {
        return this.order.iterator();
    }
}
