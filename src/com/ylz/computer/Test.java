package com.ylz.computer;

/**
 * @author ：L2
 * @date ：Created in 2023.05.17 下午 05:32
 * @description：
 * @modified By：
 * @version:
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("七彩虹","金士顿","西部数据");
        PC pc = new PC();
        pc.brand="技嘉";
        NotePad notePad = new NotePad();
        notePad.color="pink";
        System.out.println(computer.getDetail()+"品牌："+pc.brand+notePad.color);
    }
}