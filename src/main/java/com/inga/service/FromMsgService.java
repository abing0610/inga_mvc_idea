package com.inga.service;

import com.inga.bean.WeiXinMsg;

import java.util.List;
import java.util.Map;

/**
 * Created by abing on 2015/5/27.
 */
public interface FromMsgService {
    public boolean insertFromMsg(Map<String, String> map);

    public List<WeiXinMsg> selectMsg();
}
