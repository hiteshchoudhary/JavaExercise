public class ArrayExercise {


    public static void main(String args[]){

        //declare int Array
        int[] exerciseArray = {3,77, 4, 2, 7, 3, 4, 5, 44, 33, 22, 66, 22};


        //print array elements
        for (int i = 0; i < exerciseArray.length; i++){
            System.out.println("Element is " + exerciseArray[i]);
        }


        //find the largest number
        int largest = exerciseArray[0];
        for (int i = 1; i < exerciseArray.length; i++){
            if (exerciseArray[i] > largest){
                largest = exerciseArray[i];
            }
        }
        System.out.println("Largest number is " + largest);




        //Sum up all elements
        int sum = 0;
        for (int i = 0; i < exerciseArray.length; i++){
            //sum = sum + exerciseArray[i];
            sum += exerciseArray[i];
        }
        System.out.println("Total is " + sum);


        //TODO: perform same exercise with Double
    }
}
