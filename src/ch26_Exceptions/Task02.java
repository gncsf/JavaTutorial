package ch26_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        /*
        Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
        edip mainde kontrol ediniz.

 */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Hava sıcaklığını girin: ");
        int sicaklik = scanner.nextInt();

        try {
            sicaklikKontrol(sicaklik);
        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
        }


    }

    public static void sicaklikKontrol(int sicaklik) throws IOException {
        if (sicaklik < 10) {
            throw new IOException("Hava sıcaklığı 10'un altında.");
        } else {
            System.out.println("Hava sıcaklığı uygun.");
        }












    }
}
