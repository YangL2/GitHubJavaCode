package com.company.ylz.beforeStudy;

/**
 * @ author 理智
 * @ Classname Test01
 * @ Description TODO
 * @ Version 1.0.0
 * @ Date 2023/5/25 8:52
 * @ Created by y1352
 * @ author y1352
 */

public class Test01 {
    public static void main(String[] args) {
        String name="离职";
        int age = 21;
        char sex = '男';
        double money = 5123.41;
        String name1="pzy";
        int age1 = 22;
        char sex1 = '男';
        double money1 = 1234.41;

        System.out.println(name+"年龄为"+age+"岁"+"性别为"+sex+"工资为"+money);
        System.out.println(name1+"年龄为"+age1+"岁"+"性别为"+sex+"工资为"+money1);
        System.out.println("两人的平均工资为"+(money+money1)/2);
    }
}
