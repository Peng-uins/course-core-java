package edu.nf.ch01;

public class DataType {
    public static void main(String[] args) {
        //java只有八种基本类型，String不是基本类型
        byte b = 1;//对应的包装类型是Byte
        short s = 10;//对应的包装类型是Short
        int i = 10;//对应的包装类型是Integer
        //long类型的值的结尾要加L,长整型
        long l = 100L;//对应的包装类型是Long
        //单精度浮点型
        float f = 3.14f;//对应的包装类型是Float
        //双精度浮点型
        double d = 3.1415926;//对应的包装类型是Double
        //单字符类型
        char c = 'a';//对应包装类型是Character
        //布尔型(真假)
        boolean bl = true;//对应包装类型是Boolean

        //引用数据类型(对象数据类型)
        String str = new String("");
        String str2 = "abc";

        //包装类型(通常用来：用来做类型转换),有多少个基本类型就有多少个包装类型
        Byte b1 = new Byte((byte)10);//包装类型构造方法都有默认类型要转换一下
        Byte b2 = new Byte("10");
        Byte by = Byte.valueOf("10");
        byte by2 = Byte.parseByte("10");

        //类型转换
        Object o = "wds";
        String ss = "aaa";
        //自然转换（子类型直接赋值给父类型）
        o = ss;
        //强制转换(父类类型赋值给子类)
        String sss = (String)o;

        //在没有继承前提下的转换，不能进行强转，必须通过相关的API方法进行转换
        int aa = Integer.parseInt("10");
    }
}
