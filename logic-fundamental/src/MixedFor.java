import java.util.Scanner;

public class MixedFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input panjang angka: ");
        int length = scanner.nextInt();

        cubeStars(length);
        System.out.println();
        diagonalStars(length);
        System.out.println();
        oddEvenMatrix(length);
        System.out.println();
        System.out.println();
        sortFor(length);
    }

    private static void sortFor(int length) {
        int sum = length * length;

        // i ke bawah
        // j ke kanan
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++){
                System.out.print((length - i) * length - j + " ");
            }
            System.out.println();
        }
//        5-0 * 5 - 0
//         j j j
//          0  1  2  3  4
//    i   0 25 24 23 22 21
//     i  1
//     i  2
    }

    private static void oddEvenMatrix(int length) {
        int odd = 1;
        int even = 2;
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++){
                if (i % 2 == 0){
                    System.out.print(odd + " ");
                    odd += 2;
                }else {
                    System.out.print(even + " ");
                    even += 2;
                }
            }
            System.out.println();
        }
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
