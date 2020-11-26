package edu.nf.ch03.teacher;

public class PhpTeacher extends Teacher implements Teacher2 {

    @Override
    public void lesson() {
        System.out.println("上PHP课");
    }

    @Override
    public void code() {
        System.out.println("开发PHP项目");
    }

    @Override
    public void homework() {
        System.out.println("布置PHP作业");
    }

    @Override
    public void a() {

    }
}
