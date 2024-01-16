package rev1;

import java.util.Scanner;

public class rap38 {
    public static void main(String[] args) {
        /*For you to do:

Prompt user with a question: "Is it weekend?"

If it is not a weekend --> subject="manual testing"

Otherwise --> subject="Java"

Output:

```
Today you will be learning __*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it weekend?");
        String weekend= scanner.next();
        if (weekend.equals("no")){
            System.out.println("manual testing");
        } else if (weekend.equals("yes")) {
            System.out.println("java");

        }else{
            System.out.println("today you will learning");
        }
    }
}
