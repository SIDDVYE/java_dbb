// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.compress.compressors.deflate64;

enum HuffmanState
{
    INITIAL, 
    STORED, 
    DYNAMIC_CODES, 
    FIXED_CODES;
}
