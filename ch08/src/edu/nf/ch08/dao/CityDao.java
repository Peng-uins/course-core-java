package edu.nf.ch08.dao;

import edu.nf.ch08.entity.City;
import edu.nf.ch08.entity.PageBean;
import edu.nf.ch08.uitl.ConnUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityDao {

    public List<City> listCity(PageBean pageBean){
        //查询城市表的语句
        String sql = "select city_id, city_name, city_code, province from city_info limit ?,?";
        //储存城市信息的对象
        List<City> list = new ArrayList<>();
        //获取conn对象
        try(Connection conn = ConnUtils.getConnection();
            //获取执行SQL语句对象
            PreparedStatement ps = conn.prepareStatement(sql)){
            //给占位符赋值，防止sql注入
            ps.setInt(1, pageBean.getRowNum());
            ps.setInt(2, pageBean.getPageSize());
            //运行sql语句获取返回值
            try(ResultSet rs = ps.executeQuery()) {
                //循环获取到的值
                while(rs.next()){
                    //创建一个城市对象来装信息
                    City city = new City();
                    city.setId(rs.getInt(1));
                    city.setCityName(rs.getString(2));
                    city.setCityCode(rs.getString(3));
                    city.setProvince(rs.getString(4));
                    //把当前对象存到集合中
                    list.add(city);
                }
            }catch(SQLException e){
                throw e;
            }
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException("查询异常", e);
        }
        //返回集合
        return list;
    }

    /**
     * 获取总记录数,获取到城市表有多少条数据
     * @return
     */
    public int getRowCount(){
        //sql语句获取全部的数据条数
        String sql = "select count(*) from city_info";
        try(Connection conn = ConnUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){
            int rowCount = 0;
            if(rs.next()){
                //拿到数据值存入rowCount中
                rowCount = rs.getInt(1);
            }
            return rowCount;
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException("查询异常", e);
        }
    }
}
