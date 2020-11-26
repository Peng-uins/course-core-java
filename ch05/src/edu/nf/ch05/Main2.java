package edu.nf.ch05;

import java.lang.reflect.Field;

public class Main2 {

    public static void main(String[] args) throws Exception {
        //获取class对象（用一个谐音来表示class对象）
        Class clazz =  Users.class;
        //通过Class对象创建当前类的实例(可以强转)
        Object obj = clazz.newInstance();

        //获取简单类名(不包含包名)
        String className1 = clazz.getSimpleName();
        System.out.println(className1);

        //获取完整类名(包含包名)
        String className2 = clazz.getName();
        System.out.println(className2);

        //获取包名             类     包           包名
        String packageName = clazz.getPackage().getName();
        System.out.println(packageName);
        System.out.println("----------------------------");

        //获取公共的字段(包括继承的公共字段),getFields获取所有公共的字段getFields获取指定的
        //Field封装Class中的字段信息，一个字段对应一个Filed对象
        //一个字段使用一个Filed对象来描述
        Field[] fields =  clazz.getFields();
        for (Field f: fields) {
            //获取字段的名称
            System.out.println(f.getName());
            //获取字段的类型
            System.out.println(f.getType());
        }

        System.out.println("------------------------------");

        //根据名称获取某一个公共字段
        Field field = clazz.getField("userName");
        //获取该字段的名称和类型
        System.out.println(field.getName()+":"+field.getType());
        //给字段赋值，set方法第一个参数是当前类的实例，第二个参数是要赋值的内容
        field.set(obj,"张三");
        //取值get的方法只要传入当前实例就好了
        String value = (String)field.get(obj);
        System.out.println(value);

        System.out.println("-------------------------");

        //根据字段名获取私有的字段
        Field field2 = clazz.getDeclaredField("address");
        //由于是私有的，因此不能直接访问操作，要打开访问开关
        field2.setAccessible(true);
        //给私有字段赋值和取值
        field2.set(obj,"珠海");
        String value1 = (String)field2.get(obj);
        System.out.println(value1);

        System.out.println("------------------------");

        //获取本类所有的字段，包括私有和公共的但不包括继承的
        Field[] fields2 = clazz.getDeclaredFields();
        for (Field f: fields2) {
            System.out.println(f.getName());
        }

    }

}
