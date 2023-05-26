package com.ylz.interface_;

/**
 * @author 理智
 * @ Classname Computer
 * @ Description TODO
 * @ Version 1.0.0
 * @ Date 2023/5/26 16:48
 * @ Created by y1352
 */

public class Computer {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.start();
        phone.stop();
        Camare camare = new Camare();
        camare.start();
        camare.stop();
    }
}
