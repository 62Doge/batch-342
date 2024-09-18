import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input how many matrices do you want: ");
        int matricesNumber = scanner.nextInt();

        printMatrices(matricesNumber);


    }

    private static void printMatrices(int matricesNumber) {
        for (int i = 0; i < matricesNumber; i++){
           for (int j = 0; j < matricesNumber; j++){
               System.out.print(i + " ");
           }
            System.out.println();
        }
    }
}
