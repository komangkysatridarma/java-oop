package belajar.oop.application;

import belajar.oop.data.Application;
import static belajar.oop.data.Constant.*;
import static belajar.oop.data.Application.PROCESSORS;
import belajar.oop.data.Country;
import belajar.oop.util.MathUtil;
import belajar.oop.data.City;


public class StaticApp {
    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,2,3,4,5));

        Country.City city = new Country.City();
        city.setName("Jakarta");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
