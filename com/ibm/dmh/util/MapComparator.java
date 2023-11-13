// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Comparator;

public class MapComparator implements Comparator<Map>
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2016\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private ColumnInfo[] sortColumns;
    private List<ColumnInfo> sortColumnList;
    
    public MapComparator() {
        this.sortColumns = null;
        this.sortColumnList = new ArrayList<ColumnInfo>();
    }
    
    public void addSortColumn(final String name) {
        this.addSortColumn(name, true);
    }
    
    public void addSortColumn(final String name, final boolean isAscending) {
        this.sortColumnList.add(new ColumnInfo(name, isAscending));
    }
    
    @Override
    public int compare(final Map m1, final Map m2) {
        if (this.sortColumns == null) {
            this.sortColumns = this.sortColumnList.toArray(new ColumnInfo[this.sortColumnList.size()]);
        }
        int result = 0;
        for (int i = 0; i < this.sortColumns.length && result == 0; ++i) {
            final String colName = this.sortColumns[i].name;
            result = this.compareObject(m1.get(colName), m2.get(colName));
            if (!this.sortColumns[i].isAscending) {
                result *= -1;
            }
        }
        return result;
    }
    
    private int compareObject(final Object o1, final Object o2) {
        int result = 0;
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            final Comparable c1 = (Comparable)o1;
            final Comparable c2 = (Comparable)o2;
            result = c1.compareTo(c2);
        }
        else if (o1 == null && o2 != null) {
            result = -1;
        }
        else if (o1 != null && o2 == null) {
            result = 1;
        }
        return result;
    }
    
    private class ColumnInfo
    {
        String name;
        boolean isAscending;
        
        ColumnInfo(final String name, final boolean isAscending) {
            this.name = name;
            this.isAscending = isAscending;
        }
    }
}
