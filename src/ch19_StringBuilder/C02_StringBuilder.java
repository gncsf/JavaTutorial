package ch19_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();

        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());

        sb1.append("javAslan");

        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());

        sb1.append(" selam ").append("nasilsin ").append("maasa zam ").append(63).append(" ").append(true);
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());


        StringBuilder sb2 = new StringBuilder("sefa genc");
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());
        sb2.append(" merhaba merhaba merhaba");
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());

        System.out.println("sb2.length() = " + sb2.length());
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());
        System.out.println("sb2.length() = " + sb2.length());





    }
}
