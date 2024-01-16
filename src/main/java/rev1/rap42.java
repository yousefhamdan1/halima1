package rev1;

import java.util.Scanner;

public class rap42 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int roll= scanner.nextInt();
        switch (roll){
            case 101:
                System.out.println("ramesh");
                break;
            case 102:
                System.out.println("mahesh");
                break;
            case 103:
                System.out.println("mukesh");
                break;
            default:
                System.out.println("not found student in class");
        }
    }
}
