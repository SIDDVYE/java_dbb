// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

import java.lang.reflect.Array;
import java.util.Iterator;
import com.ibm.jjson.beans.BeanMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import com.ibm.jjson.beans.BeanMapFactory;

public class PojoRest
{
    private static final int GET = 1;
    private static final int PUT = 2;
    private static final int POST = 3;
    private static final int DELETE = 4;
    private final BeanMapFactory beanMapFactory;
    private JsonNode root;
    
    public PojoRest(final Object o) {
        this(o, BeanMapFactory.DEFAULT);
    }
    
    public PojoRest(final Object o, final BeanMapFactory beanMapFactory) {
        this.beanMapFactory = beanMapFactory;
        this.root = JsonNode.newInstance(o, this.beanMapFactory);
    }
    
    public Object getRootObject() {
        return (this.root == null) ? null : this.root.innerObject;
    }
    
    public Object get(final String url) {
        return this.service(1, url, null);
    }
    
    public String getString(final String url) {
        return JsonUtils.toString(this.get(url), null);
    }
    
    public String getString(final String url, final String defVal) {
        return JsonUtils.toString(this.get(url), defVal);
    }
    
    public Integer getInt(final String url) {
        return JsonUtils.toInt(this.get(url), null);
    }
    
    public Integer getInt(final String url, final Integer defVal) {
        return JsonUtils.toInt(this.get(url), defVal);
    }
    
    public Long getLong(final String url) {
        return JsonUtils.toLong(this.get(url), null);
    }
    
    public Long getLong(final String url, final Long defVal) {
        return JsonUtils.toLong(this.get(url), defVal);
    }
    
    public Boolean getBoolean(final String url) {
        return JsonUtils.toBoolean(this.get(url), null);
    }
    
    public Boolean getBoolean(final String url, final Boolean defVal) {
        return JsonUtils.toBoolean(this.get(url), defVal);
    }
    
    public Map<?, ?> getMap(final String url) {
        return (Map<?, ?>)JsonUtils.toMap(this.get(url), null);
    }
    
    public Map<?, ?> getMap(final String url, final Map<?, ?> def) {
        return (Map<?, ?>)JsonUtils.toMap(this.get(url), def);
    }
    
    public List<?> getList(final String url) {
        return (List<?>)JsonUtils.toList(this.get(url), null);
    }
    
    public List<?> getList(final String url, final List<?> def) {
        return (List<?>)JsonUtils.toList(this.get(url), def);
    }
    
    public JsonMap<?, ?> getJsonMap(final String url) {
        return (JsonMap<?, ?>)JsonUtils.toJsonMap(this.get(url), null);
    }
    
    public JsonMap<?, ?> getJsonMap(final String url, final JsonMap<?, ?> def) {
        return (JsonMap<?, ?>)JsonUtils.toJsonMap(this.get(url), def);
    }
    
    public JsonList<?> getJsonList(final String url) {
        return (JsonList<?>)JsonUtils.toJsonList(this.get(url), null);
    }
    
    public JsonList<?> getJsonList(final String url, final JsonList<?> def) {
        return (JsonList<?>)JsonUtils.toJsonList(this.get(url), def);
    }
    
    public DataType getDataType(final String url) {
        return JsonUtils.getDataType(this.get(url));
    }
    
    public Object put(final String url, final Object val) {
        return this.service(2, url, val);
    }
    
    public String post(final String url, final Object val) {
        return (String)this.service(3, url, val);
    }
    
    public Object delete(final String url) {
        return this.service(4, url, null);
    }
    
    @Override
    public String toString() {
        return (this.root == null) ? null : this.root.innerObject.toString();
    }
    
