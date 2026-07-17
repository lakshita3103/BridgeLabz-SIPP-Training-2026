package DSA.TwoPointerSlidingWindow;

import java.util.*;

public class MinimumWindow {

    public static String minWindowSubstring(String s, String t) {

        if (s.length() == 0 || t.length() == 0)
            return "";

        Map<Character, Integer> need = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();

        int required = need.size();
        int formed = 0;

        int start = 0;
        int minStart = 0;
        int minLen = Integer.MAX_VALUE;

        for (int end = 0; end < s.length(); end++) {

            char c = s.charAt(end);

            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) &&
                window.get(c).intValue() == need.get(c).intValue()) {

                formed++;
            }

            while (formed == required) {

                if (end - start + 1 < minLen) {

                    minLen = end - start + 1;
                    minStart = start;
                }

                char left = s.charAt(start);

                window.put(left, window.get(left) - 1);

                if (need.containsKey(left) &&
                    window.get(left) < need.get(left)) {

                    formed--;
                }

                start++;
            }
        }

        if (minLen == Integer.MAX_VALUE)
            return "";

        return s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {

        System.out.println(minWindowSubstring("ADOBECODEBANC", "ABC"));
    }
}