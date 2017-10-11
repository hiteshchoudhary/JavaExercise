public class DataTypes {


    public static void main(String[] args){
        System.out.println("New Module");

//        byte  - -128 : 127
//        short - -32768 : 32767
//        int   - -2,147,483,648
//        long  -  9,223,372,036,854,775,808
//
//        float - 231.2f
//        double - 231.23
//        boolean - true/false
//        char - 'Z'
//        String


//        byte myByte = 127;
//        System.out.println(myByte);

        int mInt = 22 / 7;
        float mFloat =  22 / 7f;
        double mDouble = 22 / 7d;




        System.out.println("Int value is: " + mInt);
        System.out.println("Float value is: " + mFloat);
        System.out.println("Double value is: " + mDouble);


        boolean isActive = false;

        System.out.println(isActive);

        char mChar = 'A';

        String myValue = Integer.toHexString(mChar);

        System.out.println(myValue);


        char mUniCode = '\u0080';

        System.out.println(mUniCode);


        String mString = "   I am a String    ";
        System.out.println("Answer is: " + mString);

        String fakeValue = "22.987";
        String fakeValueTwo = "33.8";

        System.out.println(mString + " " + fakeValueTwo);

        System.out.printf(mString.trim());



    }
}










