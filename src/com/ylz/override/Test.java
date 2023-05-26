package com.ylz.override;

/**
 * @author ：L2
 * @date ：Created in 2023.05.19 下午 05:59
 * @description：
 * @modified By：
 * @version:
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("理智",21);
        System.out.println(person.say());
        Student student = new Student("理智",21,1,99);

        System.out.println(student.say());
    }
}