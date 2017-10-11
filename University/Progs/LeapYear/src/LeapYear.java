public class LeapYear {

    public static void main(String args[]) {

        int year = 2008;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println( year + " is a leap year");
        } else {
            System.out.println( year + " is NOT leap year");
        }


    }
}




//2 tests:
//        1. divide a number by 400, no remainder  - Leap
//        2.1 divide it by 4, no remainder
//        2.2 divide it by 100, should be a remainer
//
//
//
//        (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)