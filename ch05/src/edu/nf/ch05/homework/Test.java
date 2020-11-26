package edu.nf.ch05.homework;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("id",1001);
        map.put("name","张三");
        map.put("age",12);
        //编写一个BeanUtils的工具类，将map集合数据自动转换成实体类
        Student stu = (Student) BeanUtils2.convert(map,Student.class);
        System.out.println(stu.getId());
        System.out.println(stu.getName());
        System.out.println(stu.getAge());

        Map<String,Object> map2 = BeanUtils.converttoMap(stu);
        //map2.forEach((k,v) -> System.out.println(v));
       for(String m : map.keySet()){
            System.out.println(m+":"+map2.get(m));
        }
        System.out.println("-----------------------");

       //创建一个新的Students对象来拷贝
       Teacher stu2 = new Teacher();
       BeanUtils2.copy(stu,stu2);
       System.out.println(stu2.getId());
       System.out.println(stu2.getName());
       System.out.println(stu2.getAge());
    }
}
