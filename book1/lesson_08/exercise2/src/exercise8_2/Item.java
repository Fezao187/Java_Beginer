
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
    public void setItemFields(String itemDesc, int itemQty, double itemPrice) {
        this.desc = itemDesc;
        this.quantity = itemQty;
        this.price = itemPrice;
    }
    

    // Write a public 4-arg setItemDisplay method that returns an int.
    public int setItemFields(String itemDesc, int itemQty, double itemPrice, char itemColorCode) {
        if(itemColorCode != ' ') {
            this.colorCode = itemColorCode;
            this.setItemFields(itemDesc, itemQty, itemPrice);
            return 1;
        }else{
            return -1;
        }
    }
}
