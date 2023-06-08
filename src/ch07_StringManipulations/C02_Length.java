package ch07_StringManipulations;

public class C02_Length {

    public static void main(String[] args) {

                /*
        length() methodu girilrn string'in uzunluğunu:içinde bulunan karakter sayısını return eder
        butun karakterleri(boşluk vs) sayıp adedini verir
         */
        String str = "Clarusway ile java";
        System.out.println("str.length() = " + str.length());

        int lengthofStr= str.length();
        System.out.println("lengthofStr= " + lengthofStr);

        String str1= "";
        System.out.println("str1.length() = " + str1.length());
        String str2= " ";
        System.out.println("str2.length() = " + str2.length());
        String str3= null;
        //System.out.println("str3.length() = " + str3.length());
        //System.out.println("str3.concat(str2) = " + str3.concat(str2));

        String str4 = "null";
        System.out.println("str4.length() = " + str4.length());

        String str5 ;
        //System.out.println("str4.concat(str5) = " + str4.concat(str5));



    }
}
