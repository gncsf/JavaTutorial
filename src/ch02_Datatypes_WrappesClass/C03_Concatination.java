package ch02_Datatypes_WrappesClass;

public class C03_Concatination {

    public static void main(String[] args) {

        char ch= 'A';
        char ch2= 'C';
        System.out.println(ch + ch2);
        System.out.println('A'+ 'C');
        System.out.println("A" + "B");

        String name = "kemal";
        String lastname = "baba";

        int a =8;
        int b = 11;

        System.out.println(name + lastname + a + b);
        System.out.println(a+b+ name+ lastname);

        System.out.println(name+lastname+(a+b));


    }
}