    private Object service(final int method, String url, final Object val) {
        if (this.root == null) {
            return null;
        }
        if (url == null) {
            url = "";
        }
        if (url.length() > 0 && url.charAt(0) == '/') {
            url = url.substring(1);
        }
        if (method == 1) {
            if (url.length() == 0) {
                return this.root.innerObject;
            }
            final JsonNode p = this.root.find(url, false);
            return (p == null) ? null : p.innerObject;
        }
        else {
            final int i = url.lastIndexOf(47);
            final String parentUrl = (i == -1) ? null : url.substring(0, i);
            final String childKey = (i == -1) ? url : url.substring(i + 1);
            if (method == 2) {
                if (url.length() == 0) {
                    final Object o = this.root.innerObject;
                    this.root = JsonNode.newInstance(val, this.beanMapFactory);
                    return o;
                }
                if (parentUrl == null) {
                    return this.root.put(url, val);
                }
                return this.root.find(parentUrl, true).put(childKey, val);
            }
            else {
                if (method == 3) {
                    if (url.length() == 0) {
                        this.root.post(val);
                    }
                    else {
                        if (parentUrl == null) {
                            return url + "/" + this.root.get(url, true).post(val);
                        }
                        final JsonNode p2 = this.root.find(parentUrl, true);
                        if (p2.get(childKey, false) == null) {
                            p2.put(childKey, new JsonList());
                        }
                        return url + "/" + p2.get(childKey, false).post(val);
                    }
                }
                if (method != 4) {
                    return null;
                }
                if (url.length() == 0) {
                    final Object o = this.root.innerObject;
                    this.root = JsonNode.newInstance(null, this.beanMapFactory);
                    return o;
                }
                if (parentUrl == null) {
                    return this.root.delete(url);
                }
                final JsonNode p2 = this.root.find(parentUrl, false);
                return (p2 == null) ? null : p2.delete(childKey);
            }
        }
    }
    
    private abstract static class JsonNode
    {
        public BeanMapFactory beanMapFactory;
        public JsonNode parent;
        public String propertyName;
        public Object innerObject;
        
        public static JsonNode newInstance(final Object o, final BeanMapFactory beanMapFactory) {
            if (o == null) {
                return null;
            }
            JsonNode n = null;
            if (o instanceof Map) {
                n = new JsonMapNode((Map)o);
            }
            else if (o instanceof List) {
                n = new JsonListNode((List)o);
            }
            else if (o instanceof Collection) {
                n = new JsonCollectionNode((Collection)o);
            }
            else if (o.getClass().isArray()) {
                n = new JsonArrayNode((Object[])o);
            }
            else {
                final BeanMap b = beanMapFactory.forBean(o);
                if (b != null) {
                    n = new JsonBeanNode(b);
                }
                else {
                    n = new JsonOtherNode(o);
                }
            }
            n.beanMapFactory = beanMapFactory;
            n.innerObject = o;
            return n;
        }
        
        public static JsonNode newInstance(final JsonNode parent, final String propertyName, final Object o) {
            if (o == null) {
                return null;
            }
            final JsonNode n = newInstance(o, parent.beanMapFactory);
            n.parent = parent;
            n.propertyName = propertyName;
            return n;
        }
        
        public JsonNode find(final String url, final boolean doFill) {
            final int i = (url == null) ? -1 : url.indexOf(47);
            if (i == -1) {
                return this.get(url, doFill);
            }
            final String parentKey = url.substring(0, i);
            final String childUrl = url.substring(i + 1);
            final JsonNode p = this.get(parentKey, doFill);
            return (p == null) ? null : p.find(childUrl, doFill);
        }
        
        public abstract JsonNode get(final String p0, final boolean p1);
        
        public abstract Object put(final String p0, final Object p1);
        
        public abstract int post(final Object p0);
        
        public abstract Object delete(final String p0);
    }
    
    private static class JsonMapNode extends JsonNode
    {
        private Map m;
        
        public JsonMapNode(final Map innerObject) {
            this.m = innerObject;
        }
        
        @Override
        public JsonNode get(final String key, final boolean doFill) {
            if (doFill && !this.m.containsKey(key)) {
                this.m.put(key, new JsonMap());
            }
            return JsonNode.newInstance(this, key, this.m.get(key));
        }
        
