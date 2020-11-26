package edu.nf.ch06;

@MyAnno(value = "avc",name = "aaa")
public class Users {

    @MyAnno(value="a",name = "s")
    private String name;

    @MyAnno(value="ass",name = "nads")
    public void say(@MyAnno(value = "gg") String name){
        System.out.println("Hello"+name);
    }
}
