package rev1;

import java.util.Scanner;

public class rap101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("In:");
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i += 2) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }
}
