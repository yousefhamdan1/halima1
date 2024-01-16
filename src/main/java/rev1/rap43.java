package rev1;

import java.util.Scanner;

public class rap43 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int month= scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            default:
                System.out.println("invaliud");
        }

    }
}
