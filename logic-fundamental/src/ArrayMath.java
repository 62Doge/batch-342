import java.util.Arrays;
import java.util.Scanner;

public class ArrayMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Input value array index ke - " + (i+1) + ": ");
            int valueArr = scanner.nextInt();
            arr[i] = valueArr;
        }

        System.out.println("Values of the sorted array");
        Arrays.sort(arr);
        for (int printArr : arr){
            System.out.print(printArr + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Mean: " + calculateMeanArr(arr));
        System.out.println("Median: " + calculateMedianArr(arr));
        System.out.println("Modus: " + calculateModusArr(arr));
        calculateMinMaxArr(arr);
    }

    private static void calculateMinMaxArr(int[] arr) {
        int min = arr[0];
        int max = arr[arr.length - 1];

        System.out.println("Min: " + min + ", Max: " + max);
    }

    private static int calculateModusArr(int[] arr) {
        int max = arr[0];
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                max = arr[i];
            }
        }
        return max;
    }

    private static double calculateMedianArr(int[] arr) {
        double medCalc;
        int index;
        if (arr.length % 2 == 1){
            index = arr.length / 2;
            medCalc = arr[index];
        } else {
            medCalc = (double) ((arr[arr.length / 2]) + (arr[arr.length / 2 - 1])) / 2;
        }

        return medCalc;
    }

    private static double calculateMeanArr(int[] arr) {
        double mean = 0;

        for (int i = 0; i < arr.length; i++){
            mean += arr[i];
        }

        return mean / arr.length;
    }
}
