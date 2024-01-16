package rev1;

public class rap75 {
    public static void main(String[] args) {
        /*For you to do:**

         Using the following array.

         {45, 78, 12,  67, 55, 89, 23, 77, 88}

         Create a for loop to extract values from that array so your output looks as below:

         ```
         **Expected Output:**
         ```

         ```
         78 55 77
         ```


         Note: Find out what is the start point an how much you need to increment to get the result. */
        int[] arr = {45, 78, 12, 67, 55, 89, 23, 77, 88};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 78 || arr[i] == 55 || arr[i] == 77) {
                System.out.println(arr[i]);
            }
        }
    }
}