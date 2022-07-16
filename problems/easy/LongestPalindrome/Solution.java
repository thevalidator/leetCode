/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.longestpalindrome;

import java.util.HashMap;
import java.util.Map;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    public static int longestPalindrome(String s) {

        Map<Character, Integer> chars = new HashMap<>();

        for (char c : s.toCharArray()) {
            int count = chars.getOrDefault(c, 0);
            chars.put(c, ++count);
        }

        int length = 0;
        boolean hasOdd = false;

        for (Map.Entry<Character, Integer> e : chars.entrySet()) {

            int value = e.getValue();

            if (!hasOdd) {
                length += e.getValue();
                if (value % 2 != 0) {
                    hasOdd = true;
                }
            } else {
                if (value != 1) {
                    length += value % 2 == 0 ? value : --value;
                }
            }

        }

        return length;

    }

    public int longestPalindrome2(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int ans = 0;
        for (int v : count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1) {
                ans++;
            }
        }
        return ans;
    }

}
