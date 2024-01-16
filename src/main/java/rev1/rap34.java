package rev1;

import java.util.Scanner;

public class rap34 {
    public static void main(String[] args) {
        /*Write a program to find the largest number among three distinct numbers using nested if condition

Please use Scanner class to take input from users

**Expected Output:**

```
Please enter 3 distinct numbers 4 5  and 14
```

```
The largest number is 14
```*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("pleas enter 3 numbers");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();
        if (num1>num2&&num1>num3){
            System.out.println(num1+" is largest number");
        } else if (num2>num1&&num2>num3) {
            System.out.println(num2+" is largest number");
        }else{
            System.out.println(num3 +" is the largest number");
        }
    }
}
