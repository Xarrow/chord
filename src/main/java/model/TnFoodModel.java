package model;

/**
 * @Author zhangjian5
 * @Time 2016/10/13
 */
public class TnFoodModel {
    private String area;
    private String name;
    private String num;
    private String date;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TnFoodModel{" +
                "area='" + area + '\'' +
                ", name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
