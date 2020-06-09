package com.kongjing.liba;

/**
 * name: Excercise<p>
 * description <p>
 * author Jing <P>
 * date: 2020/6/8 <p>
 */
class Excercise03 {


    public static void main(String[] args) {
        //cal(1000000000);
        cal(1000000000);
    }

    /**
    * functionName: cal <p>
    *  description: 执行时间 2n+2 <p>
    *      params: n <p>
    *      return: int <p>
    *      author:  <p>
    *        date: 2020/6/8 <p>
    */
    static int cal(int n) {
        System.out.println(System.currentTimeMillis());
        int sum = 0;
        int i = 1;
        for (; i <= n; ++i) {
            sum = sum + i;
        }
        System.out.println(System.currentTimeMillis());
        return sum;
    }

    /**
    * functionName: cal2 <p>
    *  description: 执行时间  (2n² + 2n + 3) <p>
    *      params: n <p>
    *      return: int <p>
    *      author:  <p>
    *        date: 2020/6/8 <p>
    */
    static int cal2(int n) {
        System.out.println(System.currentTimeMillis());
        int sum = 0;
        int i = 1;
        int j = 1;
        for (; i <= n; ++i) {
            j = 1;
            for (; j <= n; ++j) {
                sum = sum + i * j;
            }
        }
        System.out.println(System.currentTimeMillis());
        return sum;
    }

    static int array[] = new int[10];
    static int len = 10;
    static int i = 0;

    /**
    * functionName: add <p>
    *  description: 时间复杂度 <p>
    *      params: element <p>
    *      return: void <p>
    *      author:  <p>
    *        date: 2020/6/8 <p>
    */
    static void add(int element) {
        if(i >= len) {
            int new_array[] = new int[2 * len];
            for (int j = 0; j < len; ++j) {
                new_array[j] = array[j];
            }
            array = new_array;
            len = 2 * len;
        }
        array[i] = element;
        ++i;
    }
}
