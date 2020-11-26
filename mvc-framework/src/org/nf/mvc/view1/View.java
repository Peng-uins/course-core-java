package org.nf.mvc.view1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface View {
    void response(Object obj, HttpServletResponse response , HttpServletRequest request);
}
