/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems.easy.reversebits;

/**
 *
 * @author theValidator
 */
public class Main {
    public static void main(String[] args) {
        int number = 43261596;
        
        System.out.println(Math.pow(2, 32));
        
        Solution s = new Solution();
        System.out.println(s.reverseBitsBuiltInMethod(number));
        System.out.println("--> " + s.reverseBitsStringMethod(number));
        System.out.println("--> " + s.reverseBitsSecond(number));
        System.out.println("--> " + s.reverseBits(number));
        
        int num = 234;
        
        num = ((num & 0xffff0000) >>> 16) | ((num & 0x0000ffff) << 16);
        System.out.println(num);
        
        
                
    }
    
}
