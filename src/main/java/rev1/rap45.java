package rev1;

import java.util.Scanner;

public class rap45 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("inter number from 1-7");
        int day= scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("satarday");
                break;
            case 2:
                System.out.println("sunday");
                break;
            case 3:
                System.out.println("monday");
                break;
            case 4:
                System.out.println("tusday");
                break;
            case 5:
                System.out.println("wednesday");
                break;
            case 6:
                System.out.println("thirsday");
                break;
            case 7:
                System.out.println("friday");
                break;

        }

    }
}
