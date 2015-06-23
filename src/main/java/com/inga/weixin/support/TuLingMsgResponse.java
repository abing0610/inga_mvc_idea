package com.inga.weixin.support;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by abing on 2015/5/28.
 *
 * 使用的是图灵的机器人
 */
public class TuLingMsgResponse {

    public TuLingMsgResponse() {}

    /**
     * 使用图灵机器人 处理的是文本消息
     *
     * @param str
     * @return
     * @throws IOException
     */
    public String dealText(String str) throws IOException {

        String APIKEY = "992f53575bce33d0938676b7509c4f91";
        String INFO = URLEncoder.encode(str, "UTF-8");
        String getURL = "http://www.tuling123.com/openapi/api?key=" + APIKEY + "&info=" + INFO;
        URL getUrl = new URL(getURL);
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
        connection.connect();

        // 取得输入流，并使用Reader读取
        BufferedReader reader = new BufferedReader(new InputStreamReader( connection.getInputStream(), "utf-8"));
        StringBuffer sb = new StringBuffer();
        String line = "";
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        reader.close();
        // 断开连接
        connection.disconnect();
        System.out.println(sb);

        return sb.toString();
    }
}
