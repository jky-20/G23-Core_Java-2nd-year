package Lec_28_Feb_10_OOPs;

class example{
    int a;
}

class example2{
    final int a;
    example2(int a){
        this.a = a;
    }
}

final class final_class{
    int a;
}

// class child extends final_class{    // can't inherit a final class
//     int b;
// }

public class final_keyword {
    public static void main(String[] args) {
        
        final int a = 10;
        // a = 20;  // can't modify final variables

        final int b;
        b = 10;     // initializatoin
        // b = 20;  // can't modify final variables

        // reference variable
        example ex = new example();

        // final reference variable
        final example ex1 = new example();
        // ex1 = ex;       // can't reassign to other object or new object;
        // ex1 = new example();

        ex1.a = 10;
        ex1.a = 20;

        // constant objects
        example2 ex2 = new example2(10);
        // ex2.a = 10;     // can't change final data members  // constant object
    }
    
}
