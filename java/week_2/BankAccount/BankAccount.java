/*
Create a BankAccount class.
The class should have the following attributes: (double) checking balance, (double) savings balance.
Create a class member (static) that has the number of accounts created thus far.
Create a class member (static) that tracks the total amount of money stored in every account created.
In the constructor, be sure to increment the account count.
*/
import java.util.Random;

class BankAccount {

    // Member Variables

    // Static
    public static int numberOfAccounts = 0;
    public static double allAccountsCombined = 0.0; 

    // Ninja 
    /*
    NINJA BONUS: Add the the following class attribute: account number. The type is up to you, can be a String or a Long or another type.
    NINJA BONUS: Create a private method that returns a random ten digit account number.
    NINJA BONUS: In the constructor, call the private method from above so that each user has a random ten digit account.
    */

    private static int generateId() {
        Random randGenerator = new Random();
        int randmonId = randGenerator.nextInt(1000000000) + 999999999;
        return randmonId;
    }

    // Instance 
    private int accountNumber;
    private double checkingBalance;
    private double savingsBalace;

    public BankAccount() {
        BankAccount.numberOfAccounts += 1;
        this.checkingBalance = 0;
        this.savingsBalace = 0;
        this.accountNumber = BankAccount.generateId();
    }

    // GETTER METHODS 

    // Create a getter method for the user's checking account balance.
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    // Create a getter method for the user's saving account balance.
    public double getSavingsBalance() {
        return this.savingsBalace;
    }

    // getter method of account #
    public int getAccountNumber() {
        return this.accountNumber;
    }

    // Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
    public void deposite(double amount, String account) {
        if(account.equals("savings")) {
            this.savingsBalace += amount;
        }
        else if(account.equals("checking")) {
            this.checkingBalance += amount;
        }
    }

    public void widthdrawMoney(double amount, String account) {
        boolean successful = false;
        if(account.equals("savings")) {
            if(this.savingsBalace - amount >= 0) {
                successful = true;
                this.savingsBalace -= amount;
            }
            else if(account.equals("checking")) {
                if(this.checkingBalance - amount >= 0) {
                    successful = true;
                    this.checkingBalance -= amount;
                }
            }
            if(successful) {
                BankAccount.allAccountsCombined -= amount;
            }
            else {
                System.out.println("Insufficient funds.");
            }
        }
    }

    public void displayAccountBalance() {
        System.out.println(String.format("Savings: %2f, Checking: %2f", this.savingsBalace, this.checkingBalance));
    }

}