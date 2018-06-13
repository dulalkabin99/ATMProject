package com.company;

import java.util.ArrayList;

public class Transactions {
    private double balance;
    private int acct;
    Account a =new Account();



    public void setAcct(int acct) {
        this.acct = acct;
    }
    public int getAcct() {
        return acct;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public  double checkBalance(int acct) {

        double myBalance;
        myBalance = a.getBalance(acct);
        return myBalance;
    }


/*
    public static double deposit(double depo) {
        double currBalance=checkBalance( acct);
        double newBalance =currBalance+depo;
        return newBalance;

    }

    public static double withdrawl(double withdraw) {
        double currBalance=checkBalance();
        double newBalance =currBalance-withdraw;
        return newBalance;
    }*/


}