package ch25_Inheritance.inheritance;

public class Pet extends Animal{
    public Pet() {
        System.out.println("pet den selamlar her turlu hayvana bakim yapilir");
    }
    public void beslenme(){
        System.out.println("mama ile kuru ekmek vermeyin");
    }
    public void uyuma(){
        System.out.println("uygun ortamlarda uyutun");
    }

   // @Override
  //  protected void hareket() {   CTE
  //      super.hareket();
  //  }


    @Override
    public void icme() {
        System.out.println("overriding icme methodu pet class dan");
    }
    private void privateMethod (){
        System.out.println("pet class in private methodu");
    }

    int number =22;
    int age =101;
    int numberOfPets =201;

    @Override
    public String toString() {
        return "Pet{" +
                "number=" + number +
                ", age=" + age +
                ", numberOfPets=" + numberOfPets +
                '}';
    }
}
