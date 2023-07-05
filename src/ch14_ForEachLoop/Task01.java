package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        /* TASK :
        Bir öğretmenden girmek istediği kadar notu alınız, ve
        ortalamayı geçen öğrenci sayısını bulan code create ediniz.

*/

        List<Integer> listNotlar = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);


        String devamMi;

        do {
            System.out.println("istedigin kadar not gir");
            int ogrNot = input.nextInt();
            System.out.println("devam edecek miisn? devam için (E) cikmak icin (H) bas ");
            devamMi = input.next();
            listNotlar.add(ogrNot);
        }while ((devamMi.equalsIgnoreCase("E")));

        Collections.sort(listNotlar);
        System.out.println("listNotlar = " + listNotlar);

        int notlarToplami=0;
         for (int w: listNotlar) {
             notlarToplami+=w;
         }
          double ortalama = notlarToplami/listNotlar.size();





    }
}
