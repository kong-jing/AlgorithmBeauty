package com.kongjing.practice.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * name: LadderLengthTest<p>
 * description 给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
 *
 * 每次转换只能改变一个字母。
 * 转换过程中的中间单词必须是字典中的单词。
 * 说明:
 *
 * 如果不存在这样的转换序列，返回 0。
 * 所有单词具有相同的长度。
 * 所有单词只由小写字母组成。
 * 字典中不存在重复的单词。
 * 你可以假设 beginWord 和 endWord 是非空的，且二者不相同。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-ladder
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。<p>
 * author Jing <P>
 * date: 2020/11/6 <p>
 */
class LadderLengthTest {
    //todo 想要使用广度优先算法解决
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord   = "cog";
        String[] arr = {"hot","dot","dog","lot","log","cog"};
        List<String> wordList = Arrays.asList(arr);
        //判断需要多少步可以搜索到 cog
        int step = new LadderLengthTest().ladderLength(beginWord, endWord, wordList);
        System.out.println(step);
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //访问过的单词 总长度应该是 字典加上两个单词
        boolean[] visited = new boolean[wordList.size() + 1];
        //路径，想要打印顺序出来，当然这个需要做递归,index 坐标是 父节点的值
        String[] prev = new String[wordList.size() + 1];
        for (int i = 0; i < prev.length; i++) {
            //所有的值都置 -1
            prev[i] = "";
        }
        //队列，用于存储父节点的值
        Queue<String> queue = new LinkedList<>();
        //添加首节点
        queue.add(beginWord);
        //如果没有了父节点，那么搜索就结束了
        int layer = 1;
        while (!queue.isEmpty()) {
            layer ++;
            int size = queue.size();
            //队列中可以有多个节点的，需要都遍历一次
            while (size-- > 0) {
                //获取当前的节点
                String cur = queue.poll();
                for (int i = 0; i < wordList.size(); i++) {
                    if (!visited[i]) {
                        String dic = wordList.get(i);
                        if (canChange(cur, dic)) {
                            if (dic.equals(endWord)) {
                                System.out.println("\n");
                                return layer;
                            }
                            queue.add(dic);
                            //没有访问过
                            visited[i] = true;
                            System.out.print(dic + "->");
                        }
                    }
                }
            }

        }
        return 0;
    }

    /**
     * 比较是否可以通过修改一个字符变化为字典的值
     * @param cur 当前节点的值
     * @param dic 字典中指向的值
     * @return 
     */
    public boolean canChange(String cur, String dic) {
        int len = cur.length();
        int diff = 0;
        for (int i = 0; i < len; i++) {
            if (cur.charAt(i) != dic.charAt(i)) {
                diff ++;
            }
        }
        return diff == 1;
    }

}




















