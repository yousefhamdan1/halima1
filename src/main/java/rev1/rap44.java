package rev1;

import java.util.Scanner;

public class rap44 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your car favorite make");
        String car= scanner.next();
        switch (car){
            case "BMW":
                car="german car";
                break;
            case "Toyota":
                car="japanese car";
                break;
            case "maseasti":
                car="italian car";
                break;
            default:
                System.out.println("unknown");


        }
        System.out.println("your favourt car is "+car);
    }
}
