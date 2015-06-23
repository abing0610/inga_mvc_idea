package com.inga.bean.response;

/**
 * Created by abing on 2015/5/28.
 *
 * <xml>
     <ToUserName><![CDATA[toUser]]></ToUserName>
     <FromUserName><![CDATA[fromUser]]></FromUserName>
     <CreateTime>12345678</CreateTime>
     <MsgType><![CDATA[voice]]></MsgType>
     <Voice>
     <MediaId><![CDATA[media_id]]></MediaId>
     </Voice>
     </xml>
 */
public class ResVoiceMsg extends ResBaseMsg {

    private String MediaId;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
