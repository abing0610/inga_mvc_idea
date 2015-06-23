package com.inga.bean.response;

/**
 * Created by abing on 2015/5/28.
 *
 * <xml>
     <ToUserName><![CDATA[toUser]]></ToUserName>
     <FromUserName><![CDATA[fromUser]]></FromUserName>
     <CreateTime>12345678</CreateTime>
     <MsgType><![CDATA[video]]></MsgType>
     <Video>
     <MediaId><![CDATA[media_id]]></MediaId>
     <Title><![CDATA[title]]></Title>
     <Description><![CDATA[description]]></Description>
     </Video>
     </xml>
 */
public class ResVideoMsg extends ResBaseMsg {

    private String MediaId;

    private String Title;

    private String Description;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

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
}
