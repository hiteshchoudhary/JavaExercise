import java.util.Scanner;

public class LagestOfThree {

    public static void main(String args[]) {


        int numberOne, numberTwo, numberThree;

        System.out.println("Please Enter three numbers");

        Scanner in  = new Scanner(System.in);

        numberOne = in.nextInt();
        numberTwo = in.nextInt();
        numberThree = in.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree){
            System.out.println(numberOne + " is the largest of all numbers");
        }

        if (numberTwo > numberOne && numberTwo > numberThree){
            System.out.println(numberTwo + " is the largest of all numbers");
        }
        if (numberThree > numberOne && numberThree > numberTwo) {
            System.out.println(numberThree + " is the largest of all numbers");
        }
        //TODO: check if all numbers are equal


    }
}










