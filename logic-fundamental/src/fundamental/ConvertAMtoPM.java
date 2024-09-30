package fundamental;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConvertAMtoPM {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String time;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm aa");
        SimpleDateFormat simpleDateFormatConvert = new SimpleDateFormat("HH:mm");

        System.out.print("Input: ");
        time = scanner.nextLine();

        Date date = simpleDateFormat.parse(time);
        String timeHour = simpleDateFormatConvert.format(date);

        System.out.println("Output: " + timeHour);
    }
}
