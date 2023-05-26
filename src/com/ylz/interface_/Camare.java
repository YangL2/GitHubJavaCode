package com.ylz.interface_;

/**
 * @author 理智
 * @ Classname Camare
 * @ Description TODO
 * @ Version 1.0.0
 * @ Date 2023/5/26 16:47
 * @ Created by y1352
 */

public class Camare implements Usb{
    @Override
    public void start() {
        System.out.println("相机开始工作了");
    }

    @Override
    public void stop() {
        System.out.println("相机结束工作了");
    }
}
