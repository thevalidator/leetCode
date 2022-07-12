/*
 * The Krechet Software
 */

package com.leetcode.isomorphicstrings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {
    
    public static boolean isIsomorphic(String s, String t) {

        if (s.length() == t.length()) {
            
            Map<Character, Character> match = new HashMap<>();
            
            for (int i = 0; i < s.length(); i++) {
                
                char sss = s.charAt(i);
                char ttt = t.charAt(i);

                if (!match.containsKey(sss) && !match.containsValue(ttt)) {
                    
                    match.put(sss, ttt);

                } else {
                    
                    if (match.containsKey(sss)) {
                        if (match.get(sss) != ttt) {
                            return false;
                        }
                    } else {
                        return false;
                    }

                }
            }
            
            return true;

        }

        return false;

    }
    
    
    public static boolean isIsomorphic2(String s, String t) {
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                return false;
            }
        }
        return true;
    }

}
