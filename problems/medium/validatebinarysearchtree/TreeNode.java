/*
 * The Krechet Software
 */
package com.leetcode.problems.medium.validatebinarysearchtree;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
