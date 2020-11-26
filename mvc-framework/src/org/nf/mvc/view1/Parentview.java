package org.nf.mvc.view1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public abstract class Parentview implements View {
    public Object object;
    public HttpServletResponse response;
    public HttpServletRequest request;

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }
}
