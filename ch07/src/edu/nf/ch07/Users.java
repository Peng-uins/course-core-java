package edu.nf.ch07;

import java.util.Objects;

/**
 * 重写equals方法的目的是为了重写比较对象的内容是否相等
 * 但同时也需要重写hashcode方法(hashcode是一种使用hash算法将内存地址换算为一个int类型的数值)
 * 当比较两个对象是否相等时，先调用hashcode返回的数值来比较，如果hashcode
 * 不相同则认为两个对象是不相同的，如果hashcode相同，这调用equals方法来比较
 * 内容是否相等，如果equals返回true则标识相等，false则不相等
 */
public class Users {

    private String userName;
    private Integer age;

    public Users() {
    }

    public Users(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getAge() {
        return age;
    }

   /* @Override
    public boolean equals(Object obj) {
        //先判断obj是否是当前类的实例
        if(obj instanceof  Users){
            //重写equals的方法
            Users u = (Users) obj;
            //用拿到的对象和本类的对象判断
            //如果当前对象的name和age和传入进来的Users的name和age相同
            //则认为是一样的对象
            if(this.userName.equals(u.getUserName()) && this.age.equals(u.getAge())){
                return true;
            }
            return false;
        }
        return false;

    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o){return true;}
        if (!(o instanceof Users)) {return false;}
        Users users = (Users) o;
        return Objects.equals(userName, users.userName) &&
                Objects.equals(age, users.age);
    }

    /**
     * 比较的时候先比较地址，所以要重写这个
     */
    @Override
    public int hashCode() {
        return Objects.hash(userName, age);
    }
}
