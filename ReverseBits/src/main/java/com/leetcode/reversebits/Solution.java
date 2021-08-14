/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.reversebits;

public class Solution {

    // you need treat n as an unsigned value
    public int reverseBitsBuiltInMethod(int n) {
        return Integer.reverse(n);
    }
    
    public int reverseBitsStringMethod(int n) {
        String bits = Integer.toBinaryString(n);
        char[] bitsArray = bits.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char bit : bitsArray) {
            sb.append(bit);
        }

        sb = sb.reverse();
        int len = sb.length();
        if (sb.length() < 32) {
            for (int i = 0; i < (32 - len); i++) {
                sb.append('0');
            }
        }
        int result = Integer.parseUnsignedInt(sb.toString(), 2);

        return result;
    }

    //from leetcode discussions
    public int reverseBits(int n) {
        int ret = 0;
        // because there are 32 bits in total
        for (int i = 0; i < 32; i++) {
            ret = ret << 1;
            // If the bit is 1 we OR it with 1, ie add 1
            if ((n & 1) > 0) {
                ret = ret | 1;
            }
            n = n >>> 1;
        }
        return ret;
    }

    // from leetcode discussions
    public int reverseBitsSecond(int n) {
        int ret = 0, cnt = 32;
        while (cnt-- > 0) {
            ret = (ret << 1) | (n & 0x1);
            n = n >>> 1;
        }
        return ret;
    }

    // from leetcode discussions 
    // https://leetcode.com/problems/reverse-bits/discuss/1232842/Java-%3A-0ms-or-in-place-or-O(1)-Time-Complexity-or-Detailed-explanation
    public int reverseBitsThird(int num) {
        num = ((num & 0xffff0000) >>> 16) | ((num & 0x0000ffff) << 16);
        num = ((num & 0xff00ff00) >>> 8) | ((num & 0x00ff00ff) << 8);
        num = ((num & 0xf0f0f0f0) >>> 4) | ((num & 0x0f0f0f0f) << 4); //f = 1111
        num = ((num & 0xcccccccc) >>> 2) | ((num & 0x33333333) << 2); //c = 1100
        num = ((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1); //a = 1010

        return num;

    }

}
