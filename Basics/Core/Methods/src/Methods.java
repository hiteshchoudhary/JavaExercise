public class Methods {

    //    public - Visible to everyone
//    private - Visible only to class
//    protected - Visible to the package and all subclass

//    modifier return-type method-name( Parameter list){
//        //body
//    }


    public static void main(String[] args){
        System.out.println("Hello World");
        sayHello();
        sayHello();
        sayHello();

        int numberOne = 7;
        int numberTwo = 5;

//        int result = minimumNumber(numberOne, numberTwo);
//        System.out.println(result);
        System.out.println(minimumNumber(numberOne, numberTwo));

    }

    public static void sayHello(){
        System.out.println("Hello Java");
        System.out.println("How are you?");
    }


    public static int minimumNumber(int num1, int num2){

        int min;
        if (num1 > num2){
            min = num2;
        } else {
            min = num1;
        }

        return min;
    }


}
