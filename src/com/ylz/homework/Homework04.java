package com.ylz.homework;

import com.ylz.encapsulation.Encapsulation01;

/**
 * @version 1.0
 * @Author L2
 * @Date 2023/5/13 0013 22:52
 * @注释 类  复制数组
 */
public class Homework04 {
    public static void main(String[] args) {
        int[]  arr= {1,2,3,4,5,6,7,8,9,10};
        D d = new D();
        d.copyArr(arr);

    }
}
class D{
    public int[] copyArr(int[] arr){
        int[] arRay = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arRay[i]=arr[i];
        }
        for (int i : arRay) {
            System.out.println(i);
        }
        return arr;
    }
}
