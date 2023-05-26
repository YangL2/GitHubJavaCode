package com.ylz.polyparameter;

/**
 * @    Classname Test
 *  @   Description TODO
 * @    Version 1.0.0
 * @    Date 2023/5/24 10:58
 * @    Created by y1352
 * @author y1352
 */

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Worker worker = new Worker("pzy", 1000);
        test.showEmpAnnual(worker);
        test.testWork(worker);
        Manager manager = new Manager("离职", 2000, 50000);
        test.showEmpAnnual(manager);
         int a= 0;
         int b =100;
        for (int i = 0; i <=b; i++) {
            a =a+i;
        }
        System.out.println(a);

    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnuual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).managerWork();
        } else {
            System.out.println("有误");
        }
    }
}
