package question5_3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> list = new ArrayList<>();

    public ShoppingCart() {

    }

    public void addItem(Item item) {
        list.add(item);
    }

    public void removeItem(Item item) {
        list.remove(item);
    }

    public int calculateTotal(){
        int ans = 0;
        for(Item i : list) {
            ans += i.getPrice();
        }
        return ans;
    }

    public void pay(PaymentStrategy payment) {
        payment.pay(calculateTotal());
    }
}
