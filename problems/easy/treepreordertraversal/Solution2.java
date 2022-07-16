/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.treepreordertraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution2 {

    public List<Integer> preorder(Node root) {
        
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        result.add(root.val);
        for (Node child : root.children) {
            preorder(child);
        }
        return result;
        
    }

}
