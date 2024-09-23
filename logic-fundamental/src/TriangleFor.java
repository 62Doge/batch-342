import java.sql.SQLOutput;
import java.util.Scanner;

public class TriangleFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Masukkan number: ");
        number = scanner.nextInt();

        printTriangle(number);
    }

    private static void printTriangle(int number) {
//        kiri
        for (int i = 1; i <= number + 1; i++){
            for (int j = 1; j < i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("==================");
//        kanan
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= number - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("==================");
        //skibidi stars left
        for (int i = 1; i <= number + 1; i++){
            for (int j = 1; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("==================");
        //skibidi stars right
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= number - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
