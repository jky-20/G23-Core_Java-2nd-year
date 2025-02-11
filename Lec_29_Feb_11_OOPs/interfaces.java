package Lec_29_Feb_11_OOPs;

interface Animal{
    int a = 10;  // implicitly public, static and final
    void makes_sound();    // implicitly public and abstract
    
    // cannot have constructors
    // Animal(){
    //     System.out.println("Interface constructor");
    // }
}

public class interfaces {
    public static void main(String[] args) {

        // can't make objects of Inerfaces
        // Animal animal = new Animal();
    }
}
