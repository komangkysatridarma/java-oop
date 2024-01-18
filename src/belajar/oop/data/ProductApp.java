package belajar.oop.data;

import belajar.oop.data.Produk;

public class ProductApp {
    public static void main(String[] args) {

        Produk produk = new Produk("MacBook Pro", 1000000);
        System.out.println(produk.name);
        System.out.println(produk.price);
        System.out.println(produk);

        Produk produk2 = new Produk("MacBook Pro", 1000000);
        System.out.println(produk.equals(produk2));
    }
}
