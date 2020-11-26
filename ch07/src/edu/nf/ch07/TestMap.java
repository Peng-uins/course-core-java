package edu.nf.ch07;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * @author 0.0
 * [k,v]数据结构，其内部的实现是基于
 * 数组+链表(JDK 1.8之前)
 * 数组+链表+红黑叔（JDK 1.8之后）
 *
 * map是允许空的键和空的值,Hashtable是不允许的
 * HashMap是线程不安全的（性能高），Hashtable是线程安全的(性能低)
 */
public class TestMap {

    public void testHashtable(){
        Hashtable<String,Object> table = new Hashtable<>();
        table.put("key1","hello");
        table.put("key2","world");
        table.put("key3",100);
        table.put(null,null);
        System.out.println(table.get(null));
    }

    public void testHashMap(){
        HashMap<String,Object> map = new HashMap<>();
        //以"键值对"的方式储存数据
        map.put("key1","hello");
        map.put("key2","world");
        map.put("key3",100);
        map.put(null,null);
        //取值不许根据key来获取value
        String str = map.get("key1").toString();
        System.out.println(str);
        System.out.println("--------------------------------");
        //判断map集合中是否包含 某个key,包含就返回true
        System.out.println("是否存在key："+map.containsKey("key1"));
        System.out.println("是否存在某个value："+map.containsValue("hello"));
        System.out.println("--------------------------------");
        //获取map集合中所以的key返回的是一个set集合
        Set<String> keys = map.keySet();
        //循环所处所以的key
        keys.forEach(key -> System.out.println(key));
        System.out.println("--------------------------------");
        //遍历map集合，先获取所有key，在根据key取出value
        for (String key:map.keySet()){
            System.out.println(key + ":"+map.get(key));
        }
        System.out.println("--------------------------------");
        //遍历map集合，获取Entry的set集合(一个Entry表示一个键值对的元素)
        //可以通过Entry的getKey或getValue方法获取键值
        for(Map.Entry<String,Object> entry : map.entrySet()){
            System.out.println(entry.getKey() +":"+ entry.getValue());
        }
    }

    public static void main(String[] args) {
        TestMap testMap = new TestMap();
        testMap.testHashMap();
        testMap.testHashtable();
    }
}

