package com.kongjing.practice;

/**
 * name: IsPalindrome<p>
 * description 回文数 <p>
 * author Jing <P>
 * date: 2020/6/26 <p>
 */
public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        if (str.length() == 1) {
            return true;
        }
        char[] tempData = str.toCharArray();
        for (int i = str.length() - 1, j = 0; i > 0; i -- ) {
            char code = str.charAt(i);
            if (tempData[j] == code) {
                j++;
                if (j == str.length() -1) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
