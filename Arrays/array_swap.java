package Arrays;
import java.util.Scanner;

public class array_swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};
        // swap(arr[0], arr[2]);
        swap(arr);
        print(arr);
    }
    static void swap(int[] arr){
        int t = arr[0];
        arr[0] = arr[2];
        arr[2] = t;
    }
    static void swap(int a, int b){
        int t = a;
        a = b;
        b = t;
    }
    static void print(int[] arr){
        System.out.println("Array is : ");
        for(int val : arr){
            System.out.print(val + "  ");
        }
    }
}
