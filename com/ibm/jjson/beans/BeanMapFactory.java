// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson.beans;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.io.Serializable;
import com.ibm.jjson.JsonMap;
import java.util.Iterator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.lang.ref.SoftReference;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.List;

public class BeanMapFactory implements Cloneable
{
    private static String[] DEFAULT_CLASS_EXCLUDES;
    public static final BeanMapFactory DEFAULT;
    public static final BeanMapFactory DEFAULT_SAFE;
    public static final BeanMapFactory DEFAULT_RECONSTRUCTIBLE;
    boolean requireDefaultConstructor;
    boolean requireSerializable;
    boolean requireSettersForGetters;
    boolean requireSomeProperties;
    boolean addClassProperty;
    boolean putReturnsOldValue;
    boolean throwNotABeanExceptions;
    boolean includePublicFieldProperties;
    boolean includeGetterProperties;
    List<Pattern> excludeClassPatterns;
    Set<Package> ignorePackages;
    Set<Class<?>> ignoreClasses;
    private SoftReference<Map<Class<?>, BeanMeta>> metaCache;
    
    public BeanMapFactory() {
        this.requireDefaultConstructor = false;
        this.requireSerializable = false;
        this.requireSettersForGetters = false;
        this.requireSomeProperties = true;
        this.addClassProperty = false;
        this.putReturnsOldValue = false;
        this.throwNotABeanExceptions = false;
        this.includePublicFieldProperties = true;
        this.includeGetterProperties = true;
        this.excludeClassPatterns = new LinkedList<Pattern>();
        this.ignorePackages = new HashSet<Package>();
        this.ignoreClasses = new HashSet<Class<?>>() {
            {
                ((HashSet<Class<Throwable>>)this).add(Throwable.class);
            }
        };
        this.metaCache = null;
        this.setExcludeClassPatterns(BeanMapFactory.DEFAULT_CLASS_EXCLUDES);
    }
    
