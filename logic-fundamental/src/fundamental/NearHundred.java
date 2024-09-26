package fundamental;

public class NearHundred {
    /*
    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

    TestCase
    nearHundred(93) → true
    nearHundred(90) → true
    nearHundred(89) → false
    */
    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(110));

    }

    public static boolean nearHundred(int n) {
        boolean nearHundred = false;

        if (n >= 90 && n <= 100){
            nearHundred = true;
        }
        if (n >= 190 && n <= 200){
            nearHundred = true;
        }
        if (n >= 100 && n <= 110){
            nearHundred = true;
        }
        if (n >= 200 && n <= 210){
            nearHundred = true;
        }
        return nearHundred;
    }

}
