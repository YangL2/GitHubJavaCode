package com.ylz.encapsulation;

/**
 * @author ：L2
 * @date ：Created in 2023.05.15 下午 04:18
 * @description：
 * @modified By：
 * @version:
 */
public class Main extends Person{
    public static void main(String[] args) {
    }
    public void sayOk(){
        setAge(1);
        setName("12");
        setSalary(35);
        System.out.println(getAge());
    }
}