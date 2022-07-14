/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.ReverseLinkedList;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Main {

    public static void main(String[] args) {

        ListNode l13 = new ListNode(4);
        ListNode l12 = new ListNode(2, l13);
        ListNode l11 = new ListNode(1, l12);
        
        printList(l11);
        System.out.println("======");
        ListNode res = Solution.reverseList(l11);
        printList(res);

    }
    
    private static void printList(ListNode test) {
        while (true) {
            System.out.println(test.val);
            if ( test.next == null) {
                break;
            }
            test = test.next;
            
        }
    }

}
