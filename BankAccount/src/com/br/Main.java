package com.br;

import com.br.Business.AddAccount;
import com.br.Business.Deposit;
import com.br.entities.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Account> accounts = new ArrayList<>();

        int option = 0;

        Account.generateList(accounts);
        
            do {
                menu();
                System.out.println("enter the desired option");
                option = input.nextInt();

                try {
                    options(option, accounts);

                }catch (NullPointerException exception){
                    System.out.println(exception.getMessage());
                }

            } while (option >= 1 && option < 4);
        
    }

    public static void options(int option, List<Account> accounts)
    {
        Scanner input = new Scanner(System.in);

        switch (option){
            case 1:
                System.out.println("enter the acconunt number");
                int number = input.nextInt();
                System.out.println("enter the holder");
                input.nextLine();
                String holder = input.nextLine();
                System.out.println("enter the balance");
                double balance = input.nextDouble();
                System.out.println("enter the whithdrawlimit");
                double withdrawLimit = input.nextDouble();
                AddAccount.addElement(accounts, number, holder, balance, withdrawLimit);
                break;
            case 2:
                for(int i=0 ; i < accounts.size(); i++)
                {
                    System.out.println("----------------------------------------");
                    System.out.println(accounts.get(i).toString(accounts, i));
                }
                break;
            case 3:
                System.out.println("enter the holder:");
                holder = input.nextLine();
                int position = Deposit.findHolder(accounts, holder);
        }
    }

    public static void menu()
    {
        System.out.println("-------------------MENU-------------------");
        System.out.println("1 - add new account");
        System.out.println("2 - show informations");
        System.out.println("3 - deposit");
        System.out.println("4 - withdraw");
        System.out.println("------------------------------------------");
    }
}
