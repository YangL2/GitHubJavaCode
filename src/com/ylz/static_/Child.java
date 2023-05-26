package com.ylz.static_;

/**
 * @author 理智
 * @ Classname Child
 * @ Description TODO
 * @ Version 1.0.0
 * @ Date 2023/5/24 19:20
 * @ Created by y1352
 */

public class Child {
    private String name;

    public static int count=0;
    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void play(){
        count++;
        System.out.println(name+"加入了游戏");

    }
    public static void goHome(){
        System.out.println("回家喽");
    }
}
