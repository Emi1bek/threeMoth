package PractikOne;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount() {
    }

    void addBalance (double var){
       double sum;
       sum=balance+var;
    }
    void takeBalance(double var){
        double sum;
        sum=balance-var;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
