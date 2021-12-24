/*
 * The Krechet Software
 */
package com.leetcode.addtwonumbers;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int overload = 0;
        int firstNodeValue = l1.val + l2.val;
        if (firstNodeValue > 9) {
            overload = 1;
            firstNodeValue = firstNodeValue % 10;
        }
        ListNode node = new ListNode(firstNodeValue);
        ListNode current = node;
        ListNode nextNode1 = l1.next;
        ListNode nextNode2 = l2.next;
        

        while (true) {
            
            int next1 = 0;
            int next2 = 0;
            int value = 0;
            
             if (nextNode1 == null && nextNode2 == null && overload == 0) {
                break;
            }
            
            if (nextNode1 != null) {
                next1 = nextNode1.val;
                nextNode1 = nextNode1.next;
            }
            if (nextNode2 != null) {
                next2 = nextNode2.val;
                nextNode2 = nextNode2.next;
            }
           
            
            int sum = next1 + next2 + overload;
            if (sum > 9) {
                int number = 0;
                if (sum != 10) {
                    number = sum % 10;
                }
                value += number;
                overload = 1;
            } else {
                value += sum;
                overload = 0;
            }
            
            current.next = new ListNode(value);
            current = current.next;
        }

        return node;
    }

}
