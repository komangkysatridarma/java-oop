public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("komang");
        employee.sayHello("Budi");

        employee = new Manager("Iruma");
        employee.sayHello("Hinata");

        employee = new VicePresident("Kysa");
        employee.sayHello("Catur");

        sayHello(new Employee("Komang"));
        sayHello(new Manager("Iruma"));
        sayHello(new VicePresident("Ayanokouji"));
    }

    static void sayHello(Employee employee){
        //instanceof itu pengecekan tipe data dan konversi
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        }else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else{
            System.out.println("Hello " + employee.name);
        }
    }
}
