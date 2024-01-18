class Manager extends Employee {
    String city;

    void sayHello(String name){
        System.out.println("Hello " + name + " My Name Is " + this.name);
    }

    //jadi saya akan membuat constructor, nah si child nya harus mengakses si constructor dari si parent nya, jika tidak akan error
    Manager(String name){
        super(name);
    }

    Manager(String name, String City){
        super(name);
        this.city = city;
    }
}
