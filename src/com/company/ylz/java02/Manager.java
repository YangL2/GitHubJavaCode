package com.company.ylz.java02;

/**
 * @author 理智
 * @ Classname Manager
 * @ Description TODO
 * @ Version 1.0.0
 * @ Date 2023/5/26 9:39
 * @ Created by y1352
 */

public class Manager extends Employee{
    double bones;
    public Manager(String name, int id, double salary,double bones) {
        super(name, id, salary);
        this.bones=bones;
    }
    @Override
    void work() {
        System.out.println("经理"+getName()+"工作中"+"工资为"+(getSalary()+bones));
    }
}