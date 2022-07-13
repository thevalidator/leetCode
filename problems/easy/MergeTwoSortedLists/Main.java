/*
 * The Krechet Software
 */

package com.leetcode.problems.easy.MergeTwoSortedLists;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Main {
    
    public static void main(String[] args) {
        
        ListNode l13 = new ListNode(4);
        ListNode l12 = new ListNode(2, l13);
        ListNode l11 = new ListNode(1, l12);
        
        ListNode l23 = new ListNode(5);
        ListNode l22 = new ListNode(3, l23);
        ListNode l21 = new ListNode(1, l22);
        
        // PRINT ONE RESULT PER EACH APP START ONLY !!!
        ListNode res = Solution.mergeTwoLists(l11, l21);
        printList(res);

//        ListNode res2 = Solution.mergeTwoLists(l13, l23);
//        printList(res2);
         
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
