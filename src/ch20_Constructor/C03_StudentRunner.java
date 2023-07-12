package ch20_Constructor;

public class C03_StudentRunner {

    public static void main(String[] args) {

        C03_Student std = new C03_Student();
        std.name="sefa";
        std.lastName="genc";
        std.classNo=123;
        std.degree=90.5;
        std.success=true;
        std.schoolNo=3439;

        System.out.println("std = " + std);

        std.graduate();
        std.socialActivity();


    }
}
