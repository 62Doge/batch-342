import java.util.*;

public class StringManipulation {
//    String literal
//            escape character in characters
//            Creating string object
//            Length of strings -> string.length()

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata/kalimat: ");
        String inputStrings = scanner.nextLine();
        inputStrings = inputStrings.trim().toLowerCase();
        String[] vocalArr = new String[inputStrings.length()];
        String[] consonantArr = new String[inputStrings.length()];

        for (int i = 0; i < inputStrings.length(); i++) {
            if (inputStrings.charAt(i) == ' '){
                continue;
            }

            if (inputStrings.charAt(i) == 'a' || inputStrings.charAt(i) == 'i' ||
                    inputStrings.charAt(i) == 'u' || inputStrings.charAt(i) == 'e' || inputStrings.charAt(i) == 'o') {
                vocalArr[i] = String.valueOf(inputStrings.charAt(i));
            } else {
                consonantArr[i] = String.valueOf(inputStrings.charAt(i));
            }
        }

        Arrays.sort(vocalArr, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
        for (String vocal : vocalArr){
            if (vocal != null){
                System.out.print(vocal);
            }
        }
        System.out.println();
        Arrays.sort(consonantArr,Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER));
        for (String consonant : consonantArr){
            if (consonant != null){
                System.out.print(consonant);
            }
        }

    }
}
