class TestBankAccount {
    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount();
        System.out.println("New Account Number - " + ba1.getAccountNumber());
        ba1.deposite(100.49, "checking");
        ba1.deposite(3.00, "savings");
        ba1.displayAccountBalance();

        System.out.println(BankAccount.allAccountsCombined);
    }
}