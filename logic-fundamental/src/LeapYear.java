import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.print("Masukkan tahun: ");
        year = scanner.nextInt();

        calcLeapYear(year);
    }

    public static void calcLeapYear(int year) {
        do{
          if (year % 4 == 0){
              System.out.print(year + " ");
          }
            year += 1;
        }while (year <= 2024);
    }
}
