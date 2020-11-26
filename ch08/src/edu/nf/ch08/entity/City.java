package edu.nf.ch08.entity;

import java.util.Objects;

public class City {

    private Integer id;
    private String cityName;
    private String cityCode;
    private String province;

    public City() {
    }

    public City(Integer id, String cityName, String cityCode, String province) {
        this.id = id;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.province = province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof City)) {return false;}
        City city = (City) o;
        return Objects.equals(id, city.id) &&
                Objects.equals(cityName, city.cityName) &&
                Objects.equals(cityCode, city.cityCode) &&
                Objects.equals(province, city.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cityName, cityCode, province);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String getProvince() {
        return province;
    }
}
