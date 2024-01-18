package belajar.oop.application;

//jika ingin import, maka class nya harus public
//jika ingin import semuanya tinggal pakai * diakhir
//import belajar.oop.data.*;
import belajar.oop.data.Produk;

public class Application {
    public static void main(String[] args) {

        Produk produk = new Produk("Hp", 11_000_000);
        System.out.println(produk.name);
        System.out.println(produk.price);

    }
}
