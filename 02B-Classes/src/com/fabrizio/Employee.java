package com.fabrizio;

public class Employee {
    private int baseSalary;
    private int hourlyRate;


    public int calculateWage(int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalAccessException("salary can not be less than zero");
            this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalAccessException("error");
        this.hourlyRate=hourlyRate;
    }
}
