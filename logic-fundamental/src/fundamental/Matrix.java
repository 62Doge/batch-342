package fundamental;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input how many matrices do you want: ");
        int matricesNumber = scanner.nextInt();

        printMatrices(matricesNumber);

        System.out.println();

        System.out.print("Masukkan kolum: ");
        int collumn = scanner.nextInt();
        System.out.print("Masukkan baris: ");
        int row = scanner.nextInt();
        printMatricesByCollumnAndRow(collumn, row);

        System.out.println();

        System.out.print("Masukkan kolum bintang: ");
        collumn = scanner.nextInt();
        System.out.print("Masukkan baris bintang: ");
        row = scanner.nextInt();
        printMatricesByCollumnAndRowStars(collumn, row);


    }

    private static void printMatricesByCollumnAndRow(int collumn, int row) {
        for (int i = 0; i < row; i++){
            for (int j = 0; j < collumn; j++){
                System.out.print("[" + j + "(Index), " + i + "(Element)] ");
            }
            System.out.println();
        }
    }

    private static void printMatrices(int matricesNumber) {
        for (int i = 0; i < matricesNumber; i++){
           for (int j = 0; j < matricesNumber; j++){
               System.out.print("[" + j + "(Index), " + i + "(Element)] ");
           }
            System.out.println();
        }
    }

    private static void printMatricesByCollumnAndRowStars(int collumn, int row) {
        for (int i = 0; i < row; i++){
            for (int j = 0; j < collumn; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
