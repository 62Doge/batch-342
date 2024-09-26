package fundamental;

import java.util.Scanner;

public class BottleGlass {
    // 1 botol = 2 gelas; 1 botol -> 5 cangkir
    // 1 teko = 25 cangkir;
    // 1 gelas = 2,5 cangkir;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.println("1. Botol");
        System.out.println("2. Teko");
        System.out.println("3. Gelas");
        System.out.print("Input menu: ");
        int menu = scanner.nextInt();

        switch (menu){
            case 1:
                // 1 botol 5 cangkir
                System.out.print("Input banyak botol: ");
                int totalBotol = scanner.nextInt();
                total = totalBotol * 5;
                System.out.println(totalBotol + " botol : " + total + " cangkir");
                break;
            case 2:
                // 1 teko 25 cangkir
                System.out.print("Input banyak Teko: ");
                int totalTeko = scanner.nextInt();
                total = totalTeko * 25;
                System.out.println(totalTeko + " botol : " + total + " cangkir");
                break;
            case 3:
                // 1 gelas 2.5 cangkir
                System.out.print("Input banyak Teko: ");
                int totalGelas = scanner.nextInt();
                total = (int) (totalGelas * 2.5);
                System.out.println(totalGelas + " botol : " + total + " cangkir");
                break;
            default:
                System.out.println("Tidak ada menu yang sesuai");
                break;
        }

    }


}
