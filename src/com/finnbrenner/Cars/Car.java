package com.finnbrenner.Cars;

public class Car {
    public final String brand;
    public final String model;
    private int age;
    private static final int numWheels = 4;
    private final int cost;
    public static String doorOpenDir = "horizontal";

    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Civic", 15000);
        System.out.println(myCar);
        for (int i = 0; i < 5; i++) {
            myCar.age();
        }
        System.out.println(myCar);
        Car mySecondCar = new Car(2, "Honda", "Accord", 25000);
        System.out.println(mySecondCar);
    }

    public Car(String brand, String model, int cost) {
        this.cost = cost;
        this.brand = brand;
        this.model = model;
        age = 0;
    }

    public Car(int age, String brand, String model, int cost) {
        this.cost = cost;
        this.age = age;
        this.brand = brand;
        this.model = model;
    }

    public void age() {
        age++;
    }

    @Override
    public String toString() {
        if (age == 0) {
            return "a brand-new " + brand + " " + model;
        }
        return "a " + age + " year old " + brand + " " + model;
    }

    public int getCost() {
        return cost;
    }

}
