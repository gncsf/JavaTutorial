package ch08_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {
        System.out.println("bir sayi giriniz");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();




            if ( sayi<0) {
                System.out.println("pozitif bir sayi girmelisin");
            }else {
                for (int i= sayi; i<100 ; i++) {
                    if ( i %4 ==0)  {

                        System.out.println(i);
                    }
                }

            }















    }
}
