package edu.nf.ch03.teacher;

public abstract class Teacher {

    /**
     * 公共的点名方法
     */
    public void call(){
        System.out.println("上课点名");
    };

    /**
     * 抽象的上课方法，不同的老师有不同的上课内容
     * 因此不同的子类来实现
     */
    public abstract  void lesson();

    /**
     * 布置作业，不同老师布置不同内容的作业
     */
    public abstract void homework();
}
