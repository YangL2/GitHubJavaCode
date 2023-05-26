package com.ylz.homework;

import java.util.Date;

/**
 * @author ：L2
 * @date ：Created in 2023.05.15 下午 05:19
 * @description：
 * @modified By：
 * @version:
 */
public class Homework09 {
    public static void main(String[] args) {
        Music music = new Music("故乡", 3.18);
        System.out.println(music.toString());
    }
}
class Music{
    String name;
    double times;

    public Music(String name, double times) {
        this.name = name;
        this.times = times;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", times=" + times +
                '}';
    }
}