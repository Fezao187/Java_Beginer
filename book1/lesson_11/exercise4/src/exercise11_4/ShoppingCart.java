package exercise11_4;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> items = new ArrayList();
        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Pear");
        items.add("Grape");

        System.out.println("1: " +items);
        // add (insert) another element at a specific index
        items.add(2, "Peach");
        System.out.println("2: "+items);

	// Check for the existence of a specific String element.  
        //   If it exists, remove it.
        if(items.contains("Peach")){
            items.remove("Peach");
        }
        System.out.println("3: "+items);
    }
}
