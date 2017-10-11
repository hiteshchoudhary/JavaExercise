import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateDayFinder {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter date (1-31): ");
        int dd = in.nextInt();

        System.out.println("Enter Month (1-12): ");
        int mm = in.nextInt()-1;

        System.out.println("Enter year: ");
        int yy = in.nextInt();


        Date date = (new GregorianCalendar(yy, mm, dd)).getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String day = sdf.format(date);
        System.out.println(day);
    }


}
