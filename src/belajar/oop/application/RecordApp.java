package belajar.oop.application;

import belajar.oop.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Komang", "rahasia");
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Komang"));
        System.out.println(new LoginRequest("Catur", "qay"));

    }
}
