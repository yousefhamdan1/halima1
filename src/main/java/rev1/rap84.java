package rev1;

public class rap84 {
    public static void main(String[] args) {
        {
            int[][] a = {
                    {-5,-2,-3,7},
                    {1,-5,-2,2},
                    {1,-2,3,-4}
            };
      int num=0;
          for (int i=0;i<a.length;i++){
              for (int j=0;j< a[i].length;j++) {

                  if (a[i][j] % 2 != 0 && a[i][j] < 0) {
                      num++;

                  }
              }
              }
             System.out.println(num);
          }
        }
}

