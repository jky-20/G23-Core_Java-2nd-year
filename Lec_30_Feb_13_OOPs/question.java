package Lec_30_Feb_13_OOPs;

abstract class A{
    int a;
    // A(){
    //     System.out.println("default constructor developer made");
    // }
    A(int a){
        this.a = a;
    }
}
class B extends A{
    int b;
    B(){
        super(10);
    }
    B(int a){
        super(a);
    }
    B(int a, int b){
        super(a);
        this.b = b;
    }
}

public class question {
    public static void main(String[] args) {
        
    }
}
