package edu.nf.ch08.service;


import edu.nf.ch08.dao.CityDao;
import edu.nf.ch08.entity.City;
import edu.nf.ch08.entity.PageBean;

import java.util.List;

/**
 * @author wangl
 * @date 2020/10/22
 */
public class CityService {

    /**
     * 城市列表分页查询
     *
     * @param pageBean
     * @return
     */
    public PageBean listCity(PageBean pageBean) {
        CityDao dao = new CityDao();
        //查询总记录数设置到pageBean中，自动计算总页数
        pageBean.setTotal(dao.getRowCount());
        //查询分页数据
        List<City> list = dao.listCity(pageBean);
        //保存到pageBean中
        pageBean.setData(list);
        return pageBean;
    }
}