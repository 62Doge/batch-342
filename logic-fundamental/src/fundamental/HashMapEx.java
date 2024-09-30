package fundamental;

import java.util.HashMap;

public class HashMapEx {
    public static HashMap<Integer, String> capitalCities = new HashMap<>();
    static {
        capitalCities.put(1, "Bekasi");
        capitalCities.put(2, "Depok");
        capitalCities.put(3, "Jakarta");
    }

    public static void main(String[] args) {





        for (var value : capitalCities.keySet()){
            System.out.print(value + " " + capitalCities.get(value) + " ");

        }
        System.out.println();
        HashMap<Integer, String> cities = new HashMap<>();
        cities.put(1, capitalCities.get(1));
        cities.put(2, capitalCities.get(2));
        cities.put(3, capitalCities.get(3));

        for (var value: cities.keySet()){
            System.out.println(value + " " + cities.get(value) + " ");
        }

    }
}
