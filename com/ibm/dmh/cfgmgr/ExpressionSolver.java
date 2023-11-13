// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr;

import com.ibm.dmh.util.StringUtils;

public class ExpressionSolver
{
    public static boolean solveBoolean(final String s) throws Exception {
        return solveMath(s) > 0;
    }
    
    public static int solveMath(String s) throws Exception {
        if (StringUtils.isEmpty(s)) {
            throw new RuntimeException("Blank expression passed to ExpressionSolver.");
        }
        s = fixUp(s);
        s = methodizeOperator(s, '*', "mul");
        s = methodizeOperator(s, '/', "div");
        s = methodizeOperator(s, '+', "add");
        s = methodizeOperator(s, '-', "sub");
        s = methodizeOperator(s, '=', "equ");
        s = methodizeOperator(s, '!', "neq");
        s = methodizeOperator(s, '&', "and");
        s = methodizeOperator(s, '|', "orr");
        s = methodizeOperator(s, '>', "grt");
        s = methodizeOperator(s, '<', "les");
        try {
            return solve(s.toCharArray(), 0, s.length());
        }
        catch (ArithmeticException e) {
            return 0;
        }
    }
    
    public static float solveFloatMath(String s) throws Exception {
        s = fixUp(s);
        s = methodizeOperator(s, '*', "mul");
        s = methodizeOperator(s, '/', "div");
        s = methodizeOperator(s, '+', "add");
        s = methodizeOperator(s, '-', "sub");
        s = methodizeOperator(s, '=', "equ");
        s = methodizeOperator(s, '!', "neq");
        s = methodizeOperator(s, '&', "and");
        s = methodizeOperator(s, '|', "orr");
        final float f = solveFloat(s.toCharArray(), 0, s.length());
        return Float.isNaN(f) ? 0.0f : f;
    }
    
    private static String methodizeOperator(String s, final char op, final String meth) {
        int i;
        while ((i = s.indexOf(op)) != -1) {
            final char[] x = s.toCharArray();
            final String op2 = op1(x, i);
            final String op3 = op2(x, i);
            s = ((op2.length() < i) ? s.substring(0, i - op2.length()) : "") + meth + "(" + op2 + "," + op3 + ")" + ((i + op3.length() < s.length()) ? s.substring(i + op3.length() + 1) : "");
        }
        return s;
    }
    
    private static String op1(final char[] s, final int p) {
        if (p == 0) {
            return "";
        }
        if (s[p - 1] == ')') {
            int parCount = 1;
            int j = 2;
            while (parCount != 0) {
                if (s[p - j] == ')') {
                    ++parCount;
                }
                else if (s[p - j] == '(') {
                    --parCount;
                }
                ++j;
            }
            return new String(s, p - j - 2, j + 2);
        }
        int i = 1;
        if (s[p - 1] == '\'' || s[p - 1] == '\"') {
            ++i;
            while (p - i >= 0 && s[p - i] != s[p - 1]) {
                ++i;
            }
            if (p - i >= 0) {
                ++i;
            }
        }
        else {
            while (p - i >= 0 && (Character.isJavaIdentifierPart(s[p - i]) || s[p - i] == '#' || s[p - i] == '\'' || s[p - i] == '\"')) {
                ++i;
            }
        }
        return new String(s, p - i + 1, i - 1);
    }
    
    private static String op2(final char[] s, final int p) {
        if (s.length > p + 4 && Character.isLetter(s[p + 1]) && Character.isLetter(s[p + 2]) && Character.isLetter(s[p + 3]) && s[p + 4] == '(') {
            int parCount = 1;
            int j = 5;
            while (parCount != 0) {
                if (s[p + j] == '(') {
                    ++parCount;
                }
                else if (s[p + j] == ')') {
                    --parCount;
                }
                ++j;
            }
            return new String(s, p + 1, j - 1);
        }
        int i = 1;
        if (p + 2 <= s.length && (s[p + 1] == '\'' || s[p + 1] == '\"')) {
            ++i;
            while (p + i < s.length && s[p + i] != s[p + 1]) {
                ++i;
            }
            if (p + i < s.length) {
                ++i;
            }
        }
        else {
            while (p + i < s.length && (Character.isJavaIdentifierPart(s[p + i]) || s[p + i] == '#' || s[p + i] == '\'' || s[p + i] == '\"')) {
                ++i;
            }
        }
        return new String(s, p + 1, i - 1);
    }
    
