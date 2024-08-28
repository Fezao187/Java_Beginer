package exercise4_2;

public class ShoppingCart {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.
        String custName ="Katlego";
        String itemDesc="Some Item";
        String message;
        // Assign the message variable

        // Declare and initialize numeric fields: price, tax, quantity, and total.
        double price = 34.99;
        double tax = 0.15;
        int quantity = 1;
        double total;

        total = ((price * tax) + price)* quantity;
        // Modify message to include quantity
        message = custName + " wants to purchase " +quantity +" " + itemDesc +
                ".\nThe total cost will be R" +total;

        System.out.println(message);

        // Calculate total and then print the total cost
    }
}
