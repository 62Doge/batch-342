package fundamental;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class EskpedisiBodong {
    enum Day {
        SENIN,
        SELASA,
        RABU,
        KAMIS,
        JUMAT,
        SABTU,
        MINGGU
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tanggalPemesanan;
        String tanggalNasional;
        int tanggalConvert;
        int tanggalNasionalConvert1;
        int tanggalNasionalConvert2;

        Map<String, Integer> daysInNumber = new HashMap<>();
        daysInNumber.put("SENIN", 1);
        daysInNumber.put("SELASA", 2);
        daysInNumber.put("RABU", 3);
        daysInNumber.put("KAMIS", 4);
        daysInNumber.put("JUMAT", 5);
        daysInNumber.put("SABTU", 6);
        daysInNumber.put("MINGGU", 7);

        Map<Integer, String> daysInWeek = new HashMap<>();
        daysInWeek.put(1, "SENIN");
        daysInWeek.put(2, "SELASA");
        daysInWeek.put(3, "RABU");
        daysInWeek.put(4, "KAMIS");
        daysInWeek.put(5, "JUMAT");
        daysInWeek.put(6, "SABTU");
        daysInWeek.put(7, "MINGGU");


        System.out.print("Tanggal dan hari pemesanan: ");
        tanggalPemesanan = scanner.nextLine().toUpperCase();
        System.out.print("Hari libur nasional: ");
        tanggalNasional = scanner.nextLine();

        //Ambil enum hari
        Day day = Day.valueOf(tanggalPemesanan.substring(3));
        System.out.println(day);

        //Di toString karena dia enum
        int hariKe = daysInNumber.get(day.toString());
        System.out.println("Hari pemesanan ke - " + hariKe);

        tanggalConvert = Integer.parseInt(tanggalPemesanan.substring(0, 2));
        System.out.println(tanggalConvert);

        tanggalNasionalConvert1 = Integer.parseInt(tanggalNasional.substring(0, 2));
        tanggalNasionalConvert2 = Integer.parseInt(tanggalNasional.substring(4, 6));
        System.out.println(tanggalNasionalConvert1);
        System.out.println(tanggalNasionalConvert2);



    }
}
