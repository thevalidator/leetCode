package com.leetcode.problems.easy.palindromenumber;

public class Solution {
    
    public boolean isPalindrome(int x) {

        if (x < 0)
            return false;
        
        String number = String.valueOf(x);
        
        if (number.length() == 1)
            return true;
        
        StringBuilder reverseNumber = new StringBuilder().append(number).reverse();
        
        return number.equals(reverseNumber.toString());
    }

    public boolean isPalindromeTwoParts(int x) {

        String number = String.valueOf(x);
        int xLength = number.length();

        if (xLength >= 2) {
            checkTwoPartsForIdentity(number);
        }

        return true;
    }

    public boolean checkTwoPartsForIdentity(String number) {
        String firstPart;
        StringBuilder secondPart = new StringBuilder();
        int middle = number.length() / 2;
        firstPart = number.substring(0, middle);
        
        if (isEven(number.length())) {
            secondPart.append(number.substring(middle)).reverse();
        } else {
            secondPart.append(number.substring(middle + 1)).reverse();
        }
        
        return secondPart.toString().equals(firstPart);
    }

    public boolean isEven(int length) {
        return length % 2 == 0;
    }

}
