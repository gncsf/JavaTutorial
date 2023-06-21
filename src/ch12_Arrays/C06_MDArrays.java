package ch12_Arrays;

import java.util.Arrays;

public class C06_MDArrays {

    public static void main(String[] args) {

        /*
        Çok Boyutlu Diziler
        Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
        Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
        formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
        matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
        satır ve sütun sayısını girmemiz yeterli olacaktır.
                * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
        Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

                * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
       *  icerdeki  array'lere  inner->Daire array denir
                * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
                *  Array'i ancak tum elemenlari atanarak declare edilmeli
                * 3- Multi dimensional array'de bir elemanin indexi icin
                *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
                */
        int [] arr = new int[3];

        int [][] arr1=  new int [3][5];

        System.out.println("Arrays.deepToString(arr1) = " + Arrays.deepToString(arr1));


        int [][][] arr2=  new int [2][3][4];
        System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2));

        // 24 kişiilik 3 sınıf ve 21 kişilik 5 sınıf array olarak ata

        int sinif24 [][] = new int [3] [24];
        int sinif21 [][] = new int [5] [21];

        // MD eleman ekleme

        arr1[0][3]=35;

        System.out.println("Arrays.deepToString(arr1) = " + Arrays.deepToString(arr1));

        // 35 degerini yazdir

        System.out.println("arr1[0][3] = " + arr1[0][3]);

        // manuel olarak array olusturma

        int [][] mdArr = { {1,2,3}, {10,20}, {103}};

        System.out.println("mdArr.length = " + mdArr.length);

        System.out.println("Arrays.deepToString(mdArr) = " + Arrays.deepToString(mdArr));

        // son elemanı yazdir

        System.out.println("mdArr [mdArr.length - 1] [mdArr[mdArr.length-1].length-1] = " + mdArr[mdArr.length - 1][mdArr[mdArr.length - 1].length - 1]);

        System.out.println("Arrays.toString(mdArr[1]) = " + Arrays.toString(mdArr[1]));




    }
}
