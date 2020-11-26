package edu.nf.ch05;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main3 {

    public static void main(String[] args) throws Exception {
        //获取Users类的Class对象
        //<?>泛型？号是一个未知的，不加有个问号会有一个警告
        Class<?> clazz = Users.class;
        //根据Class对象创建当前类的实例(会执行构造方法)
        Object obj = clazz.newInstance();

        //获取当前类所有公共的方法，包括继承的(自然也包括Object中的方法)
        //Method用于描述方法信息，一个方法用一个Method来描述
        Method[] methods = clazz.getMethods();
        for (Method m: methods) {
            //获取方法的名称
            System.out.println("名称："+m.getName());
            //获取方法的返回值类型
            System.out.println("返回值类型："+m.getReturnType());
        }

        System.out.println("-------------------------");

        //获取某一个公共的方法,参数指定方法名称
        //第二参数开始是一个可变参数，表示方法的参数类型
        //如果方法声明了参数，那么需要指定参数类型
        //就是方法有参数后面就给参数
        //Integer.TYPE或者(int.class)
        Method method1 = clazz.getMethod("say",String.class , Integer.TYPE);
        //获取方法名称和方法返回的类型
        System.out.println(method1.getName()+":"+method1.getReturnType());
        System.out.println("-----------------------------------");
        //获取方法的参数个数
        System.out.println("参数个数："+method1.getParameterCount());
        //获取当前方法所有参数信息，Parameter表示参数信息，一个Parameter表示一个参数对象
        Parameter[] param =  method1.getParameters();
        for(Parameter p :param){
            //获取参数名称
            System.out.println("参数名称："+p.getName());
            //获取参数的类型
            System.out.println("参数类型："+p.getType());
        }
        //调用当前方法,使用invoke方法，参数一传入当前类的实例，
        // 第二个参数开始是一个可变的参数，表示方法的实参
        //如果方法有返回值，那么invoke也会返回响应的值，如果返回值是void，
        //那么invoke则返回null
        Object retur =  method1.invoke(obj,"user2",21);
        System.out.println(retur);

        System.out.println("-----------------------");

        //获取某个私有的方法
        Method method2 = clazz.getDeclaredMethod("run");
        //私有方法不能直接访问的，调用前也必须先打开访问开关
        method2.setAccessible(true);
        //run方法没有参数，因此invoke时候不需要传入实参，只需要当前类实例
        method2.invoke(obj);

        System.out.println("-------------");

        //获取本类中所有的方法，包括私有和公有的，但是不包括继承的
        Method[] methods2 = clazz.getDeclaredMethods();
        for(Method m : methods2){
            System.out.println(m.getName());
        }

    }
}
