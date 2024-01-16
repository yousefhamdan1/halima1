import java.util.Scanner;

public class halimarev1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("put a number");
        int num1= scanner.nextInt();
        if (num1%2==0){
            System.out.println("num is even");
        }else{
            System.out.println("num is odd");
        }

    }
}
