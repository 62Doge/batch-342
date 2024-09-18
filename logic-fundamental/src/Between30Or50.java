public class Between30Or50 {
    public static void main(String[] args) {
        int numOne = 40;
        int numTwo = 34;

        boolean resultBetween = isBetween30Or50(numOne, numTwo);

        System.out.println(resultBetween);

    }

    private static boolean isBetween30Or50(int numOne, int numTwo) {
        boolean isBetween = false;

        if (numOne >= 30 && numOne <= 50 && numTwo >= 30 && numTwo <= 50){
            isBetween = true;
        }

        return isBetween;
    }


}
