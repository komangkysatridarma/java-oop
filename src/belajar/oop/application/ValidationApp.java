package belajar.oop.application;

import belajar.oop.data.LoginRequest;
import belajar.oop.error.ValidationException;
import belajar.oop.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);

        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException | IllegalArgumentException e){
            System.out.println("Data tidak valid: " + e.getMessage()) ;
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");

    }

}
