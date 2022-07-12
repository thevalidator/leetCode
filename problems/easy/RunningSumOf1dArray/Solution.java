/*
 * The Krechet Software
 */
package com.leetcode.runningsumof1darray;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    public static int[] runningSum(int[] nums) {

        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                nums[i] = nums[i] + nums[i-1];
            }
        }

        return nums;
    }

}
