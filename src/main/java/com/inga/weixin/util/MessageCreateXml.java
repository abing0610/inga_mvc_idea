package com.inga.weixin.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.inga.bean.common.MsgType;
import com.inga.bean.common.WeChatConstantXml;
import com.inga.weixin.support.WeChatJson;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by abing on 2015/5/28.
 */
public class MessageCreateXml {

    public MessageCreateXml() {}

    /**
     * 接受的是图灵返回的json， 返回的是组装的字符串，返回的文本
     * @param str  图灵返回的json
     * @param map 接受到的数据，解析的map
     * @return
     */
    public String createTextXml(String str,Map<String , String> map) {

        String result = null;
        Document dom = DocumentHelper.createDocument();
        Element root = dom.addElement(WeChatConstantXml.XML);
        Element child = null;

        child = root.addElement(WeChatConstantXml.TO_USER_NAME);
        child.addText(map.get(WeChatConstantXml.FROM_USER_NAME));

        child = root.addElement(WeChatConstantXml.FROM_USER_NAME);
        child.addText(map.get(WeChatConstantXml.TO_USER_NAME));

        child = root.addElement(WeChatConstantXml.CREATE_TIME);
        child.addText(new Date().getTime() + "");

        child = root.addElement(WeChatConstantXml.MSG_TYPE);
        child.addText(map.get(WeChatConstantXml.MSG_TYPE));

        child = root.addElement(WeChatConstantXml.CONTENT);
        child.addText(WeChatJson.dealJson(str));

//        child = root.addElement("FuncFlag");
//        child.addText("0");

        return dom.asXML().trim();
    }

    /**
     * 接受的是图灵返回的json， 返回的是组装的字符串，返回的是影像
     * @param str  图灵返回的json
     * @param map 接受到的数据，解析的map
     * @return
     */
    public String createImageXml(String str,Map<String , String> map) {

        String result = null;
        Document dom = DocumentHelper.createDocument();
        Element root = dom.addElement(WeChatConstantXml.XML);
        Element child = null;

        child = root.addElement(WeChatConstantXml.TO_USER_NAME);
        child.addText(map.get(WeChatConstantXml.FROM_USER_NAME));

        child = root.addElement(WeChatConstantXml.FROM_USER_NAME);
        child.addText(map.get(WeChatConstantXml.TO_USER_NAME));

        child = root.addElement(WeChatConstantXml.CREATE_TIME);
        child.addText(new Date().getTime() + "");

        child = root.addElement(WeChatConstantXml.MSG_TYPE);
        child.addText(map.get(WeChatConstantXml.MSG_TYPE));

        child = root.addElement(WeChatConstantXml.CONTENT);
        child.addText(WeChatJson.dealJson(str));

//        child = root.addElement("FuncFlag");
//        child.addText("0");

        return dom.asXML().trim();
    }


    /**
     * 测试类  测试返回的报文是否正确
     * @param args
     */
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();

        map.put("ToUserName","ToUserName");
        map.put("FromUserName","FromUserName");
        map.put("CreateTime","CreateTime");
        map.put("MsgType","MsgType");
        map.put("Content","Content");

        String str = "{\"code\":100000,\"text\":\"恩恩，什么inga\"}";

        MessageCreateXml xml = new MessageCreateXml();
        System.out.println(xml.createTextXml(str,map));

    }
}
