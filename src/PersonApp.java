public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Komang", "Bali");

//        person1.name = "Komang";
//        person1.address = "Cisalopa";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Catur");


        Person person2 = new Person("Iruma");
        System.out.println(person2.name);
        Person person3;
        person3 = new Person();

        person3.name = "Iruma";
        person3.sayHello("Catur");

    }
}
