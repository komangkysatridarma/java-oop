package belajar.oop.application;

import belajar.oop.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello There!");
            }
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello Indonesian!");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("Komang");
        indonesia.sayHello("Komang");
        indonesia.sayHello();

    }
}
