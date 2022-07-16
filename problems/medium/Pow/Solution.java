package com.leetcode.problems.medium.pow;

public class Solution {

    // r = n ^ m
    // m => 1101  -  4 bits (binary)
    // r = (((1 * n^1)^2 * n^1)^2 * n^0)^2 * n^1
    
    public double myPowSecond(double x, int n) {
        double result = 1;
        char[] bits = Integer.toBinaryString(Math.abs(n)).toCharArray();
        for (char bit : bits) {
            result *= result;
            if (bit == '1') {
                result *= x;
            }
        }
        if (n < 0) {
            result = 1 / result;
        }

        return result;
    }

    public double myPow(double x, int n) {
        if (n == 0 || Math.abs(x) == 1.0) {
            if (n % 2 != 0 && x < 0) {
                return -1;
            } else {
                return 1;
            }
        }
        double multipliier = x;
        if (n < 0) {
            for (int i = 0; i >= n; i--) {
                x /= multipliier;
                System.out.printf("i: %d, %f\n", i, x);
                if (x < 0.0001) {
                    return 0;
                }
            }
        } else {
            for (int i = 1; i < n; i++) {
                x *= multipliier;
                if (x > 10000.) {
                    return 0;
                }
            }
        }

        return x;
    }
}
