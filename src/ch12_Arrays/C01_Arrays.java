package ch12_Arrays;

import java.util.Arrays;

public class C01_Arrays {

    /*
    Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
    Array olusturulurken 2 seyi declare etmeliyiz:
            1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
            2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
            array= tepsiye benzer..
            Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
            isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
            */

    public static void main(String[] args) {

        // Array tanimlama

        int a ;

        int [] arr;

      //  System.out.println("a = " + a);
      //  System.out.println("arr = " + arr);

        // nameArray isminde isimleri tutan bir array create ediniz

        String [] nameArray= {"rumeysa", "ahmet", "zeynep", "ali ", "tommy", "omer"};

        int [] numArray = {11 , 22 , 333, 66 , 55 , 44 , 88 , 99 , 55 , 2 , 44 , 55 , 6};

        int [] sayiArr= new int [5];


        System.out.println("sayiArr = " + sayiArr);

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        sayiArr[0]=10;
        sayiArr[1]=11;
        sayiArr[2]=12;
        sayiArr[3]=13;
        sayiArr[4]=14;
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        System.out.println("sayiArr.length = " + sayiArr.length);
        System.out.println("nameArray.length = " + nameArray.length);
        System.out.println("numArray.length = " + numArray.length);

        // her bir arrayin son elemanını yazdiriniz

        System.out.println("sayiArr[4] = " + sayiArr[4]);
        System.out.println("nameArray[5] = " + nameArray[5]);
        System.out.println("numArray[12] = " + numArray[12]);
        System.out.println("sayiArr[sayiArr.length-1] = " + sayiArr[sayiArr.length - 1]);
        System.out.println("nameArray[nameArray.length - 1] = " + nameArray[nameArray.length - 1]);
        System.out.println("numArray[nameArray.length - 1] = " + numArray[nameArray.length - 1]);

        // name array deki son elemani update ediniz

        nameArray[nameArray.length - 1] = " gnc";
        System.out.println("nameArray[nameArray.length - 1] = " + nameArray[nameArray.length - 1]);

        // for loop ile

        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i] + " ");
        }

        // task numarryadeki cift index olan elemanları print ediniz

        for (int i = 0; i < numArray.length ; i+=2) {
            System.out.print("numArray[i] = " + numArray[i]);
        }
        System.out.println(" ");
        // name array ellemanlarindan 5 harfli olan elelmanları yazdir

        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i].length()==5) {

                System.out.println(nameArray[i]);

            }
        }

        System.out.println(" // sort //");
        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));


        Arrays.sort(nameArray);
        Arrays.sort(numArray);
        Arrays.sort(sayiArr);

        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));


    }
}
