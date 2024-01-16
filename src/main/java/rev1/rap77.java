package rev1;

import java.util.Scanner;

public class rap77 {
    public static void main(String[] args) {
        // Create an array to store 5 integers
        int[] numbers = new int[5];

        // Use a loop to take input from the user and store in reverse order
        Scanner scanner = new Scanner(System.in);
        for (int i = 4; i >= 0; i--) {
            numbers[i] = scanner.nextInt();
            System.out.println(numbers[i]);
        }

        // Print the elements in the original order
      System.out.println("Output:");
       for (int i = 0; i < 5; i++) {
           System.out.println(numbers[i]);
      }
  }
}