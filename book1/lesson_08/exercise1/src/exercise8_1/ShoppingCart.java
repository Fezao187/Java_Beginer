
package exercise8_1;

import exercise8_1.Item;

public class ShoppingCart {
    public static void main(String[] args){
        Item item1 = new Item();
        char colorCode='g';
        // Call the setColor method on item1. Print the new color value from
        //   item1 if the method returns true.  Otherwise print an "invalid color"
	    //   message.
        if(item1.setColor(colorCode)==true){
            System.out.println(item1.color);
        }else{
            System.out.println("Invalid color");
        }

       // Test the class, using both valid and invalid colors.
       
        
    }
}
