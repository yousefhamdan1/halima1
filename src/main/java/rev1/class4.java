package rev1;

import java.util.Scanner;

public class class4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("add a number");
        int num1= scanner.nextInt();
        if (num1<10){
            System.out.println("number is smaller then 10");
        }else{
            System.out.println("number is bigger");
        }
    }
}
