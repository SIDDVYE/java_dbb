// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr.vars;

import com.ibm.dmh.cfgmgr.ExpressionSolver;

public class MathBoolVar extends AbstractVar
{
    public static MathBoolVar singleton;
    
    @Override
    public String resolve(final String varName, final String[] args, final VarTracker t) throws VarException {
        if (args.length < 1 || args.length > 1) {
            throw new VarException(varName, args, "Invalid number of arguments.  Must be 1.");
        }
        try {
            return ExpressionSolver.solveBoolean(args[0]) ? "true" : "false";
        }
        catch (Exception e) {
            throw new VarException(varName, args, e.getMessage());
        }
    }
    
    static {
        MathBoolVar.singleton = new MathBoolVar();
    }
}
