import java.util.Objects;
import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day;
        String[] nameOfDay = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        boolean isDayValid = false;

        System.out.print("Hari : ");
        day = scanner.next();

        for (int i = 0; i < nameOfDay.length; i++){
            if (day.equalsIgnoreCase(nameOfDay[i])){
                isDayValid = true;
            }
        }
        if (isDayValid){
            whatDay(day);
        } else {
            System.out.println("Hari " + day + " tidak valid!");
        }
    }

    public static void whatDay(String day) {
//        Minggu = 7
        int resultNumber = DayNumber.findDayNumber(day);
        String kemarinLusa = DayName.findDayName((resultNumber - 2 <= 0) ? resultNumber + 5 : resultNumber - 2);
        System.out.println("Kemarin lusa adalah hari " + kemarinLusa + " (2 hari sebelum) " + day);

        String kemarin = DayName.findDayName((resultNumber - 1 <= 0) ? resultNumber + 6 : resultNumber - 1 );
        System.out.println("Kemarin adalah hari " + kemarin + " (hari sebelum) " + day);

        System.out.println("Hari ini adalah " + day + " (didapat dari) " + day);

        String besok = DayName.findDayName((resultNumber + 1 > 7) ? resultNumber - 6 : resultNumber + 1);
        System.out.println("Besok adalah hari " + besok + " (hari setelah) " + day );

        String besokLusa = DayName.findDayName((resultNumber + 2 > 7)? resultNumber - 5 : resultNumber + 2);
        System.out.println("Besok lusa adalah hari " + besokLusa + " (2 hari setelah) " + day);
    }
}
