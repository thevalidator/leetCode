/*
 * The Krechet Software
 */
package com.leetcode.sudokusolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    private static final int SUM = 45;

    public void solveSudoku(char[][] board) {
        ArrayList<HashSet<Character>> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(new HashSet<>());
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    int index = (j / 3) + 3 * (i / 3);
                    list.get(index).add(board[i][j]);
                }
            }
        }
        
        for (HashSet<Character> s: list) {
            System.out.println(s.toString());
        }

        print2DArray(board);
    }

    private void print2DArray(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
                if ((j + 1) % 3 == 0) {
                    System.out.print("   ");
                }
            }
            System.out.println("");
            if ((i + 1) % 3 == 0) {
                System.out.println("");
                System.out.println("");
            }
        }
    }

}
