
package exercise11_3;

import exercise11_3.Item;

public class ShoppingCart {
    Item[] items = {new Item("exercise12_2.Shirt",25.60),
                    new Item("WristBand",0), 
                    new Item("Pants",35.99)};
    
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }

    // Use a standard for loop to iterate through the items array, adding up the total price
    //    Skip any items that are back ordered.  Display the Shopping Cart total.
    public void displayTotal(){
        double total = 0.0;
        for(int i = 0; i < items.length; i++){
            System.out.println("exercise12_2.Item: "+ items[i].getDesc() + "\nPrice: " + items[i].getPrice() +"\n");
            if(items[i].isBackOrdered()){
                continue;
            }else {
                total += items[i].getPrice();
            }
        }
        System.out.println("Total: " + total);
    }
}
