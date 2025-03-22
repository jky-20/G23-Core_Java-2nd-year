package Lec_43_Mar_18_ExpHandling;

import java.util.Scanner;

public class while_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b;
        while(true){
            try{
                b = sc.nextInt();
                int c = a / b;
                System.out.println("Answer is : " + c);
                break;
            }
            catch(ArithmeticException ex){
                System.out.println(ex.getMessage());
                System.out.println("Input another number : ");
            }
        }
    }
}
