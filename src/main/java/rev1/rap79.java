package rev1;

public class rap79 {
    public static void main(String[] args) {
        double[][] myArray = {{1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}
        };
        for (int i=0;i< myArray.length;i++){
            for (int j=0;j<myArray[i].length;j++){
                System.out.print(myArray[i][j]+" ");
            }
        }
    }

}
