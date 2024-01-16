package rev1;

import java.util.Scanner;

public class rap23 {
    public static void main(String[] args) {
        /*For you to do:**

Create a program that will ask a user to input boolean value "Input the boolean value"

If the input is true or false, then the output should look like below:

**Example Output:**

```
Input the boolean value
```

```
The value is true
```

**Example Output:**

```
Input the boolean value
```

```
The value is false
```*/
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter true or false");
        boolean A= scanner.nextBoolean();
        if (A==true){
            System.out.println("the value is true");
        }else{
            System.out.println("the value is false");
        }
    }
}
