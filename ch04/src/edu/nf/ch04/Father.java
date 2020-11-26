package edu.nf.ch04;

public class Father {
    //实例变量（对象创建时初始化）
    private String fname = "father";
    //静态变量（类加载时初始化）
    private static String birthplace = "guangdong";

    //静态代码块（静态代码块也是在类加载时执行一次，并且静态代码块只能访问其他的静态成员）
    static{
        System.out.println(birthplace);
    }

    //实例代码块（每创建一次对象就会执行一次）
    {
        System.out.println(fname);
    }

    public Father() {
        System.out.println("This is father");
    }
}
