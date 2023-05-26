package com.ylz.computer;

/**
 * @author ：L2
 * @date ：Created in 2023.05.17 下午 05:31
 * @description：  包含cpu 内存 硬盘
 * @modified By：
 * @version:
 */
public class Computer {
    public String Cpu;
    public String NeiCun;
    public String YingPan;

    public Computer() {
    }

    public Computer(String Cpu, String NeiCun, String YingPan) {
        this.Cpu = Cpu;
        this.NeiCun = NeiCun;
        this.YingPan = YingPan;
    }
    public String getDetail(){
        return "cpu:" +getCpu()+ "内存:" + NeiCun  + "硬盘:" + NeiCun;
    }

    public void setCpu(String cpu) {
        Cpu = cpu;
    }

    public void setNeiCun(String neiCun) {
        NeiCun = neiCun;
    }

    public void setYingPan(String yingPan) {
        YingPan = yingPan;
    }

    public String getCpu() {
        return Cpu;
    }

    public String getNeiCun() {
        return NeiCun;
    }

    public String getYingPan() {
        return YingPan;
    }
}