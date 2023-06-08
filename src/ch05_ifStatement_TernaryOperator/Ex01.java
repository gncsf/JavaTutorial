package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("bir sayi gir:");
         int sayi=input.nextInt();

         if( sayi>0) {
             System.out.println("pozitif bir sayidir.");
         } else if (sayi<0) {
             System.out.println("negatif sayidir.");
         } else{
             System.out.println("girdiğiniz sayı sifirdir.");
         }


    }
}
