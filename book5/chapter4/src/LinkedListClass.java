import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
//        Creating a linked list
        LinkedList<String> officers = new LinkedList<String>();
//        Adding Items to a LinkedList
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
//        Update a linked list
        officers.set(2,"Maredi");
//        Removing from a linked list
        officers.remove(3);
//        Print the linked list
        for (String s : officers)
            System.out.println(s);
    }
}
