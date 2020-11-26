package edu.nf.project.dome;


import edu.nf.project.entity.users;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view1.View;
import org.nf.mvc.view1.impl.ForwardView;
import org.nf.mvc.view1.impl.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Method_Class {

    @WebRequest("/add")
    public View add(HttpServletResponse response, HttpServletRequest request){
        System.out.println("添加用户:"+request.getParameter("username"));

        return new ForwardView("users.html");
    }

    @WebRequest("/add2")
    public View add2(users u, HttpServletRequest request){
        System.out.println(u.getUsername());
        System.out.println(u.getAge());
        System.out.println(u.getPassword());
        System.out.println("添加用户:"+request.getParameter("username"));

        return new RedirectView("users.html");
    }

    @WebRequest("/add3")
    public JsonView add3(users u, HttpServletRequest request){
        System.out.println(u.getUsername());
        System.out.println(u.getAge());
        System.out.println(u.getPassword());
        System.out.println("添加用户:"+request.getParameter("username"));

        return new JsonView(u);
    }


    @WebRequest("/get")
    public void get(HttpServletResponse response, HttpServletRequest request){
        System.out.println("查找用户");
    }

    @WebRequest("/del")
    public void del(HttpServletResponse response, HttpServletRequest request){
        System.out.println("删除用户");
    }


}
