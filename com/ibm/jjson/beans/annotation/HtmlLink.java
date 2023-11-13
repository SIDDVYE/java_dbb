// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson.beans.annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Documented;
import java.lang.annotation.Annotation;

@Documented
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface HtmlLink {
    String nameProperty() default "";
    
    String urlProperty() default "";
}
