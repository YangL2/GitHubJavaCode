package com.company.ylz.java01;

/**
 * @author 理智
 * @ Classname Cat
 * @ Description TODO
 * @ Version 1.0.0
 * @ Date 2023/5/25 20:04
 * @ Created by y1352
 */

public class Cat {
    private String name;
    private static Cat cat=null;

    private Cat(String name) {
        this.name = name;
    }
    public static Cat catName(){
        if(cat==null){
            cat=new Cat("小花喵");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
