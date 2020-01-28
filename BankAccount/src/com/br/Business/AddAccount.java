package com.br.Business;

import com.br.entities.Account;

import java.util.List;

public class AddAccount {

    public static void addElement(List<Account> acc, int accountNumber, String holder, double balance, double whithdrawLimit)
    {
        acc.add(new Account(accountNumber, holder, balance, whithdrawLimit));
    }
}
