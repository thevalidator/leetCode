/*
 * The Krechet Software
 */

package com.leetcode.rotateimage;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {
    
    public static void rotate(int[][] matrix) {

        int rowElements = matrix.length - 1;
        int rows = matrix.length / 2;

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < (rowElements - i); j++) {

                int buffer = matrix[i][j];
                matrix[i][j] = matrix[rowElements - j][i];
                matrix[rowElements - j][i] = matrix[rowElements - i][rowElements - j];
                matrix[rowElements - i][rowElements - j] = matrix[j][rowElements - i];
                matrix[j][rowElements - i] = buffer;

            }
        }

    }

}
