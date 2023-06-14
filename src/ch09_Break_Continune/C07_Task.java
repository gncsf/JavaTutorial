package ch09_Break_Continune;

import java.util.Scanner;

public class C07_Task {
    public static void main(String[] args) {

        // task -> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.print("Bir ifade girin: ");
        String ifade = input.nextLine();

        int count=0;

        for (int i = 0; i < ifade.length(); i++) {
            char character = ifade.charAt(i);
            if (character == 'c') {
                break;
            }
            if (character == 'a') {
                count++;
            }
        }

        System.out.println("'c' karakterine kadar olan 'a' karakter sayısı: " + count);

        input.close();

        /////avcbav

















    }
}
