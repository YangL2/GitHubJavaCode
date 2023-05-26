package com.ylz.interface_;

/**
 * @author 理智
 * @ Classname Phone
 * @ Description TODO
 * @ Version 1.0.0
 * @ Date 2023/5/26 16:46
 * @ Created by y1352
 */

public class Phone implements Usb{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机结束工作");
    }
}
