package ch26_Exceptions;

import java.util.Scanner;

public class C07_IllegalArguımentException02 {
    public static void main(String[] args) {

        try {
            System.out.println("try block basi");
            exceptionMethod();
            System.out.println("try block sonu");
        } catch (Exception e) {
            System.out.println("catch block basi");
            System.out.println("e = " + e);
            System.out.println("e.getMessage() = " + e.getMessage());
           // e.printStackTrace();
            System.out.println("catch block sonu");

        }
        System.out.println("main sonu tüm kodlar calisti");


    }

    public static void exceptionMethod(){
        throw new IllegalArgumentException("Illegal ArguımentException hatasi aldin");
    }


}
