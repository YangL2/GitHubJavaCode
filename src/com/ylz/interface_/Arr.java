package com.ylz.interface_;

/**
 * @author 理智
 * @ Classname Arr   二维数组遍历 复习
 * @ Description TODO
 * @ Version 1.0.0
 * @ Date 2023/5/26 17:05
 * @ Created by y1352
 */

public class Arr {
    public static void main(String[] args) {
        int[][] arr={{12223,231323,21321312},{123123123,213123,123123},{123123123},{123123123}};
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println("======");
        }
    }
}
