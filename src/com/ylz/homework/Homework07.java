package com.ylz.homework;

/**
 * @author ：L2
 * @date ：Created in 2023.05.15 下午 05:05
 * @description：
 * @modified By：
 * @version:
 */
public class Homework07 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.show("tom","pink",18);
        System.out.println(dog.toString());
    }
}
class Dog{
    String name;
    String color;
    int age;

    public void show(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}