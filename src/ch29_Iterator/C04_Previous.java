package ch29_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_Previous {
    public static void main(String[] args) {

        List<Integer > numberList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("numberList in ilk hali : " + numberList);

        // tersten print ediniz

        System.out.println("numberList in ters hali : ");
        for (int i = numberList.size() - 1; i >= 0; i--) {
            System.out.print(numberList.get(i) + " ");
        }

        List<String > list1 = new ArrayList<>(Arrays.asList("Zeynep ","Ahmet","Eren","Iclal","Safak","Fatih","Ali"));
        System.out.println("list1 in ilk hali  = " + list1);
        // son elemana bir ünvan ekleyin

        /*
        önemli ->  hasPrevious() meth için MUTLAKA  hasNext() ve next() meth
        calıştırılarak cursor(pointer) en sona getirilmeli.

        ITERATOR VE LISTITERATOR farkları

        1- ITERATOR-> sadece hasNext(), next(), remove() meth çalışır
        LISTITERATOR -> hasNext(), next(), remove(). hasPrevious(), previous(),add(), set() vs methodlar çalışır

        2- LISTITERATOR -> sadece List yapılarda tanımlanır
        ITERATOR-> tum collection(list set Array, map..) için tanımlanır.

        3- ITERATOR-> sadece ileri b->s tekrarlar
        LISTITERATOR -> b<->s ileri ve geri çift yönlü tekrarlar

        ITERATOR-> kapsamı geniş ama aksiyonu az
        LISTITERATOR -> kapsamı dar ama aksiyıonu çok

        */

















    }

}
