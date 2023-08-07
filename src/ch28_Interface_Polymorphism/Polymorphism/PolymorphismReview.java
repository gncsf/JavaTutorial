package ch28_Interface_Polymorphism.Polymorphism;

class A {

    public void methodA(){System.out.println(" method A from A class");
    }
    public static void methodC(){System.out.println(" method C from A class");
    }

}

class B extends A  {
    public void methodA(){System.out.println(" method A from B class");
    }
    public void methodB(){System.out.println(" method B from B class");}
    public static void methodC(){System.out.println(" method C from B class");
    }

    interface E {

    }
    abstract class C{

    }
    abstract class F implements E {

    }
    class D extends C implements E{

    }


}

 class PolymorphismReview {
     public static void main(String[] args) {

         A obj = new B();

         obj.methodA();
         obj.methodC();// static oldugu icin parenttan gelir
         ((B) obj).methodB();


         B.methodC();

         B obj1 = (B) new A();
       // C obj2= new D();
       // E obj3= new D();















     }

}
