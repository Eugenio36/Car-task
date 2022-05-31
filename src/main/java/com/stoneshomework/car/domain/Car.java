package com.stoneshomework.car.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String make;
    private String model;
    private int productionYear;
    private String vinNumber;
    private String registrationNumber;

    public Car() {
    }

    public Car(String make, String model, int productionYear, String vinNumber, String registrationNumber) {
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.vinNumber = vinNumber;
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int year) {
        this.productionYear = year;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", vinNumber='" + vinNumber + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
