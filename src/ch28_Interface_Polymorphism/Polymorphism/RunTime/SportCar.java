package ch28_Interface_Polymorphism.Polymorphism.RunTime;

public class SportCar extends Vehicle{

    @Override
    void speedUpTo60mph() {
        System.out.println("Sportcar is speeding up to 60mph in 3.2 seconds ");
    }
}
