package com.ylz.computer;

/**
 * @author ：L2
 * @date ：Created in 2023.05.17 下午 05:31
 * @description：
 * @modified By：
 * @version:
 */
public class PC extends Computer{
    public String brand;//品牌

    public PC() {
    }
    public PC(String cpu, String neiCun, String yingPan, String brand) {
        super(cpu, neiCun, yingPan);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public PC(String brand) {
        this.brand = brand;
    }
    public void show(){
        System.out.println(getDetail());
    }
}