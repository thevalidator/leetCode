/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.findpivotindex;

import java.util.HashMap;
import java.util.Map;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    public static int pivotIndex(int[] nums) {

        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0, rightSum = 0;

            int counter = 0;
            while (counter != i) {
                leftSum += nums[counter++];
            }
            counter = nums.length - 1;
            while (counter != i) {
                rightSum += nums[counter--];
            }

            if (leftSum == rightSum) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static int pivotIndex2(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x : nums) {
            sum += x;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }

}
