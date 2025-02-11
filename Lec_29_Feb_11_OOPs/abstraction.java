package Lec_29_Feb_11_OOPs;

abstract class MotorVehicle{
    abstract void start();
    MotorVehicle(){
        System.out.println("Abstract classes can have constructors");
    }
    void print(){   // concrete methods are implemented methods
        System.out.println("Abstract classes can have concrete methods");
    }
    // other functionalities are similar to normal classes
}
class Car extends MotorVehicle{
    // abstract methods should be implemented by child class
    void start(){
        System.out.println("Start from Key");
    }
}
abstract class Bike extends MotorVehicle{
    // classes which inherit abstract classes and
    // doesn't provide implementation of abstract methods
    // should be an Abstract class
}
class example{

}

public class abstraction {
    public static void main(String[] args) {
        
        // creating objects of abstract class
        // MotorVehicle mv = new MotorVehicle();   // can't do that
    }
}