    private static String fixUp(String s) throws Exception {
        if (s.indexOf(" >= ") != -1 || s.indexOf(" <= ") != -1) {
            throw new Exception("Unsupported operator used.");
        }
        for (int i = 0; (i = s.indexOf("true")) != -1; s = s.substring(0, i) + "1" + s.substring(i + 4)) {}
        for (int i = 0; (i = s.indexOf("false")) != -1; s = s.substring(0, i) + "0" + s.substring(i + 5)) {}
        for (int i = 0; (i = s.indexOf("null")) != -1; s = s.substring(0, i) + "0" + s.substring(i + 4)) {}
        for (int i = 0; (i = s.indexOf(" AND ")) != -1; s = s.substring(0, i) + " && " + s.substring(i + 5)) {}
        for (int i = 0; (i = s.indexOf(" OR ")) != -1; s = s.substring(0, i) + " || " + s.substring(i + 4)) {}
        int i = 0;
        while ((i = s.indexOf("!", i)) != -1) {
            if (s.charAt(i + 1) != '=') {
                s = s.substring(0, i) + "1 !=" + s.substring(i + 1);
                i += 4;
            }
            else {
                ++i;
            }
        }
        final StringBuffer sb = new StringBuffer();
        char quoteChar = ' ';
        boolean inQuotes = false;
        for (i = 0; i < s.length(); ++i) {
            final char c = s.charAt(i);
            if (inQuotes) {
                if (c == quoteChar) {
                    inQuotes = false;
                    quoteChar = ' ';
                }
            }
            else if (c == '\'' || c == '\"') {
                inQuotes = true;
                quoteChar = c;
            }
            if (inQuotes || !Character.isSpaceChar(c)) {
                if (!inQuotes && (c == '&' || c == '|' || c == '!' || c == '=')) {
                    ++i;
                }
                sb.append(c);
            }
        }
        s = sb.toString();
        sb.setLength(0);
        for (i = 0; i < s.length(); ++i) {
            final char c = s.charAt(i);
            if (c == '(' && (i == 0 || !Character.isLetter(s.charAt(i - 1)))) {
                sb.append("par(");
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    private static int solve(final char[] exp, final int start, final int end) throws Exception {
        if (Character.isDigit(exp[start])) {
            try {
                return Integer.parseInt(new String(exp, start, end - start));
            }
            catch (NumberFormatException ex) {}
        }
        if (start + 3 >= exp.length || exp[start + 3] != '(') {
            return Integer.MAX_VALUE;
        }
        final String opcode = new String(exp, start, 3);
        int parCount = 0;
        int argCount = 1;
        for (int i = start + 4; i < end - 1; ++i) {
            if (exp[i] == ',') {
                if (parCount == 0) {
                    exp[i] = '\u1000';
                    ++argCount;
                }
            }
            else if (exp[i] == '(') {
                ++parCount;
            }
            else if (exp[i] == ')') {
                --parCount;
            }
        }
        final int[] args = new int[argCount];
        int j = start + 4;
        for (int k = 0; k < argCount - 1; ++k) {
            int l;
            for (l = j; exp[l] != '\u1000'; ++l) {}
            args[k] = solve(exp, j, l);
            j = l + 1;
        }
        args[argCount - 1] = solve(exp, j, end - 1);
        if (args.length > 1 && args[0] == Integer.MAX_VALUE && args[1] == Integer.MAX_VALUE) {
            final String x = new String(exp, start + 4, end - start - 5);
            String arg1 = x.substring(0, x.indexOf(4096));
            String arg2 = x.substring(x.indexOf(4096) + 1);
            if (arg1.length() > 0 && (arg1.charAt(0) == '\'' || arg1.charAt(0) == '\"')) {
                arg1 = arg1.substring(1, arg1.length() - 1);
            }
            if (arg2.length() > 0 && (arg2.charAt(0) == '\'' || arg2.charAt(0) == '\"')) {
                arg2 = arg2.substring(1, arg2.length() - 1);
            }
            if (opcode.equals("equ")) {
                return arg1.equals(arg2) ? 1 : 0;
            }
            if (opcode.equals("neq")) {
                return arg1.equals(arg2) ? 0 : 1;
            }
        }
        if (opcode.equals("add")) {
            return args[0] + args[1];
        }
        if (opcode.equals("sub")) {
            return args[0] - args[1];
        }
        if (opcode.equals("mul")) {
            return args[0] * args[1];
        }
        if (opcode.equals("div")) {
            return args[0] / args[1];
        }
        if (opcode.equals("max")) {
            return Math.max(args[0], args[1]);
        }
        if (opcode.equals("min")) {
            return Math.min(args[0], args[1]);
        }
        if (opcode.equals("par")) {
            return args[0];
        }
        if (opcode.equals("abs")) {
            return Math.abs(args[0]);
        }
        if (opcode.equals("equ")) {
            return (args[0] == args[1]) ? 1 : 0;
        }
        if (opcode.equals("neq")) {
            return (args[0] != args[1]) ? 1 : 0;
        }
        if (opcode.equals("and")) {
            return (args[0] > 0 && args[1] > 0) ? 1 : 0;
        }
        if (opcode.equals("orr")) {
            return (args[0] > 0 || args[1] > 0) ? 1 : 0;
        }
        if (opcode.equals("grt")) {
            return (args[0] > args[1]) ? 1 : 0;
        }
        if (opcode.equals("les")) {
            return (args[0] < args[1]) ? 1 : 0;
        }
        return Integer.MAX_VALUE;
    }
    
    private static float solveFloat(final char[] exp, final int start, final int end) throws Exception {
        if (Character.isDigit(exp[start])) {
            try {
                return Float.parseFloat(new String(exp, start, end - start));
            }
            catch (NumberFormatException ex) {}
        }
        if (start + 3 >= exp.length || exp[start + 3] != '(') {
            return Float.MAX_VALUE;
        }
        final String opcode = new String(exp, start, 3);
        int parCount = 0;
        int argCount = 1;
        for (int i = start + 4; i < end - 1; ++i) {
            if (exp[i] == ',') {
                if (parCount == 0) {
                    exp[i] = '\u1000';
                    ++argCount;
                }
            }
            else if (exp[i] == '(') {
                ++parCount;
            }
            else if (exp[i] == ')') {
                --parCount;
            }
        }
        final float[] args = new float[argCount];
        int j = start + 4;
        for (int k = 0; k < argCount - 1; ++k) {
            int l;
            for (l = j; exp[l] != '\u1000'; ++l) {}
            args[k] = solveFloat(exp, j, l);
            j = l + 1;
        }
        args[argCount - 1] = solveFloat(exp, j, end - 1);
        if (args.length > 1 && args[0] == Float.MAX_VALUE && args[1] == Float.MAX_VALUE) {
            final String x = new String(exp, start + 4, end - start - 5);
            String arg1 = x.substring(0, x.indexOf(4096));
            String arg2 = x.substring(x.indexOf(4096) + 1);
            if (arg1.charAt(0) == '\'' || arg1.charAt(0) == '\"') {
                arg1 = arg1.substring(1, arg1.length() - 2);
            }
            if (arg2.charAt(0) == '\'' || arg2.charAt(0) == '\"') {
                arg2 = arg2.substring(1, arg2.length() - 2);
            }
            if (opcode.equals("equ")) {
                return (float)(arg1.equals(arg2) ? 1 : 0);
            }
            if (opcode.equals("neq")) {
                return (float)(arg1.equals(arg2) ? 0 : 1);
            }
        }
        if (opcode.equals("add")) {
            return args[0] + args[1];
        }
        if (opcode.equals("sub")) {
            return args[0] - args[1];
        }
        if (opcode.equals("mul")) {
            return args[0] * args[1];
        }
        if (opcode.equals("div")) {
            return args[0] / args[1];
        }
        if (opcode.equals("max")) {
            return Math.max(args[0], args[1]);
        }
        if (opcode.equals("min")) {
            return Math.min(args[0], args[1]);
        }
        if (opcode.equals("par")) {
            return args[0];
        }
        if (opcode.equals("abs")) {
            return Math.abs(args[0]);
        }
        if (opcode.equals("equ")) {
            return (float)((args[0] == args[1]) ? 1 : 0);
        }
        if (opcode.equals("neq")) {
            return (float)((args[0] != args[1]) ? 1 : 0);
        }
        if (opcode.equals("and")) {
            return (float)((args[0] > 0.0f && args[1] > 0.0f) ? 1 : 0);
        }
        if (opcode.equals("orr")) {
            return (float)((args[0] > 0.0f || args[1] > 0.0f) ? 1 : 0);
        }
        return Float.MAX_VALUE;
    }
}
