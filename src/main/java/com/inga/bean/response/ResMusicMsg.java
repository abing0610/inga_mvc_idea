package com.inga.bean.response;

/**
 * Created by abing on 2015/5/28.
 *
 * <xml>
     <ToUserName><![CDATA[toUser]]></ToUserName>
     <FromUserName><![CDATA[fromUser]]></FromUserName>
     <CreateTime>12345678</CreateTime>
     <MsgType><![CDATA[music]]></MsgType>
     <Music>
     <Title><![CDATA[TITLE]]></Title>
     <Description><![CDATA[DESCRIPTION]]></Description>
     <MusicUrl><![CDATA[MUSIC_Url]]></MusicUrl>
     <HQMusicUrl><![CDATA[HQ_MUSIC_Url]]></HQMusicUrl>
     <ThumbMediaId><![CDATA[media_id]]></ThumbMediaId>
     </Music>
     </xml>
 */
public class ResMusicMsg extends ResBaseMsg {

    private String Title;

    private String Description;

    private String MusicUrl;

    private String HQMusicUrl;

    private String ThumbMediaId;

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

    public String getMusicUrl() {
        return MusicUrl;
    }

    public void setMusicUrl(String musicUrl) {
        MusicUrl = musicUrl;
    }

    public String getHQMusicUrl() {
        return HQMusicUrl;
    }

    public void setHQMusicUrl(String HQMusicUrl) {
        this.HQMusicUrl = HQMusicUrl;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
