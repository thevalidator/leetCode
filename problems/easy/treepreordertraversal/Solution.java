/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.treepreordertraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    public List<Integer> preorder(Node root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        result.add(root.val);
        method(root, result);

        return result;

    }

    private void method(Node node, List<Integer> list) {

        for (Node n : node.children) {
            list.add(n.val);
            method(n, list);
        }

    }
    
    
    // iterative version
    public List<Integer> preorder2(Node root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        LinkedList<Node> nodes = new LinkedList<>();

        Node actual = root;
        nodes.add(actual);
        
        while (!nodes.isEmpty()) {
            
            actual = nodes.pollFirst();
            result.add(actual.val);
            
            for (int i = actual.children.size() - 1; i >= 0; i--) {
                nodes.addFirst(actual.children.get(i));
                
            }
            
        }

        return result;

    }

}
