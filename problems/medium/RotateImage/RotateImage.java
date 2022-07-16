/*
 * The Krechet Software
 */

package com.leetcode.problems.medium.rotateimage;

/**
 *
 * @author theValidator <the.validator@yandex.ru>
 */
public class RotateImage {

    public static void main(String[] args) {
        
        int[][] matrix = {
                          { 5, 1, 9,11},
                          { 2, 4, 8,10},
                          {13, 3, 6, 7},
                          {15,14,12,16}
                        };
        
        
        printMatrix(matrix);
        
        Solution.rotate(matrix);
        
        printMatrix(matrix);
        
    }
    
    public static void printMatrix(int[][] matrix) {
        System.out.println("==== START ====");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(" %2d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("==== END ====\n");
    }
    
}
