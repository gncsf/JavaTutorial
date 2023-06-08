package ch02_Datatypes_WrappesClass;

public class C02_SwapInterwievQuestion {
    public static void main(String[] args) {

        int num1=20;
        int num2=34;
        int temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("temp işleminden sonra");


        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("üçüncü variable olmadan çözüm");

        num1=num2+num1;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }
}
