package model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Music extends MusicKey {
    private String md5;

    private Integer source;

    private String fullpath;

    private String collection;

    private String urlpic;

    private String lmusic;

    private String mmusic;

    private String hmusic;

    private Date addtime;

    private Integer mark;

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getFullpath() {
        return fullpath;
    }

    public void setFullpath(String fullpath) {
        this.fullpath = fullpath;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getUrlpic() {
        return urlpic;
    }

    public void setUrlpic(String urlpic) {
        this.urlpic = urlpic;
    }

    public String getLmusic() {
        return lmusic;
    }

    public void setLmusic(String lmusic) {
        this.lmusic = lmusic;
    }

    public String getMmusic() {
        return mmusic;
    }

    public void setMmusic(String mmusic) {
        this.mmusic = mmusic;
    }

    public String getHmusic() {
        return hmusic;
    }

    public void setHmusic(String hmusic) {
        this.hmusic = hmusic;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}