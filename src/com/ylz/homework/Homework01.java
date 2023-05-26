package com.ylz.homework;

/**
 * @version 1.0
 * @Author L2
 * @Date 2023/5/13 0013 22:03
 * @注释 类   比较两数大小的方法
 */
public class Homework01 {
    public static void main(String[] args) {
        n n = new n();
        int max = n.max(3, 6);
        System.out.println(max);
    }
}
class n{
    public int max(int a,int b) {
        return a>b ? a:b;
    }
}
