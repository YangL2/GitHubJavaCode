package com.ylz.encapsulation;

/**
 * @author ：L2
 * @date ：Created in 2023.05.15 下午 01:09
 * @description：
 * @modified By：
 * @version:
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setName("tom");
        account1.setBalance(21);
        account1.setPassword("213451");
        System.out.println(account1.toString());

        /*for (int i = 1; i <= 100; i++) {
            if(i%7 ==0  ){
                continue;
            }
            if(i%10==7){
                continue;
            }
            if(i/10%10==7){
                continue;
            }
            System.out.println(i);
        }*/
    }
}

/*
71  /10   7.1 7  1
 5 /  7   0···5
*/
