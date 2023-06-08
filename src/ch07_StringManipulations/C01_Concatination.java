package ch07_StringManipulations;

public class C01_Concatination {

    public static void main(String[] args) {

        String name = "Batu";
        String title = "SDET QA";
        int age = 30;

        System.out.println(name + title);
        System.out.println("name.concat(title)= " + name.concat(title));

        // int e cevirme

        String number= "123456";
        System.out.println("number = " + number);
        System.out.println("Integer.parseInt(number +1) = " + (Integer.parseInt(number + 1) + 1));

        System.out.println("name.concat(true + \":)\") = " + name.concat(true + ":)"));
        System.out.println("name.concat(100 + \":)\") = " + name.concat(100 + ":)"));





    }
}
