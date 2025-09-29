package TD_7.Exo2.Classes;

public class Item {
    private String type;
    private String desc;
    private double price;
    public Item(String type, String desc,double price) {
        this.type = type;
        this.desc = desc;
        this.price = price;
    }

    public String getItemType() {
        return type;
    }

    public double getPrice(){
        return price;
    }

    public String getDesc() {
        return desc;
    }
}
