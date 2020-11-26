package edu.nf.ch01;

/**
 * 对象的初始化流程：（这个是没继承的有继承就先用以下操作父类的在执行一遍子类的）
 * 1、进行类加载
 * 2、初始化静态成员
 * 3、在堆内存中分配空间创建对象
 * 4、初始化实例对象
 * 5、执行构造方法剩余的内容
 */
public class Main {
    public static void main(String[] args) {
        People p1 = new People();
        People p2 = p1;
        People p3 = new People();
        p1 = null;
        p3 = p1;
        p2.say();
    }
}
