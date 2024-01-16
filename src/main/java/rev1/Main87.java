package rev1;

public class Main87 {
    String carcolor;
    int year;
    String carMake;

    public static void main(String[] args) {
        Main87 obj1=new Main87();
        Main87 obj2=new Main87();
        obj1.carcolor="black";
        obj1.year=2022;
        obj1.carMake="bmw";
        obj2.carcolor="white";
        obj2.year=2000;
        obj2.carMake="Toyota";
        System.out.println("car color is "+obj1.carcolor+" and car year is "+obj1.year+" and car modle is "+ obj1.carMake);
        System.out.println("car color is "+obj2.carcolor+" and car year is "+obj2.year+" and car modle is "+ obj2.carMake);


    }
}
