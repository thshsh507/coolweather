/**
 * @Title: City.java
 * @Package: com.coolweather.app.model
 * @Description: TODO(用一句话描述该文件做什么)
 * @author:  songxx
 * @date: 2022年2月22日 下午4:09:37
 */
package com.coolweather.app.model;

/**
 * @ClassName: City
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author songxx
 * @date 2022年2月22日 下午4:09:37
 */
public class City
{
    private int    id;
    private String cityName;
    private String cityCode;
    private int    provinceId;

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @param id
     *            要设置的 id
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the cityName
     */
    public String getCityName()
    {
        return cityName;
    }

    /**
     * @param cityName
     *            要设置的 cityName
     */
    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    /**
     * @return the cityCode
     */
    public String getCityCode()
    {
        return cityCode;
    }

    /**
     * @param cityCode
     *            要设置的 cityCode
     */
    public void setCityCode(String cityCode)
    {
        this.cityCode = cityCode;
    }

    /**
     * @return the provinceId
     */
    public int getProvinceId()
    {
        return provinceId;
    }

    /**
     * @param provinceId
     *            要设置的 provinceId
     */
    public void setProvinceId(int provinceId)
    {
        this.provinceId = provinceId;
    }

}
