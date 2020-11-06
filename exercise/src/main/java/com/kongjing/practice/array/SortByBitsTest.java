package com.kongjing.practice.array;

/**
 * name: SortByBitsTest<p>
 * description <p>
 * author Jing <P>
 * date: 2020/11/6 <p>
 */
public class SortByBitsTest {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] result = new SortByBitsTest().sortByBits(arr);
        for (int i : result) {
            System.out.print(i + ",");
        }

    }

    public int[] sortByBits(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i ; j > 0; j--) {
                if (compareNum(arr[j - 1], arr[j])) {
                    //左右交换
                    int temp   = arr[j - 1];
                    arr[j - 1]  = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private boolean compareNum(int a, int b) {
        int aCount = Integer.bitCount(a);
        int bCount = Integer.bitCount(b);
        if(aCount == bCount) {
            //如果存在相同的值，那么按照数字大小排序
            return a > b;
        }
        return aCount > bCount;
    }
}
