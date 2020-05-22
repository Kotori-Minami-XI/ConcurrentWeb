package com.Kotori.domain;

public class Car {
    private String carName;
    private Integer carAge;

    public Car(String carName, Integer carAge) {
        this.carName = carName;
        this.carAge = carAge;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carAge=" + carAge +
                '}';
    }
}
