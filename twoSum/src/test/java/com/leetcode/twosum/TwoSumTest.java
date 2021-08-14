/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.twosum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class TwoSumTest {
    
    public TwoSumTest() {
    }

    @Test
    public void twoSumTest() {
        int[] nums = new int[] {2, 5, 8, 14, 60};
        
        int[] result1 = Solution.twoSum(nums, 19);
        int[] result2 = Solution.twoSum(nums, 62);
        int[] result3 = Solution.twoSum(nums, 13);
        
        assertArrayEquals(new int[]{1, 3}, result1);
        assertArrayEquals(new int[]{0, 4}, result2);
        assertArrayEquals(new int[]{1, 2}, result3);
        
    }
    
    @Test
    public void twoSumSecondTest() {
        
        int[] nums = new int[] {2, 5, 8, 14, 60};
        
        int[] result11 = Solution.twoSumSecond(nums, 19);
        int[] result22 = Solution.twoSumSecond(nums, 62);
        int[] result33 = Solution.twoSumSecond(nums, 13);
        
        assertArrayEquals(new int[]{1, 3}, result11);
        assertArrayEquals(new int[]{0, 4}, result22);
        assertArrayEquals(new int[]{1, 2}, result33);
    }
    
    @Test
    public void twoSumThirdTest() {
        
        int[] nums = new int[] {2, 5, 8, 14, 60};
        
        int[] result11 = Solution.twoSumThird(nums, 19);
        int[] result22 = Solution.twoSumThird(nums, 62);
        int[] result33 = Solution.twoSumThird(nums, 13);
        
        assertArrayEquals(new int[]{1, 3}, result11);
        assertArrayEquals(new int[]{0, 4}, result22);
        assertArrayEquals(new int[]{1, 2}, result33);
    }
    
}
