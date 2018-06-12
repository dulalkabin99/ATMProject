package com.company;

import java.util.ArrayList;

public class Transactions {
    private double balance;
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public static double checkBalance() {
        double myBalance =100;
        return myBalance;
    }

    public static double deposit(double depo) {
        double currBalance=checkBalance();
        double newBalance =currBalance+depo;
        return newBalance;

    }

    public static double withdrawl(double withdraw) {
        double currBalance=checkBalance();
        double newBalance =currBalance-withdraw;
        return newBalance;
    }


}