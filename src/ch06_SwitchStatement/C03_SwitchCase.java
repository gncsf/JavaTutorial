package ch06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {

    public static void main(String[] args) {

        // TASK -> kullanıcının girdiği yılın ay sırasına göre ayın ismini print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("ay numrasi gir");
        int ay = input.nextInt();

        switch (ay) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("0 12 arasi nir numara giriniz");

        }











    }
}