        @Override
        public Object put(final String key, final Object val) {
            return this.m.put(key, val);
        }
        
        @Override
        public int post(final Object val) {
            try {
                int i = 0;
                final Iterator j = this.m.keySet().iterator();
                while (j.hasNext()) {
                    i = Math.max(i, Integer.parseInt(j.next().toString()));
                }
                ++i;
                this.m.put("" + i, val);
                return i;
            }
            catch (NumberFormatException e) {
                throw new RuntimeException("Cannot perform PUT operation on a Map that doesn't have number keys.");
            }
        }
        
        @Override
        public Object delete(final String key) {
            return this.m.remove(key);
        }
    }
    
    private static class JsonBeanNode extends JsonMapNode
    {
        public JsonBeanNode(final BeanMap innerObject) {
            super(innerObject);
            this.innerObject = innerObject.getBean();
        }
    }
    
    private static class JsonListNode extends JsonNode
    {
        private List l;
        
        public JsonListNode(final List innerObject) {
            this.l = innerObject;
        }
        
        @Override
        public JsonNode get(final String key, final boolean doFill) {
            if (key.length() > 0 && key.charAt(0) == '@') {
                final String attr = key.substring(1, key.indexOf(61));
                final String val = key.substring(key.indexOf(61) + 1);
                for (final Object o : this.l) {
                    final Map m = JsonUtils.toMap(o, null);
                    if (m.get(attr).equals(val)) {
                        return JsonNode.newInstance(this, key, m);
                    }
                }
                return null;
            }
            final int i = this.parseInt(key);
            while (this.l.size() <= i && doFill) {
                this.l.add(null);
            }
            if (this.l.size() <= i) {
                return null;
            }
            return JsonNode.newInstance(this, key, this.l.get(i));
        }
        
        @Override
        public Object put(final String key, final Object val) {
            final int i = this.parseInt(key);
            while (this.l.size() <= i) {
                this.l.add(null);
            }
            return this.l.set(i, val);
        }
        
        @Override
        public int post(final Object val) {
            this.l.add(val);
            return this.l.size() - 1;
        }
        
        @Override
        public Object delete(final String key) {
            final int i = this.parseInt(key);
            return (this.l.size() <= i) ? null : this.l.remove(i);
        }
        
        private int parseInt(final String key) {
            try {
                return Integer.parseInt(key);
            }
            catch (NumberFormatException e) {
                throw new RuntimeException("Cannot address an item in a List with a non-integer key [" + key + "]");
            }
        }
    }
    
    private static class JsonCollectionNode extends JsonNode
    {
        private Collection c;
        
        public JsonCollectionNode(final Collection innerObject) {
            this.c = innerObject;
        }
        
        @Override
        public JsonNode get(final String key, final boolean doFill) {
            if (key.length() > 0 && key.charAt(0) == '@') {
                final String attr = key.substring(1, key.indexOf(61));
                final String val = key.substring(key.indexOf(61) + 1);
                for (final Object o : this.c) {
                    final Map m = JsonUtils.toMap(o, null);
                    if (m.get(attr).equals(val)) {
                        return JsonNode.newInstance(this, key, m);
                    }
                }
                return null;
            }
            throw new RuntimeException("Cannot perform GET operation on a Collection that's not a List, since entries are not accessible by index.");
        }
        
        @Override
        public Object put(final String key, final Object val) {
            throw new RuntimeException("Cannot perform PUT operation on a Collection that's not a List, since entries are not accessible by index.");
        }
        
        @Override
        public int post(final Object val) {
            this.c.add(val);
            return this.c.size() - 1;
        }
        
        @Override
        public Object delete(final String key) {
            throw new RuntimeException("Cannot perform DELETE operation on a Collection that's not a List, since entries are not accessible by index.");
        }
    }
    
    private static class JsonArrayNode extends JsonNode
    {
        private Object[] a;
        
