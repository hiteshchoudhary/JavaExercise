public class TryCatch {

    public static void main(String[] args){

        try {
            int[] callArray = {1, 2, 3};

            System.out.println(callArray[3]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Check index value: " + e);
        }

        System.out.println(Integer.parseInt("7u"));

        System.out.println("I am not crashed");

    }



}
