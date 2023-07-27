package ch26_Exceptions.salaryCalculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        Employee employee =
                new Employee(
                        "iclal hanım",125000,60,2020
                );


        System.out.println("employee.getName() = " + employee.getName());
        System.out.println("employee.getSalary() = " + employee.getSalary());
        System.out.println("employee.tax() = " + employee.tax());
        System.out.println("employee.bonus() = " + employee.bonus());
        System.out.println("employee.raiseSalary() = " + employee.raiseSalary());

        System.out.println("employee = " + employee);
        salaryCalculate();



    }

    private static void salaryCalculate() {
        Scanner input = new Scanner(System.in);

        System.out.println("isminizi giriniz: ");
        String name = input.nextLine().trim();

        System.out.println("maasnizi giriniz: ");
        int salary=0;
        int workHour=0;
        int year=0;
        try {
            salary= input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giris yaptiniz");
            salaryCalculate();
        }

        System.out.println("calisma saaatini girin: ");
        try {
            workHour=input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giris yaptiniz");
            salaryCalculate();
        }

        System.out.println("ise baslama yilinş giriniz: ");
        try {
            year= input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giris yaptiniz ");
            salaryCalculate();
        }

        Employee employee = new Employee(name,salary,workHour,year);

        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println("employee.tax() = " + employee.tax());
        System.out.println("employee.bonus() = " + employee.bonus());
        System.out.println("employee.raiseSalary() = " + employee.raiseSalary());

        System.out.println("employee = " + employee);


    }




}
