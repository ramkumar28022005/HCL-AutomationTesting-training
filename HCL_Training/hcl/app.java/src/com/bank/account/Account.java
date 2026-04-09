package com.bank.account;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private String bankName;

    public Account(int accountNumber, String accountHolder, String bankName) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.bankName = bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getBankName() {
        return bankName;
    }
}
