
package exercise11_2;

public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age.
        name = args[0];
        age = Integer.parseInt(args[1]);
	// Print an error message if fewer than 2 args are passed in.
        if(args.length < 2)
        {
            System.out.println("Please enter the name of your shopping cart");
        }else{
            System.out.println("Name is: " + name + "\nAge is: " + age);
        }
        
    }
}
