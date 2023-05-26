package com.ylz.polyparameter;

/**
 * @author y1352
 * @Classname Employee
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/5/24 10:37
 * @Created by y1352
 */

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnuual() {
        return getSalary() * 12;
    }
}
