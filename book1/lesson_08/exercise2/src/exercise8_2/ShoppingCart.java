
package exercise8_2;


public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Hoodie",4,20);
        item1.displayItem();
        // Call the 4-arg setItemFields method, checking the return value.
        int returnVal = item1.setItemFields("Hoodie",4,20,'T');
        if(returnVal <0){
            System.out.println("Invalid color code");
        }else{
            item1.displayItem();
        }

	// Test your code for both valid and invalid values
 
        
        
    }
}
