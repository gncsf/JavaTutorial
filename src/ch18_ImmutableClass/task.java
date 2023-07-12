package ch18_ImmutableClass;

public class task {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Merhaba");
        sb.append(" ");
        sb.append("Dünya!");

        System.out.println(sb.toString()); // Çıktı: Merhaba Dünya!

        sb.insert(8, "Sevgili ");
        System.out.println(sb.toString()); // Çıktı: Merhaba Sevgili Dünya!

        sb.delete(0, 8);
        System.out.println(sb.toString()); // Çıktı: Sevgili Dünya!




    }
}
