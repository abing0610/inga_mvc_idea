package com.inga.dao;

import com.inga.bean.WeiXinMsg;
import com.inga.utils.MyBatisDao;

import java.util.List;
import java.util.Map;

/**
 * Created by abing on 2015/5/27.
 */
@MyBatisDao
public interface FromMsgMapper {

    public boolean insertFromMsg(Map<String, String> map);

    public List<WeiXinMsg> selectMsg();
}
