/**
 * Created by Simona Simeonova on 21-Feb-17.
 */
public class BankAccount {
    private static final double DEFAULT_INTEREST_RATE = 0.02;


    private static int accountsCount;
    private static double currentInterest = DEFAULT_INTEREST_RATE;

    private int id;
    private double balance;

    public BankAccount(){
        id= ++accountsCount;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

    public static void setInterestRate(double interestRate){
        currentInterest = interestRate;
    }

    public double getInterestRate(int years){
        return this.balance * years * currentInterest;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString(){
        return "ID" + this.id;
    }
}
