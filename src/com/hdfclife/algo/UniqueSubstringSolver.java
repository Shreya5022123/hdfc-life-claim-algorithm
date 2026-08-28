package com.hdfclife.algo;

import java.util.HashSet;

public class UniqueSubstringSolver {


    public static int longestUniqueSubstring(String input) {

        HashSet<Character> window = new HashSet<>();

        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < input.length(); end++) {

            char current = input.charAt(end);

            while (window.contains(current)) {
                window.remove(input.charAt(start));
                start++;
            }

            window.add(current);

            int currentLength = end - start + 1;

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }
}
