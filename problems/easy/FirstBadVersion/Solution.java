/*
 * The Krechet Software
 */
package com.leetcode.problems.easy.firstbadversion;

/**
 * @author theValidator <the.validator@yandex.ru>
 */
public class Solution {

    public int firstBadVersion(int n) {

        if (n == 1) {
            return 1;
        }
        return find(1, n);

    }

    private int find(int start, int finish) {

        if (finish == start) {
            return finish;
        }

        int middle = start + (finish - start) / 2;

        if (isBadVersion(middle)) {
            return find(start, middle);
        } else {
            return find(middle + 1, finish);
        }

    }

    boolean isBadVersion(int version) {
        return version >= 5;
    }

    //another one
    public int firstBadVersion2(int n) {

        int start = 1, end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

}
