import java.util.Scanner;

public class Factorial {

    public static void main(String args[]) {

        int number;
        int factorial = 1;

        System.out.println("Enter a number for Factorial: ");

        Scanner in = new Scanner(System.in);

        number = in.nextInt();

        if (number < 0){
            System.out.println("PLease enter a number greater than 0");
        }
        else {
            for (int l = 1; l <= number; l++){
                factorial = factorial * l;
            }
        }
        System.out.println("Factorial is: " + factorial);
    }
}








