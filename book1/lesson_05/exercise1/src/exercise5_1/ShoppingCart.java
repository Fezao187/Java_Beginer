
package exercise5_1;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 21.99;
        int quantity = 1;
        double tax = 1.04;
	double total;
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;

        
        // Declare outOfStock variable and initialize it
        boolean outOfStock = true;
        
        // Test quantity and modify message if quantity > 1.  
         if(quantity>1){
             message = message +"s";
             System.out.println(message);
         }else {
             System.out.println(message);
         }

        if(outOfStock){
            System.out.println(itemDesc +" is out of stock");
        }else {
            System.out.println(itemDesc +" is R" +total);
        }

        // Test outOfStock and notify user in either case.  
        
        
        
    }
    
}
