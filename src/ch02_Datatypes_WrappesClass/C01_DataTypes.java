package ch02_Datatypes_WrappesClass;

public class C01_DataTypes {

    public static void main(String[] args) {

        String name= "Gnc";
        String yas = "23";
        int age = 30;
        int yil = 2023;
        boolean emeklimi = false;
        boolean tstermi = true;

        char ch ='$';
        char harf= 'A';
        // task

        int dogumyili = 1999;
        int yas1 = yil - dogumyili ;
        System.out.println("yas1 = " + yas1);



        //task
        byte sayı1=100;
        byte sayı2=29;
        byte toplam= (byte) (sayı1+sayı2);
        System.out.println("toplam = " + toplam);


        byte sayı3= 100;
        byte sayi4= 50;
        System.out.println(sayı3-sayi4);

        //task

        int a=33;
        byte b=120;

        System.out.println("a+b = " + a + b);
        System.out.println("a+b = " + (a + b));
        //task
        int sayi5= 10;
        double sayi6=10.5;
        System.out.println("sayi6+sayi5 = " + (sayi6 + sayi5));
         //task

        int num1=28;
        int num2=34;

        num1=num2;
        num2=num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }









}
