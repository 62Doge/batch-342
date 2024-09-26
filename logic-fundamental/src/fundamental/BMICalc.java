package fundamental;

public class BMICalc {
    public static void main(String[] args) {
        int weight = 80;
        int height = 178;

        int bmiResult = (int) calculateBMI(weight, height);

        if (bmiResult < 18){
            System.out.println("Underweight");
        } else if (bmiResult <= 25) {
            System.out.println("Normal range");
        } else if (bmiResult <= 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

    public static double calculateBMI(int weight, int height){
        double result;
        double castHeight = height * 0.01;

        result = weight / (castHeight * castHeight);

        return result;
    }
}
