import java.util.HashMap;
import java.util.Scanner;

public class Plate {
    // 1 orang dewasa laki laki memakan 2 piring nasi goreng
    // 1 orang dewasa perempuan memakan 1 piring mie goreng
    // 2 orang remaja memakan 2 mangkok mie ayam
    // 1 orang anak anak memakan 1/2 piring nasi goreng
    // 1 orang balita memakan 1 mangkok kecil bubur sehat
    // Berapa total porsi makanan yang dimakan?
    // Constraint
    // jika total yang sedang makan jumlahnya ganjil lebih dari 5 orang maka tiap orang dewasa perempuan tambah 1 piring nasi goreng
    // inputan bisa saja acak (misal : laki laki dewasa 3, balita 2, laki laki dewasa 3, balita 2, perempuan dewasa 3)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> customer = new HashMap<>();
        String gender;
        int menu;
        int persons = 0;
        int totalPerson = 0;

        do {
            printMenu();
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();
            switch (menu){
                case 1:
                    gender = "Laki - laki";
                    addPlates(customer, gender, scanner, totalPerson);
                    break;
                case 2:
                    gender = "Perempuan";
                    addPlates(customer, gender, scanner, persons);
                    break;
                case 3:
                    gender = "Remaja";
                    addPlates(customer, gender, scanner, persons);
                    break;
                case 4:
                    gender = "Anak - anak";
                    addPlates(customer, gender, scanner, persons);
                    break;
                case 5:
                    gender = "Balita";
                    addPlates(customer, gender, scanner, persons);
                    break;
                case 6:
                    printData(customer);
                    System.out.println("Total Porsi : " + calcPlates(customer));
                    break;
                case 7:

                    break;
                case 8:
                    printData(customer);
                    break;
                default:
                    System.out.print("Tidak ada menu yang sesuai");
                    break;
            }
        }while (menu != 7);



    }

    public static void printData(HashMap<String, Double> customer){
        customer.entrySet().stream()
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

    }
    private static double calcPlates(HashMap<String, Double> customer) {
        double totalPlates = 0;
        int totalPerson = 0;

        for (double total : customer.values()) {
            totalPerson += total;
        }

        if (totalPerson > 5 && totalPerson % 2 == 1 && customer.containsKey("Perempuan")) {
            customer.put("Perempuan", customer.get("Perempuan") + customer.get("Perempuan"));
        }

        if (customer.containsKey("Laki - laki")) {
            totalPlates += customer.get("Laki - laki") * 2;
        }
        if (customer.containsKey("Perempuan")) {
            totalPlates += customer.get("Perempuan");
        }
        if (customer.containsKey("Remaja")) {
            totalPlates += customer.get("Remaja");
        }
        if (customer.containsKey("Anak - anak")) {
            totalPlates += customer.get("Anak - anak") * 0.5;
        }
        if (customer.containsKey("Balita")) {
            totalPlates += customer.get("Balita");
        }

        return totalPlates;
    }

    private static void addPlates(HashMap<String, Double> customer, String gender, Scanner scanner, double totalPerson) {
        System.out.print(gender + " (total porsi): ");
        totalPerson = scanner.nextInt();

        if (customer.containsKey(gender)){
            customer.put(gender, customer.get(gender) + totalPerson);
        } else {
            customer.put(gender, totalPerson);
        }
    }

    public static void printMenu(){
        System.out.println("===Resto===");
        System.out.println("1. Laki - laki Dewasa");
        System.out.println("2. Perempuan Dewasa");
        System.out.println("3. Remaja");
        System.out.println("4. Anak - Anak");
        System.out.println("5. Balita");
        System.out.println("6. Hitung Total Porsi");
        System.out.println("7. Exit");
    }
}
