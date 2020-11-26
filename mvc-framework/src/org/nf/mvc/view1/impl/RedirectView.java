package org.nf.mvc.view1.impl;

import org.nf.mvc.view1.Parentview;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RedirectView extends Parentview {

    public RedirectView(String s) {
        object = s;
    }

    @Override
    public void response(Object obj, HttpServletResponse response , HttpServletRequest request) {
        try {
            response.sendRedirect(obj.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
