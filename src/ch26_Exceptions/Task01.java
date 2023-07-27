package ch26_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /*
        Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
                */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Şifrenizi girin: ");
        String password = scanner.nextLine();

        try {
            if (password.length() < 6 || password.length() > 10) {
                throw new Exception("Şifreniz 6 karakterden az veya 10 karakterden fazla olmamalıdır.");
            } else {
                System.out.println("Şifreniz uygun.");
            }
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }














    }
}
