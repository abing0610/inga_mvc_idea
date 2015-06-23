package com.inga.bean.tuling;

/**
 * Created by abing on 2015/5/29.
 *
 *   菜 谱
 * {
     "code":308000,
     "text":"********",
     "list":[{
     "name":"",
     "info":"",
     "detailurl":""
     "icon":""
     }]
     }
 */
public class Cooks {

    private String name;

    private String info;

    private String detailurl;

    private String icon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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
