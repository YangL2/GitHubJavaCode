package com.ylz.encapsulation;

/**
 * @author ：L2
 * @date ：Created in 2023.05.15 下午 04:18
 * @description：
 * @modified By：
 * @version:
 */
class Person{
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name) {
        if(name.length()>=2 && name.length()<=6){
            this.name = name;
        }else{
            System.out.println("您的名字需要在2字符或6字符");
        }
    }

    public int getAge() {
            return age;
    }

    public void setAge(int age) {
        if(age>0 && age<120){
            this.age = age;
        }else {
            System.out.println("输入的年龄有误");
            this.age=18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<50000){
            this.salary=salary;
        }else{
            System.out.println("薪水有误");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}