package com.ylz.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ：L2
 * @date ：Created in 2023.05.15 下午 07:00
 * @description：
 * @modified By：
 * @version:
 */
public class Homework14 {
    public static void main(String[] args) {
        Stu stu = new Stu();
        stu.name="裴振宇";
        Stu stu1=new Stu();
        stu1.name="计算机";
         //0 0    2  0   （1 0输）
        int win=0;
        int dont=0;
        int ping=0;
        for (int i = 0; i <3; i++) {
            int vs = stu.vs();
            int vs1 = stu1.vs();
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入0-2数字 0代表石头 1代表剪刀  2代表布");
            int i1 = scanner.nextInt();
            int num1=i1-vs1;
            if(num1==0){
                System.out.println("平局");
                ping++;
            }else if(num1==1){
                System.out.println(stu.name+"输");
                dont++;
            }else if(num1 == -1){
                System.out.println(stu.name+"赢");
                win++;
            }else if(num1 == -2){
                System.out.println(stu.name+"输");
                dont++;
            }
        }
        System.out.println("平局为"+ping);
        System.out.println("赢了"+win);
        System.out.println("输了"+dont);

        /*switch (vs){
            case 0:
                System.out.println(stu.name+"石头");
                break;
            case 1:
                System.out.println(stu.name+"剪刀");
                break;
            case 2:
                System.out.println(stu.name+"布");
                break;
            default:
                System.out.println(stu.name+"有误");
        }
        switch (vs1){
            case 0:
                System.out.println(stu1.name+"石头");
                break;
            case 1:
                System.out.println(stu1.name+"剪刀");
                break;
            case 2:
                System.out.println(stu1.name+"布");
                break;
            default:
                System.out.println(stu1.name+"有误");
        }*/
    }
}
class Stu{
    String name;
    public int vs(){
        Random random = new Random();

        return random.nextInt(3);
    }
}