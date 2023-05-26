package com.ylz.homework;

/**
 * @version 1.0
 * @Author L2
 * @Date 2023/5/13 0013 22:07
 * @注释 类        提取字符串数组的索引
 */
public class Homework02 {
    public static void main(String[] args) {
        String[] arg={"lz","3","pzy"};
        T t = new T();
        int i = t.find("pzy", arg);
        System.out.println(i);
    }
}
class T{
    public int find(String str,String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(str.equals(arr[i])){
                return i;
            }
        }

        return -1;
    }
}
