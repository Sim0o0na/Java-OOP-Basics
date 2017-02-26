import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Simona Simeonova on 21-Feb-17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        while(true){
            String[] command = scan.readLine().split(" ");
            if(command[0].equals("End")){
                break;
            }
            if(command[0].equals("Create")){
                BankAccount account = new BankAccount();
                accounts.put(account.getId(), account);
                System.out.printf("Account %s created\n", account);
            }
            if(command[0].equals("Deposit")){
                int id = Integer.valueOf(command[1]);
                double amount = Double.valueOf(command[2]);
                if(accounts.containsKey(id)){
                    accounts.get(id).deposit(amount);
                    BankAccount account = accounts.get(id);
                    System.out.printf("Deposited %s to %s\n", (int)amount, account);
                }else{
                    System.out.println("Account does not exist");
                }
            }
            if(command[0].equals("SetInterest")){
                double amount = Double.valueOf(command[1]);
                BankAccount.setInterestRate(amount);
            }
            if(command[0].equals("GetInterest")) {
                int id = Integer.valueOf(command[1]);
                int years = Integer.valueOf(command[2]);
                if(accounts.containsKey(id)){
                    double interest =  accounts.get(id).getInterestRate(years);
                    System.out.printf("%.2f\n", interest);
                }else{
                    System.out.println("Account does not exist");
                }

            }
        }
    }
//    private static void create(HashMap<Integer, BankAccount> accounts, Integer key){
//        if(accounts.containsKey(key)){
//            System.out.println("Account already exists");
//        }else{
//            BankAccount account = new BankAccount();
//            account.setId(key);
//            accounts.put(key, account);
//        }
//    }
//
//    private static void deposit(HashMap<Integer, BankAccount> accounts, Integer key, Double amount){
//        if(!accounts.containsKey(key)){
//            System.out.println("Account does not exist");
//        }else {
//            accounts.get(key).deposit(amount);
//        }
//    }
//
//    private static void withdraw(HashMap<Integer, BankAccount> accounts, Integer key, Double amount){
//        if(!accounts.containsKey(key)){
//            System.out.println("Account does not exist");
//        }else{
//            try{
//                accounts.get(key).withdraw(amount);
//            }catch(IllegalArgumentException iae){
//                System.out.println("Insufficient balance");
//            }
//        }
//    }
//
//    private static void print(HashMap<Integer, BankAccount> accounts, Integer key) {
//        if(!accounts.containsKey(key)){
//            System.out.println("Account does not exist");
//        }else{
//            System.out.printf("Account %s, balance %.2f \n", accounts.get(key),
//                    accounts.get(key).getBalance());
//        }
//    }
}

