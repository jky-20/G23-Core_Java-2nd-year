package Lec_44_Mar_20_Exp_handling;

import java.io.FileNotFoundException;
import java.io.IOException;

class parent{
    void NonExceptionFunction(){
        System.out.println("Non Exception");
    }
    void ThrowsExceptionFunction() throws IOException{
        System.out.println("Non Exception");
    }
}
class child1 extends parent{
    @Override
    void NonExceptionFunction(){
        throw new ArithmeticException();
    }
    // @Override
    // void ThrowsExceptionFunction() throws Exception{
    //     System.out.println("can only throw exception of subtype");
    // }
}
class child2 extends parent{
    // @Override
    // void NonExceptionFunction() throws IOException{
    //     throw new IOException();
    // }
    @Override
    void ThrowsExceptionFunction() throws FileNotFoundException{
        System.out.println("can only throw exception of subtype");
    }
}

public class expHandle_overriding {
    public static void main(String[] args) {
        
    }
}
