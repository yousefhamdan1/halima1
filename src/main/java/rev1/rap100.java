package rev1;

import java.util.Scanner;

public class rap100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String reversedString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString += s.charAt(i);
        }
        System.out.println(reversedString);
    }
}