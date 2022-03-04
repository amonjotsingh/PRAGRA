package com.company;

public class Employee {
    String name;
    int employeeId;
    String dept;
    String change;
    String hireDate;
    long hourlyRate;

    public String details() {
        return ("Employee Name :" + name + ",Id: " + employeeId + ",Department" + dept + ", hiringdate" + hireDate + ", Hourlyrate" + hourlyRate);
    }

    public long getBiweeklySalary() {
        return (hourlyRate * 8 * 5 * 2);
    }
}