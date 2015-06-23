package com.inga.bean.tuling;

/**
 * Created by abing on 2015/5/29.
 *
 *   列 车
 *   {
     "code":305000,
     "text":"********",
     "list":[{
     "trainnum":"",
     "start":"",
     "terminal":"",
     "starttime":""
     "endtime":""
     "detailurl":""
     "icon":""
     }]}
 */
public class Trains {

    private String trainnum;

    private String start;

    private String terminal;

    private String starttime;

    private String endtime;

    private String detailurl;

    private String icon;

    public String getTrainnum() {
        return trainnum;
    }

    public void setTrainnum(String trainnum) {
        this.trainnum = trainnum;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getDetailurl() {
        return detailurl;
    }

    public void setDetailurl(String detailurl) {
        this.detailurl = detailurl;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
