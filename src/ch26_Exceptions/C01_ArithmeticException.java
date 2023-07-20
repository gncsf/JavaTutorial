package ch26_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("1. sayi gir");
        int sayi1 = input.nextInt();

        System.out.println("2. sayi gir");
        int sayi2 = input.nextInt();

        //int sonuc =sayi1/sayi2;


        System.out.println("uygulama calismaya devam ediyor");


        try {
            /*
            1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz catch block, try
            block exception  yakalarsa calışır
            2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch
            block tanımlanabilir.
            aynıa anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
            3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE
                    */

            int sonuc =sayi1/sayi2;
            System.out.println("sonuc = " + sonuc);
            System.out.println("try block icerisinden geliyor");
        }

        catch (StringIndexOutOfBoundsException ex) {
            System.out.println("StringIndexOutOfBoundsException sayi sifira bolunmez");
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException sayi sifira bolunmez");

        }

        catch (Exception e) {

            System.out.println("Exception eger bir exception varsa yukaridakşler disinda calisacak yer burasi");
        }

        finally {
            System.out.println("finaly blocktan selamlar her zaman calisir");
        }

        System.out.println("class in en son kodu");


    }
}
