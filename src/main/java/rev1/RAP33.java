package rev1;

import java.util.Scanner;

public class RAP33 {
    public static void main(String[] args) {
        /*Ask the user to enter any number

if a user enters a number and it is even, print "Value is even", after that it should check if the number is greater
 than 1000 it should also print even number is large otherwise even value is just right. if number is not even it should print number is
 odd after that it should check if odd number is greater than 1000 it should say odd value is large otherwise odd value is just right

**Example Output: for 33**
```
Please enter a number
```
Value is odd
```
Odd value is just right
```
**Example Output: for 1200**
```
Please enter a number
```
Value is even
```
Even value is large*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num= scanner.nextInt();
        if (num%2==0&&num>1000){
            System.out.println("number is even and greater then 1000");
        } else if (num%2==0&&num<1000) {
            System.out.println("number is even and  less 1000");

        } else if (num%2!=0&&num>1000) {
            System.out.println("number is odd and greater 1000");

        }else{
            System.out.println("number is odd and  less 1000");
        }
    }
}
