package ch12_Arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {

        String str= " tam oturması icin birkac ornek daha gerekir ";

        String [] yeniArr = str.trim().split(" ");

        System.out.println("str = " + str);
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));

        System.out.println("yeniArr.length = " + yeniArr.length);

        // str obj  karakter sayisini yazdir

        int karakterSayisi = str.length();

        System.out.println("karakterSayisi = " + karakterSayisi);

        String harfSayisi = str.replaceAll("\\s " , "");
        System.out.println("harfSayisi = " + harfSayisi);

        //String [] bosluksuz = bosluksuz.split("");



    }
}
