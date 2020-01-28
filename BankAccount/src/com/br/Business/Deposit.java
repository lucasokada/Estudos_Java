package com.br.Business;

import com.br.entities.Account;

import java.util.List;

public class Deposit extends Account{

    public Deposit(int accountNumber, String holder, double balance, double whithdrawLimit) {
        super(accountNumber, holder, balance, whithdrawLimit);
    }

    public static int findHolder(List<Account> accounts , String name)
    {
        int i=0;
        boolean achou = false;

        while(achou != true)
        {
            if(accounts.get(i).getHolder().equals(name)){
                achou = true;
            }
            i++;
        }

        if(achou != false){
            return i-1;
        }else{
            return -1;
        }
    }

    public void makeDeposit(double value)
    {
        balance += value;
    }
}
