package com.leetcode.problems.easy.maxconsecutiveones;

public class Main {

    public static void main(String[] args) {
        
        byte[] nums = new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1};
        System.out.printf("max: %d", findMaxConsecutiveOnes(nums));

    }

    public static int findMaxConsecutiveOnes(byte[] nums) {
        int result = 0, max = 0;
        for (byte num : nums) {
            if (num == 1) {
                max++;
            } else {
                max = 0;
            }
            if (max > result) {
                result = max;
            }
        }
        return result;
    }
    
}
