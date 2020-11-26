package edu.nf.ch05;

public class Users extends People implements Fly {
    public String userName;
    private String address;

    public Users() {
        System.out.println("执行构造方法");
    }

    public Users(String name){
        System.out.println("执行构造方法："+name);
    }

    private Users(int status){
        System.out.println("执行私有构造方法："+status);
    }

    public Users(String userName, String address) {
        this.userName = userName;
        this.address = address;
    }

    public void say(String name, int age){
        System.out.println("Hello "+name+", age is"+age);
    }

    private void run(){
        System.out.println("running...");
    }

    @Override
    public void fly() {
        System.out.println("我flynm");
    }
}
