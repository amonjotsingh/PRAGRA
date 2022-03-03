package com.company;

public class person {
    private String firstname;
    private String lastname;
    private int age;
    private String address;

    public person() {
        System.out.println(" constructor without parameters is called ");
        this.firstname = null;
        this.lastname = null;
        this.age = 0;
        this.address = null;
    }

    public void changeAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return firstname + lastname;
    }

    public String getAddress() {
        return this.address;
    }
}
