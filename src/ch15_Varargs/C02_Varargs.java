package ch15_Varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C02_Varargs {

    public static void main(String[] args) {

        /*
        array ve varargs method:
        */

        //task1 verilen bir array deki elemanlari toplayan method create ediniz

        int [] arr ={ 1,2,-3,4,-5,-6 } ;

        arrTopla(arr);
        vararagsTopla(arr);













    }

    private static void vararagsTopla(int... var) {
        int toplam =0;
        for(int w:var){
            toplam+=w;
        }
        System.out.println("toplam varrargs = " + toplam);
    }

    private static int arrTopla(int[] arr) {

        int toplam=0;
        for (int w:arr){
            toplam+=w;
        }
        System.out.println("toplam = " + toplam);
        return toplam;




    }
}
