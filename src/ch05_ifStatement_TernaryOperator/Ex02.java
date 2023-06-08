package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] arGS)    {
    /*
        Kullanicidan 100 uzerinden notunu isteyin.
        Not'u harf sistemine cevirip yazdirin.
        50’den kucukse "D",->1,2,3..49
        =50  <60 arasi "C",->50,51,52,..59
        =60  <80 arasi "B",->60,61,62,63..79
        =80’nin uzerinde ise "A"->80,81..100
        */
        Scanner input= new Scanner(System.in);
        System.out.println("ders notunuzu giriniz:");
        int not=input.nextInt();

        if (not<0){
            System.out.println("girdiginiz not gecersiz");
        } else if (not<50) {
            System.out.println("ders notunuz D");
        } else if (not>=50 && not<60) {
            System.out.println("ders notunuz C ");
        } else if (not>=60 && not<80) {
            System.out.println("ders notunuz B");
        } else if (not>=80 && not<=100) {
            System.out.println("ders notunuz A");
        } else {
            System.out.println("girdiginiz not 100 den büyük");
        }


    }
}

