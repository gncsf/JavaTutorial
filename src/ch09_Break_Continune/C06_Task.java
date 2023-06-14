package ch09_Break_Continune;

import java.util.Scanner;

public class C06_Task {

    public static void main(String[] args) {

        // Task-> girilen 7 tamsayının 10 ile 20 arasındakileri hariç toplamını print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 7) {
            System.out.print("Bir tamsayı girin: ");
            int num = scanner.nextInt();
            if (num >= 10 && num <= 20){
                count++;
                continue;
            }
            sum += num;
            count++;
        }

        System.out.println("sayının toplamı = " + sum);


    }
}
