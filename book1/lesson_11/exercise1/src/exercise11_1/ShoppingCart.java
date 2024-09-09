package exercise11_1;

// import statements here:
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShoppingCart {
    public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
    LocalDateTime orderDate;
        
	// Initialize the orderDate to the current date and time. Print it.
    orderDate = LocalDateTime.now();
    System.out.println("The order date is: "+orderDate);
	// Format orderDate using ISO_LOCAL_DATE; Print it.
    String fDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
    System.out.println("The formatted order date is: "+fDate);
    }
}