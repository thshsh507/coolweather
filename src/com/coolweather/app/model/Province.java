/**
 * @Title: Province.java
 * @Package: com.coolweather.app.model
 * @Description: TODO(用一句话描述该文件做什么)
 * @author:  songxx
 * @date: 2022年2月22日 下午3:59:24
 */
package com.coolweather.app.model;

/**
 * @ClassName: Province
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author songxx
 * @date 2022年2月22日 下午3:59:24
 */
public class Province
{
    private int    id;
    private String provinceName;
    private String provinceCode;

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
     * @return the provinceName
     */
    public String getProvinceName()
    {
        return provinceName;
    }

    /**
     * @param provinceName
     *            要设置的 provinceName
     */
    public void setProvinceName(String provinceName)
    {
        this.provinceName = provinceName;
    }

    /**
     * @return the provinceCode
     */
    public String getProvinceCode()
    {
        return provinceCode;
    }

    /**
     * @param provinceCode
     *            要设置的 provinceCode
     */
    public void setProvinceCode(String provinceCode)
    {
        this.provinceCode = provinceCode;
    }

}
