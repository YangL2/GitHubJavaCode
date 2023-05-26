package com.ylz.poly;

/**
 * @author ：L2
 * @date ：Created in 2023.05.23 下午 02:32
 * @description：
 * @modified By：
 * @version:
 */
public class Test {
    public static void main(String[] args) {
        Master master = new Master();
        master.name="理智";
        Cat cat = new Cat("小花猫");
        Rice rice = new Rice("米饭");

        master.feed(cat,rice);

        Pig pig = new Pig("小花猪");
        Meet meet = new Meet("五花肉");
        master.feed(pig,meet);

        Rabbit rabbit = new Rabbit("小白兔");
        Radish radish = new Radish("白萝卜");
        master.feed(rabbit,radish);

    }
}