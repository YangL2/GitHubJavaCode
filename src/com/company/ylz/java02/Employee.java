package com.company.ylz.java02;

/**
 * @author 理智
 * @ Classname Employee
 * @ Description TODO
 * @ Version 1.0.0
 * @ Date 2023/5/26 9:39
 * @ Created by y1352
 */

public abstract class Employee{
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    /**
     工作抽象
     */
    abstract void work();
}
