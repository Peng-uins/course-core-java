package edu.nf.ch01;

public class AcerComputer {
    //属性
    private String size;
    private String color;
    private String cpu;
    private String memory;

    //行为(方法)
    public void play(){
        System.out.println("playing...");
    }

    public void work(){
        System.out.println("working...");
    }

    //main方法不属于行为和属性是一个特殊的方法，表示程序的入口方法
    public static void main(String[] args) throws  Exception{
        //方式一：创建类的对象，这个是自动加载，但是要一个一个的类来查找
        AcerComputer acer1 = new AcerComputer();
        AcerComputer acer2 = new AcerComputer();

        //这样做acer1本来的对象就会变成垃圾对象，jvm会回收的
        acer1 = acer2;

        acer1 = null;

        //方式二:手动加载class来创建实例
        //Class.forName(绝对路径)手动类加载，这个是指定路径去查找
        //newInstance()方法创建改class的实列对象,但是返回的Object类型
       /* Object o1 = Class.forName("edu.nf.ch01.AcerComputer").newInstance();
        Object o2 = Class.forName("edu.nf.ch01.AcerComputer").newInstance();
        //把拿到的对象进行强制转换
        AcerComputer acer1 = (AcerComputer)o1;
        AcerComputer acer2 = (AcerComputer)o2;*/

        acer1.play();
        acer2.work();
    }
}
