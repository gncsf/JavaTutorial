package ch26_Exceptions;

import java.util.Scanner;

public class C07_IllegalArguımentException {
    public static void main(String[] args) {

        /*

        "throw" - throws" farkları
        1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
        "throw" -> method body içinde tanımlanır.
        2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
        "throw" -> keywordden sonra sadece bir tane exception tanımlanır
        3- "throws" -> keywordden sonra sadece exception class name yazılır
        "throw" ->  keywordden sonra exception obj tanımlanır
        4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
        "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
                */

// IllegalArgumentException -> kullanılmasını istenmeyen değerlerde program hata vermemesi isteniyorsa bu excp
// fırlatılıer
// ornek : yas datası için negatif değer girilidğinde program kırılmadan run olması ama girilen değer için excp
// fırlatması için kullanılır..

        Scanner input=new Scanner(System.in);

        System.out.println("yas girin");

        int yas = input.nextInt();

       // if(yas<18){
       //     System.out.println("yasiniz"+yas+"giris yapamazsiniz");
       //     throw new IllegalArgumentException();
       //
       // }else System.out.println("mekanin sahibi geldi");

try {
    if (yas < 18) {
        System.out.println("yasiniz " + yas + " giris yapamazsiniz");
        throw new IllegalArgumentException();

    } else System.out.println("mekanin sahibi geldi");
}catch(IllegalArgumentException illegalArg) {

    System.out.println("yasin yaetmiyor giris icin "+ illegalArg.getMessage());
}

        System.out.println("kod devamke");














    }
}
