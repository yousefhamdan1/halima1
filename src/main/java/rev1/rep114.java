package rev1;

public class rep114 {
    void num(int num1,int num2){
        int result=num1+num2;
        System.out.println("addition "+result);
    }
    void num1(int num1,int num2){
        int result=num1*num2;
        System.out.println("multiplication "+result);

    }
    void num2(int num1,int num2){
        int result=num1/num2;
        System.out.println("Subtraction "+result);

    }

    public static void main(String[] args) {
        rep114 obj=new rep114();
        obj.num(21,12);
        obj.num1(44,46);
        obj.num2(56,22);

    }


}
