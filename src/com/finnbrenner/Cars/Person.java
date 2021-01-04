package com.finnbrenner.Cars;

import java.util.ArrayList;
import java.util.Random;

public class Person {
    private final String name;
    private int age;
    private int money;
    private ArrayList<Car> cars = new ArrayList<>();

    public Person(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public static void main(String[] args) {
        Person john = new Person("John", 32, 52000);
        Car newCar = new Car("Honda", "Civic", 18000);
        if (john.buyCar(newCar)) {
            System.out.println("Bought " + newCar);
        } else {
            System.out.println("Failed to buy " + newCar);
        }
        Car newExpensiveCar = new Car("Nissan", "Leaf", 100000);
        if (john.buyCar(newExpensiveCar)) {
            System.out.println("Bought " + newExpensiveCar);
        } else {
            System.out.println("Failed to buy " + newExpensiveCar);
        }
        for (Car car : john.cars) {
            System.out.println(john.name + " owns a " + car);
        }
    }

    public boolean buyCar(Car car) {
        if (car.getCost() <= money) {
            cars.add(car);
            money -= car.getCost();
            return true;
        }
        return false;
    }

    public boolean ownsCar(String brand, String model) {
        /*for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).brand.equals(brand) && cars.get(i).model.equals(model)) {
                return true;
            }
        }*/
        for (Car car : cars) {
            if (car.brand.equals(brand) && car.model.equals(model)){
                return true;
            }
        }
        return false;
    }



}
