
class Banker{
    private String name;

    public Banker(String name) {
        this.name = name;
    }

    public String greet(){
        return "Default greetings\n";
    }

}

class SBIBank extends Banker{
    public SBIBank() {
        super("SBIBANK");
    }

    @Override
    public String greet() {
        return "Welcome to SBI BANK\n";
    }
}

class BOABank extends Banker{
    public BOABank() {
        super("BOA Bank");
    }

    @Override
    public String greet() {
        return "Welcome to BOA\n";
    }
}

class MyBank extends Banker{
    public MyBank() {
        super("MyBANK");
    }

    @Override
    public String greet() {
        return "Welcome to my bank\n";
    }
}




public class Main {
    public static void main(String[] args){
        for (int i = 1; i< 5; i++){
            Banker banker = GenerateObjects();
            System.out.printf("Bank greet is: " + banker.greet());
        }
    }

    public static Banker GenerateObjects(){
        int random =  (int)(Math.random()* 3) + 1;
        //System.out.println(random);
        switch (random) {
            case 1:
                return new SBIBank();
                //break;
            case 2:
                return new BOABank();
                //break;
            case 3:
                return new MyBank();
                //break;
            default:
                return null;
                //break;

        }
    }



}
















