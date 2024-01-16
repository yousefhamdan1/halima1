package rev1;

public class rap81 {
    public static void main(String[] args) {
        int arr[]={5,4,8,3};
       int big=arr[0];
       for (int i=0;i< arr.length;i++){
           if (arr[i]>big){
               big=arr[i];
               System.out.println(big);
           }
       }
        }
    }

