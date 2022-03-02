package com.company;

public class person {
    private String name;
    private int age;
    private char sex;

     void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void identity() {
        System.out.println("This object is a person");
    }
}
