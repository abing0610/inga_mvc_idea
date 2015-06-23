package com.inga.bean.tuling;

/**
 * Created by abing on 2015/5/29.
 *
 *  航 班
 *  {
     "code":306000 ,
     "text":"********",
     "list":[{
     "flight":"",
     "route":"",
     "starttime":"",
     "endtime":"",
     "state":"",
     "detailurl":""
     "icon":""
     }]}
 */
public class Flights {

    private String flight;

    private String route;

    private String starttime;

    private String endtime;

    private String state;

    private String detailurl;

    private String icon;

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
