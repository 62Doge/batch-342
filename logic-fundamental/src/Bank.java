import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Bank {
    // Bank berbeda biaya admin = Rp7.500
    // Namun saldo rekening KOSONG
    // SETOR TUNAI TERLEBIH DAHULU MELALUI MESIN ATM
    /*
        Constraint
        -Tabungan/rekening karyawan memiliki kode PIN dan setiap transaksi harus verifikasi PIN tersebut, jika salah muncul pesan "PIN SALAH"
        -Jika saldo tidak cukup untuk melakukan transfer, munculkan pesan "Saldo tidak mencukupi"
        -Panjang rekening harus 10 digit
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int transferOption;
        String pin = "";
        String pinAccess = "123456";
        int reserveMoney;
        int accountLength;
        int account;
        int transferNominal;
        int bankCode;

        do {
            System.out.print("Masukkan PIN: ");
            pin = scanner.next();

            if (!pin.equals(pinAccess)) {
                System.out.println("Pastikan PIN sesuai!");
            }
        } while(pin != pinAccess);

        System.out.print("Uang yang disetor: ");
        reserveMoney = scanner.nextInt();
        System.out.print("Pilihan Transfer: ");
        transferOption = scanner.nextInt();

        switch (transferOption) {
            case 1:
                do {
                    System.out.print("Masukkan rekening tujuan: ");
                    account = scanner.nextInt();
                    accountLength = String.valueOf(account).length();

                    if (accountLength != 10)
                        System.out.println("Pastikan 10 digit angka pada rekening");
                } while (accountLength != 10);
                System.out.print("Masukkan nominal transfer: ");
                transferNominal = scanner.nextInt();

                if (calcTransfer(reserveMoney, transferNominal, transferOption) < 0){
                    System.out.println("Saldo tidak mencukupi");
                }else {
                    System.out.println("Transaksi berhasil, saldo anda saat ini " +
                            moneyFormat(calcTransfer(reserveMoney, transferNominal, transferOption)));
                }

                break;
            case 2:
                System.out.print("Masukkan kode Bank: ");
                bankCode = scanner.nextInt();

                do {
                    System.out.print("Masukkan rekening tujuan: ");
                    account = scanner.nextInt();
                    accountLength = String.valueOf(account).length();

                    if (accountLength != 10)
                        System.out.println("Pastikan 10 digit angka pada rekening");
                } while (accountLength != 10);
                System.out.print("Masukkan nominal transfer: ");
                transferNominal = scanner.nextInt();

                if (calcTransfer(reserveMoney, transferNominal, transferOption) < 0){
                    System.out.println("Saldo tidak mencukupi");
                }else {
                    System.out.println("Transaksi berhasil, saldo anda saat ini " +
                            moneyFormat(calcTransfer(reserveMoney, transferNominal, transferOption)));
                }

                break;
            default:
                System.out.println("Tidak ada opsi " + transferOption);
        }

    }

    private static int calcTransfer(int reserveMoney, int transferNominal, int transferOption) {
        int transferTotal;

        if (transferOption == 1){
            transferTotal = reserveMoney - transferNominal;
        } else {
            transferTotal = ((reserveMoney - transferNominal) - 7500);
        }

        return transferTotal;
    }

    public static String moneyFormat(int price) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return nf.format( price );
    }
}

