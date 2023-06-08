package ch08_Loops;

public class C04_forLoop {

    public static void main(String[] args) {

       /*
        Interview Question
        Girilen  100’den kucuk bir tamsayi için
        1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
        1  - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
        2  - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
        3  - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" print eden code create ediniz
                */

        for (int i = 0; i <100 ;i++) {

            if (i %3==0 && i %5==0) {

                System.out.println("JavaCan");

            }else if (i %5==0) {

                System.out.println("Can");

            }else if ( i%3==0) {

                System.out.println("java");

            }else System.out.println(i);
        }



















    }
}
