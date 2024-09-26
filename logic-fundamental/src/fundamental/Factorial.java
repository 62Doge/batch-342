package fundamental;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input factorial number: ");
        int inputNumber = scanner.nextInt();

        calculateFactorial(inputNumber);
    }

    private static void calculateFactorial(int inputNumber) {
        int factorial = 1;

        for (int i = inputNumber; i >= 1; i--){
            factorial = factorial * i ;
        }

        System.out.println(factorial);
    }


}
