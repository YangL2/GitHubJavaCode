package com.ylz.homework;

/**
 * @version 1.0
 * @Author L2
 * @Date 2023/5/13 0013 23:12
 * @注释 类   圆的周长和面积
 */
public class Homework05 {
    public static void main(String[] args) {
        E e = new E();
        double perimeter = e.circlePerimeter(3);
        System.out.println(perimeter);
        double area = e.circleArea(3);
        System.out.println(area);
    }
}
class E{
    public double circlePerimeter(double a){
        return 2*a*3.14;
    }
    public double circleArea(double a){
        return a*a*3.14;
    }
}