// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson.beans;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.lang.reflect.Field;
import java.beans.PropertyDescriptor;
import java.beans.BeanInfo;
import java.util.Collections;
import java.lang.reflect.Modifier;
import java.io.Serializable;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.lang.annotation.Annotation;
import com.ibm.jjson.beans.annotation.Property;
import com.ibm.jjson.beans.annotation.Bean;
import java.util.HashMap;
import java.lang.reflect.Method;
import java.util.Map;
import java.lang.reflect.Constructor;

public class BeanMeta
{
    Class<?> c;
    Constructor<?> defaultConstructor;
    Map<String, Property> properties;
    String name;
    Map<Method, String> getterProps;
    Map<Method, String> setterProps;
    BeanMapFactory factory;
    
    protected BeanMeta(final Class<?> c, final BeanMapFactory factory) throws NotABeanException {
        this.getterProps = new HashMap<Method, String>();
        this.setterProps = new HashMap<Method, String>();
        this.c = c;
        this.factory = factory;
        final Class<Bean> beanAnnotation = Bean.class;
        final Class<com.ibm.jjson.beans.annotation.Property> propertyAnnotation = com.ibm.jjson.beans.annotation.Property.class;
        final boolean isBeanAnnotated = c.isAnnotationPresent(beanAnnotation);
        final boolean isReconstructible = isBeanAnnotated && c.getAnnotation(beanAnnotation).isReconstructible();
        this.properties = (Map<String, Property>)(isBeanAnnotated ? new LinkedHashMap<Object, Object>() : new TreeMap<Object, Object>());
        if (factory.isIgnoredClass(c)) {
            throw new NotABeanException("Class matches exclude-class list.  class=[" + c.getName() + "]");
        }
        BeanInfo beanInfo = null;
        try {
            final Class<?> stopClass = c.isInterface() ? null : Object.class;
            beanInfo = Introspector.getBeanInfo(c, stopClass);
        }
        catch (IntrospectionException e) {
            throw new NotABeanException(e);
        }
        if (factory.requireSerializable && !Serializable.class.isAssignableFrom(c)) {
            throw new NotABeanException("Class [" + c.getName() + "] is not serializable");
        }
        try {
            this.defaultConstructor = c.getConstructor((Class<?>[])null);
        }
        catch (Exception e2) {
            if (isBeanAnnotated && isReconstructible) {
                throw new NotABeanException("Class is denoted as 'isReconstructible' but does not have the required no-arg constructor on class [" + c.getName() + "]");
            }
            if (factory.requireDefaultConstructor) {
                throw new NotABeanException(e2);
            }
        }
        if (isReconstructible || factory.addClassProperty) {
            this.properties.put("_class", new ClassNameProperty());
        }
        if (isBeanAnnotated) {
            for (final String p : c.getAnnotation(beanAnnotation).properties()) {
                this.properties.put(p, new NormalProperty(p));
            }
            for (final PropertyDescriptor pd : beanInfo.getPropertyDescriptors()) {
                if (this.properties.containsKey(pd.getName())) {
                    this.properties.get(pd.getName()).setMethods(pd.getReadMethod(), pd.getWriteMethod());
                }
            }
            for (final Field f : c.getFields()) {
                final String n = f.getName();
                if (this.properties.containsKey(n)) {
                    final Property p2 = this.properties.get(n);
                    if (p2 instanceof NormalProperty && ((NormalProperty)p2).getter == null) {
                        final int m = f.getModifiers();
                        if (Modifier.isPublic(m) && !Modifier.isStatic(m) && !Modifier.isTransient(m) && !f.isAnnotationPresent(propertyAnnotation)) {
                            this.properties.put(n, new FieldProperty(n, f));
                        }
                    }
                }
            }
            this.name = c.getAnnotation(beanAnnotation).name();
            if (this.name != null && this.name.equals("")) {
                this.name = null;
            }
        }
        else {
            if (factory.includePublicFieldProperties) {
                for (final Field f : c.getFields()) {
                    final int i = f.getModifiers();
                    if (Modifier.isPublic(i) && !Modifier.isStatic(i) && !Modifier.isTransient(i) && !f.isAnnotationPresent(propertyAnnotation)) {
                        this.properties.put(f.getName(), new FieldProperty(f.getName(), f));
                    }
                }
            }
            if (factory.includeGetterProperties) {
                for (final PropertyDescriptor pd : beanInfo.getPropertyDescriptors()) {
                    final Method getter = pd.getReadMethod();
                    Method setter = pd.getWriteMethod();
                    if (getter != null) {
                        if (!getter.isAnnotationPresent(propertyAnnotation)) {
                            if (setter != null && setter.isAnnotationPresent(propertyAnnotation)) {
                                setter = null;
                            }
                            this.properties.put(pd.getName(), new NormalProperty(pd.getName(), getter, setter));
                        }
                    }
                }
            }
        }
        for (final Method j : c.getMethods()) {
            if (j.isAnnotationPresent(propertyAnnotation)) {
                final String pName = j.getAnnotation(propertyAnnotation).name();
                if (pName.equals("")) {
                    throw new NotABeanException("Required 'name' attribute missing from @Property annotation on class [" + c.getName() + "]");
                }
                final com.ibm.jjson.beans.annotation.Method method = j.getAnnotation(propertyAnnotation).method();
                if (isBeanAnnotated && !this.properties.containsKey(pName)) {
                    throw new NotABeanException("Method property '" + pName + "' identified, but missing from @Bean annotation on class [" + c.getName() + "]");
                }
                if (!this.properties.containsKey(pName)) {
                    this.properties.put(pName, new NormalProperty(pName));
                }
                final NormalProperty p3 = this.properties.get(pName);
                if (method == com.ibm.jjson.beans.annotation.Method.GETTER) {
                    p3.getter = j;
                }
                else {
                    p3.setter = j;
                }
            }
        }
        for (final Field f : c.getDeclaredFields()) {
            final String fName = f.getName();
            if (f.isAnnotationPresent(propertyAnnotation)) {
                String pName2 = f.getAnnotation(propertyAnnotation).name();
                if (pName2.equals("")) {
                    pName2 = fName;
                }
                if (isBeanAnnotated && !this.properties.containsKey(pName2)) {
                    throw new NotABeanException("Field property '" + pName2 + "' identified, but missing from @Bean annotation on class [" + c.getName() + "]");
                }
                this.properties.put(pName2, new FieldProperty(pName2, f));
            }
            else if (this.properties.containsKey(fName)) {
                final Property p2 = this.properties.get(fName);
                if (p2 instanceof NormalProperty && ((NormalProperty)p2).getter == null) {
                    this.properties.put(fName, new FieldProperty(fName, f));
                }
            }
        }
        final Iterator<Property> k = this.properties.values().iterator();
        while (k.hasNext()) {
            final Property p4 = k.next();
            if (p4 instanceof NormalProperty) {
                final NormalProperty np = (NormalProperty)p4;
                if (np.getter == null) {
                    if (isBeanAnnotated) {
                        throw new NotABeanException("Unknown property '" + p4.name + "' specified in a @Bean annotation on class [" + c.getName() + "]");
                    }
                    k.remove();
                }
                else if (np.setter == null && factory.requireSettersForGetters) {
                    if (isBeanAnnotated) {
                        throw new NotABeanException("Setter not found for property '" + p4.name + "' specified in a @Bean annotation on class [" + c.getName() + "]");
                    }
                    k.remove();
                }
                else {
                    if (np.getter != null) {
                        this.getterProps.put(np.getter, np.name);
                    }
                    if (np.setter == null) {
                        continue;
                    }
                    this.setterProps.put(np.setter, np.name);
                }
            }
        }
        if (factory.requireSomeProperties && this.properties.size() == (factory.addClassProperty ? 1 : 0)) {
            throw new NotABeanException("No properties detected on class: " + c.getName());
        }
        if (!isBeanAnnotated) {
            this.properties = new LinkedHashMap<String, Property>(this.properties);
        }
        this.properties = Collections.unmodifiableMap((Map<? extends String, ? extends Property>)this.properties);
    }
    
