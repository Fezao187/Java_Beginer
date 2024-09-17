import java.util.Scanner;

//If statements
public class Chapter4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println(num+ " is " +checkNum(num));
    }
//    Method to check whether number is even or odd
    public static String checkNum(int num) {
        if(num%2 ==0){
            return "Even";
        }else {
            return "Odd";
        }
    }
}
