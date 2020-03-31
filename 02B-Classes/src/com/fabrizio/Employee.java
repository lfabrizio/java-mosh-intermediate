package com.fabrizio;

public class Employee {
    private int baseSalary;
    public int hourlyRate;


    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalAccessException("salary can not be less than zero");
            this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

}
