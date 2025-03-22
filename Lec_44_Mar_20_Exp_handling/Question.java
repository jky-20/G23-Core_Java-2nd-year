package Lec_44_Mar_20_Exp_handling;

public class Question {
    public static void main(String[] args) {
        
        try{
            int[] arr = new int[3];
            System.out.println(arr[3]);
        }
        catch(Exception ex){
            System.out.println("Index out of bound");
        }
        finally{
            System.out.println("Finally Block");
        }
        System.out.println("Hello...!!!");
    }
}
