// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr.vars;

import com.ibm.dmh.util.StringUtils;

public class StringUtilsVar extends AbstractVar
{
    @Override
    public String resolve(final String varName, final String[] args, final VarTracker t) throws VarException {
        if (args.length < 2 || args.length > 2) {
            throw new VarException(varName, args, "Invalid number of arguments.  Must be 2.");
        }
        final String command = args[0];
        final String input = args[1];
        try {
            if (command.startsWith("substring")) {
                System.err.println("range=[" + command.substring(command.indexOf(40) + 1, command.indexOf(41)) + "]");
                final String[] range = StringUtils.split(command.substring(command.indexOf(40) + 1, command.indexOf(41)), ',');
                if (range.length == 1) {
                    return input.substring(Integer.parseInt(range[0]));
                }
                return input.substring(Integer.parseInt(range[0]), Integer.parseInt(range[1]));
            }
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
            throw new VarException(varName, args, e.getMessage());
        }
        throw new VarException(varName, args, "Unknown command: [" + command + "]");
    }
}
