import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args){

//        Banker john = new Banker("John", 2999.44);
//        Banker Jane;
//        Jane = john;
//
//        Jane.setcBalance(5.1);
//
//        System.out.println(john.getcBalance());

        ArrayList<Integer> myIntList = new ArrayList<>();

        myIntList.add(5);
        myIntList.add(7);
        myIntList.add(8);
        myIntList.add(9);


        for (int i=0; i<myIntList.size(); i++){
            System.out.println(i + " --- " + myIntList.get(i));
        }

        myIntList.add(1, 6);
        System.out.println("--------------------------");

        for (int i=0; i<myIntList.size(); i++){
            System.out.println(i + " --- " + myIntList.get(i));
        }



//        LinkedList example here


        LinkedList<String> programming = new LinkedList<>();


        programming.add("C");
        programming.add("Java");
        programming.add("Python");


        //Iterators
       pllist(programming);

        programming.add(1, "swift");

        pllist(programming);


    }


    public static void pllist(LinkedList<String> ll){
        Iterator<String> i = ll.iterator();
        while (i.hasNext()){
            System.out.println("Your language is : " + i.next());
        }
    }


}










