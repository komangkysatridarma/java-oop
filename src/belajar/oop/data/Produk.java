package belajar.oop.data;

import java.util.Objects;

public class Produk {

    //protected hanya bisa diakses oleh package dan class turunanya
    //private hanya bisa diakses oleh class tersebut
    //no-modifer(tanpa apapun) (default)
    public String name;
    public int price;

    public Produk(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Product name: " + name + "Harga: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produk produk = (Produk) o;

        if (price != produk.price) return false;
        return Objects.equals(name, produk.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
    //    public boolean equals(Object o){
//        if(o == this){
//            return true;
//        }
//
//        if(!(o instanceof Produk)){
//            return false;
//        }
//
//        Produk produk = (Produk) o;
//
//        if(this.price != produk.price){
//            return false;
//        }
//
//        if(this.name != null){
//            return this.name.equals(produk.name);
//        }else {
//            return produk.name == null;
//        }
//    }
}
