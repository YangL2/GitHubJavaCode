package com.ylz.override;

/**
 * @author ：L2
 * @date ：Created in 2023.05.19 下午 05:47
 * @description：
 * @modified By：
 * @version:
 */
public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String say(){
        return getName()+"学生"+"年龄为"+getAge()+"岁了";
    }
}
