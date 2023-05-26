package com.ylz.homework;

/**
 * @author ：L2
 * @date ：Created in 2023.05.15 下午 05:13
 * @description：
 * @modified By：
 * @version:
 */
public class Homework08 {
    int count=9;
    public void count1(){
        count=10;
        System.out.println(count);
    }
    public void count2(){
        System.out.println(count++);
    }

    public static void main(String[] args) {
        new Homework08().count1();   //10
        Homework08 homework08 = new Homework08();
        homework08.count2();   //9
        homework08.count2();   //10
    }
}