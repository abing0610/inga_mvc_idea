package com.inga.bean.msg;

/**
 * Created by abing on 2015/5/28.
 *
 *  <xml>
     <ToUserName><![CDATA[toUser]]></ToUserName>
     <FromUserName><![CDATA[fromUser]]></FromUserName>
     <CreateTime>1348831860</CreateTime>
     <MsgType><![CDATA[image]]></MsgType>
     <PicUrl><![CDATA[this is a url]]></PicUrl>
     <MediaId><![CDATA[media_id]]></MediaId>
     <MsgId>1234567890123456</MsgId>
     </xml>
 */
public class ImageMsg extends BaseMsg {

    private String PicUrl;

    private String MediaId;

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
