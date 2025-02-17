package Lec_31_Feb_17_OOPs;

interface A{
    void display();
}

abstract class B{
    abstract void print();
}

public class anonymous_class {
    public static void main(String[] args) {
        
        A obj = new A() {
            @Override
            public void display() {
                System.out.println("Hello");
            }
        };
        obj.display();

        B obj2 = new B() {
            @Override
            void print() {
                System.out.println("another anonymous class");
            }
        };
        obj2.print();
    }
}
