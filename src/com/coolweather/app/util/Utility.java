/**
 * @Title: Utility.java
 * @Package: com.coolweather.app.util
 * @Description: TODO(用一句话描述该文件做什么)
 * @author:  songxx
 * @date: 2022年2月22日 下午5:11:40
 */
package com.coolweather.app.util;

import com.coolweather.app.model.City;
import com.coolweather.app.model.CoolWeatherDB;
import com.coolweather.app.model.County;
import com.coolweather.app.model.Province;

import android.text.TextUtils;

/**
 * @ClassName: Utility
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author songxx
 * @date 2022年2月22日 下午5:11:40
 */
public class Utility
{
    /**
     * 解析和处理服务器返回的省级数据
     */
    public synchronized static boolean handleProvincesResponse(CoolWeatherDB coolWeatherDB, String response)
    {
        if (!TextUtils.isEmpty(response))
        {
            String[] allProvinces = response.split(",");
            if (allProvinces != null && allProvinces.length > 0)
            {
                for (String p : allProvinces)
                {
                    String[] array = p.split("\\|");
                    Province province = new Province();
                    province.setProvinceCode(array[0]);
                    province.setProvinceName(array[1]);
                    // 将解析出来的数据存储到Province表
                    coolWeatherDB.saveProvince(province);
                }
                return true;
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCitiesResponse(CoolWeatherDB coolWeatherDB, String response, int provinceId)
    {
        if (!TextUtils.isEmpty(response))
        {
            String[] allCities = response.split(",");
            if (allCities != null && allCities.length > 0)
            {
                for (String c : allCities)
                {
                    String[] array = c.split("\\|");
                    City city = new City();
                    city.setCityCode(array[0]);
                    city.setCityName(array[1]);
                    city.setProvinceId(provinceId);
                    // 将解析出来的数据存储到City表
                    coolWeatherDB.saveCity(city);
                }
                return true;
            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的县级数据
     */
    public static boolean handleCountiesResponse(CoolWeatherDB coolWeatherDB, String response, int cityId)
    {
        if (!TextUtils.isEmpty(response))
        {
            String[] allCounties = response.split(",");
            if (allCounties != null && allCounties.length > 0)
            {
                for (String c : allCounties)
                {
                    String[] array = c.split("\\|");
                    County county = new County();
                    county.setCountyCode(array[0]);
                    county.setCountyName(array[1]);
                    county.setCityId(cityId);
                    // 将解析出来的数据存储到County表
                    coolWeatherDB.saveCounty(county);
                }
                return true;
            }
        }
        return false;
    }
}
