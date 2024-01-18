package belajar.oop.application;

import belajar.oop.data.City;

public class LocationApp {
    public static void main(String[] args) {

//        var location = new Location(); //error

        var city = new City();
        city.name = "Bogor";

        System.out.println(city.name);

    }
}
