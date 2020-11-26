package edu.nf.ch05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;


public class Main4 {

    public static void main(String[] args) throws Exception{
        //获取Users的Class对象
        Class<?> clazz = Class.forName("edu.nf.ch05.Users");
        //获取所有的公共的构造方法,构造方法使用Constructor对象来描述
        //一个Constructor表示一个构造方法
        Constructor[] cons =  clazz.getConstructors();

        for(Constructor c :cons){
            //输出构造方法的名字以及参数的个数
            System.out.println(c.getName());
            //获取构造方法的所有参数信息
            Parameter[] p =  c.getParameters();
            //循环输出每一个参数详细信息
            for(Parameter p1 : p){
                System.out.println("参数名称："+p1.getName());
                System.out.println("参数类型："+p1.getType());
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        //获取某一个公共的构造方法，有参数要指定参数类型
        Constructor con = clazz.getConstructor(String.class,String.class);
        //使用构造方法来创建实例,同时需要传入构造方法所需参数
        //如果是无参数就不需要
        Object obj = con.newInstance("user1","user2");
        System.out.println("创建出来的实例："+obj);

        System.out.println("-------------------------------");

        //获取所有的构造方法，包括私有的
        Constructor[] con2 = clazz.getDeclaredConstructors();
        for(Constructor c : con2){
            System.out.println(c.getName() + ",参数个数：" +c.getParameterCount());
        }

        //获取某一个私有的构造方法
        Constructor c = clazz.getDeclaredConstructor(Integer.TYPE);

        System.out.println("访问私有的方法："+c.getName());
        //如果要使用私有的构造方法来创建实例就要打开访问开关
        c.setAccessible(true);
        Object obj2 = c.newInstance(1);
        System.out.println("私有构造方法创建实例："+obj2);
    }
}
