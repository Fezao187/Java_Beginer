

package exercise6_2;

public class ShoppingCart {

     public static void main(String args[]) {
          // Declare and initialize 2 Item objects
          Item firstItem = new Item();
          firstItem.desc ="Stylish hoodie";

          Item secondItem = new Item();
	      secondItem.desc ="Stylish shoes";

          firstItem = secondItem;

	      // Print both item descriptions and run code.
          System.out.println("First item: "+firstItem.desc);
          System.out.println("Second item: "+secondItem.desc);
	// Assign one item to another and run it again.

     }
 
} 
