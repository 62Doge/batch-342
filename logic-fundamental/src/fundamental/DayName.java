package fundamental;

import java.util.Scanner;

public class DayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Masukkan hari ke-berapa: ");
        number = scanner.nextInt();

        System.out.println(findDayName(number));
    }

    public static String findDayName(int number) {
        String day;
        switch (number) {
            case 1 -> day = "Senin";
            case 2 -> day = "Selasa";
            case 3 -> day = "Rabu";
            case 4 -> day = "Kamis";
            case 5 -> day = "Jumat";
            case 6 -> day = "Sabtu";
            case 7 -> day = "Minggu";
            default -> day = "Tidak ada hari ke-" + number;
        }

        return day;
    }


}
