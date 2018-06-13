package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    Scanner sc = new Scanner(System.in);
    private int acctNum;
    private int error = 1;
    private int pin;
    private boolean go;
    private String input = "y";
    private double currBalance;
    private double newBalance;
    private double depo=0;
    private double withdrawl=0;
    public LoginInfo log = new LoginInfo();
    private Transactions t = new Transactions();


    public void login() {

        System.out.println("----Welcome to my ATM---");
        System.out.println("please enter your Account Number: ");
        acctNum = sc.nextInt();
        System.out.println("please enter your PIN Number: ");
        pin = sc.nextInt();

        go = log.checkLogin(acctNum, pin);


        while ((!go) && (error < 3)) {

            System.out.println("wrong combinations, ");

            System.out.println("Attempt" + error);
            error++;
            System.out.println("please enter your Account Number Again: ");
            acctNum = sc.nextInt();
            System.out.println("please enter your PIN Number Again: ");
            pin = sc.nextInt();
            go = log.checkLogin(acctNum, pin);
        }
        if (error >= 3) {
            System.out.println("You are locked Out, Please try again in 3 hours");
        }
        else {
            currBalance = t.checkBalance(acctNum);
            System.out.println("You are logged in, Account Number: " + acctNum);
            while (input.equalsIgnoreCase("y")) {
                t.setAcct(acctNum);

                System.out.println("How can We help?\nEnter 'C'--check Balance, 'W'-- to Withdraw, 'D to deposit");
                input = sc.next();
                if (input.equalsIgnoreCase("c")) {
                    System.out.println("Account Number: " + acctNum);
                    System.out.println("Your Balance =" + currBalance);

                } else if (input.equalsIgnoreCase("d")) {
                    System.out.println("Account Number: " + acctNum);
                    System.out.println("How much you want to deposit?");
                    double d = sc.nextDouble();
                    depo=depo+d;

                    System.out.println("Thank You for your deposit\nYour deposit of " + depo + " is completed.");

                } else if (input.equalsIgnoreCase("w")) {
                    System.out.println("Account Number: " + acctNum);
                    System.out.println("How much you want to withdraw?");
                    double w = sc.nextDouble();
                    withdrawl=withdrawl+w;

                    System.out.println("Thank You for your withdrawl.\nYour Withdrawl of " + withdrawl + " is completed.");

                } else {
                    System.out.println("Invalid input, Please start over Again");
                }
                System.out.println("would you like to make another Transaction?");
                input =sc.next();

            }
            System.out.println("\n---Account Number: " + acctNum+ "---\nThank you for Visiting this ATM.");
            System.out.println();
            newBalance = (currBalance+depo - withdrawl);
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Previous Balance: "+ currBalance + "\nTotal Deposit: "+depo+"\nTotal Withdrawl:"+withdrawl+"\n\nNew balance: "+newBalance);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Would You like to Print Receipt Y/N?");
            String yn =sc.next();
            if (yn.equalsIgnoreCase("y")){
                System.out.println("receipt is printed, Please take your receipt");
            }
            System.out.println("Thank you, hava a good dayyyyyy");

        }
    }
}
