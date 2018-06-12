package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    Scanner sc = new Scanner(System.in);
    int acctNum;
    int error = 1;
    int pin;
    boolean go;
    String input;
    LoginInfo log = new LoginInfo();

    public void login() {

        System.out.println("----Welcome to my ATM---");
        System.out.println("please enter your Account Number: ");
        acctNum = sc.nextInt();
        System.out.println("please enter your PIN Number: ");
        pin = sc.nextInt();

        go = log.checkLogin(acctNum, pin);

            while ((!go) && (error < 3)) {

                System.out.println("wrong combinations, ");
                error++;
                System.out.println("Attempt" + error);
                System.out.println("please enter your Account Number Again: ");
                acctNum = sc.nextInt();
                System.out.println("please enter your PIN Number Again: ");
                pin = sc.nextInt();
                go = log.checkLogin(acctNum, pin);
            }
        if (error>=3) {
            System.out.println("You are locked Out");
        } else {
while
            System.out.println("You are logged in, Account Number: " + acctNum);
            System.out.println("What do you need today?\nEnter 'C'--check Balance, 'W'-- to Withdraw, 'D to deposit");
            input=sc.next();
            if (input.equalsIgnoreCase("c")){

            }
             else if (input.equalsIgnoreCase("w")) {

            }
            else if (input.equalsIgnoreCase("d")){

            }
            else {
                System.out.println("Invalid input, Please start over Again");
            }
    }
}
