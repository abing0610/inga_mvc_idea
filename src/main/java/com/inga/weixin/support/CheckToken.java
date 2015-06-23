package com.inga.weixin.support;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * 检验token是否合理，能否通过json的验证
 *
 * Created by abing on 2015/5/27.
 */
public class CheckToken {

    private  static  final String TOKEN = "weixinTOKEN";
    private String signature;
    private String timestamp;
    private String nonce;
    private String echostr;

    public CheckToken(String signature,String timestamp,String nonce,String echostr){
        this.signature = signature;
        this.timestamp = timestamp;
        this.nonce = nonce;
        this.echostr = echostr;
    }

    public  String checkToken(){
        String result = null;
        String[] arrTmp = {TOKEN,timestamp,nonce};
        Arrays.sort(arrTmp);
        //组装字符串
        StringBuffer sb = new StringBuffer();
        for (String str : arrTmp){
            sb.append(str);
        }

        System.out.println(signature);
        System.out.println(timestamp);
        System.out.println(nonce);
        System.out.println(echostr);
        String pwd = Encrypt(sb.toString());
        System.out.println("pwd : " + pwd);
        if (pwd.equals(signature)) {
            try {
                System.out.println("weixin check is ok !");
                result = echostr;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("weixin cheek is wrong !");
            result = "error";
        }

        return  result;
    }
    /**
     * 用SHA-1算法加密字符串并返回16进制串
     *
     * @param strSrc
     * @return
     */
    public String Encrypt(String strSrc) {
        MessageDigest md = null;
        String strDes = null;
        byte[] bt = strSrc.getBytes();
        try {
            md = MessageDigest.getInstance("SHA-1");
            md.update(bt);
            strDes = bytes2Hex(md.digest());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("错误");
            return null;
        }
        return strDes;
    }

    private String bytes2Hex(byte[] bts) {
        String des = "";
        String tmp = null;
        for (int i = 0; i < bts.length; i++) {
            tmp = (Integer.toHexString(bts[i] & 0xFF));
            if (tmp.length() == 1) {
                des += "0";
            }
            des += tmp;
        }
        return des;
    }

    /**
     * 023a0d26eac6353f8e54e711f91a4d25bc76db8a&timestamp=1432803409&nonce=629827987 400 3000 - -
     * @param args
     */
    public static void main(String[] args) {

        CheckToken check = new CheckToken("023a0d26eac6353f8e54e711f91a4d25bc76db8a","1432803409","629827987","test");
        String rea = check.checkToken();
        System.out.println(rea);
    }
}
