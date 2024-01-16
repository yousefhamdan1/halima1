package rev1;

public class rap116 {
   boolean num(int num1,int num2){
        boolean bol=false;
        if ( num1%2==0&&num2%2==0){
            bol=true;
        }
        return bol;



    }

    public static void main(String[] args) {
        rap116 obj=new rap116();

        System.out.println(obj.num(11,12));

    }


}
