public class GenByYear {
    public static void main(String[] args) {
        int yearOfBirth = 2000;

       calculateGen(yearOfBirth);
    }

    private static void calculateGen(int yearOfBirth) {
        if (yearOfBirth < 1945){
            System.out.println("Pre Boomer");
        } else if (yearOfBirth >= 1946 && yearOfBirth <= 1964) {
            System.out.println("Baby Boomer");
        } else if (yearOfBirth >= 1965 && yearOfBirth <= 1980) {
            System.out.println("Gen X");
        } else if (yearOfBirth >= 1981 && yearOfBirth <= 1996) {
            System.out.println("Gen Milenial");
        } else if (yearOfBirth >= 1997 && yearOfBirth <= 2012) {
            System.out.println("Gen Z");
        } else if (yearOfBirth >= 2013 && yearOfBirth <= 2025) {
            System.out.println("Gen Alpha");
        }
    }

}
