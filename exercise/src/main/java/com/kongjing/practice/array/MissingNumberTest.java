package com.kongjing.practice.array;
/**
 *
 * @author Jing
 */
public class MissingNumberTest {
    //二分查找法
    public int missingNumber(int[] nums) {
        int mid = 0;
        int j = nums.length - 1;
        int i = 0;
        while (i <= j) {
            mid = (i + j) / 2;
            if (nums[mid] == mid) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {0,1};
        int l = new MissingNumberTest().missingNumber(arr);
        System.out.println(l);
    }
}