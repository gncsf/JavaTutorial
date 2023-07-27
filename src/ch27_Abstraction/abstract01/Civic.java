package ch27_Abstraction.abstract01;

public class Civic extends Lastik {

    // public abstract void absMethod();

    @Override
    void motor() {
        System.out.println("civic icin ideal motor 1.6");
    }

    @Override
    void koltuk() {
        System.out.println("koltuklar kadife kumas");
    }

    @Override
    void kapi() {
        System.out.println("4 kapi uzun kasa");
    }

    @Override
    public void lastikEbad() {
        System.out.println("lastikler 18 inch");
    }

    public int vites(){
        return 6;
    }
}
