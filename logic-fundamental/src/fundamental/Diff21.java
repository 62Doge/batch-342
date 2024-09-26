package fundamental;

public class Diff21 {
    /*
    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    Test Case
    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
    */
    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(22));
        System.out.println(diff21(25));

    }

    public static int diff21(int n) {
        int result;
        if (n > 21){
            result = n - 21;
            result += result;
        } else {
            result = 21 - n;
        }

        return result;
    }
}
