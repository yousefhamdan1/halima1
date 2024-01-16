package rev1;

public class rep115 {
    String test(String name){

       name= name.toUpperCase();
        return name;

    }

    public static void main(String[] args) {
        rep115 obj=new rep115();
        System.out.println(obj.test("test"));
    }

}
