import java.util.Scanner;

public class MixedFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input panjang angka: ");
        int length = scanner.nextInt();

        cubeStars(length);
        System.out.println();
        diagonalStars(length);

    }

    public static void cubeStars(int length){
        for (int i = 0; i <= length; i++){
            for (int j = 0; j <= length; j++){
                if (i == 0 || i == length || j == 0 || j == length){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diagonalStars(int length){
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++){
                if (i == j || i + j == length - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
