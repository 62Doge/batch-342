public class Main {
    public static void main(String[] args) {
        String str = "Ical";
        int n = 1;

        String front = str.substring(0, n);

        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n+1, str.length());

        System.out.println(front + back);

    }
}