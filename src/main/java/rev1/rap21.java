package rev1;

import java.util.Scanner;

public class rap21 {
    public static void main(String[] args) {
        /*For you to do:**

         Write a program that asks the user's age: "Enter your age  "

         Then display it by adding 10 (i.e age + 10) in your final output.

         **Example Output:**

         ```
         Enter your age 30
         Your age after 10 years is 40
         ```
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("inter your age");
        int A= scanner.nextInt()+10;
        System.out.println("your age is after 10 years is "+A);
    }
}
