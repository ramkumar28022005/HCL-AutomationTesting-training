package com.bank.transaction;
import java.util.Scanner;
import com.bank.account.Account;
public class Transaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number:");
        int accountNumber = sc.nextInt();
        System.out.println("Enter the account holder name:");
        String accountHolder = sc.next();
        System.out.println("Enter the bank name:");
        String bankName = sc.next();
        Account account = new Account(accountNumber, accountHolder, bankName);
        System.out.println("Account created successfully!");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Bank Name: " + account.getBankName());
        sc.close();
    }
}