package com.inga.bean.msg;

/**
 * Created by abing on 2015/5/28.
 *
 * <xml>
     <ToUserName><![CDATA[toUser]]></ToUserName>
     <FromUserName><![CDATA[fromUser]]></FromUserName>
     <CreateTime>1357290913</CreateTime>
     <MsgType><![CDATA[video]]></MsgType>
     <MediaId><![CDATA[media_id]]></MediaId>
     <ThumbMediaId><![CDATA[thumb_media_id]]></ThumbMediaId>
     <MsgId>1234567890123456</MsgId>
     </xml>
 */
public class VideoMsg extends BaseMsg {

    private String MediaId;

    private String ThumbMediaId;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
