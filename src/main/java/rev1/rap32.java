package rev1;

import java.util.Scanner;

public class rap32 {
    /*
Ask the user to enter his/her gender "Please enter your gender: M or F" and their age "Please enter your age"

You have 2 conditions:

If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"

If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"

**Example Output:**

Please enter your gender: M or F
Please enter your age
Man
**Example Output:**
Please enter your gender: M or F
Please enter your age
Boy```
**Example Output:** ```
Please enter your gender: M or F
Please enter your age```
Woman```
**Example Output:** ```
Please enter your gender: M or F`````
Please enter your age
Girl
```*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your gender");
        String gender= scanner.next();
        System.out.println("please enter your age");
        int age = scanner.nextInt();
        if (gender == "M" && age < 25) {
            System.out.println("boy");
        } else if (gender =="M" && age > 25) {
            System.out.println("man");

        }
        if (gender == "F" && age < 25) {
            System.out.println("girl");
        } else if (gender == "F" && age > 25) {
            System.out.println("women");
        }
    }
}