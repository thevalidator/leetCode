/*
 * The Krechet Software
 */

package com.leetcode.problems.easy.isomorphicstrings;

/**
 *
 * @author theValidator <the.validator@yandex.ru>
 */
public class IsomorphicStrings {

    public static void main(String[] args) {
        
        String s = "badc";
        String t = "baba";
        
        System.out.println(Solution.isIsomorphic(s, t));
        System.out.println(Solution.isIsomorphic2(s, t));
        
        System.out.println(t.indexOf(t.charAt(2)));
        
    }
}
