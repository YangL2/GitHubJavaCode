package com.ylz.homework;

/**
 * @author ：L2
 * @date ：Created in 2023.05.15 下午 05:22
 * @description：
 * @modified By：
 * @version:
 */
public class Homework10 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo demo1=demo;
        demo1.m();  //101  100
        System.out.println(demo.i);   //101
        System.out.println(demo1.i);  // 101
    }
}
class Demo{
    int i=100;
    public void m(){
        int j=i++;
        System.out.println(i);
        System.out.println(j);
    }
}