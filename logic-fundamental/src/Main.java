public class Main {
    public static void main(String[] args) {

        System.out.println(solution(5, false));

    }

    public static String solution(int day, boolean vacation) {
        String result = null;
        if (vacation){
            if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5){
                result = "10:00";
            } else {
                result = "off";
            }
        } else if (!vacation) {
            if (day == 0 || day == 6){
                result = "10:00";
            } else {
                result = "7:00";
            }
        }

        return result;
    }

}
