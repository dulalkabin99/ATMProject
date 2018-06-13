package com.company;
import java.util.HashMap;



public class Account {

private int accountNum;
private int PINNum;
private String userName;
private double balance;
private HashMap<Integer , Double> hmap = new HashMap<Integer, Double>();


    public Account() {
        hmap.put(1001, 21.43);
        hmap.put(1002, 2122.33);
        hmap.put(1003, 245671.3);

    }
    /*


    public int getAccountNum() {
        return accountNum;
    }

  public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }
    public int getPINNum() {
        return PINNum;
    }

    public void setPINNum(int PINNum) {
        this.PINNum = PINNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }*/

    public double getBalance(int acct) {
        balance = hmap.get(acct);
        return balance;
    }

    /*public void setBalance(double balance) {
        this.balance = balance;
    }*/
}
