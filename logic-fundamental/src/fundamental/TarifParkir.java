package fundamental;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class TarifParkir {
    /*
          3. Delapan jam pertama -> 1000/jam
          lebih dari 8 jam s.d. 24 jam -> 8000 flat
          lebih dari 24 jam 15000/24jam dan selebihnya mengikuti ketentuan pertama dan kedua
       */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss", new Locale("id", "ID"));
        String jamMasuk;
        String jamKeluar;
        int tarif = 0;

        String waktuSekarang = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(waktuSekarang);

        System.out.print("Masuk : ");
        jamMasuk = scanner.nextLine();

        System.out.print("Keluar : ");
        jamKeluar = scanner.nextLine();

        LocalDateTime localDateTimeMasuk = LocalDateTime.parse(jamMasuk, dateTimeFormatter);
        LocalDateTime localDateTimeKeluar = LocalDateTime.parse(jamKeluar, dateTimeFormatter);

        long durasiJam = Duration.between(localDateTimeMasuk, localDateTimeKeluar).toHours();

        if (durasiJam < 8){
            tarif = (int) (durasiJam * 1000);
        } else if (durasiJam <= 24) {
            tarif = 8000;
        } else if (durasiJam > 24) {
            tarif = (int) (durasiJam * 15000);
        }

        System.out.println(durasiJam);
        System.out.println("Total : " + tarif);
    }
}
