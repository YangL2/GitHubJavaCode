package com.company.ylz.java01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author 理智
 *@lassname ForExercise
 *@Description TODO
 *@-Version 1.0.0
 *@Date 2023/5/25 10:04
 *@Created by y1352
 */

public class ForExercise {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
