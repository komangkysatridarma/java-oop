package belajar.oop.application;

public class StackTraceApp {
    public static void main(String[] args) {

        try{
            String[] names = {
                    "komeng", "artur", "iruma"
            };

            System.out.println(names[2]);
        }catch(Throwable throwable){
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            throwable.printStackTrace();
        }

    }
}
