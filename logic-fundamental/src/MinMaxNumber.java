public class MinMaxNumber {
    public static void main(String[] args) {
        int satu = 9;
        int dua = 4;
        int tiga = 5;
        int empat = 6;

        minMax(satu, dua, tiga, empat);
    }

    public static void minMax(int satu, int dua, int tiga, int empat){
        int min = satu;
        int max = satu;

        if (dua < min){
            min = dua;
        } else if (tiga < min) {
            min = tiga;
        } else if (empat < min) {
            min = empat;
        }
        System.out.println("Min : " + min);

        if (dua > max){
            max = dua;
        } else if (tiga > max) {
            max = tiga;
        } else if (empat > max) {
            max = empat;
        }
        System.out.println("Max : " + max);
    }


}
