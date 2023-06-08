package ch07_StringManipulations;

import java.util.Scanner;

public class C10_isEmpty {

    public static void main(String[] args) {

        String hi = "Hello";
        System.out.println("hi.isEmpty() = " + hi.isEmpty());

        //Task->  2: Girilen  isim mutlaka space'den farkli en az 1 character icermediğini kontrol eden code
        // create ediniz

        Scanner scanner = new Scanner(System.in);

        System.out.print("İsim girin: ");
        String name = scanner.nextLine();

        System.out.println("name.isEmpty() = " + name.isEmpty());
        String sonuc = name.isEmpty() ? "isim giriniz" : "devam edebilirsiniz";
        System.out.println(sonuc);

        String sonuc1= name.isBlank() ? "isim giriniz" : "devam edebilirsiniz";

        System.out.println(sonuc1);


    }
}
