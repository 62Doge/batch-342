package fundamental;

public class MissingChar {
    /*
     Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

     TestCase
     missingChar("kitten", 1) → "ktten"
     missingChar("kitten", 0) → "itten"
     missingChar("kitten", 4) → "kittn"
     */
    public static void main(String[] args) {

        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));

    }

    public static String missingChar(String str, int n) {
        StringBuilder strNew = new StringBuilder(str);
        strNew.deleteCharAt(n);
        str = String.valueOf(strNew);

        return str;
    }
}
