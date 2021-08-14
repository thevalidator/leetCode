/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.pow;

/**
 *
 * @author theValidator
 */

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("--> " + s.myPow(2.0, -2));
        System.out.println("--> " + s.myPow(34.00515, -3));
        System.out.println("== " + Math.pow(34.00515, -3));
        System.out.println("--> " + s.myPowSecond(2., -13));
        System.out.println("== " + Math.pow(2., -13));
        
                
    }
}
