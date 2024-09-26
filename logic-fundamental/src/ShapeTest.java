import model.*;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        double result;
        int sisi = 0;
        int alas = 0;
        int radius = 0;
        int diagonal = 0;
        Shape persegi = new Square();
        Shape persegiPanjang = new Rectangle();
        Shape segitigaSikuSiku = new RightTriangle();
        Shape segitigaSamaKaki = new IsoscelesTriangle();
        Shape lingkaran = new Circle();
        Shape jajarGenjang = new Parallelogram();



        do {
            printMenu();
            System.out.print("Input menu: ");
            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    //persegi
                    persegi.setName("Persegi");
                    System.out.println(persegi);
                    System.out.print("Input Sisi: ");
                    sisi = scanner.nextInt();

                    persegi.setVertical(sisi);
                    result = persegi.area();
                    System.out.println("Luas : " + result);

                    result = persegi.perimeter();
                    System.out.println("Keliling : " + result);
                    break;
                case 2:
                    //persegi panjang
                    persegiPanjang.setName("Persegi Panjang");
                    System.out.println(persegiPanjang);
                    System.out.print("Input panjang : ");
                    sisi = scanner.nextInt();
                    persegiPanjang.setVertical(sisi);

                    System.out.print("Input lebar : ");
                    alas = scanner.nextInt();
                    persegiPanjang.setHorizontal(alas);

                    result = persegiPanjang.area();
                    System.out.println("Luas : " + result);

                    result = persegiPanjang.perimeter();
                    System.out.println("Keliling : " + result);
                    break;
                case 3:
                    //segitiga siku-siku
                    segitigaSikuSiku.setName("Segitiga siku-siku");
                    System.out.println(segitigaSikuSiku);
                    System.out.print("Input alas : ");
                    alas = scanner.nextInt();
                    segitigaSikuSiku.setHorizontal(alas);

                    System.out.print("Input tinggi : ");
                    sisi = scanner.nextInt();
                    segitigaSikuSiku.setVertical(sisi);

                    System.out.print("Input diagonal : ");
                    diagonal = scanner.nextInt();
                    segitigaSikuSiku.setDiagonal(diagonal);

                    result = segitigaSikuSiku.area();
                    System.out.println("Luas : " + result);

                    result = segitigaSikuSiku.perimeter();
                    System.out.println("Keliling : " + result);
                    break;
                case 4:
                    //segitiga sama kaki
                    segitigaSamaKaki.setName("Segitiga sama kaki");
                    System.out.println(segitigaSamaKaki);
                    System.out.print("Input alas : ");
                    alas = scanner.nextInt();
                    segitigaSamaKaki.setHorizontal(alas);

                    System.out.print("Input tinggi : ");
                    sisi = scanner.nextInt();
                    segitigaSamaKaki.setVertical(sisi);

                    result = segitigaSamaKaki.area();
                    System.out.println("Luas : " + result);

                    result = segitigaSamaKaki.perimeter();
                    System.out.println("Keliling : " + result);
                    break;
                case 5:
                    //lingkaran
                    lingkaran.setName("Lingkaran");
                    System.out.println(lingkaran);
                    System.out.print("Input jari-jari : ");
                    radius = scanner.nextInt();
                    lingkaran.setRadius(radius);

                    result = lingkaran.area();
                    System.out.println("Luas : " + result);

                    result = lingkaran.perimeter();
                    System.out.println("Keliling : " + result);
                    break;
                case 6:
                    //jajar genjang
                    jajarGenjang.setName("Jajar genjang");
                    System.out.println(jajarGenjang);
                    System.out.print("Input alas : ");
                    alas = scanner.nextInt();
                    jajarGenjang.setHorizontal(alas);

                    System.out.print("Input alas (lainnya) : ");
                    alas = scanner.nextInt();
                    jajarGenjang.setDiagonal(alas);

                    System.out.print("Input tinggi : ");
                    sisi = scanner.nextInt();
                    jajarGenjang.setVertical(sisi);

                    result = jajarGenjang.area();
                    System.out.println("Luas : " + result);

                    result = jajarGenjang.perimeter();
                    System.out.println("Keliling : " + result);
                    break;
                default:
                    System.out.println("Tidak ada menu yang sesuai");
            }

        } while (menu != 7);
    }

    public static void printMenu(){
        System.out.println("=====Shape=====");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga siku-siku");
        System.out.println("4. Segitiga sama kaki");
        System.out.println("5. Lingkaran");
        System.out.println("6. Jajar Genjang");
        System.out.println("7. Exit");
    }

}
