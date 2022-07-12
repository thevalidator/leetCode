/*
 * The Krechet Software
 */
package com.leetcode.addtwonumbers;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        int firstNodeValue = l1.val + l2.val;
        if (firstNodeValue > 9) {
            carry = 1;
            firstNodeValue = firstNodeValue % 10;
        }
        ListNode node = new ListNode(firstNodeValue);
        ListNode current = node;
        ListNode nextNode1 = l1.next;
        ListNode nextNode2 = l2.next;

        while (true) {
            
            if (nextNode1 == null && nextNode2 == null && carry == 0) {
                break;
            }

            int next1 = 0;
            int next2 = 0;
            int value = 0;

            if (nextNode1 != null) {
                next1 = nextNode1.val;
                nextNode1 = nextNode1.next;
            }
            if (nextNode2 != null) {
                next2 = nextNode2.val;
                nextNode2 = nextNode2.next;
            }

            int sum = next1 + next2 + carry;
            if (sum > 9) {
                value += sum % 10;
                carry = 1;
            } else {
                value += sum;
                carry = 0;
            }

            current.next = new ListNode(value);
            current = current.next;
        }

        return node;
    }

    //from leetcode
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}
