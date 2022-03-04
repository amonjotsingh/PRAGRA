package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("this is trying to commit to master to use as merge");
        System.out.println("hey");
        System.out.println("I own this ");
        String s = "ASSIGNMENT";
        char arr[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
            System.out.print(arr[i]);
        }
        System.out.println("");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(arr[s.length() - i - 1]);
        }
    }
}