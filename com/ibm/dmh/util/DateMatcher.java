// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.LinkedList;
import java.util.List;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMatcher implements IMatcher<Date>
{
    private TimestampPattern[] patterns;
    private static SimpleDateFormat[] validTimestampFormats;
    
    public static void setValidTimestampFormats(final String timestampFormats) {
        final String[] s = StringUtils.split(timestampFormats, ',');
        DateMatcher.validTimestampFormats = new SimpleDateFormat[s.length];
        for (int i = 0; i < s.length; ++i) {
            DateMatcher.validTimestampFormats[i] = new SimpleDateFormat(s[i]);
        }
    }
    
    public DateMatcher(final String searchPattern) {
        (this.patterns = new TimestampPattern[1])[0] = new TimestampPattern(searchPattern);
    }
    
    public DateMatcher(final String[] searchPatterns) {
        this.patterns = new TimestampPattern[searchPatterns.length];
        for (int i = 0; i < searchPatterns.length; ++i) {
            this.patterns[i] = new TimestampPattern(searchPatterns[i]);
        }
    }
    
    @Override
    public boolean matches(final Date input) {
        if (input == null) {
            return false;
        }
        for (int i = 0; i < this.patterns.length; ++i) {
            if (!this.patterns[i].matches(input)) {
                return false;
            }
        }
        return true;
    }
    
    protected static Date parseDate(final String seg, final ParsePosition pp) {
        boolean foundIt = false;
        Date d = null;
        for (int i = 0; i < DateMatcher.validTimestampFormats.length && !foundIt; ++i) {
            pp.setIndex(0);
            d = DateMatcher.validTimestampFormats[i].parse(seg, pp);
            final int idx = pp.getIndex();
            if (idx != 0) {
                final char c = (seg.length() == idx) ? '\0' : seg.charAt(idx);
                if (c == '\0' || c == '-' || Character.isWhitespace(c)) {
                    foundIt = true;
                }
            }
        }
        if (!foundIt) {
            throw new RuntimeException("Invalid date encountered:  [" + seg + "]");
        }
        return d;
    }
    
    static {
        setValidTimestampFormats("yyyy.MM.dd.HH.mm.ss,yyyy.MM.dd.HH.mm,yyyy.MM.dd.HH,yyyy.MM.dd,yyyy.MM,yyyy");
    }
    
    private class TimestampPattern
    {
        TimestampRange[] ranges;
        List<TimestampRange> l;
        
        public TimestampPattern(String s) {
            this.l = new LinkedList<TimestampRange>();
            if (s.charAt(0) == '\'' && s.charAt(s.length() - 1) == '\'') {
                s = s.substring(1, s.length() - 1);
            }
            final Pattern p = Pattern.compile("^\\s*([<>](?:=)?)\\s*(\\S+.*)$");
            final Pattern p2 = Pattern.compile("^(\\s*-\\s*)(\\S+.*)$");
            int state = 1;
            String op = null;
            Date startDate = null;
            final ParsePosition pp = new ParsePosition(0);
            Matcher m = null;
            String seg = s;
            while (!seg.equals("") || state != 1) {
                if (state == 1) {
                    m = p.matcher(seg);
                    if (m.matches()) {
                        op = m.group(1);
                        seg = m.group(2);
                        state = 2;
                    }
                    else {
                        state = 3;
                    }
                }
                else if (state == 2) {
                    this.l.add(new TimestampRange(op, DateMatcher.parseDate(seg, pp)));
                    seg = seg.substring(pp.getIndex()).trim();
                    pp.setIndex(0);
                    state = 1;
                }
                else if (state == 3) {
                    startDate = DateMatcher.parseDate(seg, pp);
                    seg = seg.substring(pp.getIndex()).trim();
                    pp.setIndex(0);
                    state = 4;
                }
                else if (state == 4) {
                    m = p2.matcher(seg);
                    if (m.matches()) {
                        state = 5;
                        seg = m.group(2);
                    }
                    else {
                        this.l.add(new TimestampRange(startDate));
                        state = 1;
                    }
                }
                else {
                    if (state != 5) {
                        continue;
                    }
                    this.l.add(new TimestampRange(startDate, DateMatcher.parseDate(seg, pp)));
                    seg = seg.substring(pp.getIndex()).trim();
                    pp.setIndex(0);
                    state = 1;
                }
            }
            this.ranges = this.l.toArray(new TimestampRange[this.l.size()]);
        }
        
        public boolean matches(final Date number) {
            if (this.ranges.length == 0) {
                return true;
            }
            for (int i = 0; i < this.ranges.length; ++i) {
                if (this.ranges[i].matches(number)) {
                    return true;
                }
            }
            return false;
        }
    }
    
    protected class TimestampRange
    {
        Date start;
        Date end;
        
        public TimestampRange(final Date singleDate) {
            this.start = new Date(singleDate.getTime() - 1L);
            this.end = this.rollUp(singleDate);
        }
        
        public TimestampRange(final String op, Date singleDate) {
            if (op.equals(">") || op.equals("<=")) {
                singleDate = this.rollUp(singleDate);
            }
            if (op.equals(">") || op.equals(">=")) {
                this.start = new Date(singleDate.getTime() - 1L);
                this.end = new Date(Long.MAX_VALUE);
            }
            else {
                this.start = new Date(0L);
                this.end = singleDate;
            }
        }
        
        public TimestampRange(final Date start, final Date end) {
            this.start = new Date(start.getTime() - 1L);
            this.end = this.rollUp(end);
        }
        
        public boolean matches(final Date i) {
            final boolean b = i.after(this.start) && i.before(this.end);
            return b;
        }
        
        private Date rollUp(final Date d) {
            final Calendar c = Calendar.getInstance();
            c.setTime(d);
            char precisionField = ' ';
            if (c.isSet(1)) {
                precisionField = 'y';
            }
            if (c.isSet(2)) {
                precisionField = 'M';
            }
            if (c.isSet(5)) {
                precisionField = 'd';
            }
            if (c.isSet(10) || c.isSet(11)) {
                precisionField = 'H';
            }
            if (c.isSet(12)) {
                precisionField = 'm';
            }
            if (c.isSet(13)) {
                precisionField = 's';
            }
            int f = 0;
            switch (precisionField) {
                case 'y': {
                    f = 1;
                    break;
                }
                case 'M': {
                    f = 2;
                    break;
                }
                case 'd': {
                    f = 5;
                    break;
                }
                case 'H': {
                    f = 11;
                    break;
                }
                case 'm': {
                    f = 12;
                    break;
                }
                case 's': {
                    f = 13;
                    break;
                }
            }
            c.roll(f, true);
            return c.getTime();
        }
    }
}
