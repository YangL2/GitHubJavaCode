package com.ylz.override;

/**
 * @author ：L2
 * @date ：Created in 2023.05.19 下午 05:47
 * @description：
 * @modified By：
 * @version:
 */
public class Student extends Person{
    private int id;
    private double score;

    public Student() {
    }

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){
        return super.say()+"工号为"+getId()+"分数为"+getScore();
    }
}