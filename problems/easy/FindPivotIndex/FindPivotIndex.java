/*
 * The Krechet Software
 */

package com.leetcode.findpivotindex;

import java.util.Arrays;

/**
 *
 * @author theValidator <the.validator@yandex.ru>
 */
public class FindPivotIndex {

    public static void main(String[] args) {
        
        
        int[] nums = {-1,-1,0,1,-1,-1};
        
        //{-1,-1,0,0,-1,-1};
        //{-1,-1,-1,0,1,-1};
        //{-1,-1,-1,-1,0,1};
        //{-1,-1,-1,-1,-1,0};
        //{-1,-1,0,-1,-1,-1};
        //{-1,-1,-1,-1,-1,0};
        //{-1,-1,-1,-1,-1,-1};
        //{2,1,-1};
        //{1,7,3,6,5,6};
        //{1,4,5,7,-2};
        
        System.out.println(Arrays.toString(nums));
        
        System.out.println(Solution.pivotIndex(nums));

        
        
        
    }
}
