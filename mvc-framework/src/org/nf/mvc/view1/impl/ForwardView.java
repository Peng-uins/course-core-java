package org.nf.mvc.view1.impl;

import org.nf.mvc.view1.Parentview;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardView extends Parentview {

    public ForwardView(String s) {
        object = s;
    }

    @Override
    public void response(Object obj,HttpServletResponse response , HttpServletRequest request) {

        try {
            request.getRequestDispatcher(obj.toString()).forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
