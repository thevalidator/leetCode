/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.floodfill;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
class Solution {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int oldColor = image[sr][sc];
        
        if (image[sr][sc] == color) {
            return image;
        }
        
        image[sr][sc] = color;
        
        if (sr - 1 >= 0 && image[sr-1][sc] == oldColor) {
            floodFill(image, sr - 1, sc, color);
        }
        if (sc - 1 >= 0 && image[sr][sc-1] == oldColor) {
            floodFill(image, sr, sc - 1, color);
        }
        if (sr + 1 < image.length && image[sr+1][sc] == oldColor) {
            floodFill(image, sr + 1, sc, color);
        }
        if (sc + 1 < image[0].length && image[sr][sc+1] == oldColor) {
            floodFill(image, sr, sc + 1, color);
        }
        
        return image;
        
    }
    
}