package ch08_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_whileLoop {

    public static void main(String[] args) {

        // task01-> 11 den 20'ye kadar olan tamasayıları print eden code create ediniz...

        System.out.println("*****for ile cozum******");

        for (int i =11; i <20 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("**** whilw loop ile cozum ****");

        int sayi = 11;

        while (sayi<20) {
            System.out.print(sayi+ " ");
            sayi++;
        }

        System.out.println();

        //task02-> 7 kere javaCAN print eden code create ediniz...

        int i =0;

        while (i<7) {
            System.out.println("javaCan");
            i++;

        }

        // task03-> 2 basamaklı tek sayıları yanyana print eden code create ediniz

        int a =11;

        while ( a<100) {
                System.out.print(a +" ");
                a+=2;

        }
        System.out.println();
        System.out.println("diğer cozum");

        int b =11;

        while ( b<100) {
           if( b%2==1) {
               System.out.print(b +" ");
           }
            b+=2;
        }
        System.out.println();

        // task04-> girilen metni while loop ile  tersden print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("bir seyler yazin");
        String cumle = input.nextLine();

        int uzunluk = cumle.length() -1;
        while (uzunluk >= 0) {
            System.out.println(cumle.charAt(uzunluk));
            uzunluk--;

        }

        // task-> girilen tamsayını pozitif tam bolen sayısını print eden code create ediniz...
        // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
        // 30 -> 1,2,3,5,6,10,15,30: 30'nin 8 tane tam böleni var
































    }
}
