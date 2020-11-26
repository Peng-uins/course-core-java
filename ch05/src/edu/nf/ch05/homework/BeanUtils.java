package edu.nf.ch05.homework;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {

    /**
     * 将map转换为实体
     * @param map
     * @param c
     * @return
     */
    public static Object convert(Map<String,Object> map, Class c){
        //先抛出异常，这个反射会有运行时错误
        try{
            //拿到传入的类，实例化
            Object obj = c.newInstance();
            //把map集合循环遍历
            for(String key:map.keySet()){
                //根据key拿到对应的私有化字段
                Field field2 = c.getDeclaredField(key);
                //把字段私有化打开
                field2.setAccessible(true);
                //获取到对应key的value
                String value = map.get(key).toString();
                //判断是否要类型转换
                if(key == "id" || key == "age"){
                    //存入值，在根据类型进行转换
                    field2.set(obj,Integer.parseInt(value));
                }else{
                    field2.set(obj,value);
                }
            }
            return obj;
        }catch(Exception e){
            throw  new RuntimeException(e.getMessage(),e);
        }
    }

    /**
     * 将实体转换为map
     * @param obj
     * @return
     */
    public static  Map<String,Object> converttoMap(Object obj){
            Map<String,Object> map = new HashMap<>();
        try{
            //先拿到obj的class对象
            Class c = obj.getClass();
            //获取到c对象的全部字段
            Field[] fields2 = c.getDeclaredFields();
            //循环全部字段
            for (Field f: fields2) {
                //把访问权限打开
                f.setAccessible(true);
                //拿到每一个字段的值
                Object value1 = f.get(obj);
                //存入map集合中，获取当前f的名字和值，然后存入
                map.put(f.getName(),value1);
            }
            return map;
        }catch (Exception e){
            throw new RuntimeException("",e);
        }
    }

    /**
     * Bean的拷贝
     * 把src的实体对象的字段信息拷贝到target实体对象的字段
     */
    public static void copy(Object src,Object target){
      Map<String,Object> map =  BeanUtils.converttoMap(src);
      Class clazz = target.getClass();
      for(String key:map.keySet()){
          try{
              Field field = clazz.getDeclaredField(key);
              //打开访问开关给field赋值
              field.setAccessible(true);
              Object value = map.get(key);
              field.set(target,value);
          }catch (Exception e){
              e.printStackTrace();
          }
      }
    }
}
