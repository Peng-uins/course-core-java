package edu.nf.ch03.teacher;

public class JavaTeacher extends Teacher implements Teacher2{

    @Override
    public void homework() {
        System.out.println("布置JAVA作业");
    }

    @Override
    public void lesson() {
        System.out.println("上JAVA课");
    }

    /**
     * 重写了父类的code方法
     */
    @Override
    public void code() {
        System.out.println("开发JAVA项目");
    }

    @Override
    public void a() {
        System.out.println("dsadsds");
    }
}
