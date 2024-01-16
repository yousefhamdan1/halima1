package rev1;

import java.util.Scanner;

public class rap30 {
    public static void main(String[] args) {
        /*Write a program to take the month number from a user.

Provide month name to the corresponding month number

If a user provides any number that is out of month range, the program should display "Invalid"

IMPORTANT: use Scanner Class

**Example Output:**

```
Please enter month number 1
January
```

**Example Output:**

```
Please enter month number 33
Invalid
```*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter month number");
        String month= scanner.next();
        switch (month){
            case "1":
                System.out.println("jan");
                break;
            case "2":
                System.out.println("feb");
                break;
            case "3":
                System.out.println("mar");
                break;
            case "4":
                System.out.println("apr");
                break;
            case "5":
                System.out.println("may");
                break;
            case "6":
                System.out.println("jun");
                break;
            case "7":
                System.out.println("jul");
                break;
            case "8":
                System.out.println("aug");
                break;
            case "9":
                System.out.println("sep");
                break;
            case "10":
                System.out.println("oct");
                break;
            case "11":
                System.out.println("nov");
                break;
            case "12":
                System.out.println("dec");
                break;


        }
    }
}
