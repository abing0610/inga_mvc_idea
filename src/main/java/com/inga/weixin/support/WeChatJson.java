package com.inga.weixin.support;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.inga.bean.tuling.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abing on 2015/5/29.
 *
 * “\n”是换行符号
 *
 */
public class WeChatJson {

    public WeChatJson() {}



    /**
     *   对图灵返回的报文进行处理，返回相应的字符串
     * @param json
     * @return
     */
    public static String dealJson(String json){
        String result = null;

        if (json.indexOf("\"list\":[{") > 0) {

            if (json.indexOf("\"article\":") > 0) {     // 关键字 判断  新闻类
                System.out.println("----news-----");
                result = dealNews(json);

            } else if (json.indexOf("\"trainnum\":") > 0) {     // 关键字 判断  列车类
                System.out.println("----train-----");
                result = dealTrain(json);

            } else if (json.indexOf("\"flight\":") > 0) {       // 关键字 判断  航班类
                System.out.println("----flight-----");
                result = dealFlight(json);

            } else if (json.indexOf("\"name\":") > 0 ) {        // 关键字 判断  菜谱类
                System.out.println("----cookes-----");
                result = dealCook(json);

            } else {
                result = "您好，机器人正在维护，请稍后使用.";
            }

        } else {
            if (json.indexOf("\"url\":") > 0) {     // 关键字 判断  链接类
                System.out.println("----link-----");
                result = dealLink(json);

            } else if (json.indexOf("\"text\":") > 0){      // 关键字 判断  文字类
                System.out.println("----tetx-----");
                result = dealText(json);

            } else {
                result = "您好，机器人正在维护，请稍后使用.";
            }
        }

        return  result;
    }

    /**
     * 处理文字类的json
     * @param json
     * @return
     */
    private static String dealText(String json){

        TuLingText text = JSON.parseObject(json, new TypeReference<TuLingText>() {} );

        StringBuilder sb = new StringBuilder();
        sb.append(text.getText() +"\n");

        return  sb.toString();
    }

    /**
     * 处理链接类的json
     * @param json
     * @return
     */
    private static String dealLink(String json){

        TuLingLink link = JSON.parseObject(json, new TypeReference<TuLingLink>() {} );

        StringBuilder sb = new StringBuilder();
        sb.append(link.getText() +"\n");
        sb.append("链接： " + link.getUrl());

        return  sb.toString();
    }

    /**
     * 处理新闻类的json
     * @param json
     * @return
     */
    private static String dealNews(String json){

        TuLingNew text = JSON.parseObject(json, new TypeReference<TuLingNew>() {} );

        News list = text.getList().get(0);
        StringBuilder sb = new StringBuilder();
        sb.append(text.getText() +"\n");

//        for (News list : news) {

            sb.append("标题 ：" + list.getArticle().toString()+"\n");
            sb.append("来源 ：" + list.getSource()+"\n");
            sb.append("详情地址 ：" + list.getDetailurl()+"\n");
            sb.append("图标地址 ：" + list.getIcon()+"\n");
//        }
//        News list = text.getList().get(0);



        return sb.toString();
    }

    /**
     * 处理列车类的json
     * @param json
     * @return
     */
    private static String dealTrain(String json){

        TuLingTrain text = JSON.parseObject(json, new TypeReference<TuLingTrain>() {} );

        Trains list = text.getList().get(0);
        StringBuilder sb = new StringBuilder();
        sb.append(text.getText() +"\n");

//        for (Trains list : trainses) {

            sb.append("车次 ：" + list.getTrainnum()+"\n");
            sb.append("起始站 ：" + list.getStart()+"\n");
            sb.append("到达站 ：" + list.getTerminal()+"\n");
            sb.append("开车时间 ：" + list.getStarttime()+"\n");
            sb.append("到达时间 ：" + list.getEndtime()+"\n");
            sb.append("详情地址 ：" + list.getDetailurl()+"\n");
            sb.append("图标地址 ：" + list.getIcon()+"\n");
//        }
//        Trains list = text.getList().get(0);



        return sb.toString();
    }

    /**
     * 处理航班类的json
     * @param json
     * @return
     */
    private static String dealFlight(String json){

        TuLingFlight text = JSON.parseObject(json, new TypeReference<TuLingFlight>() {} );

        Flights list = text.getList().get(0);
        StringBuilder sb = new StringBuilder();
        sb.append(text.getText() +"\n");

//        for (Flights list : flightses) {

            sb.append("航班 ：" + list.getFlight()+"\n");
            sb.append("航班路线 ：" + list.getRoute()+"\n");
            sb.append("起飞时间 ：" + list.getStarttime()+"\n");
            sb.append("到达时间 ：" + list.getEndtime()+"\n");
            sb.append("航班状态 ：" + list.getState()+"\n");
            sb.append("详情 ：" + list.getDetailurl()+"\n");
            sb.append("图标地址 ：" + list.getIcon()+"\n");
//        }

//        Flights list = text.getList().get(0);



        return sb.toString();
    }

    /**
     * 处理菜谱类的json
     * @param json
     * @return
     */
    private static String dealCook(String json){

        TuLingCook text = JSON.parseObject(json, new TypeReference<TuLingCook>() {} );

        Cooks list = text.getList().get(0);
        StringBuilder sb = new StringBuilder();
        sb.append(text.getText() +"\n");

//        for (Cooks list : cookses) {

            sb.append("名称 ：" + list.getName()+"\n");
            sb.append("详情 ：" + list.getInfo()+"\n");
            sb.append("详情链接 ：" + list.getDetailurl()+"\n");
            sb.append("图标地址 ：" + list.getIcon()+"\n");
//        }

//        Cooks list = text.getList().get(0);



        return sb.toString();
    }

    /**
     * 测试类
     * @param args
     */
    public static void main(String[] args) {
        String json = "{\n" +
                "\n" +
                "\"code\":308000,\n" +
                "\n" +
                "\"text\":\"********\",\n" +
                "\n" +
                "\"list\":[{\n" +
                "\n" +
                "\"name\":\"\",\n" +
                "\n" +
                "\"info\":\"\",\n" +
                "\n" +
                "\"detailurl\":\"\",\n" +
                "\n" +
                "\"icon\":\"\"\n" +
                "\n" +
                "}]\n" +
                "\n" +
                "}";
        WeChatJson we = new WeChatJson();
        System.out.println(we.dealJson(json));
    }
}
