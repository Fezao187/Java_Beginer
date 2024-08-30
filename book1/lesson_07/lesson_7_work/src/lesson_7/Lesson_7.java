package lesson_7;

public class Lesson_7 {
    public static void main(String[] args) {
//       String length
//       String hello = "Hello World";
//       int strLength = hello.length();
//       System.out.println(strLength);

        String greet = " HOW ".trim();
        String lc = (greet + "DY").toLowerCase();
        System.out.println(lc);

//      IndexOF method
//      1 arg version
        String phoneNum = "404-543-2345";
        int idx1 = phoneNum.indexOf("-");
        System.out.println(idx1);

        // 2 arg version
        int idx2 = phoneNum.indexOf("-", idx1+1);
        System.out.println(idx2);
    }
}