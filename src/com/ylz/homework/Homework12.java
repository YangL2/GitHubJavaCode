package com.ylz.homework;

/**
 * @author ：L2
 * @date ：Created in 2023.05.15 下午 05:27
 * @description：
 * @modified By：
 * @version:
 */
public class Homework12 {
    public static void main(String[] args) {
        Employee employee = new Employee("理智", '男', 18,"奥特曼",12938.123);
        Employee employee1 = new Employee("理智1", '男', 18);
        Employee employee2 = new Employee("奥特曼",12938.123);
        System.out.println(employee2.toString());
    }
}
class Employee{
    String name;
    char sex;
    int age;
    String leader;
    double salary;

    public Employee(String name, char sex, int age, String leader, double salary) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.leader = leader;
        this.salary = salary;
    }

    public Employee(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Employee(String leader, double salary) {
        this.leader = leader;
        this.salary = salary;
    }
}