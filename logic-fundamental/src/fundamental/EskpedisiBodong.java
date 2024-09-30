package fundamental;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
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

        System.out.print("Tanggal dan hari pemesanan: ");
        tanggalPemesanan = scanner.nextLine().toUpperCase();
        System.out.print("Hari libur nasional: ");
        tanggalNasional = scanner.nextLine();

        Day day = Day.valueOf(tanggalPemesanan.substring(3));
        System.out.println(day);

        tanggalConvert = Integer.parseInt(tanggalPemesanan.substring(0, 2));
        System.out.println(tanggalConvert);

        tanggalNasionalConvert1 = Integer.parseInt(tanggalNasional.substring(0, 2));
        tanggalNasionalConvert2 = Integer.parseInt(tanggalNasional.substring(4, 6));
        System.out.println(tanggalNasionalConvert1);
        System.out.println(tanggalNasionalConvert2);


//        tanggalConvert += 7;
//        if (tanggalConvert > 31){
//            tanggalConvert -= 31;
//        }
//        System.out.println("Ditambah 7 hari: " + tanggalConvert);


    }
}
