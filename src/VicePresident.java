class VicePresident extends Manager{

    VicePresident(String name){
        super(name);
    }
    @Override
    void sayHello(String name) {
        System.out.println("Hello Vp " + name + " My Name is " + this.name);
    }
}
