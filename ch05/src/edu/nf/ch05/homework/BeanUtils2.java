package edu.nf.ch05.homework;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils2 {

    public static Object convert(Map<String,Object> map, Class c){
        try{
                //根据对象创建实体类
                Object obj = c.newInstance();
                //循环遍历map集合，去除每一个key
                for (String key:map.keySet()){
                    //只要key和实体的字段名相匹配，就可以取出对应的Field对象
                    Field field = c.getDeclaredField(key);
                    //打开访问开关给field赋值
                    field.setAccessible(true);
                    //赋值,map集合中根据key取出value，然后赋值给field
                    Object value = map.get(key);
                    field.set(obj,value);
                 }
            return  obj;
            }catch (Exception e){
                throw  new RuntimeException("",e);
        }
    }

    public static  Map<String,Object> converttoMap(Object obj){
        Map<String,Object> map = new HashMap<>();
        Class clazz = obj.getClass();
        //获取所有的私有字段
        Field[] fields = clazz.getDeclaredFields();
        //循环遍历每一个字段信息
        for(Field f : fields){
          try{
              //把访问权限打开
              f.setAccessible(true);
              //取出每一个fields的值
              Object value = f.get(obj);
              //将field的name作为key，字段值作为value保存到map中
              map.put(f.getName(),value);
          }catch (Exception e){
              throw  new RuntimeException("",e);
          }
        }
        return map;
    }

    public static void copy(Object src,Object target){
        //先获取实列的Class对象
        Class srcclazz = src.getClass();
        Class targetclazz = target.getClass();
        //先获取源对象中的所有字段信息
        Field[] fields = srcclazz.getDeclaredFields();
        for (Field f : fields){
            try{
                //打开访问开关
                f.setAccessible(true);
                //根据src的字段名去获取目标对象相同的Field,这个是私有的
               Field targetField =  targetclazz.getDeclaredField(f.getName());
               targetField.setAccessible(true);
               //给目标对象Fiel设值
                targetField.set(target,f.get(src));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
