package edu.nf.ch03.abs;

//继承了Teacher抽象类
public class PhpTeacher extends Teacher {
    //类里面有两个抽象方法要实现
    @Override
    public void lesson() {
        System.out.println("上Php课");
    }

    @Override
    public void homework() {
        System.out.println("布置php作业");
    }
}