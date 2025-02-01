package Lec_09_Dec_19_array;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // int arr[] = new int[3];
        int[] arr = new int[5];

        System.out.println(arr);

        // Accesccing array elements

        System.out.println(arr[0]);

        // input and loop in array

        int n = sc.nextInt();
        arr = new int[n];

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n ; i++){
            System.out.println(arr[i]);
        }

        // sum of array elements
        int sum = 0;
        for(int val : arr){
            sum += val;
        }
        System.out.println("Sum if : " + sum);

        // Max element in array
        int max = arr[0];
        for(int val:arr){
            if(val > max){
                max = val;
            }
        }
        System.out.println("Largest element is : " + max);
    }
}
