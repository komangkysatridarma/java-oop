package belajar.oop.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Komang";
        first = first + " " + "Keyza";

        String second = "Komang Keyzaa";

        System.out.println(first);
        System.out.println(second);
        //untuk membandingkan objek memakai .equals(apa yang akan dibandingkan)
        System.out.println(first.equals(second));

        System.out.println(first == second);

    }
}
