/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.MiddleOfTheLinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    public ListNode middleNode(ListNode head) {
        
        ListNode actual = head;
        Map<Integer, ListNode> nodes = new HashMap<>();
        
        int counter = 0;
        
        while (actual != null) {
            counter++;
            System.out.println(counter + " - " + actual.val);
            nodes.put(counter, actual);
            actual = actual.next;
        }
        
        int middleIndex = counter % 2 == 0 ? counter / 2 : counter / 2 + 1;
        
        return nodes.get(middleIndex);

    }
    
    public ListNode middleNode2(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }
        
        return nodes.get(nodes.size() / 2);
    }
    
    public ListNode middleNode3(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
