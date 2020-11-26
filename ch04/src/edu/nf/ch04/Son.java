package edu.nf.ch04;

/**
 * 对象的初始化流程
 * 初始化父类的静态成员--->子类的静态成员--->初始化父类的实例变量
 * -->执行父类的实例代码块-->执行父类的构造方法--->执行子类的实例变量
 * -->执行子类的实例代码块--->执行子类的构造方法
 */
public class Son extends Father {
    private String sname = "son";
    private static String sex = "男";

    //静态代码块
    static{
        System.out.println(sex);
    }

    //实例代码块
    {
        System.out.println(sname);
    }

    public Son() {
        //仍和构造方法的第一行代码都是一个隐式的super()
        // 表示调用父类的构造方法，因为这样能正确的先初始化父类
        //一直到Object()
        //要调用父类的方法就super().方法
        //super();可以不写
        System.out.println("This is son.");
    }

    public static void main(String[] args) {
        Son s = new Son();
    }
}
