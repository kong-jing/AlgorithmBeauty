package com.kongjing.practice.array;

/**
 * name: MaxProfitTest<p>
 * description 买卖股票的最佳时机 <p>
 * author Jing <P>
 * date: 2020/11/8 <p>
 */
class MaxProfitTest {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int d = new MaxProfitTest().maxProfit(arr);
        System.out.println(d);
    }

    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                //只要今天比昨天要大，那么就可以计算进来
                sum += (prices[i] - prices[i - 1]);
            }
        }
        return sum;
    }
}
