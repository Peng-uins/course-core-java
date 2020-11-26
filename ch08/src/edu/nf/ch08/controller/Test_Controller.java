package edu.nf.ch08.controller;

import edu.nf.ch08.dao.CityDao;
import edu.nf.ch08.entity.PageBean;
import edu.nf.ch08.service.CityService;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.View;


/**
 * @author 0.0
 */
public class Test_Controller{


    @WebRequest("/list")
    public View listCity(PageBean pageBean) {
        CityService service = new CityService();
        service.listCity(pageBean);
        return new JsonView(pageBean);
    }
}
