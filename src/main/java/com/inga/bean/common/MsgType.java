package com.inga.bean.common;

/**
 * Created by abing on 2015/5/28.
 */
public class MsgType {

    /**
     * 文本消息
     *
     *  <xml>
         <ToUserName><![CDATA[toUser]]></ToUserName>
         <FromUserName><![CDATA[fromUser]]></FromUserName>
         <CreateTime>1348831860</CreateTime>
         <MsgType><![CDATA[text]]></MsgType>
         <Content><![CDATA[this is a test]]></Content>
         <MsgId>1234567890123456</MsgId>
         </xml>
     */
    public static final String TEXT = "text";

    /**
     * 图片消息
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
    public static final String IMAGE = "image";

    /**
     * 语音消息
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
    public static final String VOICE = "voice";

    /**
     *视频消息
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
    public static final String VIDEO = "video";

    /**
     *小视频消息
     *
     * <xml>
         <ToUserName><![CDATA[toUser]]></ToUserName>
         <FromUserName><![CDATA[fromUser]]></FromUserName>
         <CreateTime>1357290913</CreateTime>
         <MsgType><![CDATA[shortvideo]]></MsgType>
         <MediaId><![CDATA[media_id]]></MediaId>
         <ThumbMediaId><![CDATA[thumb_media_id]]></ThumbMediaId>
         <MsgId>1234567890123456</MsgId>
         </xml>
     */
    public static final String SHORT_VIDEO = "shortvideo";

    /**
     *地理位置消息
     *
     * <xml>
         <ToUserName><![CDATA[toUser]]></ToUserName>
         <FromUserName><![CDATA[fromUser]]></FromUserName>
         <CreateTime>1351776360</CreateTime>
         <MsgType><![CDATA[location]]></MsgType>
         <Location_X>23.134521</Location_X>
         <Location_Y>113.358803</Location_Y>
         <Scale>20</Scale>
         <Label><![CDATA[位置信息]]></Label>
         <MsgId>1234567890123456</MsgId>
         </xml>
     */
    public static final String LOCATION = "location";

    /**
     *链接消息
     *
     * <xml>
         <ToUserName><![CDATA[toUser]]></ToUserName>
         <FromUserName><![CDATA[fromUser]]></FromUserName>
         <CreateTime>1351776360</CreateTime>
         <MsgType><![CDATA[link]]></MsgType>
         <Title><![CDATA[公众平台官网链接]]></Title>
         <Description><![CDATA[公众平台官网链接]]></Description>
         <Url><![CDATA[url]]></Url>
         <MsgId>1234567890123456</MsgId>
         </xml>
     */
    public static final String LINK = "link";


}
