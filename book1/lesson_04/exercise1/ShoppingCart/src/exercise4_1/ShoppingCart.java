package exercise4_1;
/*Exercise 4-1:

        1.  Declare and initialize 2 String variables: custName and itemDesc
2.  Declare a String variable called message.  Do not initialize it.
        3.  Assign the message variable with a concatenation of the custName and itemDesc.
Include a String literal that results in a complete sentence.
        (example: "Mary Smith wants to purchase a Shirt")
        4.  Print the message to the System output.
5.  Run the code.*/

public class ShoppingCart {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.
        String custName ="Katlego";
        String itemDesc="Some Item";
        String message;
        // Assign the message variable
        message = custName + " wants to purchase " + itemDesc;

        // Print and run the code
        System.out.println(message);

    }
}
