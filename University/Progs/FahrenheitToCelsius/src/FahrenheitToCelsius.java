import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String args[]) {

        int temp;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter temp in F: ");

        temp = in.nextInt();

        temp = ((temp -32) * 5)/9;

        System.out.println("Temperature in Celsius is : " + temp);


    }
}
