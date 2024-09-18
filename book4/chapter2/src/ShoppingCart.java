public class ShoppingCart {
    public int price;
    public String itemName;
    public ShoppingCart(int price, String itemName) {
        this.price = price;
        this.itemName = itemName;
    }

    public void displayItem() {
        System.out.println("Item Name: " + itemName+ "\nPrice: " + price);
    }
}
