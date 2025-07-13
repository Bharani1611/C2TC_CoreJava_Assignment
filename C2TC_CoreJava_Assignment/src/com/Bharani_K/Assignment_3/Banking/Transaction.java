package com.Bharani_K.Assignment_3.Banking;

public class Transaction {
    public final double transactionFee = 10.0;

    public final void performTransaction(Account account, String type, double amount) {
        System.out.println("▶️ Transaction: " + type + " ₹" + amount);

        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount - transactionFee);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount + transactionFee);
        } else {
            System.out.println("❌ Invalid transaction type");
        }

        System.out.println("💰 Balance after transaction: ₹" + account.getBalance());
    }
}