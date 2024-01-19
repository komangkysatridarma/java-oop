package belajar.oop.data;

public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String deskripsi;

    Level(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi(){
        return deskripsi;
    }
}
