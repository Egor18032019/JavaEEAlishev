package somePackage;

import java.util.HashMap;

public class Cart {
    private String name;
    private int quantity;
    private HashMap<String, Integer> cart;

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
