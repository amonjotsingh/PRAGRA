package com.company;

public class Main {

    public static void main(String[] args) {
        String n;
        player jot = new player();
        player hary = new player("hary", 19, 6.2f);
        System.out.println(hary.eligibility());
        System.out.println(jot.eligibility());
    }
}
