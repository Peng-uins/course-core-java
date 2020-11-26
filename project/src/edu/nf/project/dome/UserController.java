package edu.nf.project.dome;

import edu.nf.project.entity.users;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view1.View;
import org.nf.mvc.view1.impl.DsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController {

    @WebRequest("/addUser")
    public View add(users users) throws Exception{
        System.out.println("添加一个人");

    //    return new ForwardView("users.html");
     //   return  new RedirectView("users.html");

        return  new DsonView(users);
    }

    @WebRequest("/update")
    public void update(HttpServletResponse response, HttpServletRequest request){
        System.out.println("删除一个人");
    }
}
