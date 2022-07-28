/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.laststoneweight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    public static void main(String[] args) {

        int[] stones = {2, 2};
        int[] stones2 = {1, 3};

        System.out.println(lastStoneWeight(stones));

    }

    public static int lastStoneWeight(int[] stones) {

        List<Integer> list = new ArrayList<>();

        for (int s : stones) {
            list.add(s);
        }

        while (list.size() > 1) {
            
            Collections.sort(list, Collections.reverseOrder());
            int smashResult = list.get(0) - list.get(1);
            list.remove(1);
            if (smashResult > 0) {
                list.set(0, smashResult);
            } else {
                list.remove(0);
            }
            
        }

        if (list.size() == 1) {
            return list.get(0);
        }
        
        return 0;
    }

}
