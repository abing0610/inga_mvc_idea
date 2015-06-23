package com.inga.bean.response;

/**
 * Created by abing on 2015/5/28.
 *
 * <xml>
     <ToUserName><![CDATA[toUser]]></ToUserName>
     <FromUserName><![CDATA[fromUser]]></FromUserName>
     <CreateTime>12345678</CreateTime>
     <MsgType><![CDATA[text]]></MsgType>
     <Content><![CDATA[你好]]></Content>
     </xml>
 */
public class ResTextMsg extends ResBaseMsg {

    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
