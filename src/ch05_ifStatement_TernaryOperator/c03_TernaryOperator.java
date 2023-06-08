package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class c03_TernaryOperator {
    public c03_TernaryOperator() {
        super();
    }

    public static void main(String[] args) {

        int a=3;

        if (a>0){
            System.out.println("sayi pozitif");
        }else{
            System.out.println("sayi negatif");
        }

        // ternary

        String sonuc = a>0 ? "pozitif" : "negatif";
        System.out.println(sonuc);

        // atama olmadan
        System.out.println("atma yapmadan sonuc");
        System.out.println( a>0 ? "pozitif" : "negatif ");

        //Example 2: Iki sayidan kucuk olani secen kodu yaziniz ternary kullaniniz

        int x=3;
        int y=5;

        System.out.println( x>y? "x büyük" : "y büyük");
        int min = x >y ? y: x;
        System.out.println("min = " + min);

        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
//           Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
//           Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.

        Scanner input= new Scanner(System.in);
        System.out.println("bir sayi giriniz:");
        int d = input.nextInt();
        int abs= d>0 ? d : (-1*d);
        System.out.println("abs = " + abs);

        //Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz, // return type int
        // farkli isaretli ise "Islem yapamam" mesaji veriniz             //return type String

        System.out.println("bir sayi giriniz");
        int sayi1= input.nextInt();
        System.out.println("bir sayi giriniz");
        int sayi2= input.nextInt();

        Object obj =(sayi1>0 && sayi2>0 ) || (sayi1<0 && sayi2<0) ? (sayi1*sayi2) : "Islem yapamam" ;
        System.out.println("obj = " + obj);

        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        System.out.println("bir sayi giriniz");
        int sayi3= input.nextInt();
        String sonuc1 =(sayi3%2==0 ? "cift" : "tek");
        System.out.println("sonuc1 = " + sonuc1);


    }
}
