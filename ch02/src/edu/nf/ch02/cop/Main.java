package edu.nf.ch02.cop;

import java.io.FileInputStream;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws Exception {

        //多态(这种方式是写死的，这样要修改源代码)
        //Teacher teacher = new JavaTeacher();写死的

        //这样在配置文件里面改就好了，配置灵活
        Teacher teacher = (Teacher) Class.forName(PropUtils.getProperty("name")).newInstance();
        System.out.println("实例"+teacher);
    }

}
