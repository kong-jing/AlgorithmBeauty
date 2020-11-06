package com.kongjing.practice;

import java.util.Arrays;

/**
 * name: Exercise05<p>
 * description 05课程
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 *
 * 请你返回能让所有学生以 非递减 高度排列的最小必要移动人数。
 *
 * 注意，当一组学生被选中时，他们之间可以以任何可能的方式重新排序，而未被选中的学生应该保持不动。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/height-checker
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * author Jing <P>
 * date: 2020/6/9 <p>
 */
class Exercise05 {
    public static void main(String[] args) {
        int[] heights = new int[]{1,1,4,2,1,3};
        //System.out.println(heightChecker(heights));
        System.out.println(heightChecker2(heights));
    }

    public static int heightChecker(int[] heights) {
        int i = 0;
        int count = 0;
        //创建一个拷贝的数组
        int[] tempHeights = new int[heights.length];
        System.arraycopy(heights, 0, tempHeights, 0, heights.length);
        Arrays.sort(tempHeights);
        for (; i < heights.length; i++) {
            if (heights[i] != tempHeights[i]) {
                count ++;
            }
        }
        return count;
    }

    /**
    * functionName: heightChecker2 <p>
    *  description: 效率更高的 ， 让值变成下标，查看有多少个相同的值<p>
    *      params: heights <p>
    *      return: int <p>
    *      author:  <p>
    *        date: 2020/6/9 <p>
    */
    public static int heightChecker2(int[] heights) {
        // 值的范围是1 <= heights[i] <= 100，因此需要1,2,3,...,99,100，共101个桶
        int[] arr = new int[101];
        // 遍历数组heights，计算每个桶中有多少个元素，也就是数组heights中有多少个1，多少个2，。。。，多少个100
        // 将这101个桶中的元素，一个一个桶地取出来，元素就是有序的
        for (int height : heights) {
            arr[height] ++ ;
        }
        int count = 0;
        for (int i = 1, j = 0; i < arr.length; i++) {
            // arr[i]，i就是桶中存放的元素的值，arr[i]是元素的个数
            // arr[i]-- 就是每次取出一个，一直取到没有元素，成为空桶
            while (arr[i]-- > 0) {
                //i 数据是非递减的， 查看有多少值和非递减的数组中不同
                if (heights[j++] != i) {
                    count ++;
                }
            }
        }
        return count;
    }
}
