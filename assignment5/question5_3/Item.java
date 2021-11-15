package question5_3;

public class Item {
    String Id;
    int price;

    public Item(String Id, int price) {
        this.Id = Id;
        this.price = price;
    }

    public String getId() {
        return Id;
    }

    public int getPrice() {
        return price;
    }
}
