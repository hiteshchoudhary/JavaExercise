import java.util.ArrayList;

public class ArrayListSample {


    public static void main(String args[]){

//        String[] stringArray = new String[10];
//        stringArray[0] = "delhi";
//
//        System.out.println(stringArray[0]);

        //Array list


        ArrayList<String> heroes = new ArrayList<String>();

        heroes.add("Hulk");
        heroes.add("Iron Man");
        heroes.add("Batman");
        heroes.add(0, "Capt. America");


        System.out.println("My super hero is: " + heroes.get(0));
        System.out.println("My super hero is: " + heroes.get(1));
        System.out.println("My super hero is: " + heroes.get(2));


    }
}
