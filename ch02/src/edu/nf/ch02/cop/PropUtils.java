package edu.nf.ch02.cop;

import java.io.IOException;
import java.util.Properties;

public class PropUtils {
    public static  String getProperty(String key){
        //优化(运行时动态创建子类对象，这个就不用修改源代码，方便简介)
        Properties prop = new Properties();
        try{
            //加载properties资源文件(等于说就是通过文件路径找文件)
            prop.load(Main.class.getClassLoader().getResourceAsStream("class.properties"));
            //根据key去除value
            String className = prop.getProperty(key);
            return  className;
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("解析异常",e);
        }

    }
}
