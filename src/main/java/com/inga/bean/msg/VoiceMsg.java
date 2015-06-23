package com.inga.bean.msg;

/**
 * Created by abing on 2015/5/28.
 *
 * <xml>
     <ToUserName><![CDATA[toUser]]></ToUserName>
     <FromUserName><![CDATA[fromUser]]></FromUserName>
     <CreateTime>1357290913</CreateTime>
     <MsgType><![CDATA[voice]]></MsgType>
     <MediaId><![CDATA[media_id]]></MediaId>
     <Format><![CDATA[Format]]></Format>
     <MsgId>1234567890123456</MsgId>
     </xml>
 */
public class VoiceMsg extends BaseMsg {

    private String MediaId;

    private String Format;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }
}
