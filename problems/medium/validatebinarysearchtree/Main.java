/*
 * The Krechet Software
 */
package com.leetcode.problems.medium.validatebinarysearchtree;

import java.util.LinkedList;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Main {

    public static void main(String[] args) {

        TreeNode seven = new TreeNode(7);

        TreeNode minusOne = new TreeNode(-1);
        TreeNode nine = new TreeNode(9, seven, null);

        TreeNode six = new TreeNode(2, null, nine);
        TreeNode four = new TreeNode(4);
        TreeNode two = new TreeNode(2);
        TreeNode zero = new TreeNode(0, minusOne, null);

        TreeNode five = new TreeNode(5, four, six);
        TreeNode one = new TreeNode(1, zero, two);

        TreeNode three = new TreeNode(3, one, five);

        LinkedList<Integer> list = new LinkedList();
        
        int value;

        //printTree(three, list);
        
        checkTree(three, three.val);
        
        System.out.println(list.size());

    }

    public static void printTree(TreeNode root, LinkedList<Integer> list) {

        if (root != null) {
            printTree(root.left, list);
            if (!list.isEmpty()) {
                if (list.pollLast() <= root.val) {
                    list.add(root.val);
                } else {
                    System.out.print("X-");
                }
            } else {
                list.add(root.val);
            }

            System.out.print(root.val + " ");

            printTree(root.right, list);
        }

    }
    
    public static void checkTree(TreeNode root, int value) {

        if (root != null) {
            
            checkTree(root.left, value);
            
                if (value <= root.val) {
                    
                } else {
                    System.out.print("X-");
                }
                
            value = root.val;

            System.out.print(root.val + " ");

            checkTree(root.right, value);
        }

    }

}
