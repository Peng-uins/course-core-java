package edu.nf.ch03.teacher;

public class EnglishTeacher extends Teacher {
    @Override
    public void lesson() {
        System.out.println("上英语课");
    }

    @Override
    public void homework() {
        System.out.println("布置英语作业");
    }
}
