package com.inga.weixin.support;

import com.inga.bean.common.MsgType;

import java.util.Map;

/**
 * Created by abing on 2015/5/28.
 */
public class DealMsgFromWeiXin {

    public DealMsgFromWeiXin() {}

    public String receiveMsg(Map<String , String> map) throws Exception {

        String msgType = map.get("MsgType");
        String result = null;

        if (msgType.equals(MsgType.TEXT)) {

            TuLingMsgResponse msg = new TuLingMsgResponse();

            String context = map.get("Content");

            result = msg.dealText(context);


        } else if (msgType.equals(MsgType.IMAGE)){

        } else if (msgType.equals(MsgType.VOICE)) {

        } else if (msgType.equals(MsgType.VOICE)) {

        } else if (msgType.equals(MsgType.SHORT_VIDEO)) {

        } else if (msgType.equals(MsgType.LOCATION)) {

        } else if (msgType.equals(MsgType.LINK)) {

        } else {
            result  = "error";
        }

        return result;
    }
}
