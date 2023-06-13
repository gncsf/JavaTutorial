package ch08_Loops.L01_ForLoop;

public class C05_PatternQuestion {

    public static void main(String[] args) {

        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri

                */

        int n = 65;

        for (int i = 0; i <6; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((char) (n + j) + " ");
            }

            System.out.println();  // Satır sonu

        }

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
















    }
}
