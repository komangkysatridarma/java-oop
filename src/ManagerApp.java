public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Komang");
        manager.name = "Komang";
        manager.sayHello("Ayanokouji");

        var vicePresident = new VicePresident("Iruma");
        vicePresident.name = "Iruma";
        vicePresident.sayHello("Hinata");

        System.out.println(manager);
        System.out.println(vicePresident);

    }
}
