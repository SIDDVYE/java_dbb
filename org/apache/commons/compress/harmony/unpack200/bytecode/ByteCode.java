// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.apache.commons.compress.harmony.unpack200.Segment;
import java.io.IOException;
import java.io.DataOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm;

public class ByteCode extends ClassFileEntry
{
    private static ByteCode[] noArgByteCodes;
    private final ByteCodeForm byteCodeForm;
    private ClassFileEntry[] nested;
    private int[][] nestedPositions;
    private int[] rewrite;
    private int byteCodeOffset;
    private int[] byteCodeTargets;
    
    public static ByteCode getByteCode(final int opcode) {
        final int byteOpcode = 0xFF & opcode;
        if (ByteCodeForm.get(byteOpcode).hasNoOperand()) {
            if (null == ByteCode.noArgByteCodes[byteOpcode]) {
                ByteCode.noArgByteCodes[byteOpcode] = new ByteCode(byteOpcode);
            }
            return ByteCode.noArgByteCodes[byteOpcode];
        }
        return new ByteCode(byteOpcode);
    }
    
    protected ByteCode(final int opcode) {
        this(opcode, ClassFileEntry.NONE);
    }
    
    protected ByteCode(final int opcode, final ClassFileEntry[] nested) {
        this.byteCodeOffset = -1;
        this.byteCodeForm = ByteCodeForm.get(opcode);
        this.rewrite = this.byteCodeForm.getRewriteCopy();
        this.nested = nested;
    }
    
    @Override
    protected void doWrite(final DataOutputStream dos) throws IOException {
        for (int i = 0; i < this.rewrite.length; ++i) {
            dos.writeByte(this.rewrite[i]);
        }
    }
    
    @Override
    public boolean equals(final Object obj) {
        return this == obj;
    }
    
    public void extractOperands(final OperandManager operandManager, final Segment segment, final int codeLength) {
        final ByteCodeForm currentByteCodeForm = this.getByteCodeForm();
        currentByteCodeForm.setByteCodeOperands(this, operandManager, codeLength);
    }
    
    protected ByteCodeForm getByteCodeForm() {
        return this.byteCodeForm;
    }
    
    public int getLength() {
        return this.rewrite.length;
    }
    
    public String getName() {
        return this.getByteCodeForm().getName();
    }
    
    public ClassFileEntry[] getNestedClassFileEntries() {
        return this.nested;
    }
    
    public int getOpcode() {
        return this.getByteCodeForm().getOpcode();
    }
    
    @Override
    public int hashCode() {
        return this.objectHashCode();
    }
    
    @Override
    protected void resolve(final ClassConstantPool pool) {
        super.resolve(pool);
        if (this.nested.length > 0) {
            for (int index = 0; index < this.nested.length; ++index) {
                final int argLength = this.getNestedPosition(index)[1];
                switch (argLength) {
                    case 1: {
                        this.setOperandByte(pool.indexOf(this.nested[index]), this.getNestedPosition(index)[0]);
                        break;
                    }
                    case 2: {
                        this.setOperand2Bytes(pool.indexOf(this.nested[index]), this.getNestedPosition(index)[0]);
                        break;
                    }
                    default: {
                        throw new Error("Unhandled resolve " + this);
                    }
                }
            }
        }
    }
    
    public void setOperandBytes(final int[] operands) {
        final int firstOperandIndex = this.getByteCodeForm().firstOperandIndex();
        final int byteCodeFormLength = this.getByteCodeForm().operandLength();
        if (firstOperandIndex < 1) {
            throw new Error("Trying to rewrite " + this + " that has no rewrite");
        }
        if (byteCodeFormLength != operands.length) {
            throw new Error("Trying to rewrite " + this + " with " + operands.length + " but bytecode has length " + this.byteCodeForm.operandLength());
        }
        for (int index = 0; index < byteCodeFormLength; ++index) {
            this.rewrite[index + firstOperandIndex] = (operands[index] & 0xFF);
        }
    }
    
    public void setOperand2Bytes(final int operand, final int position) {
        final int firstOperandIndex = this.getByteCodeForm().firstOperandIndex();
        final int byteCodeFormLength = this.getByteCodeForm().getRewrite().length;
        if (firstOperandIndex < 1) {
            throw new Error("Trying to rewrite " + this + " that has no rewrite");
        }
        if (firstOperandIndex + position + 1 > byteCodeFormLength) {
            throw new Error("Trying to rewrite " + this + " with an int at position " + position + " but this won't fit in the rewrite array");
        }
        this.rewrite[firstOperandIndex + position] = (operand & 0xFF00) >> 8;
        this.rewrite[firstOperandIndex + position + 1] = (operand & 0xFF);
    }
    
    public void setOperandSigned2Bytes(final int operand, final int position) {
        if (operand >= 0) {
            this.setOperand2Bytes(operand, position);
        }
        else {
            final int twosComplementOperand = 65536 + operand;
            this.setOperand2Bytes(twosComplementOperand, position);
        }
    }
    
    public void setOperandByte(final int operand, final int position) {
        final int firstOperandIndex = this.getByteCodeForm().firstOperandIndex();
        final int byteCodeFormLength = this.getByteCodeForm().operandLength();
        if (firstOperandIndex < 1) {
            throw new Error("Trying to rewrite " + this + " that has no rewrite");
        }
        if (firstOperandIndex + position > byteCodeFormLength) {
            throw new Error("Trying to rewrite " + this + " with an byte at position " + position + " but this won't fit in the rewrite array");
        }
        this.rewrite[firstOperandIndex + position] = (operand & 0xFF);
    }
    
    @Override
    public String toString() {
        return this.getByteCodeForm().getName();
    }
    
    public void setNested(final ClassFileEntry[] nested) {
        this.nested = nested;
    }
    
    public void setNestedPositions(final int[][] nestedPositions) {
        this.nestedPositions = nestedPositions;
    }
    
    public int[][] getNestedPositions() {
        return this.nestedPositions;
    }
    
    public int[] getNestedPosition(final int index) {
        return this.getNestedPositions()[index];
    }
    
    public boolean hasMultipleByteCodes() {
        return this.getByteCodeForm().hasMultipleByteCodes();
    }
    
    public void setByteCodeIndex(final int byteCodeOffset) {
        this.byteCodeOffset = byteCodeOffset;
    }
    
    public int getByteCodeIndex() {
        return this.byteCodeOffset;
    }
    
    public void setByteCodeTargets(final int[] byteCodeTargets) {
        this.byteCodeTargets = byteCodeTargets;
    }
    
    public int[] getByteCodeTargets() {
        return this.byteCodeTargets;
    }
    
    public void applyByteCodeTargetFixup(final CodeAttribute codeAttribute) {
        this.getByteCodeForm().fixUpByteCodeTargets(this, codeAttribute);
    }
    
    public void setRewrite(final int[] rewrite) {
        this.rewrite = rewrite;
    }
    
    public int[] getRewrite() {
        return this.rewrite;
    }
    
    public boolean nestedMustStartClassPool() {
        return this.byteCodeForm.nestedMustStartClassPool();
    }
    
    static {
        ByteCode.noArgByteCodes = new ByteCode[255];
    }
}
