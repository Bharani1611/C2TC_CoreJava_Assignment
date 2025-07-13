package com.Bharani_K.Assignment_3.Banking;

public class CheckingAccount extends Account {

    public CheckingAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("❌ Overdraft not allowed");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}