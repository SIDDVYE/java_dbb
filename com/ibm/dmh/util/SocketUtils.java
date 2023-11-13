// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SocketUtils
{
    public static String connect(final String host, final int port, final String output) throws IOException {
        final Socket s = new Socket(host, port);
        final PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        final BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out.println(output);
        out.flush();
        final StringBuilder sb = new StringBuilder();
        String l;
        while ((l = in.readLine()) != null) {
            sb.append(l);
        }
        out.close();
        in.close();
        s.close();
        return sb.toString();
    }
}
