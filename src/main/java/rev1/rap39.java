package rev1;

import java.util.Scanner;

public class rap39 {
    public static void main(String[] args) {
        /*A school has following rules for grading system:
a. 1 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade.

**Example Output:**

```
Please enter your mark
```

```
Your grade is A
```

**Example Output:**

```
Please enter your mark
```

```
Please enter valid mark
```*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your mark");
        int mark= scanner.nextInt();
        if (mark>=1&&mark<=25){
            System.out.println("your geade is F");
        } else if (mark>26&&mark<=45) {
            System.out.println("your geade is E");

        } else if (mark>46&&mark<=50) {
            System.out.println("your geade is D");

        } else if (mark>51&&mark<=60) {
            System.out.println("your geade is C");

        }
    }
}
