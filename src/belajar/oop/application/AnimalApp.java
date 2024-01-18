package belajar.oop.application;

import belajar.oop.data.Animal;
import belajar.oop.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();

    }
}
