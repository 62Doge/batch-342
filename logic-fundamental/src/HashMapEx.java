import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> capitalCities = new HashMap<Integer, String>();
        capitalCities.put(1, "Bekasi");
        capitalCities.put(2, "Depok");
        capitalCities.put(3, "Jakarta");

        for (var value : capitalCities.keySet()){
            System.out.print(value + " " + capitalCities.get(value) + " ");

        }

    }
}
