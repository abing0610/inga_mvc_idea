package com.inga.bean.msg;

/**
 * Created by abing on 2015/5/28.
 *
 *<xml>
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
public class LocationMsg extends BaseMsg {

    private String Location_X;

    private String Location_Y;

    private String Scale;

    private String Label;

    public String getLocation_X() {
        return Location_X;
    }

    public void setLocation_X(String location_X) {
        Location_X = location_X;
    }

    public String getLocation_Y() {
        return Location_Y;
    }

    public void setLocation_Y(String location_Y) {
        Location_Y = location_Y;
    }

    public String getScale() {
        return Scale;
    }

    public void setScale(String scale) {
        Scale = scale;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }
}
