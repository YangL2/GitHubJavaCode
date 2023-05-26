package com.ylz.homework;
import java.util.Scanner;
/**
 * @version 1.0
 * @Author L2
 * @Date 2023/5/13 0013 23:20
 * @注释 类
 */
public class Homework06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个要进行计算的数");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个要进行计算的数");
        int num2 = scanner.nextInt();
        System.out.println("请输入要进行的运算'+''-''*''/'");
        char c = scanner.next().charAt(0);
        F f = new F();
        switch (c){
            case '+':
                f.sum(num1,num2);
                break;
            case '-':
                f.sub(num1,num2);
                break;
            case '*':
                f.mul(num1,num2);
                break;
            case '/':
                f.div(num1,num2);
                break;
            default:
                System.out.println("输入的运算符有误");
        }


    }
}
class F{
    public int sum(int a , int b){
        System.out.println(a+b);
        return a+b;
    }
    public int sub(int a , int b){
        System.out.println(a-b);
        return a-b;
    }
    public double mul(int a , int b){
        System.out.println(a*b);
        return a*b;
    }
    public double div(int a , int b){
        if(b==0){
            System.out.println("除数不能为0");
            return -1;
        }
        System.out.println(a/b);
        return a/b;
    }

}
