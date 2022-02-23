/**
 * @Title: HttpCallbackListener.java
 * @Package: com.coolweather.app.util
 * @Description: TODO(用一句话描述该文件做什么)
 * @author:  songxx
 * @date: 2022年2月22日 下午5:08:50
 */
package com.coolweather.app.util;

/**
 * @ClassName: HttpCallbackListener
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author songxx
 * @date 2022年2月22日 下午5:08:50
 */
public interface HttpCallbackListener
{
    void onFinish(String response);

    void onError(Exception e);
}
