package com.fabrizio;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(-1);
        employee.baseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}