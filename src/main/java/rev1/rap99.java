package rev1;

import java.util.Scanner;

public class rap99 {
    public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String givenString = inp.nextLine();
            //write your code below

            String stringWithoutSpaces = givenString.replaceAll("\\s+", "");

            // Converting the string to lowercase for case-insensitive comparison
            String lowercaseString = stringWithoutSpaces.toLowerCase();

            // Reversing the string
            String reversedString = new StringBuilder(lowercaseString).reverse().toString();

            // Checking if the original and reversed strings are equal
            boolean isPalindrome = lowercaseString.equals(reversedString);

            System.out.println(isPalindrome);
        }
    }



