package rev1;

import java.util.Scanner;

public class rap26 {
    public static void main(String[] args) {
        /*For you to do:**

         The variable "name" holds a String user input

         Write a conditional statement starting on line 9 that does the following:

         - If name is equal to "Chen", print "teacher"
         - For any other input, print "student"

         ```
         Examples:
         ```

         ```
         In: Chen
         teacher
         ```

         ```
         In: Faa
         student
         ```

         Hint: for your if condition use if(name.equals("Chen")) - we haven't study it yet, but this is code to compare Strings. We will cover this topic soon.

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name");
        String name= scanner.next();
        if (name.equals("Chen")){
            System.out.println("teacher");
        }else{
            System.out.println("student");
        }
    }
}
