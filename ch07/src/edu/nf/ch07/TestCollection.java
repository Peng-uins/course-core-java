package edu.nf.ch07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author 0.0
 */
public class TestCollection {

    /**
     * ArrayList是基于数组的结构实现的（数组长度不可变）
     */
    public  void testArrayList(){
        //<>泛型，指定是声明泛型就只能放入声明类型的值
        ArrayList<String> list = new ArrayList<>();
        //往集合添加元素，允许重复的元素
        //往集合里面添加元素，list可以放入重复值的数据
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("python");
        list.add("hello");
        //根据下标取出指定的元素
        String str = list.get(1);
        System.out.println(str);
        System.out.println("----------------------------------");
        //遍历集合
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("----------------------------------");
        //替换指定下标的元素
        list.set(4,"wowo");
        System.out.println(list.get(4));
        System.out.println("----------------------------------");
        //删除指定元素
        list.remove(4);
        //查看集合大小
        System.out.println("集合大小："+list.size());
        System.out.println("----------------------------------");
        //判断某个元素是否存在集合中,contains()是否包含元素
        boolean bl = list.contains("hello");
        System.out.println("是否包含元素："+bl);
        System.out.println("----------------------------------");
        //获取元素的下标值
        int index = list.indexOf("hello");
        System.out.println("当前元素的下标："+index);
    }

    /**
     * LinkedList集合是基于链表的数据结构实现的
     */
    public void testLinkedList(){
        LinkedList<String> list = new LinkedList<>();
        //添加元素
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("php");
        //获取下标获取元素
        list.set(0,"good");
        list.remove(0);
        //。。于ArrayList类似，有实现List接口中的方法

        //LinkedList独有的api方法，可以在集合的头和尾来操作元素
        //从头部添加元素
        list.addFirst("hello");
        //从尾部添加元素
        list.addLast("python");
        //移除头和尾的元素
        list.removeFirst();
        list.removeLast();

    }

    /**
     * Hashset是基于散列的数据结构
     * Hashset是无下标，不可重复的一种集合
     */
    public void testHashSet(){
        HashSet<String> set = new HashSet();
        //这个add方法是父类继承下来的
        set.add("hello");
        set.add("java");
        set.add("world");
        set.add("php");
        /**
         * 添加重复的元素也只会输出一个元素
         */
        //遍历循环
        for(String s :set){
            System.out.println(s);
        }
        System.out.println("-------------------------");
        //s是输出的值，->遍历出来要干什么 要输出的 要写多行代码要加大括号{System.out.println(s)}
        set.forEach(s -> System.out.println(s));
        System.out.println("------------------------------");
        //判断集合是否为空,isEmpty父类继承的
        System.out.println(set.isEmpty());
         //判断set集合是否包含元素
        System.out.println(set.contains("hello"));
    }

    public void testHashset2(){
        HashSet<Users> set = new HashSet<>();
        //这两个Users在堆的地址不一样，因为都创建的实例，所以可以重复了，但是不符合业务
        Users u1 = new Users("张三",19);
        Users u2 = new Users("张三",19);
        set.add(u1);
        set.add(u2);
        for(Users u : set){
            System.out.println(u.getUserName()+u.getAge());
        }
    }

    public static void main(String[] args) {
        TestCollection testCollection = new TestCollection();
        //testCollection.testArrayList();
        //testCollection.testHashSet();
        testCollection.testHashset2();
    }
}
