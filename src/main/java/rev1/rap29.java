package rev1;

import java.util.Scanner;

public class rap29 {
    public static void main(String[] args) {
        /*Write a java program that prints out true if ( x * y ) returns a positive value. Else prints out false if  (x * y) returns a negative value.

Step 1: Your program should ask "Please enter first number" - for the 1st number and "Please enter second number" - for the 2nd number.

Step 2: Create if condition to check if the multiplication of x and y values is positive or negative.

If the result of a multiplication is positive print true, otherwise print false.

**Example Output:**

```
Please enter first number
Please enter second number
true
```

**Example Output:**

```
Please enter first number
Please enter second number
false
```*/
        Scanner scanner=new Scanner(System.in);
        boolean f=false;
        System.out.println("enter number 1");
        int num1= scanner.nextInt();
        System.out.println("enter number 2");
        int num2= scanner.nextInt();
        if (num1*num2>0){
            f=true;
            System.out.println(f);

        }else{
            System.out.println(f);
        }
    }
}
