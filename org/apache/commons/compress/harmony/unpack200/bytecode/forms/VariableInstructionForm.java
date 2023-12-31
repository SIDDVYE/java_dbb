// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

public abstract class VariableInstructionForm extends ByteCodeForm
{
    public VariableInstructionForm(final int opcode, final String name) {
        super(opcode, name);
    }
    
    public void setRewrite4Bytes(final int operand, final int[] rewrite) {
        int firstOperandPosition = -1;
        for (int index = 0; index < rewrite.length - 3; ++index) {
            if (rewrite[index] == -1 && rewrite[index + 1] == -1 && rewrite[index + 2] == -1 && rewrite[index + 3] == -1) {
                firstOperandPosition = index;
                break;
            }
        }
        this.setRewrite4Bytes(operand, firstOperandPosition, rewrite);
    }
    
    public void setRewrite4Bytes(final int operand, final int absPosition, final int[] rewrite) {
        if (absPosition < 0) {
            throw new Error("Trying to rewrite " + this + " but there is no room for 4 bytes");
        }
        final int byteCodeRewriteLength = rewrite.length;
        if (absPosition + 3 > byteCodeRewriteLength) {
            throw new Error("Trying to rewrite " + this + " with an int at position " + absPosition + " but this won't fit in the rewrite array");
        }
        rewrite[absPosition] = (0xFF000000 & operand) >> 24;
        rewrite[absPosition + 1] = (0xFF0000 & operand) >> 16;
        rewrite[absPosition + 2] = (0xFF00 & operand) >> 8;
        rewrite[absPosition + 3] = (0xFF & operand);
    }
    
    public void setRewrite2Bytes(final int operand, final int absPosition, final int[] rewrite) {
        if (absPosition < 0) {
            throw new Error("Trying to rewrite " + this + " but there is no room for 4 bytes");
        }
        final int byteCodeRewriteLength = rewrite.length;
        if (absPosition + 1 > byteCodeRewriteLength) {
            throw new Error("Trying to rewrite " + this + " with an int at position " + absPosition + " but this won't fit in the rewrite array");
        }
        rewrite[absPosition] = (0xFF00 & operand) >> 8;
        rewrite[absPosition + 1] = (0xFF & operand);
    }
}
