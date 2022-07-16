/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.treepreordertraversal;

import java.util.List;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Node {

    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
    
}
