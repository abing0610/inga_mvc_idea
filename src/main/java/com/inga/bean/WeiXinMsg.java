package com.inga.bean;

/**
 * Created by abing on 2015/5/27.
 */
public class WeiXinMsg {
    private String id;

    private String tousernaem;

    private String fromusername;

    private String createtime;

    private String msgtype;

    private String content;

    private String msgid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTousernaem() {
        return tousernaem;
    }

    public void setTousernaem(String tousernaem) {
        this.tousernaem = tousernaem;
    }

    public String getFromusername() {
        return fromusername;
    }

    public void setFromusername(String fromusername) {
        this.fromusername = fromusername;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }
}
