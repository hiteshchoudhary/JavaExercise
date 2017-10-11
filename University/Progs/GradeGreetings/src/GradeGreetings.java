public class GradeGreetings {


    public static void main(String args[]) {


        //TODO: Take input from user and assign it to grade
        char grade = 'A';

        switch (grade){

            case 'A':
                System.out.println("Amazing work there. Keep going");
                break;
            case 'B':
                System.out.println("You can do better");
                break;
            case 'C':
                System.out.println("Little more hard work, buddy");
                break;
            case 'D':
                System.out.println("Ohh boy, get serious");
                break;
            case 'E':
                System.out.println("Almost got failed, somehow just got it");
                break;
            case 'F':
                System.out.println("You need to focus on studies");
                break;
            default:
                System.out.println("Grade can only be A to F");
        }


        //TODO: WAP for a star to 5 star rating system


    }
}
