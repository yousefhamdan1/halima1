package rev1;

import java.util.Scanner;

public class rap36 {
    public static void main(String[] args) {
        /*Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"

and make the comparisons:

if int1 and int2 are equal and word1 and word2 are equal, output "AND"
if int1 and int2 are equal or word1 and word2 are equal, output "OR"
if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"

**Example input/output:**
word1: banana
word2: banana
int1: 2
int2: 2
Output: AND


word1: banana


word2: apple


int1: 2


int2: 2


Output: OR

word1: phone
word2: pie
int1: 2
int2: 3
Output: NONE*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2 words!");
        String word1 = scanner.next();
        String word2 = scanner.next();
        System.out.println("enter 2 number!");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (word1.equals(word2) && num1 == num2) {
            System.out.println("and");

        } else if (word1.equals(word2) || num1 == num2) {
            System.out.println("or");

        } else if (!word1.equals(word2)&&num1!=num2){
            System.out.println("none");

        }
    }}

