package ch24_Encapsulation.encapsulation02;

public class UserRunner {
    public static void main(String[] args) {

        User obj1 = new User("sefa", "genc", "12345",15);
        System.out.println("obj1.getAd() = " + obj1.getAd());
        System.out.println("obj1.getSoyad() = " + obj1.getSoyad());
        System.out.println("obj1.getPassword() = " + obj1.getPassword());
        System.out.println("obj1.getYas() = " + obj1.getYas());

        System.out.println("obj1 = " + obj1);


        User obj2 = new User("sefa", "genc", "12345",-15);

        System.out.println("obj2.getYas() = " + obj2.getYas());


    }
}
