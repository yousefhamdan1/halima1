package rev1;

import java.util.Scanner;

public class rap20 {
    public static void main(String[] args) {
        /*For you to do:**

         Write  a program that takes user's first name and last name and prints in console

         Instruct the user to enter first name: "Please Enter First Name"

         Capture the first name

         Instruct the user to enter last name:"Please Enter Last Name"

         Capture last name

         Print first name and last name

         **Final Output:**

         ```
         Example:
         ```

         ```
         Please Enter First Name
         ```

         ```
         Please Enter Last Name
         ```

         ```
         Cindy Crawford*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("inter your first name");
        String a= scanner.next();
        System.out.println("inter your last name");
        String b= scanner.next();
        System.out.println(a+" "+b);
    }
}