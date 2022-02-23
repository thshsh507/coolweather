/**
 * @Title: HttpUtil.java
 * @Package: com.coolweather.app.util
 * @Description: TODO(用一句话描述该文件做什么)
 * @author:  songxx
 * @date: 2022年2月22日 下午5:07:17
 */
package com.coolweather.app.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @ClassName: HttpUtil
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author songxx
 * @date 2022年2月22日 下午5:07:17
 */
public class HttpUtil
{
    public static void sendHttpRequest(final String address, final HttpCallbackListener listener)
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                HttpURLConnection connection = null;
                try
                {
                    URL url = new URL(address);
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(8000);
                    connection.setReadTimeout(8000);
                    InputStream in = connection.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null)
                    {
                        response.append(line);
                    }
                    if (listener != null)
                    {
                        // 回调onFinish()方法
                        listener.onFinish(response.toString());
                    }
                }
                catch (Exception e)
                {
                    if (listener != null)
                    {
                        // 回调onError()方法
                        listener.onError(e);
                    }
                }
                finally
                {
                    if (connection != null)
                    {
                        connection.disconnect();
                    }
                }
            }
        }).start();
    }

}
