package ch07_StringManipulations;

import java.util.Scanner;

public class C06_substring {

    public static void main(String[] args) {

        /**
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder

substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */

        String str = "Çalıştıkça daha çok şey bilmediğimizi farkediyorum";
        System.out.println("str.substring(0,5) = " + str.substring(0, 5));

        System.out.println("str.substring(str.length() -10) = " + str.substring(str.length() - 10));

        System.out.println("str.substring(0,11) = " + str.substring(0, 11));
        System.out.println("str.substring(0,1) = " + str.substring(0, 1));


        Scanner input = new Scanner(System.in);
        System.out.println(" 4 harfli bir kelime giirin");
        String kelime= input.nextLine();

        System.out.print("kelime.substring(kelime.length()-1) = " + kelime.substring(kelime.length() - 1));
        System.out.print(kelime.charAt(kelime.length() - 2));
        //System.out.println(kelime.charAt(kelime.length() -2 ));
        System.out.print(kelime.substring(1,2));
        System.out.println(kelime.substring(0,1));




    }
}
