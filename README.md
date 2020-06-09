# AlgorithmBeauty

## 01-04开篇词

不同的设备会有不同的测试结果， 事后统计法，这个局限性很大。

\#### 大O复杂度表示法

运行代码的情况下，用肉眼可以得到一段代码的执行时间

所有代码的执行时间T(n)与每行代码的执行次数成正比

```java
/**

* functionName: cal <p>

* description: 执行时间 2n+2 <p>

* params: n <p>

* return: int <p>

* author: <p>

* date: 2020/6/8 <p>

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

* description: 执行时间 (2n² + 2n + 3) <p>

* params: n <p>

* return: int <p>

* author: <p>

* date: 2020/6/8 <p>

*/

static int cal2(int n) {

int sum = 0;

int i = 1;

int j = 1;

for (; i <= n; ++i) {

j = 1;

for (; j <= n; ++j) {

sum = sum + i * j;

}

}

return sum;

}

```



所以根据大O复杂度的公式，T(n) = O(f(n))

$T(n) = O(2n^2 + 2n + 3)$

只需要记住最大量级就可以了。

只关注执行次数最多的一段代码

\#### 加法法则

总复杂度等于量级最大的那段代码的复杂度

\#### 乘法法则

嵌套代码的复杂度等于嵌套内外代码复杂度的乘积

常见的时间复杂度实例分析

常量阶 指数阶 对数阶 阶乘阶 线性阶 线性对数阶 平方阶 立方阶

阶乘阶与指数阶 是非多项式量级 非常低效。

\##### 多项式量级时间复杂度

\1. O(1)

不管代码行数，常量级时间复杂度一种表示方法。一般情况下，只要算法中不存在

循环语句，递归语句，即使有成千上万行代码，时间复杂度都是 **O(1)**

2.O(logn) O(nlogn)

非常常见，也是最难分析的一种时间复杂度。

$\log_\ n$

\##### 空间复杂度

渐进空间复杂度，表示算法的存储空间与数据规模之间的增长关系

\#### 浅析最好、最坏、平均、均摊时间复杂度

```java


// 全局变量，大小为10的数组array，长度len，下标i。

int array[] = new int[10];

int len = 10;

int i = 0;

// 往数组中添加一个元素

void add(int element) {

if (i >= len) { // 数组空间不够了

// 重新申请一个2倍大小的数组空间

int new_array[] = new int[len*2];

// 把原来array数组中的数据依次copy到new_array

for (int j = 0; j < len; ++j) {

new_array[j] = array[j];

}

// new_array复制给array，array现在大小就是2倍len了

array = new_array;

len = 2 * len;

}

// 将element放到下标为i的位置，下标i加一

array[i] = element;

++i;

}

```



当i < len时, 即 i = 0,1,2,...,n-1的时候，for循环不走，所以这n次的时间复杂度都是O(1);

当i >= len时, 即 i = n的时候，for循环进行数组的copy，所以只有这1次的时间复杂度是O(n);

最好时间复杂度 O(1)

最差时间复杂度 O(n)

(1+1+.....+n)/(n+1)

均摊时间复杂度 前n个的时间复杂度是 O(1) 最后一个O(n) 均摊到前面的时间上面去。

那么均摊时间复杂度就是 O(1)