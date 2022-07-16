/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.issubsequence;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0) {
            return true;
        }

        if (t.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        int index = 0;

        for (char c : t.toCharArray()) {
            if (index != chars.length) {
                if (c == chars[index]) {
                    index++;
                }

            } else {
                break;
            }

        }

        return index == chars.length;

    }

}
