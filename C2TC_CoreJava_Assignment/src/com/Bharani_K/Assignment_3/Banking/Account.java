package com.Bharani_K.Assignment_3.Banking;

public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accNo, double balance) {
        this.accountNumber = accNo;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    public void showDetails() {
        System.out.println("Account No: " + accountNumber + " | Balance: ₹" + balance);
    }
}