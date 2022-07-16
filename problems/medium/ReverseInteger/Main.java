/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems.medium.reverseinteger;

/**
 *
 * @author theValidator
 */
public class Main {
    public static void main(String[] args) {
        
        Solution s = new Solution();
        int reverseNumber = s.reverse(Integer.MIN_VALUE);
        System.out.println(reverseNumber);
        System.out.println(Integer.MAX_VALUE);
        
    }
    
}
