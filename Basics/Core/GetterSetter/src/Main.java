
public class Main {

    public static void main(String[] args){

        MyClass john = new MyClass("MyName", 5, 55);

//        john.name = "Ram";
//        System.out.println(john.name);

        john.setAge(4);

        System.out.println(john.getAge());


    }


}


class MyClass {
    private String name = "Jane";
    private int age = 34;
    private int accNo;

    //getter
    public int getAge(){
        return age;
    }

    //setter
    public void setAge(int age){
        this.age = age;
    }

    public MyClass(String name, int age, int accNo) {
        this.name = name;
        this.age = age;
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }


}





