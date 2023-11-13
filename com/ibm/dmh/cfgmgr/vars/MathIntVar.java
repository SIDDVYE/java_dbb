// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr.vars;

import com.ibm.dmh.cfgmgr.ExpressionSolver;

public class MathIntVar extends AbstractVar
{
    public static MathIntVar singleton;
    
    @Override
    public String resolve(final String varName, final String[] args, final VarTracker t) throws VarException {
        if (args.length < 1 || args.length > 1) {
            throw new VarException(varName, args, "Invalid number of arguments.  Must be 1.");
        }
        try {
            return "" + ExpressionSolver.solveMath(args[0]);
        }
        catch (Exception e) {
            throw new VarException(varName, args, e.getMessage());
        }
    }
    
    static {
        MathIntVar.singleton = new MathIntVar();
    }
}
