package belajar.oop.application;

import belajar.oop.data.*;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        Bus bus = new Bus();
        bus.drive();
        System.out.println(car.getTier());
        car.drive();
    }
}
