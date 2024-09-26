package fundamental;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the length of the number: ");
        int lenght = scanner.nextInt();

        int[] fiboArr = new int[lenght];

        calculateFibo(fiboArr);

    }

    private static void calculateFibo(int[] fiboArr) {
        int start = 1;
        fiboArr[0] = 1;
        for (int i = 1; i < fiboArr.length; i++){
            fiboArr[i] = start;
            if (fiboArr[i] > 2){
                fiboArr[i] = fiboArr[i - 1] + fiboArr[i - 2];
            }

            start++;
        }

        for (int numbs : fiboArr){
            System.out.println(numbs);
        }
    }


}
