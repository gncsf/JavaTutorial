package ch08_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C02_whileLoop {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("bir tamsayi yazin");
        int sayi = input.nextInt();

        int bolen =1;
        int bolenSayısı= 0;

        while (bolen<=sayi) {
            if (sayi % bolen == 0) {
                bolenSayısı++;

            }
            bolen++;
        }
        System.out.println(bolenSayısı);














    }
}
