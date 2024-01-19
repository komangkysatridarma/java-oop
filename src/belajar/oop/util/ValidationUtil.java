package belajar.oop.util;

import belajar.oop.data.LoginRequest;
import belajar.oop.error.BlankException;
import belajar.oop.error.ValidationException;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if(loginRequest.username() == null){
            throw new ValidationException("Username tidak boleh null");
        } else if(loginRequest.username().isBlank()){
            throw new ValidationException("Username tidak boleh kosong");
        } else if(loginRequest.password() == null){
            throw new ValidationException("Password tidak boleh null");
        } else if(loginRequest.password().isBlank()){
            throw new ValidationException("Password tidak boleh kosong");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) throws BlankException {
        if(loginRequest.username() == null){
            throw new NullPointerException("Username tidak boleh null");
        } else if(loginRequest.username().isBlank()){
            throw new BlankException("Username tidak boleh kosong");
        } else if(loginRequest.password() == null){
            throw new NullPointerException("Password tidak boleh null");
        } else if(loginRequest.password().isBlank()){
            throw new BlankException("Password tidak boleh kosong");
        }
    }

    //java reflection
    public static void validationReflection(Object object){

    }

}
