package edu.nf.ch01;

public class Demo {
    public static void main(String[] args) {
        //包装类型都有缓存机制 -127——-128超过这个值就会创建一个新的对象来存就会不等于(类似于地址判断)
        /*Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a==b);
        System.out.println(c==d);*/

        String a = "hello";
        String b = "hello";

        String c = new String("World");
        String d = new String("World");
        System.out.println(a==b);
        System.out.println(c.equals(d));
    }
}

