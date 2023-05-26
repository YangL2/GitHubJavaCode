package com.ylz.poly;

/**
 * @author ：L2
 * @date ：Created in 2023.05.23 下午 02:33
 * @description：
 * @modified By：
 * @version:
 */
public class Master {
    public String name;
    public String food;
    public Master() {
    }
    public Master(String name,String food) {
        this.name = name;
        this.food = food;
    }


    public void feed(Animals animals, Food food){
        System.out.println("主人"+name+"食物"+food.food);
        System.out.println("主人"+name+"喂"+animals.name+"吃"+food.food);
    }
}