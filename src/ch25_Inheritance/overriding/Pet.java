package ch25_Inheritance.overriding;

public class Pet extends Animal {
    public Pet() {
        System.out.println("pet den selamlar her turlu hayvana bakim yapilir");
    }
    public void beslenme(){
        System.out.println("mama ile kuru ekmek vermeyin");
    }
    public void uyuma(){
        System.out.println("uygun ortamlarda uyutun");
    }
}
