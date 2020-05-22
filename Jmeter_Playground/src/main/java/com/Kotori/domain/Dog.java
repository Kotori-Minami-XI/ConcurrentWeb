package com.Kotori.domain;

public class Dog {
    private String dogName;
    private Integer dogAge;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public Integer getDogAge() {
        return dogAge;
    }

    public void setDogAge(Integer dogAge) {
        this.dogAge = dogAge;
    }

    static Dog buildDog() {
        Dog dog = new Dog();
        dog.setDogAge(3);
        dog.setDogName("大白");
        return dog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }
}
