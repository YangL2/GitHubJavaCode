package com.ylz.polyparameter;

/**
 * @author y1352
 * @Classname Worker
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/5/24 10:40
 * @Created by y1352
 */

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnuual() {
        return super.getAnuual();
    }

    public void work() {
        System.out.println(getName() + "工人正在工作");
    }
}
