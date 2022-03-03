package com.company;

public class Family {
    String fatherName;
    String motherName;
    String sonName;
    String daughterName;
    int fatherSalary;
    int motherSalary;
    int sonFee;
    int daughterFee;
    int grocery = 500;

    public Family() {
        System.out.println("constructor with 'NO' parameters is called");
        this.fatherName = null;
        this.motherName = null;
        this.sonName = null;
        this.daughterName = null;
        this.fatherSalary = 0;
        this.motherSalary = 0;
        this.sonFee = 0;
        this.daughterFee = 0;
    }

    public Family(String fatherName, String motherName, String sonName, String daughterName, int fatherSalary, int motherSalary, int sonFee, int daughterFee) {
        System.out.println("constructor with ALL THE parameters is called");
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.sonName = sonName;
        this.daughterName = daughterName;
        this.fatherSalary = fatherSalary;
        this.motherSalary = motherSalary;
        this.sonFee = sonFee;
        this.daughterFee = daughterFee;
    }

    public void printNames() {
        System.out.println("Name of Father is " + fatherName);
        System.out.println("Name of Mother is " + motherName);
        System.out.println("Name of Son is " + sonName);
        System.out.println("Name of Daughter is " + daughterName);
    }

    public int totalSalary() {
        return motherSalary + fatherSalary;
    }

    public int totalFee() {
        return sonFee + daughterFee;
    }

    public int totalSavings() {
        return (fatherSalary + motherSalary - sonFee - daughterFee - grocery);
    }

    public void checkSavings() {
        int saving = totalSavings();
        if (saving > 1000) System.out.println("Congratulation!!" + fatherName + "you saved this much " + saving);
    }
}

