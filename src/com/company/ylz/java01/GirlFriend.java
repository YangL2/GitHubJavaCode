package com.company.ylz.java01;

/**
 * @author 理智
 * @ Classname GirlFriend
 * @ Description TODO
 * @ Version 1.0.0
 * @ Date 2023/5/25 19:34
 * @ Created by y1352
 */

public class GirlFriend {
    private String name;
    private static GirlFriend girlFriend=new GirlFriend("理智");

    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getGirlFriend(){
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
