package ch10_Method_Cretion;

import java.util.Scanner;

public class C03_methodCreation {

    public static void main(String[] args) {

        // task-> girilen tam sayının rakamları toplamını print eden METHOD create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("bir tamsayı  gir");
        int sayi = input.nextInt();

        System.out.println("rakamlarToplami(sayi) = " + rakamlarToplami(sayi));


    }

    public static int rakamlarToplami(int x) {
        int rakamlarToplami =0;

        while (x > 0) {

            rakamlarToplami += x %10;
             x /= 10;
        }
        return rakamlarToplami;

    }
}
