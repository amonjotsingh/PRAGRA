package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("THIS CHANGE IS MADE TO NEWBRANCH AND MERGED TO MASTER ");
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