package Lec_28_Feb_10_OOPs;

class Mutable{
    int x;
}

final class Immutable{
    private final int a;
    private final int b;
    private final Mutable m;

    Immutable(int a, int b, Mutable m){
        this.a = a;
        this.b = b;
        // this.m = m;     // Shallow copy (we don't use this)

        // use deep copy for mutable class objects
        this.m = new Mutable();
        this.m.x = m.x;
    }
    int get_a(){
        return this.a;
    }
    int get_b(){
        return this.b;
    }
    Mutable get_m(){
        // return this.m;   // don't return object reference

        // return defensive copy
        Mutable temp = new Mutable();
        temp.x = this.m.x;
        return temp;
    }
    void print(){
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("m : " + m.x);
        System.out.println("--------------------------");
    }
}

public class immutable_class {
    public static void main(String[] args) {
        
        Mutable m = new Mutable();
        m.x = 10;
        Immutable im = new Immutable(10, 20, m);
        im.print();

        m.x = 20;
        im.print();

        // getting object of mutable class data member
        Mutable m1 = im.get_m();
        m1.x = 30;
        im.print();
    }
}
