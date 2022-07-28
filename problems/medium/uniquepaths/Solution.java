/*
 * The Krechet Software
 */
package com.leetcode.problems.medium.uniquepaths;

import java.math.BigInteger;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(uniquePaths(23, 12));

    }

    public static int uniquePaths(int m, int n) {

        if (m == 1 || n == 1) {
            return 1;
        } else if (m == 2) {
            return n;
        } else if (n == 2) {
            return m;
        } else {
            
            BigInteger a = factorial(m + n - 2);
            BigInteger b = factorial(n - 1);
            BigInteger c = factorial(m - 1);

            return Integer.valueOf(a.divide(b.multiply(c)).toString());

        }

    }

    private static BigInteger factorial(int number) {

        BigInteger f = new BigInteger("1");
        if (number == 1) {
            return f;
        } else {
            for (int i = number; i > 1; i--) {
                f = f.multiply(BigInteger.valueOf(i));
            }
        }

        return f;

    }

}
