package rev1;

import java.util.Scanner;

public class rap22 {
    public static void main(String[] args) {
        /*For you to do:**

         Write a program to take user name, age and mobile number

         First Output: "Enter your name"

         Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)

         Third Output: "Enter your age"

         **Example Output:**

         ```
         Enter your name
         ```

         ```
         Enter your mobile number
         ```

         ```
         Enter your age
         ```

         ```
         Your name is Weqas, your age is 45 and your mobile number is 123-456-7890
         ```

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("inter your name");
        String A= scanner.next();
        System.out.println("inter your moble number");
        int B = scanner.nextInt();
        System.out.println("inter your age");
        int g= scanner.nextInt();
        System.out.println("your name is"+" "+A+" "+"your age is "+g+" "+"and your mobile number "+B);
    }

}
