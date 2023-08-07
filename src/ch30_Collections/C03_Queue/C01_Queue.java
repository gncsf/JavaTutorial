package ch30_Collections.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class C01_Queue {

    public static void main(String[] args) {

        /*
        Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
                ile obj uretilir.
        Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
                Cons seçimine göre queue obj özelliklieri belirlenir.
        FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenişr enbaştan silinir

        peek()-> copt-paste gibi ilk elemanı return eder ama silmez
        poll()-> cut-paste gibi ilk elemanı siler ve  return eder
        element() -> ilk elemanı silmeden return eder.
                remove() -> ilk elemnı siler ve return eder..
  */

        Queue <String> q1 = new LinkedList<>(Arrays.asList("almanya", "hollanda", "fransa", "amerika", "afrika","brezilya"
        ,"yani zellanda"));
        q1.add("türkiye");

        System.out.println("q1 = " + q1);


        Queue <String> q2 = new LinkedList<>(Arrays.asList("almanya", "hollanda", "fransa", "amerika", "afrika","brezilya"
                ,"yani zellanda"));
        System.out.println("q2 = " + q2);

        q2.add("Turkiye");
        q2.add("andorra");

        System.out.println("q2 = " + q2);


        System.out.println("q2.peek() = " + q2.peek());
        System.out.println("q2.remove() = " + q2.remove());
        System.out.println("q2 = " + q2);


        System.out.println("q2.poll() = " + q2.poll());

        System.out.println("q2 = " + q2);

        System.out.println("q2.element() = " + q2.element());
        System.out.println("q2 = " + q2);

        System.out.println("q1.offer(\"madagaskar\") = " + q1.offer("madagaskar"));
        System.out.println("q1 = " + q1);




    }
}
