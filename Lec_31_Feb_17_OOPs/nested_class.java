package Lec_31_Feb_17_OOPs;

class outer{
    int a;

    class inner{
        int b;
    }
    static class static_inner{
        int c;
    }
}
public class nested_class {
    public static void main(String[] args) {

        outer obj = new outer();
        outer.inner inner_obj = obj.new inner();
        inner_obj.b = 10;

        outer.static_inner static_class_obj = new outer.static_inner();
        static_class_obj.c = 20;
    }
}
