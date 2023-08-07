package ch28_Interface_Polymorphism.Polymorphism.CompileTime;

public class Calculation {

    public static void sum(int num1,int num2) {

        System.out.println("sum of 2 integers " + (num1+num2));

    }
    public static void sum(int num1,int num2,int num3) {

        System.out.println("sum of 3 integers " + (num1+num2+num3));

    }
    public static void sum(double num1,double num2) {

        System.out.println("sum of 2 doubles " + (num1+num2));

    }
    public static void sum(double num1,double num2,double num3) {

        System.out.println("sum of doubles " + (num1+num2+num3));

    }








}
