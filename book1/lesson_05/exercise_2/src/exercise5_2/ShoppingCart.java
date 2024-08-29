
package exercise5_2;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        String items[] = {"Shirt", "Shoe", "Hoodie", "Hat"};

        // Change message to show the number of items purchased.
        message ="There are " + items.length + " items in "+ custName+"'s shopping cart.";

        System.out.println(message);
        // Print an element from the items array.  
        System.out.println("The item on index number 3 is: "+items[3]);
        
    }

}
