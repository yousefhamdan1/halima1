package rev1;

public class rap72 {
    public static void main (String[]args){

        char[] myChar = {'s', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
        String syntax = "";
        for (int i = 0; i < myChar.length; i++) {
            if (myChar[i] == 's' || myChar[i] == 'y' || myChar[i] == 'n' || myChar[i] == 't' || myChar[i] == 'a' || myChar[i] == 'x') {
                syntax += myChar[i];
            }
        }
        System.out.println(syntax);
    }
}