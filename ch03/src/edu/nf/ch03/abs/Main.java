package edu.nf.ch03.abs;

public class Main {
    public static void main(String[] args) {
        //多态用父类存储继承的父类的子类
        Teacher teacher = new JavaTeacher();
        //子类实现的方法会存到teacher中，在调用继承下来的方法完成操作-/*
        teacher.work();
    }
}