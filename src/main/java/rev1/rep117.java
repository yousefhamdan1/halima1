package rev1;

public class rep117 {
    int sumEvenToX(int x) {
        int sumEven = 0;
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                sumEven =sumEven+ i;
            }
        }
        return sumEven;
    }

    public static void main(String[] args) {
         rep117 obj = new rep117();
        int result = obj.sumEvenToX(8);
        System.out.println(result);
    }
}