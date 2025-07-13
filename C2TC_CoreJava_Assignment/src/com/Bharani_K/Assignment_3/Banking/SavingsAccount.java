package com.Bharani_K.Assignment_3.Banking;

public class SavingsAccount extends Account {

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("❌ Insufficient balance");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}