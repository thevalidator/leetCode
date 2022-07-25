/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.lowestcommonancestorofbinarysearchtree;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {
    
    
    public static void main(String[] args) {

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode result = root;

        if (p.val == root.val || q.val == root.val) {
            return root;
        }

        while (true) {
            
            if (p.val < result.val && q.val < result.val) {
                result = result.left;
            } else if (p.val > result.val && q.val > result.val) {
                result = result.right;
            } else {
                break;
            }
            
        }

        return result;
    }

}
