package com.kongjing.practice.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * name: KClosestTest<p>
 * description <p>
 * author Jing <P>
 * date: 2020/11/9 <p>
 */
class KClosestTest {
    public static void main(String[] args) {

    }

    public int[][] kClosest(final int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt((int[] point ) -> (point[0] * point[0] + point[1] * point[1])));
        return Arrays.copyOfRange(points, 0, K);
    }
}
