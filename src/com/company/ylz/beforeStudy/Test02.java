package com.company.ylz.beforeStudy;

import java.util.Scanner;

/**
 * @author 理智
 * @ Classname Test02
 * @ Description TODO
 * @ Version 1.0.0
 * @ Date 2023/5/26 8:39
 * @ Created by y1352
 */

public class Test02 {
    public static void main(String[] args) {
        String psw="你好";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("密码");
            String next = scanner.next();
            if(next.equals(psw)){
                System.out.println("登陆成功");
                return;
            }else{
                System.out.println("密码不正确,请重新输入");
            }
        }

    }
}
