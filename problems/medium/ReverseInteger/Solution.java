package com.leetcode.problems.medium.reverseinteger;

public class Solution {

    private final int DIVIDER = 10;

    public int reverse(int x) {
        StringBuilder reverseNumber = new StringBuilder();
        if (x < 0 ) {
            reverseNumber.append("-");
        }

        for (int i = 0;; i++) {
            int remainder = Math.abs(x % DIVIDER);
            x = x / DIVIDER;
            reverseNumber.append(remainder);
            if (x == 0) {
                break;
            }
        }        
        try {
            int result = Integer.parseInt(reverseNumber.toString());
            return result;
        } catch (NumberFormatException e) {
            return 0;
        }       
    }
    
    // the solution from the leetcode
    public int reverseTwo(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
