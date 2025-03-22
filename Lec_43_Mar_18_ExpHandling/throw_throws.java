package Lec_43_Mar_18_ExpHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throw_throws {
    static void function() throws FileNotFoundException{
        FileReader file = new FileReader("test.txt");
        try{
            int[] arr = new int[3];
            int a = arr[4];
        }
        catch(ArrayIndexOutOfBoundsException ex){
            throw ex;
        }
    }
    public static void main(String[] args) {
        
        try{
            function();
        }
        catch(FileNotFoundException fileEx){
            System.out.println("File not Found, Please change directory or create the file");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Recheck the Index and array size");
        }
    }
}
