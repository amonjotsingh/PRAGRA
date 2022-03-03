package com.company;

public class Director extends Manager {
    long bonus;

    @Override
    public long getBiweeklySalary() {
        return (super.getBiweeklySalary() + bonus);
    }
}
