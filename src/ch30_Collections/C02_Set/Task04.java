package ch30_Collections.C02_Set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Task04 {
    public static void main(String[] args) {


        //treeSet ve HashSet e 100 adet random deger ekleyin
        //ve surelerini kiyaslayin
        //hashset ten set olusturup eleman ekleyip bunu tree set e cevirin


        // HashSet oluşturup 100 random değer ekleyin
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(1000); // 0 ile 999 arasında rastgele bir sayı
            hashSet.add(randomNumber);
        }

        // Süre ölçümü için başlangıç zamanını alın
        long baslangicZamanıHashSet = System.nanoTime();

        // HashSet'teki elemanları TreeSet'e kopyalayın
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

        // Süre ölçümü için bitiş zamanını alın
        long sonlanmaZamaniHashSet = System.nanoTime();

        // Süreleri hesaplayın
        long zamanFarkiHashSet = sonlanmaZamaniHashSet - baslangicZamanıHashSet;

        // HashSet ve TreeSet içeriklerini yazdırın
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);

        // Süreleri yazdırın
        System.out.println("HashSet ve TreeSet zaman farki: " + zamanFarkiHashSet + " nanosaniye");

        System.out.println("********************");



       long startTimeHashSet = System.nanoTime();

       HashSet <Integer> hashSet1 = new HashSet<>();
        Random random1 = new Random();

        for (int i = 0; i < 100; i++) {

            hashSet.add(random.nextInt(1000));

        }

        long endTimeHashSet = System.nanoTime();

        System.out.println("(endTimeHashSet-startTimeHashSet) = " + (endTimeHashSet - startTimeHashSet));


        long startTimeTreeSet = System.nanoTime();

        TreeSet <Integer> treeSet1 = new TreeSet<>();


        for (int i = 0; i < 100; i++) {

            treeSet.add(random.nextInt(1000));

        }

        long endTimeTreeSet = System.nanoTime();

        System.out.println("(endTimeTreeSet-startTimeTreeSet) = " + (endTimeTreeSet - startTimeTreeSet));

        TreeSet<Integer> treeSet2 = new TreeSet<>(hashSet1);

        System.out.println("treeSet2 = " + treeSet2);


    }
}
