package Lec_25_Feb_4_OOPs;

public class compile_time_polymorphism {

    static int add(long a){
        return 10;
    }
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){    // overload by changing parameters
        return a + b + c;
    }
    static int add(String a, int b){    // overload by changing parameter type
        return 10;
    }
    static int add(int b, String a){    // overload by changing parameter order
        return 20;
    }
    // static String add(int b, String a){    // can't overload by changing return type
    //     return "20";
    // }
    public static void main(String[] args) {
        
        int sum = add(10, 20);
        System.out.println(sum);

        sum = add(10, 20, 30);

        System.out.println(add("null", 2));
        System.out.println(add(3, "null"));

        int a = 20;
        sum = add(a);
    }
}
