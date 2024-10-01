package fundamental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> listEx = new ArrayList();

        listEx.add("String 1");
        listEx.add("String 2");

        listEx.replaceAll(s -> s += "*");

        System.out.println(listEx);
    }
}
