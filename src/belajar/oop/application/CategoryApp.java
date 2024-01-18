package belajar.oop.application;

import belajar.oop.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("28");

        System.out.println(category.getId());
        System.out.println(category.isExpensive());


    }

}