    public BeanMapFactory clone() {
        try {
            return (BeanMapFactory)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public BeanMapFactory setRequireDefaultConstructor(final boolean requireDefaultConstructor) {
        this.requireDefaultConstructor = requireDefaultConstructor;
        return this;
    }
    
    public BeanMapFactory setRequireSerializable(final boolean requireSerializable) {
        this.requireSerializable = requireSerializable;
        return this;
    }
    
    public BeanMapFactory setRequireSettersForGetters(final boolean requireSettersForGetters) {
        this.requireSettersForGetters = requireSettersForGetters;
        return this;
    }
    
    public BeanMapFactory setRequireSomeProperties(final boolean requireSomeProperties) {
        this.requireSomeProperties = requireSomeProperties;
        return this;
    }
    
    public BeanMapFactory setAddClassProperty(final boolean addClassProperty) {
        this.addClassProperty = addClassProperty;
        return this;
    }
    
    public BeanMapFactory setPutReturnsOldValue(final boolean putReturnsOldValue) {
        this.putReturnsOldValue = putReturnsOldValue;
        return this;
    }
    
    public BeanMapFactory setThrowNotABeanExceptions(final boolean throwNotABeanExceptions) {
        this.throwNotABeanExceptions = throwNotABeanExceptions;
        return this;
    }
    
    public BeanMapFactory setIncludePublicFieldProperties(final boolean includePublicFieldProperties) {
        this.includePublicFieldProperties = includePublicFieldProperties;
        return this;
    }
    
    public BeanMapFactory setIncludeGetterProperties(final boolean includeGetterProperties) {
        this.includeGetterProperties = includeGetterProperties;
        return this;
    }
    
    public BeanMapFactory addExcludeClassPatterns(final String... excludeClassPatterns) {
        for (final String s : excludeClassPatterns) {
            this.excludeClassPatterns.add(Pattern.compile(s.toString().replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*")));
        }
        return this;
    }
    
    public BeanMapFactory setExcludeClassPatterns(final String... excludeClassPatterns) {
        this.excludeClassPatterns.clear();
        return this.addExcludeClassPatterns(excludeClassPatterns);
    }
    
    public BeanMapFactory addIgnorePackages(final String... packages) {
        for (final String p : packages) {
            final Package p2 = Package.getPackage(p);
            if (p2 != null) {
                this.ignorePackages.add(p2);
            }
        }
        return this;
    }
    
    public BeanMapFactory addIgnoreClasses(final String... classes) {
        for (final String c : classes) {
            try {
                this.addIgnoreClasses(Class.forName(c));
            }
            catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return this;
    }
    
    public BeanMapFactory addIgnoreClasses(final Class<?>... classes) {
        for (final Class<?> c : classes) {
            if (c != null) {
                this.ignoreClasses.add(c);
            }
        }
        return this;
    }
    
    protected boolean isIgnoredClass(final Class<?> c) {
        final String className = c.getName();
        for (final Pattern p : this.excludeClassPatterns) {
            if (p.matcher(className).matches()) {
                return true;
            }
        }
        Class<?> c2 = c;
        do {
            final Package p2 = c2.getPackage();
            if (this.ignorePackages.contains(p2)) {
                return true;
            }
            if (this.ignoreClasses.contains(c2)) {
                return true;
            }
            c2 = c2.getSuperclass();
        } while (c2 != null);
        return false;
    }
    
    public BeanMap forBean(final Object o) {
        return this.forBean(o, o.getClass());
    }
    
    public boolean isBean(final Object o) {
        return this.forBean(o, o.getClass()) != null;
    }
    
    public BeanMap forBean(final Object o, final Class<?> c) {
        if (o == null || c == null) {
            throw new NullPointerException("Neither the specified object nor class may be null.  class=[ " + c + " ], object=[ " + o + " ]");
        }
        if (!c.isInstance(o)) {
            throw new IllegalArgumentException("The specified object is not an instance of the specified class.  class=[ " + c.getName() + " ], objectClass=[ " + o.getClass().getName() + " ], object=[ " + o + " ]");
        }
        final BeanMeta m = this.getBeanMeta(c);
        if (m == null) {
            return null;
        }
        return new BeanMap(o, m);
    }
    
    public BeanMap newInstance(final Class<?> c) throws Exception {
        return this.newInstance(c, (Map)null);
    }
    
    public BeanMap newInstance(final Class<?> c, final String initProperties) throws Exception {
        return this.newInstance(c, new JsonMap(initProperties));
    }
    
    public BeanMap newInstance(final Class<?> c, final Map initProperties) throws Exception {
        final BeanMeta m = this.getBeanMeta(c);
        if (m == null) {
            return null;
        }
        Object o = null;
        if (c.isInterface()) {
            o = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[] { c, Serializable.class }, new BeanHandler(m));
        }
        else if (m.defaultConstructor == null) {
            if (this.throwNotABeanExceptions) {
                throw new NotABeanException("Class does not have a no-arg constructor.");
            }
            return null;
        }
        else {
            o = m.defaultConstructor.newInstance((Object[])null);
        }
        final BeanMap b = new BeanMap(o, m);
        if (initProperties != null) {
            b.putAll(initProperties);
        }
        return b;
    }
    
    private synchronized BeanMeta getBeanMeta(final Class<?> c) {
        if (this.metaCache == null || this.metaCache.get() == null) {
            this.metaCache = new SoftReference<Map<Class<?>, BeanMeta>>(new HashMap<Class<?>, BeanMeta>());
        }
        final Map<Class<?>, BeanMeta> cacheMap = this.metaCache.get();
        if (!cacheMap.containsKey(c)) {
            try {
                cacheMap.put(c, new BeanMeta(c, this));
            }
            catch (NotABeanException e) {
                if (this.throwNotABeanExceptions) {
                    throw e;
                }
                cacheMap.put(c, null);
            }
        }
        return cacheMap.get(c);
    }
    
    static {
        BeanMapFactory.DEFAULT_CLASS_EXCLUDES = new String[] { "java.lang.*", "java.io.*" };
        DEFAULT = new BeanMapFactory();
        DEFAULT_SAFE = BeanMapFactory.DEFAULT.clone().setThrowNotABeanExceptions(true);
        DEFAULT_RECONSTRUCTIBLE = BeanMapFactory.DEFAULT.clone().setAddClassProperty(true);
    }
    
    private static class BeanHandler implements InvocationHandler
    {
        private BeanMeta meta;
        private Map<String, Object> beanProps;
        
        public BeanHandler(final BeanMeta meta) {
            this.meta = meta;
            this.beanProps = new HashMap<String, Object>();
        }
        
        @Override
        public Object invoke(final Object proxy, final Method method, final Object[] args) {
            final Class<?>[] paramTypes = method.getParameterTypes();
            if (method.getName().equals("equals") && paramTypes.length == 1 && paramTypes[0] == Object.class) {
                final Object arg = args[0];
                if (arg == null) {
                    return Boolean.FALSE;
                }
                if (proxy == arg) {
                    return Boolean.TRUE;
                }
                if (proxy.getClass() == arg.getClass()) {
                    final InvocationHandler ih = Proxy.getInvocationHandler(arg);
                    if (ih instanceof BeanHandler) {
                        return this.beanProps.equals(((BeanHandler)ih).beanProps) ? Boolean.TRUE : Boolean.FALSE;
                    }
                }
                final BeanMap bean = this.meta.factory.forBean(arg);
                return this.beanProps.equals(bean) ? Boolean.TRUE : Boolean.FALSE;
            }
            else {
                if (method.getName().equals("hashCode") && paramTypes.length == 0) {
                    return new Integer(this.beanProps.hashCode());
                }
                if (method.getName().equals("toString") && paramTypes.length == 0) {
                    return this.beanProps.toString();
                }
                String prop = this.meta.getterProps.get(method);
                if (prop != null) {
                    return this.beanProps.get(prop);
                }
                prop = this.meta.setterProps.get(method);
                if (prop != null) {
                    this.beanProps.put(prop, args[0]);
                    return null;
                }
                throw new UnsupportedOperationException("Unsupported bean method.  method=[ " + method + " ]");
            }
        }
    }
}
