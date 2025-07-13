package com.Bharani_K.Assignment_3.Banking;


public class Bank {
    private static int totalAccounts = 0;

    public Bank() {
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}