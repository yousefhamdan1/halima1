package rev1;

import java.util.Scanner;

public class rap25 {
    public static void main(String[] args) {
        /*For you to do:**

         The variable "num" holds an integer input from a user
         Write a conditional statement starting on line 9 that does the following:

         - If num is positive, print "__ is positive"
         - If num is negative, print "__ is negative"
         - If num is equals to 0, then print "Entered number is equals to 0"

         Examples:

         ```
         In: 5
         5 is positive
         ```

         ```
         In: -2
         -2 is negative
         ```

         ```
         In: 0
         ```

         ```
         Entered number is equals to 0*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num= scanner.nextInt();
        if (num>0){
            System.out.println("positive");
        } else if (num<0) {
            System.out.println("negative");

        }else{
            System.out.println("num is equals to 0");
        }
    }
}
