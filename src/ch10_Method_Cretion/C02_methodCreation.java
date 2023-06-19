package ch10_Method_Cretion;

import java.util.Scanner;

public class C02_methodCreation {

    public static void main(String[] args) {

        // girilen 3 notun ortalamasını hesaplayan method create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("1. notunu gir");
        double not1 = input.nextDouble();

        System.out.println("2. notunu gir");
        double not2 = input.nextDouble();

        System.out.println("3. notunu gir");
        double not3 = input.nextDouble();

        System.out.println("ortalama(not1,not2 ,not3) = " + ortalama(not1, not2, not3));


    }

    private static double ortalama(double not1,double not2,double not3) {
        return (not1+not2+not3)/3;






    }
}
