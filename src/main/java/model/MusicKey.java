package model;



public class MusicKey {
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