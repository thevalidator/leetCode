/*
 * The Krechet Software
 */
package com.leetcode.problems.medium.validatebinarysearchtree;

import java.util.LinkedList;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    public boolean isValidBST(TreeNode root) {

        LinkedList<Integer> list = new LinkedList();
        
        boolean result = checkTree(root, list);
        System.out.println(result);
        return result;
        
    }

    public boolean checkTree(TreeNode root, LinkedList<Integer> list) {
        
        if (root != null) {
            
            boolean left = checkTree(root.left, list);
            if (left == false) {
                return left;
            }
            
            if (!list.isEmpty()) {
                if (list.pollLast() < root.val) {
                    list.add(root.val);
                } else {
                    return false;
                }
            } else {
                list.add(root.val);
                System.out.print(root.val + " ");
            }

            boolean right = checkTree(root.right, list);
            if (right == false) {
                return right;
            }
        }
        
        return true;
        
    }

}
