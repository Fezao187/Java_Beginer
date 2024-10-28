import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
//        Creating an arraylist object
        ArrayList<String> signs = new ArrayList<String>();
//        Adding elements
        signs.add("Drink Pepsi");
        signs.add("No minors allowed");
        signs.add("Say Pepsi, Please");
        signs.add("7-Up: You Like It, It Likes You");
        signs.add("Dr. Pepper 10, 2, 4");
// Deleting arrays
//        signs.clear();
        signs.remove("Drink Pepsi");
//        signs.remove(3);
//        Printing arrays
        for (String s : signs) {
            System.out.println(s);
        }
    }
}
