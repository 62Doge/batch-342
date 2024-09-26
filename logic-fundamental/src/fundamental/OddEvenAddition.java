package fundamental;

import java.util.Scanner;

public class OddEvenAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;

        System.out.print("Masukkan angka iterasi: ");
        inputNumber = scanner.nextInt();

        calcOddEvenAddition(inputNumber);
    }

    private static void calcOddEvenAddition(int inputNumber) {
        for (int i = 1; i <= inputNumber*2; i+=2){
            int odd = i;
            int even = i + 1;
            int result = odd + even;
            System.out.println(odd + " + " + even + " = " + result);

        }
    }
}
