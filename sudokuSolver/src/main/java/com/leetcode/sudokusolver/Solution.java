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
        
        boolean wasAdded;
        boolean hasEmpty = true;
        ArrayList<HashSet<Character>> squares = new ArrayList<>(9);
        ArrayList<HashSet<Character>> verticals = new ArrayList<>(9);
        ArrayList<HashSet<Character>> horisontals = new ArrayList<>(9);
        ArrayList<Character> possibleCharacters = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            squares.add(new HashSet<>());
            verticals.add(new HashSet<>());
            horisontals.add(new HashSet<>());
            possibleCharacters.add(Character.forDigit(i + 1, 10));
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    int index = (j / 3) + 3 * (i / 3);
                    squares.get(index).add(board[i][j]);
                    horisontals.get(i).add(board[i][j]);
                    verticals.get(j).add(board[i][j]);
                }
            }
        }

        System.out.println("");
        print2DArray(board);
        System.out.println("");

        while (hasEmpty) {
            hasEmpty = false;
            wasAdded = false;
            ArrayList<Character> suitableCharacters;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == '.') {
                        hasEmpty = true;
                        int index = (j / 3) + 3 * (i / 3);

                        HashSet<Character> used = new HashSet<>();
                        used.addAll(squares.get(index));
                        used.addAll(verticals.get(j));
                        used.addAll(horisontals.get(i));

                        suitableCharacters = new ArrayList<>(possibleCharacters);
                        suitableCharacters.removeAll(used);
                        System.out.println(suitableCharacters.toString());
                        if (suitableCharacters.size() == 1) {
                            char c = suitableCharacters.get(0);
                            board[i][j] = c;
                            squares.get(index).add(c);
                            verticals.get(j).add(c);
                            horisontals.get(i).add(c);
                            wasAdded = true;
                        } else {
//                            for (char c : suitableCharacters) {
//                                int hStartIndex = (index % 3) * 3;
//                                int vIndex = i;
//                                boolean isExists = true;
//                                for (int k = 0; k < 3; k++) {
//                                    int hIndex = hStartIndex + k;
//                                    if (hIndex == j || vIndex == i) {
//                                        continue;
//                                    }
//                                    if (!verticals.get(hIndex).contains(c) || !horisontals.get(vIndex).contains(c)) {
//                                        isExists = false;
//                                    }
//
////                                    System.out.println(i + ":" + j 
////                                            + " box: " + index 
////                                            + " - h index: " 
////                                            + (hIndex + k) 
////                                            + " - v index: " 
////                                            + (vIndex));
//                                }
//                                if (isExists && !squares.get(index).contains(c)) {
//                                    board[i][j] = c;
//                                }
//
//                            }
                        }
                    }
                }
                System.out.println("-------------------------------------------");
            }
            if (!wasAdded) {
                break;
            }
            System.out.println("");
            print2DArray(board);
        }

        System.out.println("");
        print2DArray(board);
    }

    private void print2DArray(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
                if ((j + 1) % 3 == 0) {
                    System.out.print("    ");
                }
            }
            System.out.println("");
            if ((i + 1) % 3 == 0) {
                System.out.println("\n");
            }
        }
    }

}
