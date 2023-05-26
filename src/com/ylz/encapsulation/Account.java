package com.ylz.encapsulation;

/**
 * @author ：L2
 * @date ：Created in 2023.05.15 下午 02:16
 * @description：
 * @modified By：
 * @version:
 */
class Account{
    public String name;
    private int balance;
    private String password;

    public Account() {
    }

    public Account(String name, int balance, String password) {
        setBalance(balance);
        setName(name);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<=4 && name.length()>=2){
            this.name = name;
        }else{
            System.out.println("姓名必须为2-4位");
            this.name="jack";
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance>20){

            this.balance = balance;
        }else{
            System.out.println("余额必须大于20");
            this.balance=20;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()==6) {
            this.password = password;
        }else{
            System.out.println("密码必须为6位");
            this.password="123456";
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}