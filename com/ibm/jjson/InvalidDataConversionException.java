// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.jjson;

public class InvalidDataConversionException extends RuntimeException
{
    public InvalidDataConversionException(final Class<?> fromType, final Class<?> toType) {
        super("Invalid data conversion from type [" + fromType.getName() + "] to type [" + toType.getName() + "].");
    }
}
