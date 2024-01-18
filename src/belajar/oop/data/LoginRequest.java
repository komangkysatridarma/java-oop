package belajar.oop.data;

public record LoginRequest(String username, String password) {
    public LoginRequest{
        System.out.println("Membuat object LoginRequest");
    }

    //ketika ingin membuat constructor overloading di record maka harus memanggil si constructor record nya kalo tidak akan error

    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }
}
