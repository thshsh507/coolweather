/**
 * @Title: County.java
 * @Package: com.coolweather.app.model
 * @Description: TODO(用一句话描述该文件做什么)
 * @author:  songxx
 * @date: 2022年2月22日 下午4:10:28
 */
package com.coolweather.app.model;

/**
 * @ClassName: County
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author songxx
 * @date 2022年2月22日 下午4:10:28
 */
public class County
{
    private int    id;
    private String countyName;
    private String countyCode;
    private int    cityId;

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
     * @return the countyName
     */
    public String getCountyName()
    {
        return countyName;
    }

    /**
     * @param countyName
     *            要设置的 countyName
     */
    public void setCountyName(String countyName)
    {
        this.countyName = countyName;
    }

    /**
     * @return the countyCode
     */
    public String getCountyCode()
    {
        return countyCode;
    }

    /**
     * @param countyCode
     *            要设置的 countyCode
     */
    public void setCountyCode(String countyCode)
    {
        this.countyCode = countyCode;
    }

    /**
     * @return the cityId
     */
    public int getCityId()
    {
        return cityId;
    }

    /**
     * @param cityId
     *            要设置的 cityId
     */
    public void setCityId(int cityId)
    {
        this.cityId = cityId;
    }

}
