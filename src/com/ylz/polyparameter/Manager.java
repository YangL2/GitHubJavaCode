package com.ylz.polyparameter;

/**
 * @author y1352
 * @Classname Manager
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/5/24 10:43
 * @Created by y1352
 */

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnuual() {
        return super.getAnuual() + bonus;
    }

    public void managerWork() {
        System.out.println(getName() + "正在managing");
    }
}
