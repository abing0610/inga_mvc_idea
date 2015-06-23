package com.inga.controller;

import com.inga.service.FromMsgService;
import com.inga.weixin.support.CheckToken;
import com.inga.weixin.support.DealMsgFromWeiXin;
import com.inga.weixin.util.MessageCreateXml;
import com.inga.weixin.util.MessageUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.Map;

/**
 * Created by abing on 2015/5/26.
 */
@Controller
@RequestMapping("/weixinAction")
public class WexiXinController {

    private  static  final String TOKEN = "weixinTOKEN";

    @Resource
    private FromMsgService fromMsgService;

    /**
     * 通过get方式链接过来，验证是否可用
     * @param signature
     * @param timestamp
     * @param nonce
     * @param echostr
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public  String weixinGetAction(@RequestParam String signature,@RequestParam String timestamp,
                                @RequestParam String nonce,@RequestParam String echostr){

        System.out.println(" signature : " + signature);
        System.out.println(" timestamp : " + timestamp);
        System.out.println(" nonce : " + nonce);
        System.out.print(" echostr : " + echostr);


        if (StringUtils.isNotEmpty(echostr)) {
            //进行验证，查看发过来的信息是否完整
            CheckToken check = new CheckToken(signature , timestamp , nonce , echostr );
            echostr  = check.checkToken();

//            echostr =  checkToken(signature , timestamp , nonce , echostr);

        }


        return echostr;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public  void   weixinPostAction(HttpServletRequest request,HttpServletResponse response) {

//        Map<String, String> map = MessageUtil.parseXml(request);
        Map<String, String> map = null;
        String result = null;

        System.out.println("this is post request ");


        try {
            map = MessageUtil.parseXml(request);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        boolean b = this.fromMsgService.insertFromMsg(map);
//
//        if (b) {
            DealMsgFromWeiXin dealMsgFromWeiXin = new DealMsgFromWeiXin();
            try {
                result = dealMsgFromWeiXin.receiveMsg(map);
            } catch (Exception e) {
                e.printStackTrace();
            }
//        }
        MessageCreateXml msgCreate = new MessageCreateXml();
        result = msgCreate.createTextXml(result,map);

        System.out.println("result : " + result );
//
        try {
            OutputStream os = response.getOutputStream();
            os.write(result.getBytes("utf-8"));
            os.flush();
            os.close();

        }catch (Exception e){
            e.printStackTrace();
        }

//        return result;
    }




}
