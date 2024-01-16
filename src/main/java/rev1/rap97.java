package rev1;

import java.util.Scanner;

public class rap97 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your browser");
        String ibbo=scanner.next();
        if (ibbo.equalsIgnoreCase("Chrome")){
            System.out.println("Proceed with Chrome browser");
        } else if (ibbo.equalsIgnoreCase("firefox"))
        {
            System.out.println("Proceed with Firefox browser");
            
        }else{
            System.out.println("Invalid browser");
        }

    }
}
