package Lec_30_Feb_13_OOPs;

interface Animal{
    int a = 10;  // implicitly public, static and final
    void makes_sound();    // implicitly public and abstract
    
    // cannot have constructors
    // Animal(){
    //     System.out.println("Interface constructor");
    // }
    default void print(){
        private_method();
        System.out.println("Default method in Interface");
    }
    private void private_method(){
        System.out.println("private_method");
    }
}
class Cat implements Animal{
    // @Override
    public void makes_sound(){
        System.out.println("Abstract Method implementation");
        System.out.println("Cat meows");
    }
}
interface Dog extends Animal{

}
abstract class Parrot implements Animal{

}

public class interfaces {
    public static void main(String[] args) {

        // can't make objects of Inerfaces
        // Animal animal = new Animal();
    }
}
