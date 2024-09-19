import java.util.Scanner;

public class DayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day;

        System.out.print("Masukkan hari yang anda inginkan: ");
        day = scanner.next();

        System.out.println(findDayNumber(day));
    }

    private static int findDayNumber(String day) {
        int number = 0;
        switch (day){
            case "senin" -> number = 1;
            case "selasa" -> number = 2;
            case "rabu" -> number = 3;
            case "kamis" -> number = 4;
            case "jumat" -> number = 5;
            case "sabtu" -> number = 6;
            case "minggu" -> number = 7;
        }

        return number;
    }
}
