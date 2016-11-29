package model;

import java.io.Serializable;
import java.util.Date;

public class Jiandan implements Serializable{

    private Integer id;

    private String md5;

    private String name;

    private String fullpath;


    private Date updatetime;

    private Integer ext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullpath() {
        return fullpath;
    }

    public void setFullpath(String fullpath) {
        this.fullpath = fullpath;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getExt() {
        return ext;
    }

    public void setExt(Integer ext) {
        this.ext = ext;
    }

    @Override
    public String toString() {
        return "Jiandan{" +
                "id=" + id +
                ", md5='" + md5 + '\'' +
                ", name='" + name + '\'' +
                ", fullpath='" + fullpath + '\'' +
                ", updatetime=" + updatetime +
                ", ext=" + ext +
                '}';
    }
}