/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.besttimetobuyandsellstock;


/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {2,4,1};
        int[] prices3 = {7,6,4,3,1};
        int[] prices4 = {2,1,2,0,1};

        System.out.println(maxProfit(prices));
        System.out.println("======");
        System.out.println(maxProfit(prices2));
        System.out.println("======");
        System.out.println(maxProfit(prices3));
        System.out.println("======");
        System.out.println(maxProfit(prices4));

    }
    
    
    public static int maxProfit(int[] prices) {

        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = -1;
        
        for (int i = 1; i < prices.length; i++) {
            
            if (prices[i - 1] < minPrice) {
                minPrice = prices[i - 1];
                maxPrice = prices[i - 1];
            }
            
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
            
            int diff = maxPrice - minPrice;
            if (diff > profit) {
                profit = diff;
            }
            
        }
        
        return profit;

    }

    public static int maxProfit2(int[] prices) {

        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int diff = prices[i] - minPrice;
            if (diff > profit) {
                profit = diff;
            }
        }
        
        return profit;

    }

}
