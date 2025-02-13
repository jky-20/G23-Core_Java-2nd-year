package Lec_30_Feb_13_OOPs;

// in case of classes
class A{
    int a;
}
class B{
    int b;
}
// class C extends A, B{   // not possible in Classes
//     int c;
// }

// In interface
interface W{
    default void function(){
        System.out.println("Default function");
    }
}
interface X{
    default void function(){
        System.out.println("Default function");
    }
}
interface Y{
    default void function(){
        System.out.println("Default function");
    }

}
interface Z extends X,Y{
    default void function(){
        // override
    } 
}
class C implements X,Y{
    @Override
    public void function() {
        X.super.function();
    }
    void func(){

    }
}

public class multiple_inheritance {
    public static void main(String[] args) {
        
    }
}
