package ch07_StringManipulations;

import java.util.Scanner;

public class C03_charAt {

    public static void main(String[] args) {

      //  charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        //  index değeri 0'dan başlar


        String city = "Istanbul";
        System.out.println("city.charAt(0) = " + city.charAt(0));

        System.out.println("city.charAt(1) = " + city.charAt(1));

        char cityBirincİndexElemanı = city.charAt(1);


        char son = city.charAt(city.length() - 1);
        System.out.println("son = " + son);

        char sonHarf = city.charAt(city.length()-1);
        System.out.println("sonHarf = " + sonHarf);

        //RTE System.out.println("city.charAt(21) = " + city.charAt(21));

        // Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri
// print eden code create ediniz...


        char ortaHarf = city.charAt(city.length()/2);
        System.out.println("orta = " + ortaHarf);

        Scanner input= new Scanner(System.in);
        System.out.println("bir sehir girin");
        String city2 = input.nextLine();

        if (city.length()%2==0) {
            System.out.println("senin sehrin ortası yok");
        }else{
            System.out.println("city.charAt(city.length()/2) = " + city.charAt(city.length() / 2));
        }


    }
}
