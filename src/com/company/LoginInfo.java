package com.company;

import java.util.HashMap;

public class LoginInfo {
     HashMap<Integer , Integer> hmap = new HashMap<Integer, Integer>();

        public LoginInfo() {
            hmap.put(1001, 2143);
            hmap.put(1002, 2158);
            hmap.put(1003, 9124);

        }
    public  boolean checkLogin (int acct, int pin){


            if (hmap.containsKey(acct)) {
                int p = hmap.get(acct);
                if (p == pin) {
                    return true;
                } else return false;
            }
            else return false;
    }


    }


