package com.company;

public class player {
    private String name;
    private int age;
    float heightInFeet;

    public player() {
        name = "blank";
        age = 0;
        heightInFeet = 0;
    }

    public player(String name, int age, float heightInFeet) {
        this.name = name;
        this.age = age;
        this.heightInFeet = heightInFeet;
    }

    public String eligibility() {
        if ((this.age >= 18) && (this.heightInFeet >= 5.9f)) {
            return (this.name + " is eligible to play");
        } else return (this.name + " is not eligible to play");
    }
}
