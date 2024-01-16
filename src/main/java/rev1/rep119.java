package rev1;

public class rep119 {
    String censorLetter(String a,char letter){
        String result=a.replace(letter,'*');
        return result;

    }

    public static void main(String[] args) {
        rep119 obj=new rep119();
        rep119 obj2=new rep119();

        String res=obj.censorLetter("computer science",'e');
        String res2=obj.censorLetter("trick or treat",'t');
        System.out.println(res);
        System.out.println(res2);

    }}