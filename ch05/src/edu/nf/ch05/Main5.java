package edu.nf.ch05;

public class Main5 {

    public static void main(String[] args) {
        //获取users类的class对象
        Class<?> clazz = Users.class;
        //获取父类的class对象
        Class<?> superClass = clazz.getSuperclass();
        //父类的完整类型
        System.out.println(superClass.getName());
        //获取父类的父类的名字，再往上获取父类的信息
        System.out.println(superClass.getSuperclass().getName());
        System.out.println("-----------------------------------");

        //获取实现的接口的Class对象信息，因为一个类可以实现多个接口
        //所以返回的是一个Class数组
        Class<?>[] infClasses =  clazz.getInterfaces();
        for(Class<?> c : infClasses){
            System.out.println(c.getName());
        }
    }
}
