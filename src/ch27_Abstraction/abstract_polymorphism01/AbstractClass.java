package ch27_Abstraction.abstract_polymorphism01;

public abstract class AbstractClass {

    public static void byLİnkText(){
        System.out.println("Link text super ");

    }
    public  void get(){
        System.out.println("chrome ");

    }

    abstract void absMethod();


    static class Test extends AbstractClass{

        public static void byLİnkText(){
            System.out.println("Link text sub class ");

        }
        public void get(){
            System.out.println("fire fox ");

        }


        @Override
        void absMethod() {
            System.out.println("abs method override edildi");
        }

        public static void test(){
            System.out.println("test method");
        }

        public static void main(String[] args) {

            Test.byLİnkText();
            AbstractClass.byLİnkText();

            AbstractClass obj =new Test();
            obj.absMethod();
            obj.get();



        }
    }








}
