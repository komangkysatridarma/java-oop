package belajar.oop.application;

import belajar.oop.data.Customer;
import belajar.oop.data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Komang");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDeskripsi());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Daftar Level");
        for(var value : Level.values()){
            System.out.println("-" + value);
        }

    }
}
