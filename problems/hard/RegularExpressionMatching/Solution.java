package com.leetcode.regularexpressionmatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {

    public boolean isMatchMy(String s, String p) {

        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);

        return matcher.matches();
        //return s.matches(p);

    }

    //leetcode
    public boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) {
            return text.isEmpty();
        }
        boolean first_match = (!text.isEmpty()
                && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            return (isMatch(text, pattern.substring(2))
                    || (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }

}
