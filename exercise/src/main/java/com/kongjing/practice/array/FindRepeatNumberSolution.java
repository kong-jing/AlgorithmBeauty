package com.kongjing.practice.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * name: FindRepeatNumberSolution<p>
 * description <p>
 * author Jing <P>
 * date: 2020/11/3 <p>
 */
public class FindRepeatNumberSolution {
    public int findRepeatNumber(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        int r = new FindRepeatNumberSolution().findRepeatNumber(arr);
        System.out.println(r);
    }
}
