package com.ll.exam;

public class Util {
    public static class str {

        public static String beforeFrom(String str, String fromStr, int matchCount) {
            StringBuilder sb = new StringBuilder();

            String[] bits = str.split(fromStr);

            for (int i = 0; i < matchCount; i++) {
                sb.append(bits[i]);
                if ( i + 1 < matchCount ) {
                    sb.append(fromStr);
                }
            }

            return sb.toString();
        }
    }

    ;
}
