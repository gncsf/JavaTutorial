package ch24_Encapsulation.encapsulation05;

public class Main {

    /*
    step 1 ->  Burada iki adet class olsun. Biri Main, diğeri ise student ,
    student classı içinde;
    step 2 -> String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

    Main classın içinde;
    step 3 ->  girilen değerleri aşagıdaki gibi print eden code create ediniz
    Örnek:
    age 12'dir.
    name Steven'dır.

    name(isim) olarak;
   "Student name is Steven"
    ve
    age(yaş) olarak da;
   "He is 12 years old"


           */




}// class sonu




class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
