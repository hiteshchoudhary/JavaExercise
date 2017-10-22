public class Banker {

    private String cName;
    private double cBalance;


    public Banker(String cName, double cBalance) {
        this.cName = cName;
        this.cBalance = cBalance;
    }


    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public double getcBalance() {
        return cBalance;
    }

    public void setcBalance(double cBalance) {
        this.cBalance = cBalance;
    }
}
