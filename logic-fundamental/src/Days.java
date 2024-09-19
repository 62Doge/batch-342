import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day;

        System.out.print("Hari : ");
        day = scanner.next();

        whatDay(day);
    }

    public static void whatDay(String day) {
        int resultNumber = DayNumber.findDayNumber(day);
        String kemarinLusa = DayName.findDayName(resultNumber + 5);
        System.out.println("Kemarin lusa adalah hari " + kemarinLusa + " (2 hari sebelum) " + day);

        String kemarin = DayName.findDayName(resultNumber + 6);
        System.out.println("Kemarin adalah hari " + kemarin + " (hari sebelum) " + day);

        System.out.println("Hari ini adalah " + day + " (didapat dari) " + day);

        String besok = DayName.findDayName(resultNumber + 1);
        System.out.println("Besok adalah hari " + besok + " (hari setelah) " + day );

        String besokLusa = DayName.findDayName(resultNumber + 2 );
        System.out.println("Besok lusa adalah hari " + besokLusa + " (2 hari setelah) " + day);
    }
}
