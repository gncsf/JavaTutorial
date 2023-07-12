package ch20_Constructor;

public class C03_Student {

    String name;
    String lastName;
    int classNo;
    double degree;
    int schoolNo;
    boolean success;

    public void graduate () {
        if ( degree >=60){

            System.out.println("you are graduated");
        }else {
            System.out.println("we are waiting you next year");
        }
    }

    public void socialActivity() {
        System.out.println("you should social activity");
    }

    @Override
    public String toString() {
        return "C03_Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classNo=" + classNo +
                ", degree=" + degree +
                ", schoolNo=" + schoolNo +
                ", success=" + success +
                '}';
    }


}
