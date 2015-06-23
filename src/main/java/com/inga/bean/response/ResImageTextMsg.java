package com.inga.bean.response;

/**
 * Created by abing on 2015/5/28.
 *
 * <xml>
     <ToUserName><![CDATA[toUser]]></ToUserName>
     <FromUserName><![CDATA[fromUser]]></FromUserName>
     <CreateTime>12345678</CreateTime>
     <MsgType><![CDATA[news]]></MsgType>
     <ArticleCount>2</ArticleCount>
     <Articles>
     <item>
     <Title><![CDATA[title1]]></Title>
     <Description><![CDATA[description1]]></Description>
     <PicUrl><![CDATA[picurl]]></PicUrl>
     <Url><![CDATA[url]]></Url>
     </item>
     <item>
     <Title><![CDATA[title]]></Title>
     <Description><![CDATA[description]]></Description>
     <PicUrl><![CDATA[picurl]]></PicUrl>
     <Url><![CDATA[url]]></Url>
     </item>
     </Articles>
     </xml>
 */
public class ResImageTextMsg extends ResBaseMsg {

    private String Title;

    private String Description;

    private String PicUrl;

    private String Url;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
