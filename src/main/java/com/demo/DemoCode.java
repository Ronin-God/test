package com.demo;

/**
 * @Author: Ronin
 * @date 2024/2/25 15:25
 * @Version 1.0
 * @Description:
 */

public class DemoCode {

    public static String testDemo1(String input) {
        StringBuilder sb = new StringBuilder(input);
        boolean found = true;

        while (found) {
            found = false;
            int start = -1;
            for (int i = 0; i < sb.length() - 2; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1) && sb.charAt(i + 1) == sb.charAt(i + 2)) {
                    start = i;
                    found = true;
                    break;
                }
            }
            if (found) {
                int end = start + 2;
                while (end < sb.length() && sb.charAt(start) == sb.charAt(end)) {
                    end++;
                }
                sb.delete(start, end);
            }
        }
        return sb.toString();
    }

    public static String testDemo2(String input) {
        StringBuilder sb = new StringBuilder(input);
        boolean found = true;

        while (found) {
            found = false;
            int start = -1;
            for (int i = 0; i < sb.length() - 2; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1) && sb.charAt(i + 1) == sb.charAt(i + 2)) {
                    start = i;
                    found = true;
                    break;
                }
            }
            if (found) {
                char replacement = (char) (sb.charAt(start) - 1);
                sb.replace(start, start + 3, String.valueOf(replacement));
            }
        }

        return sb.toString();
    }

}
