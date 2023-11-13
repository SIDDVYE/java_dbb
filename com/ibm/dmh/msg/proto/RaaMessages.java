// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg.proto;

import com.ibm.dmh.util.StringUtils;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.ibm.dmh.util.TextFileContents;
import java.util.Locale;
import java.util.HashMap;

public class RaaMessages
{
    private static HashMap<String, String> messages;
    
    public static void init(final String wsaaHome) throws Exception {
        if (RaaMessages.messages != null) {
            return;
        }
        RaaMessages.messages = new HashMap<String, String>();
        final String lang = Locale.getDefault().getLanguage();
        String l = "en_US";
        if (lang.equals("ja")) {
            l = "ja_JP";
        }
        else if (lang.equals("ko")) {
            l = "ko_KR";
        }
        final String[] files = { "messages/" + l + "/dist1.ide", "messages/" + l + "/dist2.ide", "messages/" + l + "/dist3.ide", "messages/" + l + "/dist4.ide", "messages/" + l + "/dist5.ide", "messages/aes/" + l + "/mvs1.ide", "messages/mvs/" + l + "/mvs2.ide", "messages/mvs/" + l + "/mvs3.ide", "messages/mvs/" + l + "/mvs4.ide", "messages/mvs/" + l + "/mvs5.ide", "messages/mvs/" + l + "/mvs6.ide", "messages/mvs/" + l + "/mvs7.ide" };
        final TextFileContents fc = new TextFileContents();
        fc.setCapacity(500000);
        fc.setMaxReuseCapacity(1000000);
        final Pattern p = Pattern.compile("\\<msgnum\\>(.*?)\\<\\/msgnum\\>.*?\\<msgtext\\>(.*?)\\<\\/msgtext\\>", 32);
        for (int i = 0; i < files.length; ++i) {
            fc.readFile(wsaaHome + "/" + files[i], "UTF-8");
            final Matcher m = p.matcher(fc.getContents());
            while (m.find()) {
                RaaMessages.messages.put(m.group(1).trim().toLowerCase(), m.group(2).replaceAll("[\r\n]", " ").trim());
            }
        }
    }
    
    public static LogRecord getMessage(final String id, final String... vars) {
        final char lc = Character.toLowerCase(id.charAt(id.length() - 1));
        Level level = Level.INFO;
        switch (lc) {
            case 'e': {
                level = Level.SEVERE;
                break;
            }
            case 'w': {
                level = Level.WARNING;
                break;
            }
            default: {
                level = Level.INFO;
                break;
            }
        }
        String text = RaaMessages.messages.get(id.toLowerCase());
        if (text == null) {
            text = "message id=[" + id + "], args=[" + StringUtils.join(vars, ",") + "]";
        }
        else if (vars.length == 1) {
            text = text.replaceAll("\\<mv\\>[^\\>]*\\<\\/mv\\>", vars[0]);
        }
        else {
            String key;
            String val;
            for (int i = 0; i < vars.length; val = vars[++i], text = text.replaceAll("\\<mv\\>\\s*" + key + "\\s*\\<\\/mv\\>", val), ++i) {
                key = vars[i];
            }
        }
        return new LogRecord(level, text);
    }
}
