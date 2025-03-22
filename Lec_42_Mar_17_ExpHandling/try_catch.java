package Lec_42_Mar_17_ExpHandling;

import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0, b;
        try{
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(a / b);
            // try{    // nested try catch
                int[] arr = new int[2];
                System.out.println(arr[2]);
            // }
            // catch(ArrayIndexOutOfBoundsException ex){
            //     System.out.println("Index out of bound");
            // }
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Index out of bound");
        }
        catch(ArithmeticException ex){
            System.out.println("Can't divide by zero!!!");
            System.out.println("Please enter other value for second number");
            
            b = sc.nextInt();
            System.out.println(a / b);
        }
        finally{
            System.out.println("Always executed");
        }
        System.out.println("Hello mate !!");    
    }
}
