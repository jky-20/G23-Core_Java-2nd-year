package Lec_8_Dec_17_function_recursion;
public class functions {
    
    static int a =6;
    public static void main(String[] args) {

        int b = 10;

        // swap(a, b);
        System.out.println(a);
        System.out.println(b);

        int ans = fib(10);
        System.out.println(ans);
    }

    static int fib(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        int n_fib = fib(n-1) + fib(n-2);
        return n_fib;
    }

    static void swap(int a, int b){
        swap(a, b);
        int  t = b;
        b = a;
        a = t;
    }
    static int sum(int a, int b){
        return a+b;
    }
    
}

