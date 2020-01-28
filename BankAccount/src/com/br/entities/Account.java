package com.br.entities;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;
    private String holder;
    protected double balance;
    private double whithdrawLimit;

    public Account(int accountNumber, String holder, double balance, double whithdrawLimit) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        this.whithdrawLimit = whithdrawLimit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWhithdrawLimit() {
        return whithdrawLimit;
    }

    public static void generateList(List<Account> acc)
    {
        if(acc == null){
            acc = new ArrayList<>();
        }
    }

    public String toString(List<Account> accounts, int position)
    {
        return "account number: " + accounts.get(position).accountNumber + "\n" +
                "holder: " + accounts.get(position).holder + "\n" +
                "balance: " + accounts.get(position).balance + "\n" +
                "whithdraw limit: " + accounts.get(position).whithdrawLimit;
    }
}