    private Object convertToType(Object value, final Class<?> type) throws Exception {
        if (value == null) {
            if (type.isPrimitive()) {
                throw new NullPointerException("Cannot set primitive value as null.");
            }
        }
        else if (type.isArray()) {
            final Class<?> t2 = type.getComponentType();
            if (value instanceof Collection) {
                final Collection<?> c = (Collection<?>)value;
                value = c.toArray(new Object[c.size()]);
            }
            if (!value.getClass().isArray()) {
                value = new Object[] { value };
            }
            final Class<?> vt = value.getClass().getComponentType();
            if (!t2.isAssignableFrom(vt)) {
                final Object[] v1 = (Object[])value;
                if (!Map.class.isAssignableFrom(t2)) {
                    for (int i = 0; i < v1.length; ++i) {
                        if (v1[i] instanceof Map) {
                            v1[i] = this.factory.newInstance(t2, (Map)v1[i]).getBean();
                        }
                    }
                }
                final Object[] v2 = (Object[])Array.newInstance(t2, v1.length);
                System.arraycopy(v1, 0, v2, 0, v1.length);
                value = v2;
            }
        }
        else {
            if (value instanceof Map && !Map.class.isAssignableFrom(type)) {
                value = this.factory.newInstance(type, (Map)value).getBean();
            }
            if (value instanceof Collection && Collection.class.isAssignableFrom(type)) {
                final Collection<?> c2 = (Collection<?>)type.newInstance();
                c2.addAll((Collection<?>)value);
                value = c2;
            }
        }
        return value;
    }
    
