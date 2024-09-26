package fundamental;

public class SumDouble {
    /*
    Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8
     */
    public static void main(String[] args) {
        // Test Case
        //sumDouble(1, 2) → 3
        //sumDouble(3, 2) → 5
        //sumDouble(2, 2) → 8

        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));

    }

    public static int sumDouble(int a, int b) {
        int result;
        if (a == b){
            result = (a + b) * 2;
        } else {
            result = a + b;
        }

        return result;
    }

}
