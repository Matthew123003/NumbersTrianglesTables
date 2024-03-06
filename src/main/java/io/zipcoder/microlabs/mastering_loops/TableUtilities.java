package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder sb = new StringBuilder();
        int n = 1;
        for(int i = 0; i < n; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder sb = new StringBuilder();
        int n = 1;
        for(int i = 0; i < n; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                int k = i * j;
                if(k < 10){
                    sb.append("  "+k+" ").append("|");
                } else if (k >= 10 && k < 100) {
                    sb.append(" "+k+" ").append("|");
                } else if (k >= 100 && k <= 400){
                    sb.append(k+" ").append("|");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
