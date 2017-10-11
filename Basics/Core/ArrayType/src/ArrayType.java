public class ArrayType {

    public static void main(String args[]){

        int score = 40;

        int[] scoreArray = new int[20];

        int[] anotherScore = {1, 2, 3, 4, 5, 6};


        scoreArray[0] = 5;
        scoreArray[2] = 9;

        //System.out.println(scoreArray[0]);


        for (int i = 0; i < scoreArray.length; i++){
            scoreArray[i] = i * 10;
        }

//        System.out.println(scoreArray[0]);
//        System.out.println(scoreArray[1]);
//        System.out.println(scoreArray[12]);

        for (int i = 0; i< scoreArray.length; i++){
            System.out.println(scoreArray[i]);
        }

    }


}
