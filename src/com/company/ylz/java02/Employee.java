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
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

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
