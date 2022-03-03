package com.company;

public class Manager extends Employee {
    long allowance;

    @Override
    public long getBiweeklySalary() {
        return (super.getBiweeklySalary() + allowance);
    }
}
