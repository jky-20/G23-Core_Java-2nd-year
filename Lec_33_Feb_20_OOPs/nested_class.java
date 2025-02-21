package Lec_33_Feb_20_OOPs;

class outer{
    int a;
    private int x;
    private class private_class{
        int d;
        void func(){
            display();
            static_func();
        }
    }
    class inner{
        int b;
        void func(){
            display();
            static_func();
        }
    }
    static class static_inner{
        int c;
        void func(){
            // display();  // can't access non-static members of outer class directly
            static_func();
        }
    }

    void display(){
        System.out.println("Normal function");
    }
    static void static_func(){
        System.out.println("Static function");
    }
}
public class nested_class {
    public static void main(String[] args) {

        outer obj = new outer();
        outer.inner inner_obj = obj.new inner();
        inner_obj.b = 10;

        outer.static_inner static_class_obj = new outer.static_inner();
        static_class_obj.c = 20;

        class example{
            int x,y;
        }
        example ex1 = new example();
    }
}
