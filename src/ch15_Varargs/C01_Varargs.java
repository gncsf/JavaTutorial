package ch15_Varargs;

import java.util.Arrays;

public class C01_Varargs {

    public static void main(String[] args) {

        /*
        VARARGS :dillerdeki  yuklem gelmemisse veya daha ornek cogaltilacaksa kullanildigi gibi javada da ayni sekilde kullanilir
        var----variety cesitlilik args---arguments
        SYNTAX ->
                mathodName(parametre1,parametre2, dataType... dataName) {
            method body....

        }

        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır
       .
        2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :


        Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
        ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli

                */

        // vewrilen iki sayş toplamini  print eden method create ediniz

        int sayi1 =99;
        int sayi2 =15;
        int sayi3 =55;
        int sayi4 =35;

        topla(sayi1,sayi2);
        topla(sayi3,sayi4);

        System.out.println(" **** varargs ile ****");

        toplaVarargs(sayi1,sayi2,sayi4,33);
        toplaVarargs(sayi1,sayi2,sayi4,33,35);
        toplaVarargs(sayi1,sayi2,sayi4,33,sayi3, sayi1,22);

        // Task -> verilen String'lerin en fazla karaktere sahip olanı print eden
        // METHOD create ediniz->>
        // parametre saysı belirli değil : varargs

        String str1 = "java";
        String str2 = "react";
        String str3 = "jira";
        String str4 = "spring";
        String str5 = "aws";

        enFazlaKarakter(str1, str2);
        enFazlaKarakter(str1, str2,str4);
        enFazlaKarakter(str1, str2,str5,str4);
        enFazlaKarakter(str1, str2,str3,str5,str4);










    }

    private static void enFazlaKarakter(String... str) {
        String enFazlaKarakterli="";

        for (String w: str) {
            if (w.length() > enFazlaKarakterli.length()) {
                enFazlaKarakterli=w;

            }

        }
        System.out.println("enFazlaKarakterli = " + enFazlaKarakterli);

    }

    private static void toplaVarargs (int... i ){

        System.out.println(i);
        System.out.println("Arrays.toString(i) = " + Arrays.toString(i));

        int toplam =0;
        for(int w:i){
            toplam+=w;
        }

        System.out.println("varargs ile sayilarin toplami " + toplam);

    }



    private static void topla(int s, int d) {
        System.out.println("ikik sayinin toplami " + (s+d));

    }
}
