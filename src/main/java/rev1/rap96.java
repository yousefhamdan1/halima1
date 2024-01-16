package rev1;

import java.util.Scanner;

public class rap96 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a= scanner.next();
        if (a.equals("java")){
            System.out.println("Java is a programming language");
        } else if (a.equals("C")) {
            System.out.println("C is a procedural programming language");
        } else if (a.equals("C++")) {
            System.out.println("C++ is a middle-level programming language");

        }else{
            System.out.println("Doesn't match any programming language");
        }

    }
}
