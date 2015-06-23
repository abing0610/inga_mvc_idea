package com.inga.bean.tuling;

/**
 * Created by abing on 2015/5/29.
 *
 *   新闻
 *   {
     "code":302000,
     "text":"********",
     "list":[{
     "article":"",
     "source":"",
     "detailurl":"",
     "icon":""
     }]
     }
 */
public class News {

    private String article;

    private String source;

    private String detailurl;

    private String icon;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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
