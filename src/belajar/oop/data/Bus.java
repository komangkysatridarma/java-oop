package belajar.oop.data;

public class Bus implements Car{

    @Override
    public void drive() {
        System.out.println("Bus Drive");
    }

    @Override
    public int getTier() {
        return 2;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return true;
    }

    @Override
    public boolean isBig() {
        return true;
    }
}
