/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.MergeTwoSortedLists;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode first;
        ListNode actual;
        ListNode potentialNext;

        if (list1.val < list2.val) {
            first = list1;
            potentialNext = list2;
        } else {
            first = list2;
            potentialNext = list1;
        }

        actual = first;

        boolean flag = true;
        while (flag) {

            if (actual.next != null) {

                if (potentialNext.val < actual.next.val) {
                    ListNode temp = actual.next;
                    actual.next = potentialNext;
                    potentialNext = temp;
                }
                actual = actual.next;

            } else {

                actual.next = potentialNext;

                break;

            }

        }

        return first;

    }

    public ListNode mergeTwoLists2FromLeetCode(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

}
