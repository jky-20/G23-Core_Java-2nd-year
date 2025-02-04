package Lec_25_Feb_4_OOPs;

public class varargs {

    static void print(int... a){
        for(int i : a){
            System.out.print(i + "  ");
        }
        System.out.println();
    }
    static void print(String str, int... a){    // can combine with other arguments
        for(int i : a){
            System.out.print(i + "  ");
        }
        System.out.println();
    }
    // static void print(int... a, String str){    // varargs must be last argument
    //     for(int i : a){
    //         System.out.print(i + "  ");
    //     }
    //     System.out.println();
    // }
    // static void print(int b, int... a){     // gives ambguity to compiler
    //     for(int i : a){
    //         System.out.print(i + "  ");
    //     }
    //     System.out.println();
    // }
    public static void main(String[] args) {
        
        print(1,2,3);
        print(1,2,3,4,5,6,7,8);     // can pass variable arguments

        int[] a = {1,2,3,4,5};      // can pass array
        print(a);
    }
}
