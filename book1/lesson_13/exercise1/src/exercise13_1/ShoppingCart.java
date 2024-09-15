package exercise13_1;


import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCart {
    public static void main(String[] args){
        String[] days = {"monday","saturday","tuesday","sunday","friday"};
        
        // Convert the days array into an ArrayList
        ArrayList<String> dayList=new ArrayList<>(Arrays.asList(days));
        // Loop through the ArrayList, printing out "sunday" elements in
        for(String day:dayList){
            if(day.equals("sunday")){
                //   upper case (use toUpperCase() method of String class)
                System.out.println(day.toUpperCase());
            }else{
                // Print all other days in lower case
                System.out.println(day);
            }
        }


        // Print out the ArrayList  
        System.out.println(dayList);


    }    
}
