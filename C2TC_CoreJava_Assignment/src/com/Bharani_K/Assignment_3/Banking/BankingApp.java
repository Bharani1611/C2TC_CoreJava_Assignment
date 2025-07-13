package com.Bharani_K.Assignment_3.Banking;

public class BankingApp {
    public static void main(String[] args) {
        // Static counter test
        Bank b1 = new Bank();
        Bank b2 = new Bank();
        System.out.println("🏦 Total Accounts: " + Bank.getTotalAccounts());

        // Abstract class test
        Account sAcc = new SavingsAccount("SA1001", 5000);
        Account cAcc = new CheckingAccount("CA2001", 3000);

        sAcc.showDetails();
        cAcc.showDetails();

        // Final method test
        Transaction txn = new Transaction();
        txn.performTransaction(sAcc, "deposit", 1000);
        txn.performTransaction(cAcc, "withdraw", 500);
    }
}
