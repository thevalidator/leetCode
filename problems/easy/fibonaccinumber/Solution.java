/*
 * The Krechet Software
 */

package com.leetcode.problems.easy.fibonaccinumber;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {
    
    public static void main(String[] args) {
        fib(8);
    }
    
    public static int fib(int n) {
        
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        int result = 1;
        int prev = 0;
        
        for (int i = 2; i <= n; i++) {
            int tmp = result;
            result = result + prev;
            prev = tmp;
        }
        
        return result;
        
    }

}
