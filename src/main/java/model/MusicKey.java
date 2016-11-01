package model;

import com.sun.istack.internal.NotNull;

public class MusicKey {
    @NotNull
    private Byte id;

    private Integer singid;

    private String name;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Integer getSingid() {
        return singid;
    }

    public void setSingid(Integer singid) {
        this.singid = singid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}