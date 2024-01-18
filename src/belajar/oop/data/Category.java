package belajar.oop.data;

public class Category {

    private String id;

    private boolean expensive;

    //cara cepat membuat setter dan getter, klik button humberger di pojok kiri, code, generate, pilih setter dan getter


    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
