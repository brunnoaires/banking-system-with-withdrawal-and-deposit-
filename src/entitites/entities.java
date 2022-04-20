package entitites;

public class entities {

    private int numc;
    private String holder;
    private double balance;

    public entities(int number, String holder){
        this.numc = numc;
        this.holder = holder;
    }

    public entities(int numc, String holder, double initialDeposit) {
        this.numc = numc;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumc() {
        return numc;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return  balance;
    }

    public void deposit(double amount) {
         balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString(){
        return "Account: "
                + numc
                + ", Holder: "
                + holder
                + ", Balance: $"
                + String.format("%.2f", balance);
   }
}
