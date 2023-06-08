package ch06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        // Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
//break in ozelligini kullanin
//29 subat icin sartlarini hatirlayiniz

        Scanner scan = new Scanner(System.in);
        System.out.println("bir rakam giriniz");
        int aySayi = scan.nextInt();

        switch (aySayi) {
            case 1:

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:
                System.out.println("girilen ayda 31 gün vardır");
                break;
            case 4:

            case 6:

            case 9:

            case 11:
                System.out.println("girilen ayda 30 gün vardır");
                break;

            case 2:
                System.out.println("yılı giriniz");
                int yıl = scan.nextInt();
                if (yıl % 4 == 0) {
                    System.out.println("ay 29 gün çeker");
                } else
                    System.out.println("ay 28 gün çeker");
                break;

            default:
                System.out.println("doğru yazınız");


        }
    }
}
