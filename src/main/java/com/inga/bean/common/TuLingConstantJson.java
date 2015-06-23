package com.inga.bean.common;

/**
 * Created by abing on 2015/5/29.
 *
 * 文字类
 * {"code":100000,"text":"恩恩，害羞ing……"}
 *
 *链接类
 *{ "code":200000, "text":"亲，已帮你打开图灵", "url":"http://www.tuling123.com/openapi/"}
 *
 *新闻
 *{"code":302000,"text":"********","list":[{"article":"","source":"","detailurl":"","icon":""}]}
 *
 *列车
 * { "code":305000, "text":"********", "list":[{ "trainnum":"", "start":"", "terminal":"", "starttime":"" "endtime":"" "detailurl":"""icon":""}]}
 *
 *航班
 *{ "code":306000 , "text":"********", "list":[{ "flight":"", "route":"", "starttime":"", "endtime":"", "state":"", "detailurl":"" "icon":""}]}
 *
 *菜谱
 *{ "code":308000, "text":"********", "list":[{ "name":"", "info":"", "detailurl":"" "icon":"" }]}
 *
 */
public class TuLingConstantJson {

    public static final String CODE = "code";

    public static final String TEXT = "text";

    public static final String URL = "url";

    public static final String LIST = "list";

    //  新 闻
    public static final String ARTICLE = "article";

    public static final String SOURC = "source";

    public static final String DETAILURL = "detailurl";

    public static final String ICON = "icon";

    //  列 车
    public static final String TRAIN_NUM = "trainnum";

    public static final String START = "start";

    public static final String TERMINAL = "terminal";

    public static final String START_TIME = "starttime";

    public static final String END_TIME = "endtime";

    public static final String DETAIL_URL = "detailurl";

    //  航 班
    public static final String FLIGHT = "flight";

    public static final String ROUTE = "route";

    public static final String STATE = "state";

    //  菜 谱
    public static final String NAME = "name";

    public static final String INFO = "info";




}
