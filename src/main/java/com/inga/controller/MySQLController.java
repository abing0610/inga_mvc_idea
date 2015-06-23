package com.inga.controller;

import com.inga.service.FromMsgService;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by abing on 2015/6/10.
 */
@Controller
@RequestMapping(value = "/mysql")
public class MySQLController {

    @Resource
    private FromMsgService fromMsgService;

    @RequestMapping(value = "/insert" , method = RequestMethod.POST)
    @ResponseBody
    public String insertWeiXinMsg(HttpServletRequest request,HttpServletResponse response) throws IOException {

        System.out.println(request.getInputStream().toString());
        System.out.println("this is ok!");
        for (int i = 100000; i < 599999 ; i++) {

            Map<String,String> map = new HashMap<String, String>();
//            v
            map = randomWeiXin(i);

            for (Map.Entry<String,String> me : map.entrySet()) {
                System.out.println(me.getKey() + " : " + me.getValue());
            }

            boolean b = this.fromMsgService.insertFromMsg(map);

            System.out.println(i +" : "+ b);
        }


        return "ok";
    }

    private Map<String,String> randomWeiXin(int i){

        Random random = new Random(999);
        Map<String,String> map = new HashMap<String, String>();

        map.put("ToUserName", "inga_touser" + i);
        map.put("FromUserName", "inga_fromuser" + i);
        map.put("CreateTime", "inga_createtime" + i);
        map.put("MsgType", "inga_type" + i);
        map.put("Content", "inga_content" + i);
        map.put("MsgId", "inga_msgid" + i);


        return map;
    }
}
