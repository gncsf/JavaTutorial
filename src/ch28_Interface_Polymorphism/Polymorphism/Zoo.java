package ch28_Interface_Polymorphism.Polymorphism;

class Animal {
    public void talk(){System.out.println("animal is talking");}
}
class Tiger extends Animal {
    public void hunt(){System.out.println("tiger is hunting");}
    public void talk(){System.out.println("tiger is talking");}
}

class Octopus extends Animal{
    public void swim(){System.out.println("octopus is swimming");}
    public void talk(){System.out.println("octopus is talking  == gloglo");}
}
public class Zoo {
    public static void main(String[] args) {

        Tiger tiger1= new Tiger();
        Tiger [] tigers = {tiger1, new Tiger()};

        Octopus octopus1 = new Octopus();
        Octopus [] octopus ={octopus1, new Octopus()};

        Animal animal1 = new Tiger();

        animal1.talk();
        //animal1.hunt();

        Animal animal2 = new Octopus();

        animal2.talk();










    }
}