    abstract class Property
    {
        String name;
        
        public Property(final String name) {
            this.name = name;
        }
        
        public abstract Object get(final Object p0) throws BeanRuntimeException;
        
        public abstract Object set(final Object p0, final Object p1) throws BeanRuntimeException;
    }
    
    private class NormalProperty extends Property
    {
        Method getter;
        Method setter;
        
        NormalProperty(final String name) {
            super(name);
        }
        
        NormalProperty(final String name, final Method getter, final Method setter) {
            super(name);
            this.setMethods(getter, setter);
        }
        
        public void setMethods(final Method getter, final Method setter) {
            this.getter = getter;
            this.setter = setter;
        }
        
        @Override
        public Object get(final Object bean) throws BeanRuntimeException {
            if (this.getter == null) {
                throw new BeanRuntimeException("Getter not defined on property '" + this.name + "' on class '" + BeanMeta.this.c.getName() + "'");
            }
            try {
                return this.getter.invoke(bean, (Object[])null);
            }
            catch (Exception e) {
                throw new BeanRuntimeException(null, e);
            }
        }
        
        @Override
        public Object set(final Object bean, Object value) throws BeanRuntimeException {
            if (this.setter == null) {
                throw new BeanRuntimeException("Setter not defined on property '" + this.name + "' on class '" + BeanMeta.this.c.getName() + "'");
            }
            try {
                final Object r = BeanMeta.this.factory.putReturnsOldValue ? this.get(bean) : null;
                value = BeanMeta.this.convertToType(value, this.setter.getParameterTypes()[0]);
                this.setter.invoke(bean, value);
                return r;
            }
            catch (Exception e) {
                throw new BeanRuntimeException(null, e);
            }
        }
    }
    
    private class FieldProperty extends Property
    {
        Field field;
        
        FieldProperty(final String name, final Field field) {
            super(name);
            this.field = field;
        }
        
        @Override
        public Object get(final Object bean) throws BeanRuntimeException {
            try {
                return this.field.get(bean);
            }
            catch (Exception e) {
                throw new BeanRuntimeException(e);
            }
        }
        
        @Override
        public Object set(final Object bean, Object value) throws BeanRuntimeException {
            try {
                final Object r = BeanMeta.this.factory.putReturnsOldValue ? this.get(bean) : null;
                value = BeanMeta.this.convertToType(value, this.field.getType());
                this.field.set(bean, value);
                return r;
            }
            catch (Exception e) {
                throw new BeanRuntimeException(e);
            }
        }
    }
    
    private class ClassNameProperty extends Property
    {
        public ClassNameProperty() {
            super("_class");
        }
        
        @Override
        public Object get(final Object bean) throws BeanRuntimeException {
            return BeanMeta.this.c.getName();
        }
        
        @Override
        public Object set(final Object bean, final Object value) throws BeanRuntimeException {
            return null;
        }
    }
}
