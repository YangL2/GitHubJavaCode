package com.ylz.static_;

/**
 * @author 理智
 * @ Classname ChildTest
 * @ Description TODO
 * @ Version 1.0.0
 * @ Date 2023/5/24 19:21
 * @ Created by y1352
 */

public class ChildTest {
    public static void main(String[] args) {
        Child child1 = new Child("1");
        child1.play();
        Child child2 = new Child("2");
        child2.play();
        Child child3 = new Child("3");
        child3.play();
        System.out.println(Child.count);
        Child.goHome();
    }
}
