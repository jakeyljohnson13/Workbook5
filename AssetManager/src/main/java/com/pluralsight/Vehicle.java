package com.pluralsight;

import java.time.LocalDateTime;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value = getOriginalCost();
        LocalDateTime now = LocalDateTime.now();
        int age = now.getYear() - year;
        if (age <= 3) {
            for (int i = 0; i < age; i++) {
                value = value - (getOriginalCost() * 0.03);
            }
        } else if (age > 3 && age <= 6) {
            for (int i = 0; i < age; i++) {
                value = value - (getOriginalCost() * 0.06);
            }
        } else if (age > 6 && age >= 9) {
            for (int i=0;i<age;i++){
                value = value - (getOriginalCost() * 0.08);
            }
        } else{value = 1000.0;}
        if (getOdometer() > 100000)
            if (!getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")){
            value = value - (value*0.25);
        } return value;
    }
}
