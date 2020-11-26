package org.nf.mvc.view1.impl;

import edu.nf.project.entity.users;
import org.nf.mvc.view1.Parentview;

import java.io.IOException;
import com.google.gson.Gson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DsonView extends Parentview {

    public DsonView(users users) {
        object = users;
    }

    @Override
    public void response(Object obj, HttpServletResponse response , HttpServletRequest request) {
        try {
            String json = new Gson().toJson(obj);
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
