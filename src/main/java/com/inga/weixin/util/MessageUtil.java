package com.inga.weixin.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.*;

/**
 * Created by abing on 2015/5/27.
 */
public class MessageUtil {


    /**
     *  接受的是string字符串的xml报文，处理，返回map
     * @param xml
     * @return
     * @throws IOException
     * @throws DocumentException
     */
    public  static Map<String,String> parseXml(String xml) throws IOException, DocumentException {
        Map<String, String> map = new HashMap<String, String>();

        InputStream in = new ByteArrayInputStream(xml.getBytes());
        SAXReader reader = new SAXReader();
        Reader read = new InputStreamReader(in,"gbk");
        Document dom = reader.read(read);

        Element root = dom.getRootElement();

        List<Element> elementList = root.elements();

        for (Element e : elementList) {
            map.put(e.getName(), e.getText());
        }

        in.close();
        in = null;

        return  map;
    }


    /**
     * 接受的是request ,处理inputstream字节流，处理，返回map
     *
     * @param request
     * @return
     * @throws IOException
     * @throws DocumentException
     */
    public  static Map<String,String> parseXml(HttpServletRequest request) throws IOException, DocumentException {



        Map<String, String> map = new HashMap<String, String>();

        InputStream in = request.getInputStream();
        SAXReader reader = new SAXReader();
        Reader read = new InputStreamReader(in,"UTF-8");
        Document dom = reader.read(read);
//        SAXReader reader = new SAXReader();
////        Reader read = new InputStreamReader(in);
//        Document dom = reader.read(in);

        System.out.print(" dom : " + dom.asXML());

        Element root = dom.getRootElement();

        List<Element> elementList = root.elements();

        for (Element e : elementList) {
            map.put(e.getName(), e.getText());
        }

        for (Map.Entry<String,String> me : map.entrySet()) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }

        in.close();
        in = null;

        return  map;
    }
}
