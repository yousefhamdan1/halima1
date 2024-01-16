package rev1;

import java.util.Scanner;

public class rap37 {
    /*Take 2 boolean inputs from a user:



"Are you thirsty?"

"Are you sleepy?"

If user is thirsty and not sleepy--> drink=water

If user is thirsty and sleepy--> drink=coffee

If user is not thirsty and sleepy --> drink=tea

Otherwise drink="nothing"

Output:


Looks like you need to drink ___*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty= scanner.nextBoolean();
        System.out.println("are you sleepy");
        boolean sleepy=scanner.nextBoolean();
        if (thirsty==true&&sleepy==false){
            System.out.println("water");

        } else if (thirsty==true&&sleepy==true) {
            System.out.println("coffe");

        } else if (thirsty!=true&&sleepy!=true) {
            System.out.println("drink tea");

        }
    }
}
