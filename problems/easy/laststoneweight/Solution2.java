/*
 * The Krechet Software
 */

package com.leetcode.problems.easy.laststoneweight;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution2 {
    
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones) {
            queue.add(i);
        }
        int x;
        int y;
        while(queue.size() > 1) {
            y = queue.poll();
            x = queue.poll();
            if(y > x) {
                queue.offer(y-x);   
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }

}
