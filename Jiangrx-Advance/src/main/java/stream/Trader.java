package stream;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: caopeng
 * @Date: 2020/8/11
 */
public class Trader{
    private String name;
    private String area;

    public Trader(String name ,String area){
        this.name=name;
        this.area= area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}