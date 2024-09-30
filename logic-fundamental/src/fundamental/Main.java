package fundamental;

public class Main {
    public static void main(String[] args) {

        int angka = 5;
        int tambahAngka = 7;

        angka += tambahAngka;

        System.out.println(angka);

        while (angka > 31){
            angka -= 31;
        }

        System.out.println(angka);

    }


}
