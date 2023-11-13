// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr.vars;

import com.ibm.dmh.cfgmgr.ExpressionSolver;

public class MathFloatVar extends AbstractVar
{
    private static int FLOAT;
    private static int PERCENT;
    
    @Override
    public String resolve(final String varName, final String[] args, final VarTracker t) throws VarException {
        if (args.length < 1 || args.length > 3) {
            throw new VarException(varName, args, "Invalid number of arguments.  Must be 1-3.");
        }
        final String expr = (args.length > 0) ? args[0] : "";
        final String typeArg = (args.length > 1) ? args[1] : "";
        final String precisionArg = (args.length > 2) ? args[2] : "";
        try {
            int type = 0;
            if (typeArg.equals("FLOAT")) {
                type = MathFloatVar.FLOAT;
            }
            else if (typeArg.equals("PERCENT")) {
                type = MathFloatVar.PERCENT;
            }
            int precision = 0;
            if (!precisionArg.equals("")) {
                precision = Integer.parseInt(precisionArg);
            }
            String val = null;
            float f = ExpressionSolver.solveFloatMath(expr);
            if (type == MathFloatVar.PERCENT) {
                f *= 100.0f;
            }
            final String s = Float.toString(f);
            if (s.indexOf(69) != -1) {
                val = s;
            }
            else {
                final int i = s.indexOf(46);
                if (i == -1) {
                    val = s;
                }
                else if (precision == 0) {
                    val = s.substring(0, i);
                }
                else {
                    final int endIndex = i + precision + 1;
                    if (s.length() < endIndex) {
                        final StringBuffer sb = new StringBuffer(endIndex);
                        sb.append(s);
                        for (int j = s.length(); j < endIndex; ++j) {
                            sb.append("0");
                        }
                        val = sb.toString();
                    }
                    else {
                        val = s.substring(0, endIndex);
                    }
                }
            }
            return val + ((type == MathFloatVar.PERCENT) ? "%" : "");
        }
        catch (Exception e) {
            throw new VarException(varName, args, e.getMessage());
        }
    }
    
    static {
        MathFloatVar.FLOAT = 1;
        MathFloatVar.PERCENT = 2;
    }
}
