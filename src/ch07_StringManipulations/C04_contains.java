package ch07_StringManipulations;

import java.util.Scanner;

public class C04_contains {

    public static void main(String[] args) {

        /*
        String icersinde istenen stringin varlığını kontrol eder boolean return eder..

        */

        String str = "java ile gunler";
        System.out.println("str = " + str);

        System.out.println("str.contains(\"java\") = " + str.contains("java"));
        System.out.println("str.contains(\"Java\") = " + str.contains("Java"));


        System.out.println("str.contains(\"\") = " + str.contains(""));
        System.out.println("str.contains(\" \") = " + str.contains(" "));

        System.out.println("\"\".length() = " + "".length());

        // task-> girilen uruunun var olup olmaidginiz kontrol eden bir code create ediniz -> ternary kullanınız

        Scanner input = new Scanner(System.in);
        System.out.println("bir urun giriniz");
        String urun = input.nextLine();
        System.out.println("aranan urunu girin:");
        String arananUrun = input.nextLine();

        System.out.println(urun.contains(arananUrun) ? " bu urun vardır" : " bu urun yok");


        //TASK giirlen sifrenin dogru ise erisim izni verin yanlis ise vermeyin
        // ternary ile switch ile if ile yapiniz
        //bug i bulunuz
        //contains methodu sifre kontrol islemlerinde KULLANILMAMALI

        String sifre = "123456";
        System.out.println("sifrenizi giriniz");
        String sifre1 = input.nextLine();

        if (sifre1.contains(sifre)) {
            System.out.println("giris yaptınız");
        }else {
            System.out.println("giris yapamazsınız");
        }

        System.out.println(sifre1.equals(sifre) ? "giris yaptınız" : "giris yapamazsınız");




    }
}
