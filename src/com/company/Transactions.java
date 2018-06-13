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
}