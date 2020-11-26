package edu.nf.ch06;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {

    public static void main(String[] args) throws Exception {
        //获取user的Class对象
        Class<?> clazz = Users.class;
        //获取类上标识的注解信息
        //isAnnotationPresent方法用于判断是否标识了注解
        //如果标识则返回ture
        if(clazz.isAnnotationPresent(MyAnno.class)){
            //获取所有的注解类
            //Annotation[] annos =  clazz.getAnnotations();

            //获取注解信息
            MyAnno anno =  clazz.getAnnotation(MyAnno.class);
            //获取注解的属性值
            String value = anno.value();
            String name = anno.name();
            System.out.println(name +"，"+ value);
        }

        System.out.println("----------------------");

        //获取当前类指定的方法
        Method me = clazz.getMethod("say",String.class);
        //isAnnotationPresent方法用于判断是否标识了注解
        //如果标识则返回ture
        if(me.isAnnotationPresent(MyAnno.class)){
            //获取注解信息
            MyAnno a =  me.getAnnotation(MyAnno.class);
            //输出注解的属性的值
            System.out.println(a.name() +"，"+a.value());
        }

        System.out.println("------------------");

        //获取当前类指定的方法
        Field f = clazz.getDeclaredField("name");
        f.setAccessible(true);
        //isAnnotationPresent方法用于判断是否标识了注解
        //如果标识则返回ture
        if(f.isAnnotationPresent(MyAnno.class)){
            //获取注解信息
            MyAnno a =  f.getAnnotation(MyAnno.class);
            //输出注解的属性的值
            System.out.println(a.name() +"，"+a.value());
        }

        System.out.println("---------------------------");

        //获取方法
        Method m = clazz.getMethod("say", String.class);
        //获取方法参数
        Parameter[] p = m.getParameters();
        //循环当前获取的参数集合
        for(Parameter p1 : p ){
            //判断当前参数是否有标识注解
            if(p1.isAnnotationPresent(MyAnno.class)){
                //获取注解信息
                MyAnno my =  p1.getAnnotation(MyAnno.class);
                //输出注解属性的值
                System.out.println(my.name()+","+my.value());
            }
        }
    }
}
