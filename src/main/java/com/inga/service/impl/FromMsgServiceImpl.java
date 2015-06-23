package com.inga.service.impl;

import com.inga.bean.WeiXinMsg;
import com.inga.dao.FromMsgMapper;
import com.inga.service.FromMsgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by abing on 2015/5/27.
 */
@Service("fromMsgService")
public class FromMsgServiceImpl implements FromMsgService {

    @Resource
    private FromMsgMapper fromMsgMapper;

    @Override
    public boolean insertFromMsg(Map<String, String> map) {

        boolean b  = this.fromMsgMapper.insertFromMsg(map);

        return b;
    }

    @Override
    public List<WeiXinMsg> selectMsg() {


        return null;
    }
}
