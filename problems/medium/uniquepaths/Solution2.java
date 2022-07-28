/*
 * The Krechet Software
 */
package com.leetcode.problems.medium.uniquepaths;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution2 {
    
    public static void main(String[] args) {
        System.out.println(uniquePaths(4, 4));
    }

    public static int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    grid[i][j] = 1;
                } else {
                    grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
                }
                System.out.print(grid[i][j]);
            }
            System.out.println("");
        }
        return grid[m - 1][n - 1];
    }

}
