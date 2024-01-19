package belajar.oop.application;

import belajar.oop.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {

        //kalau error nya kaya hanya validasi/error mending pakai runtimeException
        //kalau error nya yang kaya menganggu aplikasi/serius mending pakai try catch

//        try{
//            connectDatabase("Komang", null);
//            System.out.println("Sukses");
//        } catch (DatabaseError error){
//            System.out.println("Error " + error.getMessage());
//        }

        connectDatabase("Komeng", null);
        System.out.println("Sukses");

    }

    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa connect ke database");
        }
    }
}
