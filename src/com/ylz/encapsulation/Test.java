package com.ylz.encapsulation;

/**
 * @author ：L2
 * @date ：Created in 2023.05.15 下午 04:32
 * @description：
 * @modified By：
 * @version:
 */
public class Test {
    public static void main(String[] args) {
        for (int i =3; i <=100; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    break;
                }else {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}