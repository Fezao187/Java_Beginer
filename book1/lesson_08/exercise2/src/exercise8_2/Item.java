
package exercise8_2;


public class Item {
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colorCode);
    }

    // Write a public 3-arg setItemDisplay method that returns void.
    public void setItems(String itemDesc, int itemQty, double itemPrice) {
        desc = itemDesc;
        quantity = itemQty;
        price = itemPrice;
    }
    

    // Write a public 4-arg setItemDisplay method that returns an int.
    
    
    
}
