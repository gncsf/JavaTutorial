package ch12_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        int []  numbers = {12,13,55,66,35,3,4,34,33,63,72};

        int istenenSayi=35;

        int count = 0;

        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]== istenenSayi){
                count++;
                flag=true;
                break;


            }
        }

        //count mantiği ıle bulma

        if (count>=1 ){
            System.out.println("senin sayin bizde var"+ istenenSayi);
        }else System.out.println("senin sayin bizde yoktur");

        System.out.println("senin sayinin adedi =" + count);

        //flag mantığı ile

        if(flag){
            System.out.println("senin sayin arrayde var"+ istenenSayi);
        }else System.out.println("senin sayin arrayde yok");

        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        System.out.println("Arrays.binarySearch(numbers, istenenSayi) = " + Arrays.binarySearch(numbers, istenenSayi));


    }
}
