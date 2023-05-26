package com.ylz.homework;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author L2
 * @Date 2023/5/13 0013 22:38
 * @注释 类   大于150的返回150   大于100小于150 返回100
 */
public class Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入这本书的价格");
        int i = scanner.nextInt();
        c a = new c();
        a.updatePrice(i);


    }
}
class c{
    public int updatePrice(int i){
        if(i>150){
            System.out.println("这本书价格为150");
            return 150;
        }else if(i<150 && i>100){
            System.out.println("这本书价格为100");
            return 100;
        }
        return -1;
    }
}