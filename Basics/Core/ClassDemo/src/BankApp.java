public class BankApp {

    String name;
    int age;
    String taxDetail;
    double amount;


    //constructor
    public BankApp(String name){
        this.name = name;
        System.out.println("Constructor called");
    }

    //ask user for age

    public void accAge(int myAge){
        age = myAge;
    }

    public void accTax(String taxDetail){
        this.taxDetail = taxDetail;
    }

    public void depositAmount(double amount){
        this.amount = amount;
    }

    public void getUserInfo(){
        System.out.println("Name of user is: " + this.name);
        System.out.println("Name of balance is: " + amount);
    }
}














