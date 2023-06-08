
package ch03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {

    public static void main(String[] args) {

        boolean basariliMi = true;
       // String basari = basariliMi; calişmaz
        String basari = String.valueOf(basariliMi);// boolean stringe cevrildi
        System.out.println("basari = " + basari);

        double d = 17;
        System.out.println("d = " + d);

        int sayi1 =33;
        int sayi2 =4;

        System.out.println("sayi1/sayi2 = " + sayi1 / sayi2);


        byte by =127;
        int number= by;

        int num =123;
        double d1=14;
        double d2=d1/num;
        System.out.println("d2 = " + d2);

        double db1 =14.66;
        int i = (int) db1;
        System.out.println("i = " + i);


        int num3 = 150;
        byte by1= (byte) num3;
        System.out.println("by1 = " + by1);

        // task

        Scanner input = new Scanner(System.in);
        System.out.println("bir karakter giriniz:");
        char ch = input.nextLine().charAt(0);
        System.out.println("ch = " + (ch + 0));

        String str ="a";
        System.out.println("str.hashCode() = " + str.hashCode());// tek karakter ile çalışır












    }
}
