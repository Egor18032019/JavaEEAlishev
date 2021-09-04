public class Cart {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
