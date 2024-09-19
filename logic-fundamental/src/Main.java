public class Main {
    public static void main(String[] args) {
        int number=15;
        int numbs = 1;
        System.out.println("List of odd numbers from 1 to "+number+": ");

//        for (int i=1; i<=number; i++)
//        {
////            if (i%2!=0)
////            {
////                System.out.print(i + " ");
////            }
//            System.out.println(i);
//        }
        do{
            if (numbs % 2 == 0){
                System.out.println(" Genap " + numbs);
                System.out.println();
            }else{
                System.out.print("Ganjil " + numbs);
            }
            numbs += 1;
        }while (numbs <= number*2);
    }

}