        public JsonArrayNode(final Object[] innerObject) {
            this.a = innerObject;
        }
        
        @Override
        public JsonNode get(final String key, final boolean doFill) {
            if (key.length() > 0 && key.charAt(0) == '@') {
                final String attr = key.substring(1, key.indexOf(61));
                final String val = key.substring(key.indexOf(61) + 1);
                for (final Object o : this.a) {
                    final Map m = JsonUtils.toMap(o, null);
                    if (m.get(attr).equals(val)) {
                        return JsonNode.newInstance(this, key, m);
                    }
                }
                return null;
            }
            final int i = this.parseInt(key);
            if (this.a.length <= i && doFill) {
                final Object[] a2 = (Object[])Array.newInstance(this.a.getClass().getComponentType(), i);
                System.arraycopy(this.a, 0, a2, 0, this.a.length);
                this.a = a2;
                this.parent.put(this.propertyName.toString(), this.a);
            }
            if (this.a.length <= i) {
                return null;
            }
            return JsonNode.newInstance(this, key, this.a[i]);
        }
        
        @Override
        public Object put(final String key, final Object val) {
            final int i = this.parseInt(key);
            if (this.a.length <= i) {
                final Object[] a2 = (Object[])Array.newInstance(this.a.getClass().getComponentType(), i + 1);
                System.arraycopy(this.a, 0, a2, 0, this.a.length);
                this.a = a2;
            }
            final Object old = this.a[i];
            this.a[i] = this.convert(val);
            this.parent.put(this.propertyName.toString(), this.a);
            return old;
        }
        
        @Override
        public int post(final Object val) {
            final Object[] a2 = (Object[])Array.newInstance(this.a.getClass().getComponentType(), this.a.length + 1);
            System.arraycopy(this.a, 0, a2, 0, this.a.length);
            (this.a = a2)[this.a.length - 1] = this.convert(val);
            this.parent.put(this.propertyName.toString(), this.a);
            return this.a.length - 1;
        }
        
        @Override
        public Object delete(final String key) {
            final int i = this.parseInt(key);
            final Object old = this.a[i];
            final Object[] a2 = (Object[])Array.newInstance(this.a.getClass().getComponentType(), this.a.length - 1);
            System.arraycopy(this.a, 0, a2, 0, i);
            System.arraycopy(this.a, i + 1, a2, i, this.a.length - i - 1);
            this.a = a2;
            this.parent.put(this.propertyName.toString(), this.a);
            return old;
        }
        
        private Object convert(final Object o) {
            try {
                final Class c = this.a.getClass().getComponentType();
                if (o instanceof Map && !Map.class.isAssignableFrom(c)) {
                    return this.beanMapFactory.newInstance(c, (Map)o).getBean();
                }
            }
            catch (Exception e) {
                e.printStackTrace(System.err);
            }
            return o;
        }
        
        private int parseInt(final String key) {
            try {
                return Integer.parseInt(key);
            }
            catch (NumberFormatException e) {
                throw new RuntimeException("Cannot address an item in an array with a non-integer key [" + key + "]");
            }
        }
    }
    
    private static class JsonOtherNode extends JsonNode
    {
        public JsonOtherNode(final Object innerObject) {
        }
        
        @Override
        public JsonNode get(final String key, final boolean doFill) {
            throw new RuntimeException("Cannot perform GET operation on an object of type [" + this.innerObject.getClass().getName() + "].");
        }
        
        @Override
        public Object put(final String key, final Object val) {
            throw new RuntimeException("Cannot perform PUT operation on an object of type [" + this.innerObject.getClass().getName() + "].");
        }
        
        @Override
        public int post(final Object val) {
            throw new RuntimeException("Cannot perform POST operation on an object of type [" + this.innerObject.getClass().getName() + "].");
        }
        
        @Override
        public Object delete(final String key) {
            throw new RuntimeException("Cannot perform DELETE operation on an object of type [" + this.innerObject.getClass().getName() + "].");
        }
    }
}
